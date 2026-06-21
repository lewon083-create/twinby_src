package io.sentry.transport;

import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @NotNull
    private final SentryOptions options;

    @Nullable
    private final Proxy proxy;

    @NotNull
    private final RateLimiter rateLimiter;

    @NotNull
    private final RequestDetails requestDetails;

    public HttpConnection(@NotNull SentryOptions sentryOptions, @NotNull RequestDetails requestDetails, @NotNull RateLimiter rateLimiter) {
        this(sentryOptions, requestDetails, AuthenticatorWrapper.getInstance(), rateLimiter);
    }

    private void closeAndDisconnect(@NotNull HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @NotNull
    private HttpURLConnection createConnection() throws IOException {
        HttpURLConnection httpURLConnectionOpen = open();
        for (Map.Entry<String, String> entry : this.requestDetails.getHeaders().entrySet()) {
            httpURLConnectionOpen.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionOpen.setRequestMethod("POST");
        httpURLConnectionOpen.setDoOutput(true);
        httpURLConnectionOpen.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionOpen.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionOpen.setRequestProperty("Accept", "application/json");
        httpURLConnectionOpen.setRequestProperty("Connection", "close");
        httpURLConnectionOpen.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        httpURLConnectionOpen.setReadTimeout(this.options.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if ((httpURLConnectionOpen instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionOpen).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionOpen.connect();
        return httpURLConnectionOpen;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getErrorMessageFromStream(@org.jetbrains.annotations.NotNull java.net.HttpURLConnection r5) {
        /*
            r4 = this;
            java.io.InputStream r5 = r5.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r2 = io.sentry.transport.HttpConnection.UTF_8     // Catch: java.lang.Throwable -> L38
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r2 = 1
        L16:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L26
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3a
        L26:
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            goto L16
        L2b:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L37
            r5.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r1     // Catch: java.lang.Throwable -> L38
        L43:
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r5 = move-exception
            r0.addSuppressed(r5)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r0     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r5 = "Failed to obtain error message while analyzing send failure."
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.HttpConnection.getErrorMessageFromStream(java.net.HttpURLConnection):java.lang.String");
    }

    private boolean isSuccessfulResponseCode(int i) {
        return i == 200;
    }

    @NotNull
    private TransportResult readAndLog(@NotNull HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                updateRetryAfterLimits(httpURLConnection, responseCode);
                if (isSuccessfulResponseCode(responseCode)) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    TransportResult transportResultSuccess = TransportResult.success();
                    closeAndDisconnect(httpURLConnection);
                    return transportResultSuccess;
                }
                if (responseCode == 413) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                } else {
                    this.options.getLogger().log(SentryLevel.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                }
                if (this.options.isDebug()) {
                    this.options.getLogger().log(SentryLevel.ERROR, "%s", getErrorMessageFromStream(httpURLConnection));
                }
                TransportResult transportResultError = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return transportResultError;
            } catch (IOException e3) {
                this.options.getLogger().log(SentryLevel.ERROR, e3, "Error reading and logging the response stream", new Object[0]);
                closeAndDisconnect(httpURLConnection);
                return TransportResult.error();
            }
        } catch (Throwable th2) {
            closeAndDisconnect(httpURLConnection);
            throw th2;
        }
    }

    @Nullable
    private Proxy resolveProxy(@Nullable SentryOptions.Proxy proxy) {
        if (proxy == null) {
            return null;
        }
        String port = proxy.getPort();
        String host = proxy.getHost();
        if (port == null || host == null) {
            return null;
        }
        try {
            return new Proxy(proxy.getType() != null ? proxy.getType() : Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
        } catch (NumberFormatException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, e3, "Failed to parse Sentry Proxy port: " + proxy.getPort() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    @Nullable
    public Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    public HttpURLConnection open() {
        return (HttpURLConnection) (this.proxy == null ? this.requestDetails.getUrl().openConnection() : this.requestDetails.getUrl().openConnection(this.proxy));
    }

    @NotNull
    public TransportResult send(@NotNull SentryEnvelope sentryEnvelope) {
        TransportResult andLog;
        this.options.getSocketTagger().tagSockets();
        try {
            OutputStream outputStream = createConnection().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return andLog;
    }

    public void updateRetryAfterLimits(@NotNull HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    public HttpConnection(@NotNull SentryOptions sentryOptions, @NotNull RequestDetails requestDetails, @NotNull AuthenticatorWrapper authenticatorWrapper, @NotNull RateLimiter rateLimiter) {
        this.requestDetails = requestDetails;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter;
        Proxy proxyResolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = proxyResolveProxy;
        if (proxyResolveProxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String user = sentryOptions.getProxy().getUser();
        String pass = sentryOptions.getProxy().getPass();
        if (user == null || pass == null) {
            return;
        }
        authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
    }
}
