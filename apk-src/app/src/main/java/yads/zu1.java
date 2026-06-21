package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zu1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zu1 f45541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f45542b;

    static {
        zu1 zu1Var = new zu1();
        f45541a = zu1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", zu1Var, 4);
        q0Var.k("timestamp", false);
        q0Var.k("type", false);
        q0Var.k("tag", false);
        q0Var.k("text", false);
        f45542b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{uk.k0.f34539a, a1Var, a1Var, a1Var};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f45542b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        long jL = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                jL = aVarA.l(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                strF = aVarA.f(q0Var, 1);
                i |= 2;
            } else if (iV == 2) {
                strF2 = aVarA.f(q0Var, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    throw new qk.e(iV);
                }
                strF3 = aVarA.f(q0Var, 3);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new bv1(i, jL, strF, strF2, strF3);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f45542b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        bv1 bv1Var = (bv1) obj;
        uk.q0 q0Var = f45542b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.s(q0Var, 0, bv1Var.f37151a);
        oVarA.v(q0Var, 1, bv1Var.f37152b);
        oVarA.v(q0Var, 2, bv1Var.f37153c);
        oVarA.v(q0Var, 3, bv1Var.f37154d);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
