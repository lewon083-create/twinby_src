# Twinby — Reverse Engineering & SSL Pinning Bypass

## Содержимое репозитория

### `base.apk`
Оригинальный APK-файл приложения **Twinby** (`com.twinby`) — Flutter (Embedding v2), minSdk=24, targetSdk=36.

### `apk-src/`
Декомпилированный исходный код `base.apk`, полученный через **jadx**. Содержит:
- Полную Java-декомпиляцию (classes.dex, classes2.dex, classes3.dex)
- Ресурсы (`res/`), включая `res/xml/network_security_config.xml`
- Flutter assets и нативные библиотеки

---

## SSL Pinning Bypass — работа с Frida (вне репозитория)

> **Важно**: Frida-скрипты не включены в коммит. Ниже — описание того, что было сделано
> в процессе анализа, что не сработало, и предполагаемая задача на написание
> корректного скрипта. Сами скрипты и отчёт хранятся локально в рабочей директории.

### Архитектура SSL/TLS в Twinby

Приложение использует **4 независимых сетевых слоя**:

| Слой | Технология | Комментарий |
|------|-----------|-------------|
| **1. Dart HttpClient** | `dart:io` → BoringSSL в `libflutter.so` | Основной трафик API. Свой root store (не Android). `network_security_config.xml` не влияет. |
| **2. OkHttp (Java)** | `zk.u` (обфусцированный OkHttpClient) | VK SDK, Yandex Varioqub. |
| **3. Yandex Ads SDK** | `yads.qu2` (X509ExtendedTrustManager) + `yads.mw2` | Кастомный TrustManager с fallback на pinned-сертификаты из ресурсов APK. |
| **4. Android System** | `RootTrustManager` / `TrustManagerImpl` / Conscrypt | Стандартная проверка через `network_security_config.xml`. |

### Что было создано (версии скриптов)

| Версия | Статус | Ключевые проблемы |
|--------|--------|-------------------|
| **v4** (оригинальный) | ❌ Неработоспособен | 3 критических бага: бесконечная рекурсия `SSLContext.init`, каскадная рекурсия `makePermissiveSSF()`, HttpsURLConnection рекурсия |
| **v2** (первая попытка) | ❌ Отклонён | 2 fatal regression: `SSLContext.init` сделан no-op (контекст не инициализируется), `onLeave` запись нулей в случайные смещения `SSL_CTX` (повреждение памяти) |
| **v3** (исправленный) | ✅ Синтаксически корректен | Основная стратегия: `TMF.getTrustManagers()` — единая точка инъекции. `SSLContext.init` не трогается. `RootTrustManager` + `Conscrypt` → noop. |
| **v3.1** (расширенный) | ⚠️ Требует проверки | Добавлены: нативные хуки `exit()` / `_exit()` / `abort()` для блокировки PairIP kill, pattern-scan stripped `libflutter.so`. |

### Что НЕ сработало

1. **Native BoringSSL hooks в release-сборке**: `libflutter.so` в release — stripped, символы `SSL_set_custom_verify` / `SSL_CTX_set_verify` отсутствуют в dynamic symbol table. `Module.findExportByName()` возвращает `null`.
2. **Pattern-scan** (v3.1): попытка найти функции по байтовым паттернам из `libssl.so` — ненадёжно, зависит от версии BoringSSL и требует тестирования на реальном устройстве.
3. **Dart HttpClient bypass**: основной трафик идёт через `dart:io`, который использует собственный BoringSSL и собственный certificate store. Без работающих native-хуков трафик Dart не перехватывается.
4. **PairIP License Check**: приложение вызывает `System.exit(0)` в `attachBaseContext()` до запуска `Java.perform()`. Требуется нативный хук `libc.exit()` (добавлен в v3.1, не проверен).
5. **Attach mode race condition**: при подключении к уже запущенному приложению, SSL-контекст уже проинициализирован с verify mode ≠ 0.

### Предполагаемая задача: корректный Frida-скрипт для обхода

Необходимо написать скрипт со следующей стратегией:

**Уровень 1 — Java SSL (рабочий)**: 
- `TrustManagerFactory.getTrustManagers()` → возвращает permissive TrustManager (все сертификаты доверенны)
- `RootTrustManager.checkServerTrusted` (все overloads) → noop
- `Conscrypt TrustManagerImpl.checkServerTrusted` (все overloads) → noop
- `yads.qu2.checkServerTrusted` (все overloads) → noop
- OkHttp `hl.n.m()` / `hl.n.l()` → permissive
- `PairIP LicenseClient.checkLicense` → noop
- `PairIP LicenseClient.performLocalInstallerCheck` → return true
- **Нативный** `libc.exit()` hook — блокировка до старта JVM

**Уровень 2 — Dart/BoringSSL (ключевая проблема)**:
- Символы BoringSSL stripped в release → `Module.findExportByName` не находит
- Альтернативные подходы:
  - **APK repackaging**: `android:debuggable=true` → Flutter использует debug-сборку libflutter.so с символами
  - **Frida Gadget**: встроить gadget в APK
  - **Dart-уровень**: хук `HttpClient.badCertificateCallback`
  - **System certificate**: установить CA в системное хранилище (для Java-трафика)
  - **iptables + transparent proxy**: перенаправление трафика без расшифровки TLS

**Рекомендуемый подход**: APK repackaging с `android:debuggable=true` + user CA certificate + v3 скрипт для Java-слоя.

### Инструкция по запуску (для тестирующих)

Скрипт и отчёт передаются отдельно. Запуск и проверка на реальном устройстве выполняются на стороне тестирующего.

```bash
# Рекомендуемый способ (spawn mode):
frida -U -f com.twinby -l frida_bypass_ssl_pinning_v3.js --no-pause

# Attach mode:
frida -U com.twinby -l frida_bypass_ssl_pinning_v3.js
# После загрузки — перезапустить приложение вручную
```

**Необходимо также**:
- Установить CA-сертификат прокси (Burp/Charles) как **system certificate** на устройство (Android 7+ требует system certs для targetSdk ≥ 24)
- Либо использовать Magisk модуль `MoveCertificate`

---

## Ключевые обфусцированные классы

| Класс | Роль |
|-------|------|
| `zk.u` | OkHttpClient |
| `zk.t` | OkHttpClient.Builder |
| `hl.n` | OkHttp Platform (Android) |
| `ll.c` | OkHttp HostnameVerifier |
| `yads.qu2` | Yandex Ads TrustManager |
| `yads.mw2` | Yandex Ads delegate |