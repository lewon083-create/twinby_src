package yads;

import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Response;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hu1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hu1 f39330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f39331b;

    static {
        hu1 hu1Var = new hu1();
        f39330a = hu1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", hu1Var, 2);
        q0Var.k(SentryBaseEvent.JsonKeys.REQUEST, false);
        q0Var.k(Response.TYPE, false);
        f39331b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{mu1.f41015a, com.google.android.gms.internal.auth.g.q(pu1.f42067a)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f39331b;
        tk.a aVarA = bVar.a(q0Var);
        ou1 ou1Var = null;
        boolean z5 = true;
        int i = 0;
        ru1 ru1Var = null;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                ou1Var = (ou1) aVarA.i(q0Var, 0, mu1.f41015a, ou1Var);
                i |= 1;
            } else {
                if (iV != 1) {
                    throw new qk.e(iV);
                }
                ru1Var = (ru1) aVarA.g(q0Var, 1, pu1.f42067a, ru1Var);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new ju1(i, ou1Var, ru1Var);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f39331b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ju1 ju1Var = (ju1) obj;
        uk.q0 q0Var = f39331b;
        wk.o oVarA = cVar.a(q0Var);
        oVarA.u(q0Var, 0, mu1.f41015a, ju1Var.f39985a);
        oVarA.t(q0Var, 1, pu1.f42067a, ju1Var.f39986b);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
