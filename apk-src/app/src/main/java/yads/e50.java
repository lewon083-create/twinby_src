package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e50 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e50 f38014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38015b;

    static {
        e50 e50Var = new e50();
        f38014a = e50Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", e50Var, 3);
        q0Var.k("title", true);
        q0Var.k("message", true);
        q0Var.k("type", true);
        f38015b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var), com.google.android.gms.internal.auth.g.q(a1Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38015b;
        tk.a aVarA = bVar.a(q0Var);
        String str = null;
        boolean z5 = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                str = (String) aVarA.g(q0Var, 0, uk.a1.f34493a, str);
                i |= 1;
            } else if (iV == 1) {
                str2 = (String) aVarA.g(q0Var, 1, uk.a1.f34493a, str2);
                i |= 2;
            } else {
                if (iV != 2) {
                    throw new qk.e(iV);
                }
                str3 = (String) aVarA.g(q0Var, 2, uk.a1.f34493a, str3);
                i |= 4;
            }
        }
        aVarA.m(q0Var);
        return new g50(i, str, str2, str3);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38015b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        g50 g50Var = (g50) obj;
        uk.q0 q0Var = f38015b;
        wk.o oVarA = cVar.a(q0Var);
        if (oVarA.x(q0Var) || g50Var.f38657a != null) {
            oVarA.t(q0Var, 0, uk.a1.f34493a, g50Var.f38657a);
        }
        if (oVarA.x(q0Var) || g50Var.f38658b != null) {
            oVarA.t(q0Var, 1, uk.a1.f34493a, g50Var.f38658b);
        }
        if (oVarA.x(q0Var) || g50Var.f38659c != null) {
            oVarA.t(q0Var, 2, uk.a1.f34493a, g50Var.f38659c);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
