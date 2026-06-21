package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k40 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k40 f40060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f40061b;

    static {
        k40 k40Var = new k40();
        f40060a = k40Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", k40Var, 2);
        q0Var.k("waterfall", false);
        q0Var.k("bidding", false);
        f40061b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = m40.f40786c;
        return new qk.a[]{aVarArr[0], aVarArr[1]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f40061b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = m40.f40786c;
        List list = null;
        boolean z5 = true;
        int i = 0;
        List list2 = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                list = (List) aVarA.i(q0Var, 0, aVarArr[0], list);
                i |= 1;
            } else {
                if (iV != 1) {
                    throw new qk.e(iV);
                }
                list2 = (List) aVarA.i(q0Var, 1, aVarArr[1], list2);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new m40(i, list, list2);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f40061b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        m40 m40Var = (m40) obj;
        uk.q0 q0Var = f40061b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = m40.f40786c;
        oVarA.u(q0Var, 0, aVarArr[0], m40Var.f40787a);
        oVarA.u(q0Var, 1, aVarArr[1], m40Var.f40788b);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
