package a0;

import android.util.Rational;
import android.util.Size;
import g0.w2;
import g0.x2;
import g0.z2;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.q1 f224b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(int i) {
        this(g0.q1.v(), 0);
        this.f223a = i;
        switch (i) {
            case 1:
                this(g0.q1.v(), 1);
                break;
            case 2:
                this(g0.q1.v(), 2);
                break;
            default:
                break;
        }
    }

    @Override // a0.j0
    public final g0.q1 a() {
        switch (this.f223a) {
        }
        return this.f224b;
    }

    @Override // g0.w2
    public final x2 b() {
        switch (this.f223a) {
            case 0:
                return new g0.f1(g0.u1.u(this.f224b));
            case 1:
                return new g0.g1(g0.u1.u(this.f224b));
            case 2:
                return new g0.v1(g0.u1.u(this.f224b));
            default:
                return new y0.a(g0.u1.u(this.f224b));
        }
    }

    public k1 c() {
        g0.g gVar = g0.g1.P;
        g0.q1 q1Var = this.f224b;
        Integer num = (Integer) q1Var.g(gVar, null);
        if (num != null) {
            q1Var.y(g0.h1.f19579f, num);
        } else {
            j1 j1Var = k1.B;
            g0.g gVar2 = g0.g1.Q;
            if (Objects.equals(q1Var.g(gVar2, null), 2)) {
                q1Var.y(g0.h1.f19579f, 32);
            } else if (Objects.equals(q1Var.g(gVar2, null), 3)) {
                q1Var.y(g0.h1.f19579f, 32);
                q1Var.y(g0.h1.f19580g, 256);
            } else if (Objects.equals(q1Var.g(gVar2, null), 1)) {
                q1Var.y(g0.h1.f19579f, 4101);
                q1Var.y(g0.h1.f19581h, i0.f111c);
            } else {
                q1Var.y(g0.h1.f19579f, 256);
            }
        }
        g0.g1 g1Var = new g0.g1(g0.u1.u(q1Var));
        g0.i1.r(g1Var);
        k1 k1Var = new k1(g1Var);
        Size size = (Size) q1Var.g(g0.i1.f19608m, null);
        if (size != null) {
            k1Var.f144u = new Rational(size.getWidth(), size.getHeight());
        }
        f2.g.g((Executor) q1Var.g(l0.g.H, hl.d.o()), "The IO executor can't be null");
        g0.g gVar3 = g0.g1.N;
        if (q1Var.L.containsKey(gVar3)) {
            Integer num2 = (Integer) q1Var.a(gVar3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3 && q1Var.g(g0.g1.V, null) == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
        }
        return k1Var;
    }

    public t0(g0.q1 q1Var, int i) {
        this.f223a = i;
        switch (i) {
            case 1:
                this.f224b = q1Var;
                g0.g gVar = l0.k.J;
                Class cls = (Class) q1Var.g(gVar, null);
                if (cls != null && !cls.equals(k1.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                q1Var.y(x2.C, z2.f19812b);
                q1Var.y(gVar, k1.class);
                g0.g gVar2 = l0.k.I;
                if (q1Var.g(gVar2, null) == null) {
                    q1Var.y(gVar2, k1.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.f224b = q1Var;
                g0.g gVar3 = l0.k.J;
                Class cls2 = (Class) q1Var.g(gVar3, null);
                if (cls2 != null && !cls2.equals(a2.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                q1Var.y(x2.C, z2.f19813c);
                q1Var.y(gVar3, a2.class);
                g0.g gVar4 = l0.k.I;
                if (q1Var.g(gVar4, null) == null) {
                    q1Var.y(gVar4, a2.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                g0.g gVar5 = g0.i1.f19607l;
                if (((Integer) q1Var.g(gVar5, -1)).intValue() == -1) {
                    q1Var.y(gVar5, 2);
                    return;
                }
                return;
            case 3:
                this.f224b = q1Var;
                if (q1Var.L.containsKey(y0.a.M)) {
                    g0.g gVar6 = l0.k.J;
                    Class cls3 = (Class) q1Var.g(gVar6, null);
                    if (cls3 != null && !cls3.equals(x0.k0.class)) {
                        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                    }
                    q1Var.y(x2.C, z2.f19815e);
                    q1Var.y(gVar6, x0.k0.class);
                    g0.g gVar7 = l0.k.I;
                    if (q1Var.g(gVar7, null) == null) {
                        q1Var.y(gVar7, x0.k0.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.f224b = q1Var;
                g0.g gVar8 = l0.k.J;
                Class cls4 = (Class) q1Var.g(gVar8, null);
                if (cls4 != null && !cls4.equals(w0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                q1Var.y(x2.C, z2.f19814d);
                q1Var.y(gVar8, w0.class);
                g0.g gVar9 = l0.k.I;
                if (q1Var.g(gVar9, null) == null) {
                    q1Var.y(gVar9, w0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(x0.m0 m0Var) {
        this.f223a = 3;
        g0.q1 q1VarV = g0.q1.v();
        q1VarV.y(y0.a.M, m0Var);
        this(q1VarV, 3);
    }
}
