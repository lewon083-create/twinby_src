package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f40 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f38367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38368b;

    static {
        f40 f40Var = new f40();
        f38367a = f40Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        q0Var.k("adapter", true);
        q0Var.k("network_name", false);
        q0Var.k("bidding_parameters", false);
        q0Var.k("network_ad_unit_id", true);
        q0Var.k("network_ad_unit_id_name", true);
        f38368b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = h40.f39018f;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(a1Var), a1Var, aVarArr[2], com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38368b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = h40.f39018f;
        int i = 0;
        String str = null;
        String strF = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                str = (String) aVarA.g(q0Var, 0, uk.a1.f34493a, str);
                i |= 1;
            } else if (iV == 1) {
                strF = aVarA.f(q0Var, 1);
                i |= 2;
            } else if (iV == 2) {
                list = (List) aVarA.i(q0Var, 2, aVarArr[2], list);
                i |= 4;
            } else if (iV == 3) {
                str2 = (String) aVarA.g(q0Var, 3, uk.a1.f34493a, str2);
                i |= 8;
            } else {
                if (iV != 4) {
                    throw new qk.e(iV);
                }
                str3 = (String) aVarA.g(q0Var, 4, uk.a1.f34493a, str3);
                i |= 16;
            }
        }
        aVarA.m(q0Var);
        return new h40(i, str, strF, list, str2, str3);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38368b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        h40 h40Var = (h40) obj;
        uk.q0 q0Var = f38368b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = h40.f39018f;
        if (oVarA.x(q0Var) || h40Var.f39019a != null) {
            oVarA.t(q0Var, 0, uk.a1.f34493a, h40Var.f39019a);
        }
        oVarA.v(q0Var, 1, h40Var.f39020b);
        oVarA.u(q0Var, 2, aVarArr[2], h40Var.f39021c);
        if (oVarA.x(q0Var) || h40Var.f39022d != null) {
            oVarA.t(q0Var, 3, uk.a1.f34493a, h40Var.f39022d);
        }
        if (oVarA.x(q0Var) || h40Var.f39023e != null) {
            oVarA.t(q0Var, 4, uk.a1.f34493a, h40Var.f39023e);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
