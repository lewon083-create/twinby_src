package yads;

import com.appsflyer.AdRevenueScheme;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c40 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c40 f37266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f37267b;

    static {
        c40 c40Var = new c40();
        f37266a = c40Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        q0Var.k("name", false);
        q0Var.k(AdRevenueScheme.AD_TYPE, false);
        q0Var.k("ad_unit_id", false);
        q0Var.k("mediation", true);
        f37267b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a aVarQ = com.google.android.gms.internal.auth.g.q(k40.f40060a);
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, a1Var, a1Var, aVarQ};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f37267b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        m40 m40Var = null;
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
                strF3 = aVarA.f(q0Var, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    throw new qk.e(iV);
                }
                m40Var = (m40) aVarA.g(q0Var, 3, k40.f40060a, m40Var);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new e40(i, strF, strF2, strF3, m40Var);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f37267b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        e40 e40Var = (e40) obj;
        uk.q0 q0Var = f37267b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.v(q0Var, 0, e40Var.f38003a);
        oVarA.v(q0Var, 1, e40Var.f38004b);
        oVarA.v(q0Var, 2, e40Var.f38005c);
        if (oVarA.x(q0Var) || e40Var.f38006d != null) {
            oVarA.t(q0Var, 3, k40.f40060a, e40Var.f38006d);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
