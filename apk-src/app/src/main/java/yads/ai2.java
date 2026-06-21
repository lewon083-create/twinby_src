package yads;

import io.sentry.protocol.Response;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ai2 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ai2 f36723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f36724b;

    static {
        ai2 ai2Var = new ai2();
        f36723a = ai2Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", ai2Var, 3);
        q0Var.k("status", false);
        q0Var.k("error_message", false);
        q0Var.k(Response.JsonKeys.STATUS_CODE, false);
        f36724b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{ci2.f37401d[0], com.google.android.gms.internal.auth.g.q(uk.a1.f34493a), com.google.android.gms.internal.auth.g.q(uk.e0.f34508a)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f36724b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = ci2.f37401d;
        fi2 fi2Var = null;
        boolean z5 = true;
        int i = 0;
        String str = null;
        Integer num = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                fi2Var = (fi2) aVarA.i(q0Var, 0, aVarArr[0], fi2Var);
                i |= 1;
            } else if (iV == 1) {
                str = (String) aVarA.g(q0Var, 1, uk.a1.f34493a, str);
                i |= 2;
            } else {
                if (iV != 2) {
                    throw new qk.e(iV);
                }
                num = (Integer) aVarA.g(q0Var, 2, uk.e0.f34508a, num);
                i |= 4;
            }
        }
        aVarA.m(q0Var);
        return new ci2(i, fi2Var, str, num);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f36724b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ci2 ci2Var = (ci2) obj;
        uk.q0 q0Var = f36724b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.u(q0Var, 0, ci2.f37401d[0], ci2Var.f37402a);
        oVarA.t(q0Var, 1, uk.a1.f34493a, ci2Var.f37403b);
        oVarA.t(q0Var, 2, uk.e0.f34508a, ci2Var.f37404c);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
