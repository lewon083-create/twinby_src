package yads;

import android.content.Context;
import android.os.Looper;
import yads.sn0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53 f42989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b53 f42990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b53 f42991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b53 f42992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b53 f42993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b53 f42994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xy0 f42995h;
    public final Looper i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pk f42996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f42998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zw2 f42999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yd0 f43000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f43001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f43002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f43003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43004r;

    /* JADX WARN: Illegal instructions before constructor call */
    public sn0(final Context context) {
        final int i = 0;
        final int i10 = 1;
        this(context, new b53() { // from class: zl.y0
            @Override // yads.b53
            public final Object get() {
                switch (i) {
                    case 0:
                        return sn0.a(context);
                    case 1:
                        return sn0.b(context);
                    case 2:
                        return sn0.c(context);
                    default:
                        return sn0.d(context);
                }
            }
        }, new b53() { // from class: zl.y0
            @Override // yads.b53
            public final Object get() {
                switch (i10) {
                    case 0:
                        return sn0.a(context);
                    case 1:
                        return sn0.b(context);
                    case 2:
                        return sn0.c(context);
                    default:
                        return sn0.d(context);
                }
            }
        });
    }

    public static /* synthetic */ uf1 a(uf1 uf1Var) {
        return uf1Var;
    }

    public static /* synthetic */ pe0 b(pe0 pe0Var) {
        return pe0Var;
    }

    public static im d(Context context) {
        dc0 dc0Var;
        synchronized (dc0.class) {
            try {
                if (dc0.f37705t == null) {
                    dc0.f37705t = new dc0(context == null ? null : context.getApplicationContext(), cc0.a(lb3.b(context)), 2000, xv.f44814a, true);
                }
                dc0Var = dc0.f37705t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dc0Var;
    }

    public final sn0 c(pe0 pe0Var) {
        if (this.f43004r) {
            throw new IllegalStateException();
        }
        this.f42990c = new zl.j(3, pe0Var);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sn0(final Context context, b53 b53Var, b53 b53Var2) {
        final int i = 2;
        final int i10 = 3;
        this(context, b53Var, b53Var2, new b53() { // from class: zl.y0
            @Override // yads.b53
            public final Object get() {
                switch (i) {
                    case 0:
                        return sn0.a(context);
                    case 1:
                        return sn0.b(context);
                    case 2:
                        return sn0.c(context);
                    default:
                        return sn0.d(context);
                }
            }
        }, new zl.p0(1), new b53() { // from class: zl.y0
            @Override // yads.b53
            public final Object get() {
                switch (i10) {
                    case 0:
                        return sn0.a(context);
                    case 1:
                        return sn0.b(context);
                    case 2:
                        return sn0.c(context);
                    default:
                        return sn0.d(context);
                }
            }
        }, new zl.g0(22));
    }

    public static zm1 b(Context context) {
        return new ge0(new oc0(context, new pd0()), new od0());
    }

    public final void a(zd0 zd0Var) {
        if (this.f43004r) {
            throw new IllegalStateException();
        }
        this.f42993f = new zl.j(2, zd0Var);
    }

    public sn0(Context context, b53 b53Var, b53 b53Var2, b53 b53Var3, b53 b53Var4, b53 b53Var5, xy0 xy0Var) {
        this.f42988a = context;
        this.f42990c = b53Var;
        this.f42991d = b53Var2;
        this.f42992e = b53Var3;
        this.f42993f = b53Var4;
        this.f42994g = b53Var5;
        this.f42995h = xy0Var;
        this.i = lb3.c();
        this.f42996j = pk.f41937h;
        this.f42997k = 1;
        this.f42998l = true;
        this.f42999m = zw2.f45574c;
        this.f43000n = new xd0().a();
        this.f42989b = xv.f44814a;
        this.f43001o = 500L;
        this.f43002p = 2000L;
        this.f43003q = true;
    }

    public static v73 c(Context context) {
        return new if0(context, af0.a(context), new dc(0));
    }

    public static /* synthetic */ pe0 a(Context context) {
        return new pe0(context);
    }
}
