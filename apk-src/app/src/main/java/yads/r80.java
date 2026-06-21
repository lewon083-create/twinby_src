package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r80 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r80 f42511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f42512b;

    static {
        r80 r80Var = new r80();
        f42511a = r80Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", r80Var, 3);
        q0Var.k("version", false);
        q0Var.k("is_integrated", false);
        q0Var.k("integration_messages", false);
        f42512b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.a1.f34493a, uk.f.f34512a, t80.f43235d[2]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f42512b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = t80.f43235d;
        String strF = null;
        boolean z5 = true;
        int i = 0;
        boolean zD = false;
        List list = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                zD = aVarA.d(q0Var, 1);
                i |= 2;
            } else {
                if (iV != 2) {
                    throw new qk.e(iV);
                }
                list = (List) aVarA.i(q0Var, 2, aVarArr[2], list);
                i |= 4;
            }
        }
        aVarA.m(q0Var);
        return new t80(i, strF, zD, list);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f42512b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        t80 t80Var = (t80) obj;
        uk.q0 q0Var = f42512b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = t80.f43235d;
        oVarA.v(q0Var, 0, t80Var.f43236a);
        oVarA.p(q0Var, 1, t80Var.f43237b);
        oVarA.u(q0Var, 2, aVarArr[2], t80Var.f43238c);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
