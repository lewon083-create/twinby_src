# Twinby SSL Pinning Bypass — Полный Анализ и v2 Скрипт

> **Цель**: Разобрать 4-уровневый SSL/TLS стек приложения Twinby (Flutter + Java), выявить
> все причины неработоспособности текущего `frida_bypass_ssl_pinning.js` (v4),
> и предложить исправленный v2-скрипт.

---

## 1. Архитектура SSL/TLS в Twinby

Приложение `com.twinby` (Flutter, Embedding v2, minSdk=24, targetSdk=36) имеет **4 независимых сетевых слоя**:

```
┌──────────────────────────────────────────────────────────────────┐
│                    СЕТЕВОЙ СТЕК TWINBY                           │
├──────────────────────────────────────────────────────────────────┤
│                                                                  │
│  Layer 1: Dart HttpClient (ОСНОВНОЙ ТРАФИК)                     │
│  ┌────────────────────────────────────────────────────────────┐ │
│  │ Dart code → dart:io HttpClient → SecurityContext           │ │
│  │   → BoringSSL в libflutter.so → TCP socket                 │ │
│  │   • СВОЙ root store (не Android!)                          │ │
│  │   • network_security_config.xml НЕ ВЛИЯЕТ                  │ │
│  │   • main API: twinby.com, twinby.ru, link.twinby.com       │ │
│  └────────────────────────────────────────────────────────────┘ │
│                                                                  │
│  Layer 2: OkHttp (Java) — VK SDK, Yandex Varioqub               │
│  ┌────────────────────────────────────────────────────────────┐ │
│  │ zk.t (Builder) → zk.u (OkHttpClient)                       │ │
│  │   → hl.n (Platform) → TrustManagerFactory                  │ │
│  │   → Андроидный X509TrustManager                             │ │
│  │   • network_security_config.xml: только system certs       │ │
│  │   • VKOkHttpProvider, com.yandex.varioqub                   │ │
│  └────────────────────────────────────────────────────────────┘ │
│                                                                  │
│  Layer 3: Yandex Ads SDK — кастомный TrustManager + pinning      │
│  ┌────────────────────────────────────────────────────────────┐ │
│  │ yads.qu2 (X509ExtendedTrustManager) → yads.mw2             │ │
│  │   1. Системный TrustManager (e93.a(null))                  │ │
│  │   2. Pinned cert fallback (monetization_ads_bundled_cert)  │ │
│  │   • Использует KeyStore с пропатченными сертификатами      │ │
│  └────────────────────────────────────────────────────────────┘ │
│                                                                  │
│  Layer 4: Android System — HttpsURLConnection / Conscrypt        │
│  ┌────────────────────────────────────────────────────────────┐ │
│  │ RootTrustManager / TrustManagerImpl / Conscrypt             │ │
│  │   → network_security_config.xml enforcement                │ │
│  └────────────────────────────────────────────────────────────┘ │
│                                                                  │
└──────────────────────────────────────────────────────────────────┘
```

### Ключевые классы Java

| Класс | Пакет | Роль |
|-------|-------|------|
| `zk.u` | classes2.dex | OkHttpClient (обфусцирован) |
| `zk.t` | classes2.dex | OkHttpClient.Builder |
| `zk.d` | classes2.dex | CertificatePinner (пустой pinset в prod) |
| `hl.n` | classes2.dex | OkHttp Platform (Android) — синглтон f20755a |
| `hl.j` | classes2.dex | AndroidPlatform extends hl.n |
| `ll.c` | classes2.dex | OkHttp HostnameVerifier (RFC 2818) |
| `yads.qu2` | classes2.dex | Yandex SdkTrustManager (X509ExtendedTrustManager) |
| `yads.mw2` | classes2.dex | Делегат проверки сертификатов Yandex |
| `yads.e93` | classes2.dex | Фабрика TrustManager из KeyStore |
| `yads.lw2` | classes2.dex | Function0 — возвращает системный TrustManager |
| `yads.yf` | classes2.dex | API-level адаптер (Socket/SSLEngine overloads) |
| `com.twinby.MainActivity` | classes.dex | FlutterActivity |

### Конфигурация Network Security Config (`res/xml/network_security_config.xml`)

```xml
<network-security-config>
    <debug-overrides>
        <trust-anchors>
            <certificates src="user"/>   <!-- только в debug-сборке -->
            <certificates src="system"/>
        </trust-anchors>
    </debug-overrides>
    <base-config cleartextTrafficPermitted="false">
        <trust-anchors>
            <certificates src="system"/>  <!-- ТОЛЬКО системные сертификаты -->
        </trust-anchors>
    </base-config>
</network-security-config>
```

