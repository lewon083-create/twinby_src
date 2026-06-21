package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dh2 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dh2 f37768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f37769b;

    static {
        dh2 dh2Var = new dh2();
        f37768a = dh2Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", dh2Var, 1);
        q0Var.k("prefetched_mediation_data", false);
        f37769b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{fh2.f38444b[0]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f37769b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = fh2.f38444b;
        List list = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else {
                if (iV != 0) {
                    throw new qk.e(iV);
                }
                list = (List) aVarA.i(q0Var, 0, aVarArr[0], list);
                i = 1;
            }
        }
        aVarA.m(q0Var);
        return new fh2(i, list);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f37769b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        uk.q0 q0Var = f37769b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.u(q0Var, 0, fh2.f38444b[0], ((fh2) obj).f38445a);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
