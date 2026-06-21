package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sd0 extends p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3.x f42906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.x f42907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zc.g f42908h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p3.l f42909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpURLConnection f42910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InputStream f42911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f42914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f42915p;

    public sd0(String str, int i, int i10, boolean z5, boolean z10, p3.x xVar) {
        super(true);
        this.f42905e = str;
        this.f42903c = i;
        this.f42904d = i10;
        this.f42901a = z5;
        this.f42902b = z10;
        if (z5 && z10) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f42906f = xVar;
        this.f42908h = null;
        this.f42907g = new p3.x();
        this.i = false;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f42910k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                m3.b.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
        }
    }

    @Override // p3.h
    public final void close() {
        try {
            InputStream inputStream = this.f42911l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    String str = m3.z.f28608a;
                    throw new p3.u(e3, 2000, 3);
                }
            }
        } finally {
            this.f42911l = null;
            a();
            if (this.f42912m) {
                this.f42912m = false;
                transferEnded();
            }
            this.f42910k = null;
            this.f42909j = null;
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f42910k;
        return httpURLConnection == null ? ad.g1.f796h : new qd0(httpURLConnection.getHeaderFields());
    }

    @Override // p3.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f42910k;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        p3.l lVar = this.f42909j;
        if (lVar != null) {
            return lVar.f31172a;
        }
        return null;
    }

    @Override // p3.h
    public final long open(p3.l lVar) throws p3.u {
        this.f42909j = lVar;
        long j10 = 0;
        this.f42915p = 0L;
        this.f42914o = 0L;
        transferInitializing(lVar);
        try {
            HttpURLConnection httpURLConnectionA = a(lVar);
            this.f42910k = httpURLConnectionA;
            this.f42913n = httpURLConnectionA.getResponseCode();
            httpURLConnectionA.getResponseMessage();
            int i = this.f42913n;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                if (this.f42913n == 416) {
                    if (lVar.f31177f == p3.y.c(httpURLConnectionA.getHeaderField("Content-Range"))) {
                        this.f42912m = true;
                        transferStarted(lVar);
                        long j11 = lVar.f31178g;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionA.getErrorStream();
                try {
                    if (errorStream != null) {
                        bd.g.b(errorStream);
                    } else {
                        String str = m3.z.f28608a;
                    }
                } catch (IOException unused) {
                    String str2 = m3.z.f28608a;
                }
                a();
                throw new p3.w(this.f42913n, this.f42913n == 416 ? new p3.i(2008) : null, headerFields);
            }
            String contentType = httpURLConnectionA.getContentType();
            zc.g gVar = this.f42908h;
            if (gVar != null && !gVar.apply(contentType)) {
                a();
                throw new p3.v(com.google.android.gms.internal.ads.om1.k("Invalid content type: ", contentType), 2003);
            }
            if (this.f42913n == 200) {
                long j12 = lVar.f31177f;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                this.f42914o = lVar.f31178g;
            } else {
                long j13 = lVar.f31178g;
                if (j13 != -1) {
                    this.f42914o = j13;
                } else {
                    long jB = p3.y.b(httpURLConnectionA.getHeaderField("Content-Length"), httpURLConnectionA.getHeaderField("Content-Range"));
                    this.f42914o = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f42911l = httpURLConnectionA.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f42911l = new GZIPInputStream(this.f42911l);
                }
                this.f42912m = true;
                transferStarted(lVar);
                try {
                    a(j10, lVar);
                    return this.f42914o;
                } catch (IOException e3) {
                    a();
                    if (e3 instanceof p3.u) {
                        throw ((p3.u) e3);
                    }
                    throw new p3.u(e3, 2000, 1);
                }
            } catch (IOException e7) {
                a();
                throw new p3.u(e7, 2000, 1);
            }
        } catch (IOException e10) {
            a();
            throw p3.u.a(e10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // j3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws p3.u {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f42914o     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f42915p     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L35
        L20:
            java.io.InputStream r0 = r6.f42911l     // Catch: java.io.IOException -> L1e
            java.lang.String r1 = m3.z.f28608a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f42915p     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f42915p = r8     // Catch: java.io.IOException -> L1e
            r6.bytesTransferred(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            java.lang.String r8 = m3.z.f28608a
            r8 = 2
            p3.u r7 = p3.u.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.sd0.read(byte[], int, int):int");
    }

    public final URL a(URL url, String str, p3.l lVar) throws p3.u {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new p3.u(com.google.android.gms.internal.ads.om1.k("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (this.f42901a || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                if (this.f42902b) {
                    try {
                        return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                    } catch (MalformedURLException e3) {
                        throw new p3.u(e3, 2001, 1);
                    }
                }
                throw new p3.u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
            } catch (MalformedURLException e7) {
                throw new p3.u(e7, 2001, 1);
            }
        }
        throw new p3.u("Null location redirect", 2001);
    }

    public final HttpURLConnection a(p3.l lVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(lVar.f31172a.toString());
        int i = lVar.f31174c;
        byte[] bArr = lVar.f31175d;
        long j10 = lVar.f31177f;
        long j11 = lVar.f31178g;
        int i10 = 1;
        int i11 = 0;
        boolean z5 = (lVar.i & 1) == 1;
        if (!this.f42901a && !this.f42902b && !this.i) {
            return a(url, i, bArr, j10, j11, z5, true, lVar.f31176e);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 <= 20) {
                httpURLConnectionA = a(url, i, bArr, j10, j11, z5, false, lVar.f31176e);
                int responseCode = httpURLConnectionA.getResponseCode();
                String headerField = httpURLConnectionA.getHeaderField("Location");
                if ((i == i10 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    url = a(url, headerField, lVar);
                } else {
                    if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    httpURLConnectionA.disconnect();
                    if (!this.i || responseCode != 302) {
                        bArr = null;
                        i = 1;
                    }
                    url = a(url, headerField, lVar);
                }
                i11 = i12;
                i10 = 1;
            } else {
                throw new p3.u(new NoRouteToHostException(og2.a("Too many redirects: ", i12)), 2001, 1);
            }
        }
        return httpURLConnectionA;
    }

    public final HttpURLConnection a(URL url, int i, byte[] bArr, long j10, long j11, boolean z5, boolean z10, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = ((lu2) this).f40687q;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        httpURLConnection.setConnectTimeout(this.f42903c);
        httpURLConnection.setReadTimeout(this.f42904d);
        HashMap map2 = new HashMap();
        p3.x xVar = this.f42906f;
        if (xVar != null) {
            map2.putAll(xVar.a());
        }
        map2.putAll(this.f42907g.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = p3.y.a(j10, j11);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.f42905e;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z5 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(p3.l.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final void a(long j10, p3.l lVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f42911l;
            String str = m3.z.f28608a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new p3.u(new InterruptedIOException(), 2000, 1);
            }
            if (i != -1) {
                j10 -= (long) i;
                bytesTransferred(i);
            } else {
                throw new p3.u();
            }
        }
    }
}