- **Release-сборка**: доверяет ТОЛЬКО системным сертификатам
- **User CA** (Burp/Charles/Fiddler) — НЕ ДОВЕРЯЕТ
- На Dart/BoringSSL Layer этот конфиг **НЕ ВЛИЯЕТ**
- На OkHttp Layer — ОГРАНИЧИВАЕТ доверенные сертификаты системными

---

## 2. Как работает Yandex Ads pinning (yads.mw2)

```java
// yads/mw2.java — упрощённая логика
public void a(X509Certificate[] certs, String hostname) {
    try {
        // Попытка 1: системный TrustManager
        TrustManager systemTM = (X509TrustManager) this.f41055b.getValue();
        systemTM.checkServerTrusted(certs, hostname);
    } catch (CertificateException e) {
        synchronized (this.f41058e) {
            a();  // lazy-init KeyStore с пропатченными сертификатами
            b();  // проверка блокировки
            X509TrustManager pinned = this.f41057d;
            if (pinned != null) {
                pinned.checkServerTrusted(certs, hostname);  // Попытка 2
            } else {
                throw e;
            }
        }
    }
}
```

**Сертификаты для pinning загружаются из ресурсов APK**:
- `R$raw.monetization_ads_sdkinternalca`
- `R$raw.monetization_ads_bundled_cert`

Создаётся кастомный `KeyStore`, в который добавляются эти сертификаты, затем из него создаётся `TrustManager` через `TrustManagerFactory`.

---

## 3. Разбор ошибок текущего скрипта (v4)

### 3.1. 🔴 КРИТИЧЕСКАЯ: Native BoringSSL hooks не срабатывают

**Текущая логика (v4 Section A)**:
```javascript
// Перебор модулей и поиск экспортов по имени
Process.enumerateModules().forEach(function(mod) {
    Module.findExportByName(mod.name, "SSL_CTX_set_custom_verify");
});
```

**Почему не работает — три независимых причины:**

#### A. Attach mode (`frida -U com.twinby`)
- Скрипт подключается к УЖЕ запущенному приложению
- `libflutter.so` уже загружен
- `SSL_CTX_set_custom_verify` уже вызван во время инициализации Flutter Engine
- Hooks устанавливаются ПОСЛЕ того, как SSL-контекст настроен
- Новые SSL-соединения используют уже настроенный контекст с verify mode ≠ 0

#### B. Spawn mode (`frida -f com.twinby`)
- Immediate scope выполняется до загрузки JVM
- `Process.enumerateModules()` НЕ находит `libflutter.so` (ещё не загружен)
- Polling стартует через 500ms
- **Flutter Engine инициализирует SSL-контекст в первые 100-200ms после старта**
- К моменту первого poll (500ms) `SSL_CTX_set_custom_verify` УЖЕ отработал

#### C. Stripped symbols в libflutter.so
- В release-сборках Flutter бинарные символы STRIPPED
- `Module.findExportByName("libflutter.so", "SSL_CTX_set_custom_verify")` → `null`
- Даже если функция существует в коде, она НЕ в dynamic symbol table
- BoringSSL в Flutter компилируется с префиксом или инлайнится

### 3.2. 🔴 КРИТИЧЕСКАЯ: Бесконечная рекурсия в SSLContext.init

```javascript
// v4 — Section C10
SSLCtx.init.overload(
    "[Ljavax.net.ssl.KeyManager;",
    "[Ljavax.net.ssl.TrustManager;",
    "java.security.SecureRandom"
).implementation = function (km, tm, sr) {
    logJava("SSLContext.init");
    this.init(km, Java.array("javax.net.ssl.TrustManager", [trustAllInstance]), sr);
    //   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    //   ВЫЗЫВАЕТ САМ СЕБЯ → StackOverflowError!
};
```

`this.init(...)` внутри перегруженной реализации вызывает саму себя рекурсивно. Это приводит к StackOverflowError при первой же попытке создать SSL-соединение.

### 3.3. 🟡 Java.choose("zk.u") — race condition

