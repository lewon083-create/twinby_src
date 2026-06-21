package yads;

import android.app.Activity;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m2 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f40748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f40749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f40750c;

    public m2(Activity activity, x1 x1Var, q1 q1Var) {
        this.f40748a = activity;
        this.f40749b = x1Var;
        this.f40750c = q1Var;
    }

    @Override // yads.h2
    public final void c() {
        Object objS;
        q1 q1Var = this.f40750c;
        Activity activity = this.f40748a;
        x1 x1Var = this.f40749b;
        q1Var.getClass();
        qf0 qf0Var = x1Var.f44568g;
        if (qf0Var == null) {
            return;
        }
        try {
            ij.k kVar = ij.m.f21341c;
            activity.startActivityForResult(qf0Var.f42286a, 0);
            objS = Unit.f27471a;
            r1 r1Var = q1Var.f42133a;
            ho2 ho2VarA = r1Var.f42440b.a(x1Var.f44562a, x1Var.f44563b);
            eo2 eo2Var = eo2.H;
            Map map = ho2VarA.f39286a;
            r1Var.f42439a.a(new go2(eo2Var.a(), kotlin.collections.j0.m(map), ho2VarA.f39287b));
            qf0Var.f42287b.invoke();
            activity.finish();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            activity.finish();
            q1Var.f42133a.f42439a.reportError("Failed to register ActivityResult", thA);
            qf0Var.f42288c.invoke(thA);
        }
    }

    @Override // yads.h2
    public final boolean d() {
        return true;
    }

    @Override // yads.h2
    public final void a() {
    }

    @Override // yads.h2
    public final void b() {
    }

    @Override // yads.h2
    public final void f() {
    }

    @Override // yads.h2
    public final void g() {
    }

    @Override // yads.h2
    public final void onAdClosed() {
    }
}
