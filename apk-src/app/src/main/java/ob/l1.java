package ob;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements t1 {
    public static volatile l1 F;
    public volatile boolean A;
    public int B;
    public int C;
    public final long E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l7.b f30262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f30263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f30264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f30265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1 f30266h;
    public final k3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4 f30267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f30268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ua.a f30269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u2 f30270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k2 f30271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f30272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n2 f30273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f30274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n0 f30275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d3 f30276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f30277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f30278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o2 f30279v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f30281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f30282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Boolean f30283z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f30280w = false;
    public final AtomicInteger D = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l1(ci.e r11) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.l1.<init>(ci.e):void");
    }

    public static final void f(b0 b0Var) {
        if (b0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void h(e1.d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void i(f0 f0Var) {
        if (f0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f0Var.f30106c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f0Var.getClass())));
        }
    }

    public static final void k(s1 s1Var) {
        if (s1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!s1Var.f30419c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(s1Var.getClass())));
        }
    }

    public static l1 r(Context context, com.google.android.gms.internal.measurement.t0 t0Var, Long l10) {
        Bundle bundle;
        if (t0Var != null) {
            Bundle bundle2 = t0Var.f13972e;
            t0Var = new com.google.android.gms.internal.measurement.t0(t0Var.f13969b, t0Var.f13970c, t0Var.f13971d, bundle2, null);
        }
        pa.c0.i(context);
        pa.c0.i(context.getApplicationContext());
        if (F == null) {
            synchronized (l1.class) {
                try {
                    if (F == null) {
                        F = new l1(new ci.e(context, t0Var, l10));
                    }
                } finally {
                }
            }
        } else if (t0Var != null && (bundle = t0Var.f13972e) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            pa.c0.i(F);
            F.f30283z = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        pa.c0.i(F);
        return F;
    }

    public final boolean a() {
        return c() == 0;
    }

    @Override // ob.t1
    public final s0 b() {
        s0 s0Var = this.f30265g;
        k(s0Var);
        return s0Var;
    }

    public final int c() {
        i1 i1Var = this.f30266h;
        k(i1Var);
        i1Var.C();
        g gVar = this.f30263e;
        if (gVar.P()) {
            return 1;
        }
        k(i1Var);
        i1Var.C();
        if (!this.A) {
            return 8;
        }
        z0 z0Var = this.f30264f;
        h(z0Var);
        z0Var.C();
        Boolean boolValueOf = z0Var.G().contains("measurement_enabled") ? Boolean.valueOf(z0Var.G().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        l7.b bVar = ((l1) gVar.f15951b).f30262d;
        Boolean boolO = gVar.O("firebase_analytics_collection_enabled");
        return boolO != null ? boolO.booleanValue() ? 0 : 4 : (this.f30283z == null || this.f30283z.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r6 = this;
            boolean r0 = r6.f30280w
            if (r0 == 0) goto L96
            ob.i1 r0 = r6.f30266h
            k(r0)
            r0.C()
            java.lang.Boolean r0 = r6.f30281x
            ua.a r1 = r6.f30269l
            if (r0 == 0) goto L34
            long r2 = r6.f30282y
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f30282y
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f30282y = r0
            ob.e4 r0 = r6.f30267j
            h(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.Y(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.Y(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f30260b
            ti.b r3 = wa.b.a(r1)
            boolean r3 = r3.e()
            r4 = 1
            if (r3 != 0) goto L74
            ob.g r3 = r6.f30263e
            boolean r3 = r3.F()
            if (r3 != 0) goto L74
            boolean r3 = ob.e4.r0(r1)
            if (r3 == 0) goto L75
            boolean r1 = ob.e4.V(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f30281x = r1
            if (r2 == 0) goto L8f
            ob.l0 r1 = r6.q()
            java.lang.String r1 = r1.J()
            boolean r0 = r0.G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f30281x = r0
        L8f:
            java.lang.Boolean r0 = r6.f30281x
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.l1.d():boolean");
    }

    @Override // ob.t1
    public final i1 e() {
        i1 i1Var = this.f30266h;
        k(i1Var);
        return i1Var;
    }

    @Override // ob.t1
    public final l7.b g() {
        return this.f30262d;
    }

    @Override // ob.t1
    public final Context j() {
        return this.f30260b;
    }

    public final o0 l() {
        return this.f30268k;
    }

    public final n0 m() {
        i(this.f30275r);
        return this.f30275r;
    }

    public final d3 n() {
        i(this.f30276s);
        return this.f30276s;
    }

    @Override // ob.t1
    public final ua.a o() {
        return this.f30269l;
    }

    public final q p() {
        k(this.f30277t);
        return this.f30277t;
    }

    public final l0 q() {
        i(this.f30278u);
        return this.f30278u;
    }
}