- `Java.choose` сканирует heap один раз в момент вызова
- Новые экземпляры OkHttpClient, созданные ПОСЛЕ сканирования, не патчатся
- Hooks на `hl.n.m()` и `hl.n.l()` должны покрывать новые экземпляры, НО:
  - Если `zk.t` Builder уже содержит pre-set TrustManager/SSLSocketFactory (поле `f46464p`/`f46463o`), используются они вместо Platform default → наши хуки не помогают

### 3.4. 🟡 Yandex Sdk: Socket/SSLEngine overloads

`yads.qu2` extends `X509ExtendedTrustManager`. Когда Android вызывает overload с Socket/SSLEngine параметрами, v4 скрипт пытается перехватить их через try/catch, но:
- Может не найти сигнатуру (silent fail)
- `yf.java` на Android 7+ вызывает `X509ExtendedTrustManager.checkServerTrusted(certs, str, socket)` напрямую

### 3.5. 🟡 CertificatePinner хук избыточен, но не вреден

`zk.d` (CertificatePinner) в prod-сборке инициализируется с ПУСТЫМ pinset:
```java
public static final d f46343c = new d(CollectionsKt.V(new ArrayList()), null);
```
Пустой pinset означает "нет пинов" — проверка всегда проходит.

### 3.6. 🟡 OkHttp Platform синглтон

`zk.u` конструктор использует `hl.n.f20755a` (статический volatile синглтон). При первом вызове `hl.n.f20755a.m()` создаётся TrustManager через `TrustManagerFactory.getDefaultAlgorithm()`. Если этот вызов уже произошёл ДО установки хуков, возвращённый TrustManager кешируется в поле `f46489q` экземпляра `zk.u`.

### 3.7. 🟡 HttpsURLConnection hooks — та же рекурсия (C12–C15)

В v4 хуки на `HttpsURLConnection` (строки 838-881) демонстрируют ту же проблему, что и `SSLContext.init`:

```javascript
// v4: setDefaultSSLSocketFactory (line ~838)
HttpsURLConnection.setDefaultSSLSocketFactory.implementation = function(ssf) {
    this.setDefaultSSLSocketFactory(permissiveSSF); // ← вызывает сам себя!
};

// v4: setSSLSocketFactory (line ~852)
HttpsURLConnection.setSSLSocketFactory.implementation = function(ssf) {
    this.setSSLSocketFactory(permissiveSSF); // ← вызывает сам себя!
};

// v4: setDefaultHostnameVerifier (line ~866)
HttpsURLConnection.setDefaultHostnameVerifier.implementation = function(hv) {
    this.setDefaultHostnameVerifier(permissiveHV); // ← вызывает сам себя!
};

// v4: setHostnameVerifier (line ~874)
HttpsURLConnection.setHostnameVerifier.implementation = function(hv) {
    this.setHostnameVerifier(permissiveHV); // ← вызывает сам себя!
};
```

Все четыре вызова `this.setXxxx()` внутри перегруженной реализации вызывают саму себя рекурсивно — идентично багу 3.2. В v2 эти хуки сделаны no-op (пустая реализация), что безопасно, но в v4 они вызывают `StackOverflowError`.

### 3.8. 🔴 Каскадная рекурсия через makePermissiveSSF()

Стратегия v4 создаёт каскадную рекурсию между несколькими хуками:

```
hl.n.l(tm)                     # OkHttp Platform → getSocketFactory
  └→ makePermissiveSSF()
       └→ SSLContext.getInstance("TLS")
            └→ ctx.init(km, tm, sr)         # ← триггерит хук 3.2!
                 └→ this.init(...)           # ← StackOverflowError
```

Даже если бы `SSLContext.init` был исправлен, `makePermissiveSSF()` всё равно вызывает `ctx.init()` с `PERMISSIVE_TM` в качестве TrustManager. Это означает, что:

- **OkHttp Platform хуки (`hl.n.l` → `makePermissiveSSF()`) сломаны багом 3.2** — рекурсия не изолирована в одном хуке, а распространяется каскадом
- **v4 неработоспособен даже для OkHttp-трафика** — каждый вызов `hl.n.l()` приводит к `StackOverflowError`
- **Рекурсия SSLContext.init — не локальная проблема**, она разрушает ВСЕ пути, которые используют `makePermissiveSSF()`

---

## 4. Стратегия v2: что нужно исправить

### Приоритет 1: Dart HttpClient (BoringSSL) — основной трафик

Три подхода комбинируются для максимальной надёжности:

