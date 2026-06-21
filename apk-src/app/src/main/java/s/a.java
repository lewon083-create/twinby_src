package s;

import a0.j0;
import android.hardware.camera2.CaptureRequest;
import g0.g;
import g0.q1;
import g0.u0;
import g0.u1;
import g0.w2;
import g0.x2;
import g0.z2;
import java.util.UUID;
import l0.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j0, w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f32367b;

    public a(q1 q1Var) {
        this.f32366a = 1;
        this.f32367b = q1Var;
        g gVar = k.J;
        Class cls = (Class) q1Var.g(gVar, null);
        if (cls != null && !cls.equals(u0.d.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        q1Var.y(x2.C, z2.f19816f);
        q1Var.y(gVar, u0.d.class);
        g gVar2 = k.I;
        if (q1Var.g(gVar2, null) == null) {
            q1Var.y(gVar2, u0.d.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // a0.j0
    public final q1 a() {
        switch (this.f32366a) {
        }
        return this.f32367b;
    }

    @Override // g0.w2
    public x2 b() {
        return new u0.e(u1.u(this.f32367b));
    }

    public void c(CaptureRequest.Key key, Object obj) {
        this.f32367b.x(b.u(key), u0.f19774d, obj);
    }

    public a() {
        this.f32366a = 0;
        this.f32367b = q1.v();
    }
}
