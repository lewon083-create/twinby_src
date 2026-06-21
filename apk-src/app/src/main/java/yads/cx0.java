package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cx0 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cx0 f37544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f37545b;

    static {
        cx0 cx0Var = new cx0();
        f37544a = cx0Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.fonts.FontUrls", cx0Var, 4);
        q0Var.k("regular", false);
        q0Var.k("bold", false);
        q0Var.k("light", false);
        q0Var.k("medium", false);
        f37545b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, a1Var, a1Var, a1Var};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f37545b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
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
                strF4 = aVarA.f(q0Var, 3);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new ex0(i, strF, strF2, strF3, strF4);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f37545b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ex0 ex0Var = (ex0) obj;
        uk.q0 q0Var = f37545b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.v(q0Var, 0, ex0Var.f38272a);
        oVarA.v(q0Var, 1, ex0Var.f38273b);
        oVarA.v(q0Var, 2, ex0Var.f38274c);
        oVarA.v(q0Var, 3, ex0Var.f38275d);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
