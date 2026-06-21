package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e80 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e80 f38043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38044b;

    static {
        e80 e80Var = new e80();
        f38043a = e80Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", e80Var, 6);
        q0Var.k("id", true);
        q0Var.k("name", false);
        q0Var.k("logo_url", true);
        q0Var.k("adapter_status", true);
        q0Var.k("adapters", false);
        q0Var.k("latest_adapter_version", true);
        f38044b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = g80.f38669g;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(a1Var), a1Var, com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var), aVarArr[4], com.google.android.gms.internal.auth.g.q(a1Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38044b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = g80.f38669g;
        int i = 0;
        String str = null;
        String strF = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
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
                    str2 = (String) aVarA.g(q0Var, 2, uk.a1.f34493a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) aVarA.g(q0Var, 3, uk.a1.f34493a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) aVarA.i(q0Var, 4, aVarArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) aVarA.g(q0Var, 5, uk.a1.f34493a, str4);
                    i |= 32;
                    break;
                default:
                    throw new qk.e(iV);
            }
        }
        aVarA.m(q0Var);
        return new g80(i, str, strF, str2, str3, list, str4);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38044b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        g80 g80Var = (g80) obj;
        uk.q0 q0Var = f38044b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = g80.f38669g;
        if (oVarA.x(q0Var) || g80Var.f38670a != null) {
            oVarA.t(q0Var, 0, uk.a1.f34493a, g80Var.f38670a);
        }
        oVarA.v(q0Var, 1, g80Var.f38671b);
        if (oVarA.x(q0Var) || g80Var.f38672c != null) {
            oVarA.t(q0Var, 2, uk.a1.f34493a, g80Var.f38672c);
        }
        if (oVarA.x(q0Var) || g80Var.f38673d != null) {
            oVarA.t(q0Var, 3, uk.a1.f34493a, g80Var.f38673d);
        }
        oVarA.u(q0Var, 4, aVarArr[4], g80Var.f38674e);
        if (oVarA.x(q0Var) || g80Var.f38675f != null) {
            oVarA.t(q0Var, 5, uk.a1.f34493a, g80Var.f38675f);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
