package o4;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.google.android.gms.internal.ads.a1;
import com.google.android.gms.internal.ads.c0;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f29684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f29685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29687d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29690g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29692j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29696n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29688e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29689f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f29691h = -9223372036854775807L;
    public long i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f29693k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m3.t f29694l = m3.t.f28598a;

    public r(Context context, i iVar, long j10) {
        this.f29684a = iVar;
        this.f29686c = j10;
        this.f29685b = new a1(context, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
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
    public final int a(long r31, long r33, long r35, long r37, boolean r39, boolean r40, com.google.android.gms.internal.ads.u0 r41) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.r.a(long, long, long, long, boolean, boolean, com.google.android.gms.internal.ads.u0):int");
    }

    public final boolean b(boolean z5) {
        if (z5 && (this.f29688e == 3 || (!this.f29695m && this.f29696n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.f29694l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z5) {
        long jElapsedRealtime;
        this.f29692j = z5;
        long j10 = this.f29686c;
        if (j10 > 0) {
            this.f29694l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.f29687d = true;
        this.f29694l.getClass();
        this.f29690g = m3.z.M(SystemClock.elapsedRealtime());
        a1 a1Var = this.f29685b;
        a1Var.f2697b = true;
        a1Var.b();
        DisplayManager displayManager = (DisplayManager) a1Var.f2696a.getSystemService("display");
        x0 tVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                tVar = Build.VERSION.SDK_INT >= 33 ? new t(choreographer, displayManager) : new s(choreographer, displayManager, 1);
            } catch (RuntimeException e3) {
                m3.b.t("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e3);
            }
        }
        a1Var.f2713s = tVar;
        if (tVar != null) {
            tVar.e();
        }
        a1Var.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.f29688e = 1;
        } else if (i == 1) {
            this.f29688e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f29688e = Math.min(this.f29688e, 2);
        }
        this.f29685b.b();
    }

    public final void f(float f10) {
        a1 a1Var = this.f29685b;
        a1Var.f2699d = f10;
        d0 d0Var = (d0) a1Var.f2712r;
        ((c0) d0Var.f4406d).c();
        ((c0) d0Var.f4407e).c();
        d0Var.f4403a = false;
        d0Var.f4404b = -9223372036854775807L;
        d0Var.f4405c = 0;
        a1Var.c();
    }

    public final void g(Surface surface) {
        this.f29695m = surface != null;
        this.f29696n = false;
        a1 a1Var = this.f29685b;
        if (a1Var.f2698c != surface) {
            a1Var.a();
            a1Var.f2698c = surface;
            a1Var.d(true);
        }
        this.f29688e = Math.min(this.f29688e, 1);
    }

    public final void h(float f10) {
        h5.h(f10 > 0.0f);
        if (f10 == this.f29693k) {
            return;
        }
        this.f29693k = f10;
        a1 a1Var = this.f29685b;
        a1Var.f2702g = f10;
        a1Var.d(false);
    }
}
