package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClient f25264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f25265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f25266c;

    public c(@NotNull NetworkClient networkClient, @NotNull Request request, @NotNull d dVar) {
        this.f25264a = networkClient;
        this.f25265b = request;
        this.f25266c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f25265b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f25264a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f25264a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f25264a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f25264a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f25265b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f25264a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    @NotNull
    public final Response execute() {
        Map<String, List<String>> headerFields;
        int responseCode;
        Throwable th2;
        String string;
        boolean z5;
        try {
            d dVar = this.f25266c;
            String url = this.f25265b.getUrl();
            dVar.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f25265b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrA = new byte[0];
            byte[] bArrA2 = new byte[0];
            try {
                a(httpsURLConnection);
                if (Intrinsics.a(this.f25265b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f25265b.getBody());
                            outputStream.flush();
                            Unit unit = Unit.f27471a;
                            outputStream.close();
                        } finally {
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
                try {
                    headerFields = httpsURLConnection.getHeaderFields();
                } catch (Throwable th3) {
                    th = th3;
                    headerFields = null;
                }
                try {
                    bArrA = e.a(this.f25264a.getMaxResponseSize(), new a(httpsURLConnection));
                    bArrA2 = e.a(this.f25264a.getMaxResponseSize(), new b(httpsURLConnection));
                    string = httpsURLConnection.getURL().toString();
                    th2 = null;
                    z5 = true;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    string = null;
                    z5 = false;
                }
            } catch (Throwable th5) {
                th = th5;
                headerFields = null;
                responseCode = 0;
            }
            byte[] bArr = bArrA;
            byte[] bArr2 = bArrA2;
            int i = responseCode;
            Map<String, List<String>> map = headerFields;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z5, i, bArr, bArr2, map, th2, string);
        } catch (Throwable th6) {
            return new Response(th6);
        }
    }

    public c(@NotNull NetworkClient networkClient, @NotNull Request request) {
        this(networkClient, request, new d());
    }
}
