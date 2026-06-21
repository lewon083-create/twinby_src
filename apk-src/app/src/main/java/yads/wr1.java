package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wr1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wr1 f44456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f44457b;

    static {
        wr1 wr1Var = new wr1();
        f44456a = wr1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", wr1Var, 2);
        q0Var.k("ad_unit_id", false);
        q0Var.k("networks", false);
        f44457b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.a1.f34493a, zr1.f45523d[1]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f44457b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = zr1.f45523d;
        String strF = null;
        boolean z5 = true;
        int i = 0;
        List list = null;
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
                list = (List) aVarA.i(q0Var, 1, aVarArr[1], list);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new zr1(i, strF, list);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f44457b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        zr1 zr1Var = (zr1) obj;
        uk.q0 q0Var = f44457b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = zr1.f45523d;
        oVarA.v(q0Var, 0, zr1Var.f45524b);
        oVarA.u(q0Var, 1, aVarArr[1], zr1Var.f45525c);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
