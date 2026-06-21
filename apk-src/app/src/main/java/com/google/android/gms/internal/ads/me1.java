package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 extends h41 implements zj1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7874h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n90 f7875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n90 f7876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public db1 f7877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HttpURLConnection f7878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InputStream f7879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7883r;

    public /* synthetic */ me1(String str, int i, int i10, boolean z5, n90 n90Var) {
        super(true);
        this.i = str;
        this.f7873g = i;
        this.f7874h = i10;
        this.f7872f = z5;
        this.f7875j = n90Var;
        this.f7876k = new n90(23);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.ct1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(byte[] r7, int r8, int r9) throws com.google.android.gms.internal.ads.ih1 {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f7882q     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f7883r     // Catch: java.io.IOException -> L1e
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
            java.io.InputStream r0 = r6.f7879n     // Catch: java.io.IOException -> L1e
            java.lang.String r1 = com.google.android.gms.internal.ads.cq0.f4293a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f7883r     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f7883r = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            java.lang.String r8 = com.google.android.gms.internal.ads.cq0.f4293a
            r8 = 2
            com.google.android.gms.internal.ads.ih1 r7 = com.google.android.gms.internal.ads.ih1.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me1.C(byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f7878m;
        return httpURLConnection == null ? w51.f11648h : new wd1(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        try {
            InputStream inputStream = this.f7879n;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    String str = cq0.f4293a;
                    throw new ih1(e3, 2000, 3);
                }
            }
        } finally {
            this.f7879n = null;
            j();
            if (this.f7880o) {
                this.f7880o = false;
                f();
            }
            this.f7878m = null;
            this.f7877l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection h(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f7873g
            r5.setConnectTimeout(r0)
            int r0 = r4.f7874h
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.n90 r1 = r4.f7875j
            java.util.Map r1 = r1.e()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.n90 r1 = r4.f7876k
            java.util.Map r1 = r1.e()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L72
        L5c:
            r6 = r0
        L5d:
            java.lang.String r12 = "bytes="
            java.lang.String r0 = "-"
            java.lang.StringBuilder r12 = gf.a.n(r12, r0, r6)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L6e
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L6e:
            java.lang.String r6 = r12.toString()
        L72:
            if (r6 == 0) goto L79
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L79:
            java.lang.String r6 = r4.i
            if (r6 == 0) goto L82
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L82:
            r6 = 1
            if (r6 == r10) goto L88
            java.lang.String r6 = "identity"
            goto L8a
        L88:
            java.lang.String r6 = "gzip"
        L8a:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.db1.f4543f
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me1.h(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL i(URL url, String str) throws ih1 {
        if (str == null) {
            throw new ih1("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ih1("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f7872f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(pe.a.b(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new ih1(sb2.toString(), 2001, 1);
        } catch (MalformedURLException e3) {
            throw new ih1(e3, 2001, 1);
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.f7878m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                rs.H("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(com.google.android.gms.internal.ads.db1 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.me1.k(com.google.android.gms.internal.ads.db1):long");
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f7878m;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        db1 db1Var = this.f7877l;
        if (db1Var != null) {
            return db1Var.f4544a;
        }
        return null;
    }
}
