package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s40 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s40 f42800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f42801b;

    static {
        s40 s40Var = new s40();
        f42800a = s40Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", s40Var, 6);
        q0Var.k("adapter", true);
        q0Var.k("network_name", false);
        q0Var.k("waterfall_parameters", false);
        q0Var.k("network_ad_unit_id_name", true);
        q0Var.k("currency", false);
        q0Var.k("cpm_floors", false);
        f42801b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = u40.f43546g;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(a1Var), a1Var, aVarArr[2], com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(ia0.f39477a), aVarArr[5]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f42801b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = u40.f43546g;
        int i = 0;
        String str = null;
        String strF = null;
        List list = null;
        String str2 = null;
        ka0 ka0Var = null;
        List list2 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            switch (iV) {
                case -1:
                    z5 = false;
                    break;
                case 0:
                    str = (String) aVarA.g(q0Var, 0, uk.a1.f34493a, str);
                    i |= 1;
                    break;
                case 1:
                    strF = aVarA.f(q0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) aVarA.i(q0Var, 2, aVarArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) aVarA.g(q0Var, 3, uk.a1.f34493a, str2);
                    i |= 8;
                    break;
                case 4:
                    ka0Var = (ka0) aVarA.g(q0Var, 4, ia0.f39477a, ka0Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) aVarA.i(q0Var, 5, aVarArr[5], list2);
                    i |= 32;
                    break;
                default:
                    throw new qk.e(iV);
            }
        }
        aVarA.m(q0Var);
        return new u40(i, str, strF, list, str2, ka0Var, list2);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f42801b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        u40 u40Var = (u40) obj;
        uk.q0 q0Var = f42801b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = u40.f43546g;
        if (oVarA.x(q0Var) || u40Var.f43547a != null) {
            oVarA.t(q0Var, 0, uk.a1.f34493a, u40Var.f43547a);
        }
        oVarA.v(q0Var, 1, u40Var.f43548b);
        oVarA.u(q0Var, 2, aVarArr[2], u40Var.f43549c);
        if (oVarA.x(q0Var) || u40Var.f43550d != null) {
            oVarA.t(q0Var, 3, uk.a1.f34493a, u40Var.f43550d);
        }
        oVarA.t(q0Var, 4, ia0.f39477a, u40Var.f43551e);
        oVarA.u(q0Var, 5, aVarArr[5], u40Var.f43552f);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