1. **Поиск символов через `Module.findExportByName(null, symbol)`** — ищет во ВСЕХ загруженных модулях
2. **Хук на `android_dlopen_ext`** — перехват загрузки libflutter.so для мгновенной установки хуков
3. **Быстрый polling (50ms вместо 500ms)** — для spawn mode
4. **Прямая модификация SSL_CTX полей** — для attach mode, патчинг verify_mode существующих контекстов

### Приоритет 2: Исправить рекурсию SSLContext.init

Вместо `this.init(...)` полагаемся на хук `TrustManagerFactory.getTrustManagers()` для инъекции permissive TM.

### Приоритет 3: TrustManagerFactory.init — полное покрытие

Добавляем хук на фабричный уровень.

### Приоритет 4: OkHttp — двойное патчение

Первый проход при загрузке + повтор через 2 секунды для новых экземпляров.

---

## 5. Oracle Review v2 — найденные fatal-баги

При ревью v2-скрипта Oracle обнаружил **два критических (fatal) бага** и **три проблемы средней серьёзности**, которые делают v2 неработоспособным в текущем виде.

### FATAL 1: SSLContext.init сделан no-op — SSLContext никогда не инициализируется

```javascript
// v2 — Section B3: SSLContext.init — ИСПРАВЛЕНО (нет рекурсии!)
SSLCtx.init.overloads.forEach(function(overload) {
    overload.implementation = function() {
        log("JAVA: SSLContext.init — TMF hook covers this");
        // Не вызываем оригинал — TMF хук уже всё сделает при
        // следующем вызове getTrustManagers()
    };
});
```

Заменив рекурсивный `this.init(...)` на пустую реализацию, v2 создал новую проблему: **SSLContext больше никогда не инициализируется**. Без вызова оригинального `init()` внутреннее состояние контекста остаётся неинициализированным, и все последующие вызовы `getSocketFactory()` или `getServerSocketFactory()` падают с `IllegalStateException`. SSLContext.init НЕ вызывает TMF.getTrustManagers — он принимает уже готовый массив TrustManager'ов как аргумент.

### FATAL 2: onLeave цикл записи в случайные смещения SSL_CTX

```javascript
// v2 — Section A1: Native hooks onLeave
onLeave: function(retval) {
    if (this.ctx && !this.ctx.isNull()) {
        for (var offset = 0x60; offset <= 0x80; offset += 4) {
            try { this.ctx.add(offset).writeInt(0); } catch(e) {}
        }
    }
}
```

Этот код записывает нули в смещения **0x60, 0x64, 0x68, 0x6c, 0x70, 0x74, 0x78, 0x7c, 0x80** структуры SSL_CTX. Это **разрушает внутренние поля** SSL_CTX, не только `verify_mode`:
- `0x60` может быть `verify_mode`, но BoringSSL не гарантирует фиксированные смещения между версиями
- Другие смещения содержат критические указатели (cert store, session cache, cipher lists)
- Запись нулей в случайные поля → **segfault или повреждение памяти**

### MEDIUM 1: v2 не учитывает stripped symbols в RELEASE-сборках

Анализ v2 предполагает, что `Module.findExportByName(null, symbol)` найдёт BoringSSL-символы в `libflutter.so`. В release-сборках Flutter эти символы полностью stripped — они отсутствуют в dynamic symbol table. Скрипт молча пропускает эту ситуацию без предупреждения.

### MEDIUM 2: v2 не упоминает HttpsURLConnection рекурсию в анализе v4

Хотя v2 исправил HttpsURLConnection хуки (сделал их no-op), в анализе ошибок v4 (Section 3) отсутствует документирование рекурсии в C12–C15 — это было упущено при первом разборе.

### MEDIUM 3: v2 не рассматривает Dart-уровневый bypass

`HttpClient.badCertificateCallback` в Dart позволяет перехватить все ошибки сертификатов на уровне dart:io — это более элегантное решение, чем патчинг BoringSSL, но v2 его не упоминает.

---

## 6. v3 Frida Script (исправленный)

**v3 скрипт** сохранён отдельным файлом: `frida_bypass_ssl_pinning_v3.js`

---

## 7. Рекомендации по использованию

### 7.1. Оптимальный способ запуска

```bash
# SPAWN MODE — скрипт загружается ДО старта приложения
# Native hooks устанавливаются до инициализации Flutter Engine
frida -U -f com.twinby -l frida_bypass_ssl_pinning_v2.js --no-pause

# ATTACH MODE — если spawn недоступен
frida -U com.twinby -l frida_bypass_ssl_pinning_v2.js
# После загрузки скрипта ПЕРЕЗАПУСТИТЕ приложение вручную
```

