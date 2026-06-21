package p3;

import ad.g1;
import android.net.TrafficStats;
import android.net.Uri;
import com.google.android.gms.internal.ads.om1;
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

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c {
    public boolean A;
    public int B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f31192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f31193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f31194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f31195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x f31196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f31197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f31198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HttpURLConnection f31199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InputStream f31200z;

    public p(String str, int i, int i10, boolean z5, x xVar) {
        super(true);
        this.f31195u = str;
        this.f31193s = i;
        this.f31194t = i10;
        this.f31192r = z5;
        this.f31196v = xVar;
        this.f31197w = new x();
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f31199y;
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
            InputStream inputStream = this.f31200z;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    String str = m3.z.f28608a;
                    throw new u(e3, 2000, 3);
                }
            }
        } finally {
            this.f31200z = null;
            b();
            if (this.A) {
                this.A = false;
                transferEnded();
            }
            this.f31199y = null;
            this.f31198x = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final URL d(URL url, String str) throws u {
        if (str == null) {
            throw new u("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new u(om1.k("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f31192r || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e3) {
            throw new u(e3, 2001, 1);
        }
    }

    public final HttpURLConnection e(URL url, int i, byte[] bArr, long j10, long j11, boolean z5, boolean z10, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f31193s);
        httpURLConnection.setReadTimeout(this.f31194t);
        HashMap map2 = new HashMap();
        x xVar = this.f31196v;
        if (xVar != null) {
            map2.putAll(xVar.a());
        }
        map2.putAll(this.f31197w.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = y.a(j10, j11);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.f31195u;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z5 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(l.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final HttpURLConnection f(l lVar) throws IOException {
        HttpURLConnection httpURLConnectionE;
        URL url = new URL(lVar.f31172a.toString());
        int i = lVar.f31174c;
        byte[] bArr = lVar.f31175d;
        long j10 = lVar.f31177f;
        long j11 = lVar.f31178g;
        int i10 = 1;
        int i11 = 0;
        boolean z5 = (lVar.i & 1) == 1;
        if (!this.f31192r) {
            return e(url, i, bArr, j10, j11, z5, true, lVar.f31176e);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new u(new NoRouteToHostException(l7.o.i(i12, "Too many redirects: ")), 2001, 1);
            }
            httpURLConnectionE = e(url, i, bArr, j10, j11, z5, false, lVar.f31176e);
            int responseCode = httpURLConnectionE.getResponseCode();
            String headerField = httpURLConnectionE.getHeaderField("Location");
            if ((i == i10 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionE.disconnect();
                url = d(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionE.disconnect();
                url = d(url, headerField);
                bArr = null;
                i = 1;
            }
            i11 = i12;
            i10 = 1;
        }
        return httpURLConnectionE;
    }

    public final void g(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f31200z;
            String str = m3.z.f28608a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new u(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new u();
            }
            j10 -= (long) i;
            bytesTransferred(i);
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f31199y;
        return httpURLConnection == null ? g1.f796h : new o(httpURLConnection.getHeaderFields());
    }

    @Override // p3.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f31199y;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        l lVar = this.f31198x;
        if (lVar != null) {
            return lVar.f31172a;
        }
        return null;
    }

    @Override // p3.h
    public final long open(l lVar) throws u {
        this.f31198x = lVar;
        long j10 = 0;
        this.D = 0L;
        this.C = 0L;
        transferInitializing(lVar);
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            HttpURLConnection httpURLConnectionF = f(lVar);
            long j11 = lVar.f31177f;
            long j12 = lVar.f31178g;
            this.f31199y = httpURLConnectionF;
            this.B = httpURLConnectionF.getResponseCode();
            httpURLConnectionF.getResponseMessage();
            int i = this.B;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionF.getHeaderFields();
                if (this.B == 416 && j11 == y.c(httpURLConnectionF.getHeaderField("Content-Range"))) {
                    this.A = true;
                    transferStarted(lVar);
                    if (j12 != -1) {
                        return j12;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionF.getErrorStream();
                try {
                    if (errorStream != null) {
                        bd.g.b(errorStream);
                    } else {
                        String str = m3.z.f28608a;
                    }
                } catch (IOException unused) {
                    String str2 = m3.z.f28608a;
                }
                b();
                throw new w(this.B, this.B == 416 ? new i(2008) : null, headerFields);
            }
            httpURLConnectionF.getContentType();
            if (this.B == 200 && j11 != 0) {
                j10 = j11;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionF.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j12 != -1) {
                this.C = j12;
            } else {
                long jB = y.b(httpURLConnectionF.getHeaderField("Content-Length"), httpURLConnectionF.getHeaderField("Content-Range"));
                this.C = jB != -1 ? jB - j10 : -1L;
            }
            try {
                this.f31200z = httpURLConnectionF.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f31200z = new GZIPInputStream(this.f31200z);
                }
                this.A = true;
                transferStarted(lVar);
                try {
                    g(j10);
                    return this.C;
                } catch (IOException e3) {
                    b();
                    if (e3 instanceof u) {
                        throw ((u) e3);
                    }
                    throw new u(e3, 2000, 1);
                }
            } catch (IOException e7) {
                b();
                throw new u(e7, 2000, 1);
            }
        } catch (IOException e10) {
            b();
            throw u.a(e10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
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
            long r0 = r6.C     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.D     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.f31200z     // Catch: java.io.IOException -> L32
            java.lang.String r1 = m3.z.f28608a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.D     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.D = r8     // Catch: java.io.IOException -> L32
            r6.bytesTransferred(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            java.lang.String r8 = m3.z.f28608a
            r8 = 2
            p3.u r7 = p3.u.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p.read(byte[], int, int):int");
    }
}
