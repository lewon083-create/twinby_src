package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k80 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k80 f40100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f40101b;

    static {
        k80 k80Var = new k80();
        f40100a = k80Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", k80Var, 6);
        q0Var.k("app_data", false);
        q0Var.k("sdk_data", false);
        q0Var.k("adapters_data", false);
        q0Var.k("consents_data", false);
        q0Var.k("sdk_logs", false);
        q0Var.k("network_logs", false);
        f40101b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = m80.f40840g;
        return new qk.a[]{k50.f40076a, r80.f42511a, aVarArr[2], r50.f42496a, aVarArr[4], aVarArr[5]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f40101b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = m80.f40840g;
        int i = 0;
        m50 m50Var = null;
        t80 t80Var = null;
        List list = null;
        t50 t50Var = null;
        List list2 = null;
        List list3 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            switch (iV) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    m50Var = (m50) aVarA.i(q0Var, 0, k50.f40076a, m50Var);
                    i |= 1;
                    break;
                case 1:
                    t80Var = (t80) aVarA.i(q0Var, 1, r80.f42511a, t80Var);
                    i |= 2;
                    break;
                case 2:
                    list = (List) aVarA.i(q0Var, 2, aVarArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    t50Var = (t50) aVarA.i(q0Var, 3, r50.f42496a, t50Var);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) aVarA.i(q0Var, 4, aVarArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) aVarA.i(q0Var, 5, aVarArr[5], list3);
                    i |= 32;
                    break;
                default:
                    throw new qk.e(iV);
            }
        }
        aVarA.m(q0Var);
        return new m80(i, m50Var, t80Var, list, t50Var, list2, list3);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f40101b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        m80 m80Var = (m80) obj;
        uk.q0 q0Var = f40101b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = m80.f40840g;
        oVarA.u(q0Var, 0, k50.f40076a, m80Var.f40841a);
        oVarA.u(q0Var, 1, r80.f42511a, m80Var.f40842b);
        oVarA.u(q0Var, 2, aVarArr[2], m80Var.f40843c);
        oVarA.u(q0Var, 3, r50.f42496a, m80Var.f40844d);
        oVarA.u(q0Var, 4, aVarArr[4], m80Var.f40845e);
        oVarA.u(q0Var, 5, aVarArr[5], m80Var.f40846f);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
