package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r50 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r50 f42496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f42497b;

    static {
        r50 r50Var = new r50();
        f42496a = r50Var;
        uk.q0 q0Var = new uk.q0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", r50Var, 4);
        q0Var.k("has_location_consent", false);
        q0Var.k("age_restricted_user", false);
        q0Var.k("has_user_consent", false);
        q0Var.k("has_cmp_value", false);
        f42497b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.f fVar = uk.f.f34512a;
        return new qk.a[]{fVar, com.google.android.gms.internal.auth.g.q(fVar), com.google.android.gms.internal.auth.g.q(fVar), fVar};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f42497b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        boolean zD = false;
        boolean zD2 = false;
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                zD = aVarA.d(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                bool = (Boolean) aVarA.g(q0Var, 1, uk.f.f34512a, bool);
                i |= 2;
            } else if (iV == 2) {
                bool2 = (Boolean) aVarA.g(q0Var, 2, uk.f.f34512a, bool2);
                i |= 4;
            } else {
                if (iV != 3) {
                    throw new qk.e(iV);
                }
                zD2 = aVarA.d(q0Var, 3);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new t50(i, zD, bool, bool2, zD2);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f42497b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        t50 t50Var = (t50) obj;
        uk.q0 q0Var = f42497b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.p(q0Var, 0, t50Var.f43182a);
        uk.f fVar = uk.f.f34512a;
        oVarA.t(q0Var, 1, fVar, t50Var.f43183b);
        oVarA.t(q0Var, 2, fVar, t50Var.f43184c);
        oVarA.p(q0Var, 3, t50Var.f43185d);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
