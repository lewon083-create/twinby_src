package g0;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f19505k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f19506l = com.google.android.gms.internal.auth.g.v("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f19507m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f19508n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19509a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19510b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19511c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j1.h f19512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1.k f19513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1.h f19514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1.k f19515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f19516h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f19517j;

    public a1(Size size, int i) {
        this.f19516h = size;
        this.i = i;
        final int i10 = 0;
        j1.k kVarW = i0.o.w(new j1.i(this) { // from class: g0.y0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a1 f19806c;

            {
                this.f19806c = this;
            }

            @Override // j1.i
            public final Object m(j1.h hVar) {
                switch (i10) {
                    case 0:
                        a1 a1Var = this.f19806c;
                        synchronized (a1Var.f19509a) {
                            a1Var.f19512d = hVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + a1Var + ")";
                    default:
                        a1 a1Var2 = this.f19806c;
                        synchronized (a1Var2.f19509a) {
                            a1Var2.f19514f = hVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + a1Var2 + ")";
                }
            }
        });
        this.f19513e = kVarW;
        final int i11 = 1;
        this.f19515g = i0.o.w(new j1.i(this) { // from class: g0.y0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a1 f19806c;

            {
                this.f19806c = this;
            }

            @Override // j1.i
            public final Object m(j1.h hVar) {
                switch (i11) {
                    case 0:
                        a1 a1Var = this.f19806c;
                        synchronized (a1Var.f19509a) {
                            a1Var.f19512d = hVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + a1Var + ")";
                    default:
                        a1 a1Var2 = this.f19806c;
                        synchronized (a1Var2.f19509a) {
                            a1Var2.f19514f = hVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + a1Var2 + ")";
                }
            }
        });
        if (com.google.android.gms.internal.auth.g.v("DeferrableSurface")) {
            e(f19508n.incrementAndGet(), f19507m.get(), "Surface created");
            kVarW.f26173c.a(new e1.y(20, this, Log.getStackTraceString(new Exception())), hl.d.j());
        }
    }

    public void a() {
        j1.h hVar;
        synchronized (this.f19509a) {
            try {
                if (this.f19511c) {
                    hVar = null;
                } else {
                    this.f19511c = true;
                    this.f19514f.b(null);
                    if (this.f19510b == 0) {
                        hVar = this.f19512d;
                        this.f19512d = null;
                    } else {
                        hVar = null;
                    }
                    if (com.google.android.gms.internal.auth.g.v("DeferrableSurface")) {
                        com.google.android.gms.internal.auth.g.e("DeferrableSurface", "surface closed,  useCount=" + this.f19510b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (hVar != null) {
            hVar.b(null);
        }
    }

    public final void b() {
        j1.h hVar;
        synchronized (this.f19509a) {
            try {
                int i = this.f19510b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i10 = i - 1;
                this.f19510b = i10;
                if (i10 == 0 && this.f19511c) {
                    hVar = this.f19512d;
                    this.f19512d = null;
                } else {
                    hVar = null;
                }
                if (com.google.android.gms.internal.auth.g.v("DeferrableSurface")) {
                    com.google.android.gms.internal.auth.g.e("DeferrableSurface", "use count-1,  useCount=" + this.f19510b + " closed=" + this.f19511c + " " + this);
                    if (this.f19510b == 0) {
                        e(f19508n.get(), f19507m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (hVar != null) {
            hVar.b(null);
        }
    }

    public final ed.d c() {
        synchronized (this.f19509a) {
            try {
                if (this.f19511c) {
                    return new k0.l(1, new z0("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f19509a) {
            try {
                int i = this.f19510b;
                if (i == 0 && this.f19511c) {
                    throw new z0("Cannot begin use on a closed surface.", this);
                }
                this.f19510b = i + 1;
                if (com.google.android.gms.internal.auth.g.v("DeferrableSurface")) {
                    if (this.f19510b == 1) {
                        e(f19508n.get(), f19507m.incrementAndGet(), "New surface in use");
                    }
                    com.google.android.gms.internal.auth.g.e("DeferrableSurface", "use count+1, useCount=" + this.f19510b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(int i, int i10, String str) {
        if (!f19506l && com.google.android.gms.internal.auth.g.v("DeferrableSurface")) {
            com.google.android.gms.internal.auth.g.e("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        com.google.android.gms.internal.auth.g.e("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i10 + "](" + this + "}");
    }

    public abstract ed.d f();
}
