package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yq1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq1 f45145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f45146b;

    static {
        yq1 yq1Var = new yq1();
        f45145a = yq1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", yq1Var, 4);
        q0Var.k("name", false);
        q0Var.k("id", false);
        q0Var.k("version", false);
        q0Var.k("adapters", false);
        f45146b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = dr1.f37878e;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, a1Var, com.google.android.gms.internal.auth.g.q(a1Var), aVarArr[3]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f45146b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = dr1.f37878e;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
        List list = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                strF2 = aVarA.f(q0Var, 1);
                i |= 2;
            } else if (iV == 2) {
                str = (String) aVarA.g(q0Var, 2, uk.a1.f34493a, str);
                i |= 4;
            } else {
                if (iV != 3) {
                    throw new qk.e(iV);
                }
                list = (List) aVarA.i(q0Var, 3, aVarArr[3], list);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new dr1(i, strF, strF2, str, list);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f45146b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        dr1 dr1Var = (dr1) obj;
        uk.q0 q0Var = f45146b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = dr1.f37878e;
        oVarA.v(q0Var, 0, dr1Var.f37879a);
        oVarA.v(q0Var, 1, dr1Var.f37880b);
        oVarA.t(q0Var, 2, uk.a1.f34493a, dr1Var.f37881c);
        oVarA.u(q0Var, 3, aVarArr[3], dr1Var.f37882d);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
