package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jw0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o31 f6951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ja1 f6952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f6953d;

    public final HttpURLConnection a(ja1 ja1Var) throws IOException {
        this.f6951b = new mp0(3, (byte) 0);
        this.f6952c = ja1Var;
        ((Integer) this.f6951b.mo8h()).getClass();
        ja1 ja1Var2 = this.f6952c;
        ja1Var2.getClass();
        Set set = yy.f12795g;
        fp fpVar = p9.k.C.f31310q;
        int iIntValue = ((Integer) q9.s.f31967e.f31970c.a(al.f2916a0)).intValue();
        URL url = new URL(ja1Var2.f6802b);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            u9.f fVar = new u9.f();
            fVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            fVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f6953d = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            u9.i.c("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f6953d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
