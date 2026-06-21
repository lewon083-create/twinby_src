package com.google.android.gms.internal.ads;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bz extends xy implements wx {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jz f3968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3971h;
    public py i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3973k;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(u9.d.d(str, "MD5")));
    }

    public static String p(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        l7.o.t(sb2, str, "/", canonicalName, StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void a() {
        jz jzVar = this.f3968e;
        if (jzVar != null) {
            jzVar.f7018k = null;
            vu1 vu1Var = jzVar.f7016h;
            if (vu1Var != null) {
                vu1Var.f11492e.b();
                vu1Var.f11491d.H1(jzVar);
                vu1 vu1Var2 = jzVar.f7016h;
                vu1Var2.f11492e.b();
                vu1Var2.f11491d.I1();
                jzVar.f7016h = null;
                jz.f7009w.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final boolean b(String str) {
        return c(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.sz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.bz, com.google.android.gms.internal.ads.xy] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.bz, com.google.android.gms.internal.ads.xy] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.bz, com.google.android.gms.internal.ads.xy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.xy
    public final boolean c(String str, String[] strArr) throws Throwable {
        ?? r42;
        boolean z5;
        ?? r22;
        ?? r23;
        ?? r12;
        String str2;
        String str3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        ?? r13 = this;
        ?? r24 = str;
        r13.f3969f = r24;
        ?? O = o(r24);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        boolean z10 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            jz jzVar = r13.f3968e;
            jzVar.getClass();
            jzVar.u(uriArr, ByteBuffer.allocate(0), false);
            ?? r02 = (sz) r13.f12373d.get();
            if (r02 != 0) {
                r02.V0(O, r13);
            }
            p9.k.C.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            wk wkVar = al.Z;
            q9.s sVar = q9.s.f31967e;
            long jLongValue = ((Long) sVar.f31970c.a(wkVar)).longValue();
            long jLongValue2 = ((Long) sVar.f31970c.a(al.Y)).longValue() * 1000;
            long jIntValue = ((Integer) sVar.f31970c.a(al.f3247w)).intValue();
            boolean zBooleanValue = ((Boolean) sVar.f31970c.a(al.f3118n2)).booleanValue();
            long j16 = -1;
            r13 = r13;
            r24 = r24;
            O = O;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str6 = str5;
                            long j17 = jLongValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j17).length() + 27);
                            sb2.append(str6);
                            sb2.append(j17);
                            sb2.append(str4);
                            throw new IOException(sb2.toString());
                        }
                        if (r13.f3970g) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (r13.f3971h) {
                            return true;
                        }
                        vu1 vu1Var = r13.f3968e.f7016h;
                        if (!(vu1Var != null ? true : z10)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jF1 = vu1Var.F1();
                        if (jF1 > 0) {
                            long jG1 = r13.f3968e.f7016h.G1();
                            if (jG1 != j16) {
                                boolean z11 = jG1 > 0 ? true : z10;
                                if (zBooleanValue) {
                                    try {
                                        jz jzVar2 = r13.f3968e;
                                        j15 = (jzVar2.f7027t == null || !jzVar2.f7027t.f5516q) ? jzVar2.f7019l : 0L;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r42 = O;
                                        z5 = false;
                                        r12 = r13;
                                        r23 = r24;
                                    }
                                } else {
                                    j15 = -1;
                                }
                                long jP = zBooleanValue ? r13.f3968e.p() : -1L;
                                long jQ = zBooleanValue ? r13.f3968e.q() : -1L;
                                try {
                                    int i10 = jz.f7008v.get();
                                    int i11 = jz.f7009w.get();
                                    kw0 kw0Var = u9.d.f34372b;
                                    str2 = str4;
                                    str3 = str5;
                                    j13 = jLongValue;
                                    j11 = jIntValue;
                                    j10 = jLongValue2;
                                    long j18 = jP;
                                    z5 = false;
                                    try {
                                        sy syVar = new sy(r13, r24, O, jG1, jF1, j15, j18, jQ, z11, i10, i11);
                                        j14 = jG1;
                                        r42 = jF1;
                                        kw0Var.post(syVar);
                                        j16 = j14;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r22 = this;
                                        r42 = O;
                                        O = str;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z5 = false;
                                    r22 = this;
                                    r42 = O;
                                    O = str;
                                    throw th;
                                }
                            } else {
                                str2 = str4;
                                str3 = str5;
                                z5 = z10;
                                j13 = jLongValue;
                                r42 = jF1;
                                j14 = jG1;
                                j10 = jLongValue2;
                                j11 = jIntValue;
                            }
                            r22 = (j14 > r42 ? 1 : (j14 == r42 ? 0 : -1));
                            if (r22 >= 0) {
                                bz bzVar = this;
                                String str7 = str;
                                try {
                                    u9.d.f34372b.post(new vy(bzVar, str7, (String) O, (long) r42));
                                    return true;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r42 = O;
                                    r12 = bzVar;
                                    r23 = str7;
                                }
                            } else {
                                try {
                                    bz bzVar2 = this;
                                    r42 = O;
                                    O = str;
                                    if (bzVar2.f3968e.f7019l >= j11 && j14 > 0) {
                                        return true;
                                    }
                                    j12 = j13;
                                    r22 = bzVar2;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        } else {
                            str2 = str4;
                            str3 = str5;
                            z5 = z10;
                            j10 = jLongValue2;
                            j11 = jIntValue;
                            r42 = O;
                            O = r24;
                            r22 = r13;
                            j12 = jLongValue;
                        }
                        try {
                            r22.wait(j12);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r42 = O;
                        z5 = z10;
                        r12 = r13;
                        r23 = r24;
                    }
                    O = r23;
                    r22 = r12;
                }
                try {
                    throw th;
                } catch (Exception e3) {
                    e = e3;
                    String message = e.getMessage();
                    ?? sb3 = new StringBuilder(String.valueOf((Object) O).length() + 34 + String.valueOf(message).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(O);
                    sb3.append(" Exception: ");
                    sb3.append(message);
                    u9.i.h(sb3.toString());
                    p9.k.C.f31302h.e("VideoStreamExoPlayerCache.preload", e);
                    r22.a();
                    r22.l(O, r42, "error", p("error", e));
                    return z5;
                }
                jLongValue = j12;
                r13 = r22;
                r24 = O;
                O = r42;
                jLongValue2 = j10;
                jIntValue = j11;
                z10 = z5;
                str4 = str2;
                str5 = str3;
            }
        } catch (Exception e7) {
            e = e7;
            r42 = O;
            z5 = z10;
            O = r24;
            r22 = r13;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final boolean e(String str, String[] strArr, py pyVar) {
        this.f3969f = str;
        this.i = pyVar;
        String strO = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            jz jzVar = this.f3968e;
            jzVar.getClass();
            jzVar.u(uriArr, ByteBuffer.allocate(0), false);
            sz szVar = (sz) this.f12373d.get();
            if (szVar != null) {
                szVar.V0(strO, this);
            }
            p9.k.C.f31304k.getClass();
            this.f3972j = System.currentTimeMillis();
            this.f3973k = -1L;
            t9.g0.f33596l.postDelayed(new s(22, this), 0L);
            return true;
        } catch (Exception e3) {
            String message = e3.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            u9.i.h(sb2.toString());
            p9.k.C.f31302h.e("VideoStreamExoPlayerCache.preload", e3);
            a();
            l(str, strO, "error", p("error", e3));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void f(int i) {
        ez ezVar = this.f3968e.f7011c;
        synchronized (ezVar) {
            ezVar.f5146c = ((long) i) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void h(int i) {
        ez ezVar = this.f3968e.f7011c;
        synchronized (ezVar) {
            ezVar.f5145b = ((long) i) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void i(int i) {
        ez ezVar = this.f3968e.f7011c;
        synchronized (ezVar) {
            ezVar.f5147d = ((long) i) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void j(int i) {
        ez ezVar = this.f3968e.f7011c;
        synchronized (ezVar) {
            ezVar.f5148e = ((long) i) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void k() {
        synchronized (this) {
            this.f3970g = true;
            notify();
            a();
        }
        String str = this.f3969f;
        if (str != null) {
            l(this.f3969f, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void u() {
        u9.i.h("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void v(long j10, boolean z5) {
        sz szVar = (sz) this.f12373d.get();
        if (szVar != null) {
            hx.f6284f.execute(new iy(szVar, z5, j10, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void x(String str, Exception exc) {
        u9.i.i("Precache error", exc);
        p9.k.C.f31302h.e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void y(IOException iOException) {
        u9.i.i("Precache exception", iOException);
        p9.k.C.f31302h.e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void Y(int i) {
    }

    @Override // com.google.android.gms.internal.ads.wx
    public final void w(int i, int i10) {
    }
}
