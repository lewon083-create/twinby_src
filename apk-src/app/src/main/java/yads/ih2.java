package yads;

import io.sentry.protocol.FeatureFlag;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ih2 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ih2 f39544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f39545b;

    static {
        ih2 ih2Var = new ih2();
        f39544a = ih2Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", ih2Var, 5);
        q0Var.k("adapter", false);
        q0Var.k("network_winner", false);
        q0Var.k("revenue", false);
        q0Var.k(FeatureFlag.JsonKeys.RESULT, false);
        q0Var.k("network_ad_info", false);
        f39545b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{a1Var, com.google.android.gms.internal.auth.g.q(qh2.f42302a), com.google.android.gms.internal.auth.g.q(gi2.f38766a), ai2.f36723a, com.google.android.gms.internal.auth.g.q(a1Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f39545b;
        tk.a aVarA = bVar.a(q0Var);
        int i = 0;
        String strF = null;
        sh2 sh2Var = null;
        ii2 ii2Var = null;
        ci2 ci2Var = null;
        String str = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                strF = aVarA.f(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                sh2Var = (sh2) aVarA.g(q0Var, 1, qh2.f42302a, sh2Var);
                i |= 2;
            } else if (iV == 2) {
                ii2Var = (ii2) aVarA.g(q0Var, 2, gi2.f38766a, ii2Var);
                i |= 4;
            } else if (iV == 3) {
                ci2Var = (ci2) aVarA.i(q0Var, 3, ai2.f36723a, ci2Var);
                i |= 8;
            } else {
                if (iV != 4) {
                    throw new qk.e(iV);
                }
                str = (String) aVarA.g(q0Var, 4, uk.a1.f34493a, str);
                i |= 16;
            }
        }
        aVarA.m(q0Var);
        return new kh2(i, strF, sh2Var, ii2Var, ci2Var, str);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f39545b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        kh2 kh2Var = (kh2) obj;
        uk.q0 q0Var = f39545b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.v(q0Var, 0, kh2Var.f40203a);
        oVarA.t(q0Var, 1, qh2.f42302a, kh2Var.f40204b);
        oVarA.t(q0Var, 2, gi2.f38766a, kh2Var.f40205c);
        oVarA.u(q0Var, 3, ai2.f36723a, kh2Var.f40206d);
        oVarA.t(q0Var, 4, uk.a1.f34493a, kh2Var.f40207e);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
