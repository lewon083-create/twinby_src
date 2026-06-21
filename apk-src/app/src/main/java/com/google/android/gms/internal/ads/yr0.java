package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements xr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12695a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12709p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12696b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12697c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12698d = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12710q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12711r = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12699e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12700f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12701g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12702h = "";
    public String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12703j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f12704k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12705l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f12706m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12707n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12708o = false;

    public yr0(Context context, int i) {
        this.f12695a = context;
        this.f12709p = i;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 D(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 a(boolean z5) {
        synchronized (this) {
            this.f12698d = z5;
        }
        return this;
    }

    public final synchronized void b() {
        Configuration configuration;
        p9.k kVar = p9.k.C;
        t9.h0 h0Var = kVar.f31300f;
        Context context = this.f12695a;
        this.f12699e = h0Var.q(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f12711r = i;
        kVar.f31304k.getClass();
        this.f12696b = SystemClock.elapsedRealtime();
        this.f12708o = true;
    }

    public final synchronized void c() {
        p9.k.C.f31304k.getClass();
        this.f12697c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final boolean e() {
        return !TextUtils.isEmpty(this.f12702h);
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 f(String str) {
        synchronized (this) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.U9)).booleanValue()) {
                this.f12706m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 g(Throwable th2) {
        synchronized (this) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.U9)).booleanValue()) {
                String strD = u9.d.d(xt.f(th2), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                this.f12705l = strD;
                String strF = xt.f(th2);
                xo0 xo0VarC = xo0.c(new b31('\n'));
                strF.getClass();
                this.f12704k = (String) ((m31) ((n31) xo0VarC.f12221c).e(xo0VarC, strF)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final /* bridge */ /* synthetic */ xr0 h() {
        b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final synchronized boolean j() {
        return this.f12708o;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final /* bridge */ /* synthetic */ xr0 l() {
        c();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.f12701g = r0;
     */
    @Override // com.google.android.gms.internal.ads.xr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.xr0 m(com.google.android.gms.internal.ads.cw r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f4348d     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zp0 r0 = (com.google.android.gms.internal.ads.zp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f13056b     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            r2.f12700f = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L32
        L12:
            java.lang.Object r3 = r3.f4347c     // Catch: java.lang.Throwable -> L10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.xp0 r0 = (com.google.android.gms.internal.ads.xp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f12230b0     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            r2.f12701g = r0     // Catch: java.lang.Throwable -> L10
        L30:
            monitor-exit(r2)
            return r2
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yr0.m(com.google.android.gms.internal.ads.cw):com.google.android.gms.internal.ads.xr0");
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 n(q9.x1 x1Var) {
        synchronized (this) {
            try {
                IBinder iBinder = x1Var.f31980f;
                if (iBinder != null) {
                    e60 e60Var = (e60) iBinder;
                    String str = e60Var.f4846e;
                    if (!TextUtils.isEmpty(str)) {
                        this.f12700f = str;
                    }
                    String str2 = e60Var.f4844c;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f12701g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 o(int i) {
        synchronized (this) {
            this.f12710q = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final synchronized zr0 p() {
        try {
            if (this.f12707n) {
                return null;
            }
            this.f12707n = true;
            if (!this.f12708o) {
                b();
            }
            if (this.f12697c < 0) {
                c();
            }
            return new zr0(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 t(int i) {
        synchronized (this) {
            this.f12703j = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xr0
    public final xr0 v0(String str) {
        synchronized (this) {
            this.f12702h = str;
        }
        return this;
    }
}
