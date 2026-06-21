package a0;

import com.google.android.gms.internal.measurement.b4;
import g0.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements g0.f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90b;

    public /* synthetic */ g1(int i, Object obj) {
        this.f89a = i;
        this.f90b = obj;
    }

    @Override // g0.f2
    public final void a(g0.h2 h2Var) {
        switch (this.f89a) {
            case 0:
                k1 k1Var = (k1) this.f90b;
                if (k1Var.e() == null) {
                    return;
                }
                f0.s sVar = k1Var.f148y;
                sVar.getClass();
                b4.e();
                sVar.f16557g = true;
                f0.q qVar = sVar.f16555e;
                if (qVar != null) {
                    b4.e();
                    if (!qVar.f16545d.f26173c.isDone()) {
                        l1 l1Var = new l1("The request is aborted silently and retried.", null, 3);
                        b4.e();
                        qVar.f16548g = true;
                        k0.b bVar = qVar.i;
                        Objects.requireNonNull(bVar);
                        bVar.cancel(true);
                        qVar.f16546e.d(l1Var);
                        qVar.f16547f.b(null);
                        qVar.f16543b.d(qVar.f16542a);
                    }
                }
                k1Var.G(true);
                String strG = k1Var.g();
                g0.g1 g1Var = (g0.g1) k1Var.f209h;
                g0.n nVar = k1Var.i;
                nVar.getClass();
                g0.d2 d2VarH = k1Var.H(strG, g1Var, nVar);
                k1Var.f146w = d2VarH;
                Object[] objArr = {d2VarH.c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                k1Var.F(Collections.unmodifiableList(arrayList));
                k1Var.r();
                f0.s sVar2 = k1Var.f148y;
                sVar2.getClass();
                b4.e();
                sVar2.f16557g = false;
                sVar2.c();
                return;
            case 1:
                a2 a2Var = (a2) this.f90b;
                if (a2Var.e() == null) {
                    return;
                }
                a2Var.J((g0.v1) a2Var.f209h, a2Var.i);
                a2Var.r();
                return;
            case 2:
                Iterator it = ((g0.g2) this.f90b).f19570n.iterator();
                while (it.hasNext()) {
                    ((g0.f2) it.next()).a(h2Var);
                }
                return;
            case 3:
                t.x1 x1Var = (t.x1) this.f90b;
                x1Var.f33318c = x1Var.e();
                t.s sVar3 = (t.s) x1Var.f33321f;
                if (sVar3 != null) {
                    t.c0 c0Var = sVar3.f33275c;
                    try {
                        if (((Boolean) i0.o.w(new t.s(c0Var, 4)).f26173c.get()).booleanValue()) {
                            t.x1 x1Var2 = c0Var.B;
                            g0.h2 h2Var2 = (g0.h2) x1Var2.f33318c;
                            t.w1 w1Var = (t.w1) x1Var2.f33319d;
                            Object obj2 = null;
                            c0Var.f32969d.execute(new t.r(c0Var, t.c0.y(x1Var2), h2Var2, w1Var, obj2, Collections.singletonList(z2.f19817g), 2));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e3) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e3);
                    }
                }
                return;
            default:
                ((x0.k0) this.f90b).O();
                return;
        }
    }
}
