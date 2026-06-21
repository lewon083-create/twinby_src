package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class td0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43278h;
    public final u11 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u11 f43279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f43280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qg2 f43281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f43282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f43283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f43286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f43287r;

    public td0(String str, int i, int i10, boolean z5, u11 u11Var) {
        super(true);
        this.f43278h = str;
        this.f43276f = i;
        this.f43277g = i10;
        this.f43275e = z5;
        this.i = u11Var;
        this.f43281l = null;
        this.f43279j = new u11();
        this.f43280k = false;
    }

    public final URL a(URL url, String str) throws r11 {
        if (str == null) {
            throw new r11("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new r11(com.google.android.gms.internal.ads.om1.k("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f43275e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new r11("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e3) {
            throw new r11(e3, 2001, 1);
        }
    }

    public final HttpURLConnection c(u30 u30Var) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(u30Var.f43533a.toString());
        int i = u30Var.f43535c;
        byte[] bArr = u30Var.f43536d;
        long j10 = u30Var.f43538f;
        long j11 = u30Var.f43539g;
        int i10 = 1;
        int i11 = 0;
        boolean z5 = (u30Var.i & 1) == 1;
        if (!this.f43275e && !this.f43280k) {
            return a(url, i, bArr, j10, j11, z5, true, u30Var.f43537e);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new r11(new NoRouteToHostException(og2.a("Too many redirects: ", i12)), 2001, 1);
            }
            httpURLConnectionA = a(url, i, bArr, j10, j11, z5, false, u30Var.f43537e);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i == i10 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                url = a(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionA.disconnect();
                if (!this.f43280k || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = a(url, headerField);
            }
            i11 = i12;
            i10 = 1;
        }
        return httpURLConnectionA;
    }

    @Override // yads.p30
    public final void close() {
        try {
            InputStream inputStream = this.f43283n;
            if (inputStream != null) {
                long j10 = this.f43286q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f43287r;
                }
                a(this.f43282m, j11);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    int i = lb3.f40466a;
                    throw new r11(e3, 2000, 3);
                }
            }
        } finally {
            this.f43283n = null;
            f();
            if (this.f43284o) {
                this.f43284o = false;
                d();
            }
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f43282m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                kh1.b("DefaultHttpDataSource", kh1.a("Unexpected error while disconnecting", e3));
            }
            this.f43282m = null;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f43282m;
        return httpURLConnection == null ? zm2.f45462h : new rd0(httpURLConnection.getHeaderFields());
    }

    @Override // yads.p30
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f43282m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // yads.l30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws yads.r11 {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f43286q     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f43287r     // Catch: java.io.IOException -> L1e
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
            java.io.InputStream r0 = r6.f43283n     // Catch: java.io.IOException -> L1e
            int r1 = yads.lb3.f40466a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f43287r     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f43287r = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            int r8 = yads.lb3.f40466a
            r8 = 2
            yads.r11 r7 = yads.r11.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.td0.read(byte[], int, int):int");
    }

    public final HttpURLConnection a(URL url, int i, byte[] bArr, long j10, long j11, boolean z5, boolean z10, Map map) throws IOException {
        String string;
        String str;
        Map map2;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f43276f);
        httpURLConnectionA.setReadTimeout(this.f43277g);
        HashMap map3 = new HashMap();
        u11 u11Var = this.i;
        if (u11Var != null) {
            synchronized (u11Var) {
                try {
                    if (u11Var.f43522b == null) {
                        u11Var.f43522b = Collections.unmodifiableMap(new HashMap(u11Var.f43521a));
                    }
                    map2 = u11Var.f43522b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map3.putAll(map2);
        }
        map3.putAll(this.f43279j.a());
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = c21.f37251a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sbN = gf.a.n("bytes=", "-", j10);
            if (j11 != -1) {
                sbN.append((j10 + j11) - 1);
            }
            string = sbN.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str2 = this.f43278h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z5 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z10);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i10 = u30.f43532k;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionA;
        }
        httpURLConnectionA.connect();
        return httpURLConnectionA;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i;
        if (httpURLConnection == null || (i = lb3.f40466a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1  */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.u30 r27) throws yads.r11 {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.td0.a(yads.u30):long");
    }

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final void a(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f43283n;
            int i = lb3.f40466a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new r11(new InterruptedIOException(), 2000, 1);
            }
            if (i10 != -1) {
                j10 -= (long) i10;
                c(i10);
            } else {
                throw new r11();
            }
        }
    }
}
