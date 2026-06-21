package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f11159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f11160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11161c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11164f;
    public boolean i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11170m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11162d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11163e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11165g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11166h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f11167j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c6 f11168k = c6.f4047g;

    public v0(Context context, k0 k0Var) {
        this.f11159a = k0Var;
        this.f11160b = new a1(context, 0);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f11162d = 1;
        } else if (i != 1) {
            this.f11162d = Math.min(this.f11162d, 2);
        } else {
            this.f11162d = 0;
        }
        this.f11160b.e();
    }

    public final void b() {
        this.f11161c = true;
        this.f11168k.getClass();
        this.f11164f = cq0.s(SystemClock.elapsedRealtime());
        a1 a1Var = this.f11160b;
        a1Var.f2697b = true;
        a1Var.e();
        DisplayManager displayManager = (DisplayManager) a1Var.f2696a.getSystemService("display");
        x0 z0Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                z0Var = Build.VERSION.SDK_INT >= 33 ? new z0(choreographer, displayManager) : new y0(choreographer, displayManager, 0);
            } catch (RuntimeException e3) {
                rs.w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
            }
        }
        a1Var.f2713s = z0Var;
        if (z0Var != null) {
            z0Var.g();
        }
        a1Var.g(false);
    }

    public final void c(Surface surface) {
        this.f11169l = surface != null;
        this.f11170m = false;
        a1 a1Var = this.f11160b;
        if (a1Var.f2698c != surface) {
            a1Var.h();
            a1Var.f2698c = surface;
            a1Var.g(true);
        }
        this.f11162d = Math.min(this.f11162d, 1);
    }

    public final void d(float f10) {
        a1 a1Var = this.f11160b;
        a1Var.f2699d = f10;
        d0 d0Var = (d0) a1Var.f2712r;
        ((c0) d0Var.f4406d).d();
        ((c0) d0Var.f4407e).d();
        d0Var.f4403a = false;
        d0Var.f4404b = -9223372036854775807L;
        d0Var.f4405c = 0;
        a1Var.f();
    }

    public final boolean e(boolean z5) {
        if (z5 && (this.f11162d == 3 || (!this.f11169l && this.f11170m))) {
            this.f11166h = -9223372036854775807L;
            return true;
        }
        if (this.f11166h == -9223372036854775807L) {
            return false;
        }
        this.f11168k.getClass();
        if (SystemClock.elapsedRealtime() < this.f11166h) {
            return true;
        }
        this.f11166h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        if (r3 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        if (r33 >= r37) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
    
        if (r30.f11161c != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.u0 r41) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v0.f(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.u0):int");
    }

    public final void g(float f10) {
        ix.o(f10 > 0.0f);
        if (f10 == this.f11167j) {
            return;
        }
        this.f11167j = f10;
        a1 a1Var = this.f11160b;
        a1Var.f2702g = f10;
        a1Var.g(false);
    }
}
