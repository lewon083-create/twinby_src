package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bs1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bs1 f37133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f37134b;

    static {
        bs1 bs1Var = new bs1();
        f37133a = bs1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", bs1Var, 2);
        q0Var.k("adapter", false);
        q0Var.k("network_data", false);
        f37134b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.a1.f34493a, es1.f38249d[1]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f37134b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = es1.f38249d;
        String strF = null;
        boolean z5 = true;
        int i = 0;
        Map map = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    throw new qk.e(iV);
                }
                map = (Map) aVarA.i(q0Var, 1, aVarArr[1], map);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new es1(i, strF, map);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f37134b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        es1 es1Var = (es1) obj;
        uk.q0 q0Var = f37134b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = es1.f38249d;
        oVarA.v(q0Var, 0, es1Var.f38250b);
        oVarA.u(q0Var, 1, aVarArr[1], es1Var.f38251c);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
