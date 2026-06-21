package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ar1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ar1 f36845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f36846b;

    static {
        ar1 ar1Var = new ar1();
        f36845a = ar1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", ar1Var, 3);
        q0Var.k("format", false);
        q0Var.k("version", false);
        q0Var.k("isIntegrated", false);
        f36846b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, com.google.android.gms.internal.auth.g.q(a1Var), uk.f.f34512a};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f36846b;
        tk.a aVarA = bVar.a(q0Var);
        String strF = null;
        boolean z5 = true;
        int i = 0;
        boolean zD = false;
        String str = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                str = (String) aVarA.g(q0Var, 1, uk.a1.f34493a, str);
                i |= 2;
            } else {
                if (iV != 2) {
                    throw new qk.e(iV);
                }
                zD = aVarA.d(q0Var, 2);
                i |= 4;
            }
        }
        aVarA.m(q0Var);
        return new cr1(i, strF, str, zD);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f36846b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        cr1 cr1Var = (cr1) obj;
        uk.q0 q0Var = f36846b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.v(q0Var, 0, cr1Var.f37481a);
        oVarA.t(q0Var, 1, uk.a1.f34493a, cr1Var.f37482b);
        oVarA.p(q0Var, 2, cr1Var.f37483c);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
