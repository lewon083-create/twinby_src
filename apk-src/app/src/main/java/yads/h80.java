package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h80 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h80 f39067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f39068b;

    static {
        h80 h80Var = new h80();
        f39067a = h80Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", h80Var, 7);
        q0Var.k("page_id", true);
        q0Var.k("latest_sdk_version", true);
        q0Var.k("app_ads_txt_url", true);
        q0Var.k("app_status", true);
        q0Var.k("alerts", true);
        q0Var.k("ad_units", true);
        q0Var.k("mediation_networks", false);
        f39068b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = j80.f39768h;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(aVarArr[4]), com.google.android.gms.internal.auth.g.q(aVarArr[5]), aVarArr[6]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f39068b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = j80.f39768h;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
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
                    str = (String) aVarA.g(q0Var, 0, uk.a1.f34493a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) aVarA.g(q0Var, 1, uk.a1.f34493a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) aVarA.g(q0Var, 2, uk.a1.f34493a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) aVarA.g(q0Var, 3, uk.a1.f34493a, str4);
                    i |= 8;
                    break;
                case 4:
                    list = (List) aVarA.g(q0Var, 4, aVarArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) aVarA.g(q0Var, 5, aVarArr[5], list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) aVarA.i(q0Var, 6, aVarArr[6], list3);
                    i |= 64;
                    break;
                default:
                    throw new qk.e(iV);
            }
        }
        aVarA.m(q0Var);
        return new j80(i, str, str2, str3, str4, list, list2, list3);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f39068b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        j80 j80Var = (j80) obj;
        uk.q0 q0Var = f39068b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = j80.f39768h;
        if (oVarA.x(q0Var) || j80Var.f39769a != null) {
            oVarA.t(q0Var, 0, uk.a1.f34493a, j80Var.f39769a);
        }
        if (oVarA.x(q0Var) || j80Var.f39770b != null) {
            oVarA.t(q0Var, 1, uk.a1.f34493a, j80Var.f39770b);
        }
        if (oVarA.x(q0Var) || j80Var.f39771c != null) {
            oVarA.t(q0Var, 2, uk.a1.f34493a, j80Var.f39771c);
        }
        if (oVarA.x(q0Var) || j80Var.f39772d != null) {
            oVarA.t(q0Var, 3, uk.a1.f34493a, j80Var.f39772d);
        }
        if (oVarA.x(q0Var) || j80Var.f39773e != null) {
            oVarA.t(q0Var, 4, aVarArr[4], j80Var.f39773e);
        }
        if (oVarA.x(q0Var) || j80Var.f39774f != null) {
            oVarA.t(q0Var, 5, aVarArr[5], j80Var.f39774f);
        }
        oVarA.u(q0Var, 6, aVarArr[6], j80Var.f39775g);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