### 7.2. Настройка прокси (Burp/Charles)

1. Установите сертификат прокси как **SYSTEM certificate** на устройстве
   - На Android 7+ (API 24+) user certificates НЕ trusted для targetSdk >= 24
   - Используйте `adb root` + перемещение сертификата в `/system/etc/security/cacerts/`
   - Или Magisk модуль `MoveCertificate`

2. Настройте прокси:
   ```bash
   adb shell settings put global http_proxy <proxy_ip>:<proxy_port>
   # или iptables
   adb reverse tcp:8080 tcp:8080
   ```

### 7.3. Проверка работы

Следите за логами Frida — должны появиться сообщения:
```
[v2 ✓] + SSL_set_custom_verify in (any) @ 0x7abc...
[v2 ✓] + Hooked android_dlopen_ext
[v2 ✓] + TMF.getTrustManagers
[v2] NATIVE: Found libflutter.so on poll #2
[v2 ✓] + SSL_CTX_set_custom_verify in libflutter.so @ 0x7def...
```

---

## 8. Что делать, если скрипт всё равно не работает

### 8.1. BoringSSL символы не найдены в stripped libflutter.so

Если `Module.findExportByName(null, "SSL_set_custom_verify")` возвращает `null` для всех символов, это значит, что release-сборка libflutter.so полностью stripped.

**Варианты решения**:

1. **Использовать debuggable APK**: переупаковать APK с `android:debuggable="true"`
2. **Frida Gadget**: встроить Frida Gadget в APK (работает с любыми сборками)
3. **Objection**: `objection -g com.twinby explore` + `android sslpinning disable`
4. **Xposed/LSPosed модуль**: TrustMeAlready, SSLUnpinning

### 8.2. Dart HttpClient игнорирует системные сертификаты

Dart использует собственный сертификат-стор. Если BoringSSL хуки не работают:

- Установить CA сертификат в Dart-стор (сложно)
- Модифицировать `dart:io` через Frida Dart hooks
- Пересобрать APK с `HttpClient.badCertificateCallback`

---

## 9. Сводная таблица проблем и решений

| # | Проблема | Серьёзность | Решение в v2 |
|---|----------|-------------|--------------|
| 1 | BoringSSL хуки не срабатывают в attach mode | 🔴 | dlopen мониторинг + 50ms polling + прямой патч SSL_CTX |
| 2 | Stripped symbols в libflutter.so | 🔴 | Поиск через `null` модуль + dlopen хук |
| 3 | Бесконечная рекурсия в SSLContext.init | 🔴 | Убран рекурсивный вызов, используется TMF хук |
| 4 | Polling 500ms слишком медленный | 🟡 | 50ms интервал + dlopen хук |
| 5 | Java.choose race condition | 🟡 | Повторное сканирование через 2с |
| 6 | Yandex overloads не все покрыты | 🟡 | `.overloads.forEach` — все overloads |
| 7 | NSC блокирует user certs | 🟡 | Java хуки обходят + нужен system cert для Dart |
| 8 | OkHttp Builder pre-set TM/SSF | 🟡 | Патчинг полей существующих экземпляров |
| 9 | HttpsURLConnection рекурсия | 🟡 СРЕДНЯЯ | no-op хуки в v3 |
| 10 | makePermissiveSSF каскадная рекурсия | 🟡 СРЕДНЯЯ | SSLContext.init не тронут |
| 11 | SSLContext.init no-op (v2 regression) | 🔴 КРИТИЧЕСКАЯ | Удалён хук, TMF покрывает |
| 12 | onLeave memory corruption (v2 regression) | 🔴 КРИТИЧЕСКАЯ | Удалён onLeave |
| 13 | Stripped symbols default case | 🟡 СРЕДНЯЯ | Добавлено предупреждение в скрипт |

---

## 10. Версии скрипта

| Версия | Файл | Статус |
|--------|------|--------|
| v4 (original) | `frida_bypass_ssl_pinning.js` | ❌ Не работает — 3 критических бага |
| v2 (первая попытка) | `frida_bypass_ssl_pinning_v2.js` | ❌ Oracle rejected — 2 fatal regression bugs |
| v3 (Oracle-fixed) | `frida_bypass_ssl_pinning_v3.js` | ✅ Исправлен после Oracle review |

v3 — РЕКОМЕНДУЕМАЯ ВЕРСИЯ.