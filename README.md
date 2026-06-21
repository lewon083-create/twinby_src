# Twinby — Reverse Engineering & SSL Pinning Bypass

## Содержимое репозитория

### `base.apk`
Оригинальный APK-файл приложения **Twinby** (`com.twinby`) — Flutter (Embedding v2), minSdk=24, targetSdk=36. При желании его также можно декомпилировать самостоятельно через `jadx -d <output_dir> base.apk`.

### `apk-src/`
Декомпилированный исходный код `base.apk`, полученный через **jadx**. Содержит:
- Полную Java-декомпиляцию (classes.dex, classes2.dex, classes3.dex)
- Ресурсы (`res/`), включая `res/xml/network_security_config.xml`
- Flutter assets и нативные библиотеки

### Frida-скрипты SSL Pinning Bypass
4 версии скриптов для обхода SSL-пиннинга в Twinby + подробный отчёт с анализом архитектуры:

| Файл | Описание |
|------|----------|
| `frida_bypass_ssl_pinning.js` | v4 — оригинальный скрипт (❌ неработоспособен) |
| `frida_bypass_ssl_pinning_v2.js` | v2 — первая попытка исправления (❌ отклонён) |
| `frida_bypass_ssl_pinning_v3.js` | v3 — Oracle-fixed (✅ синтаксически корректен) |
| `frida_bypass_ssl_pinning_v3_1.js` | v3.1 — расширенная версия с pattern-scan (❌ некорректно) |
| `SSL_PINNING_BYPASS_REPORT.md` | Полный анализ архитектуры SSL/TLS и всех версий скриптов |

---

## SSL Pinning Bypass — работа с Frida

### Архитектура SSL/TLS в Twinby

Приложение использует **3 независимых сетевых слоя**:

| Слой | Технология | Комментарий |
|------|-----------|-------------|
| **1. Dart HttpClient** | `dart:io` → BoringSSL в `libflutter.so` | Основной трафик API. Свой root store (не Android). `network_security_config.xml` не влияет. |
| **2. OkHttp (Java)** | `zk.u` (обфусцированный OkHttpClient) | VK SDK, Yandex Varioqub. |
| **3. Android System** | `RootTrustManager` / `TrustManagerImpl` / Conscrypt | Стандартная проверка через `network_security_config.xml`. |

### Что было создано (версии скриптов)

| Версия | Статус | Ключевые проблемы |
|--------|--------|-------------------|
| **v4** (оригинальный) | ❌ Неработоспособен | 3 критических бага: бесконечная рекурсия `SSLContext.init`, каскадная рекурсия `makePermissiveSSF()`, HttpsURLConnection рекурсия |
| **v2** (первая попытка) | ❌ Отклонён | 2 fatal regression: `SSLContext.init` сделан no-op (контекст не инициализируется), `onLeave` запись нулей в случайные смещения `SSL_CTX` (повреждение памяти) |
| **v3** (исправленный) | ✅ Синтаксически корректен | Основная стратегия: `TMF.getTrustManagers()` — единая точка инъекции. `SSLContext.init` не трогается. `RootTrustManager` + `Conscrypt` → noop. |
| **v3.1** (расширенный) | ❌ Некорректно | Native `exit()` hook блокирует PairIP kill, но сам перехват через `Interceptor.replace` может вызвать `StackOverflowError` при рекурсивных вызовах `exit()`. Pattern-scan ненадёжен: байты функций BoringSSL различаются между версиями `libflutter.so`, матч первого же совпадения по 64 байтам не гарантирует корректный адрес. |

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

---

## Ключевые обфусцированные классы

| Класс | Роль |
|-------|------|
| `zk.u` | OkHttpClient |
| `zk.t` | OkHttpClient.Builder |
| `hl.n` | OkHttp Platform (Android) |
| `ll.c` | OkHttp HostnameVerifier |