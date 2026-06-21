package yads;

import io.sentry.SentryLogEvent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pu1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pu1 f42067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f42068b;

    static {
        pu1 pu1Var = new pu1();
        f42067a = pu1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", pu1Var, 4);
        q0Var.k("timestamp", false);
        q0Var.k("code", false);
        q0Var.k("headers", false);
        q0Var.k(SentryLogEvent.JsonKeys.BODY, false);
        f42068b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.k0.f34539a, com.google.android.gms.internal.auth.g.q(uk.e0.f34508a), com.google.android.gms.internal.auth.g.q(ru1.f42727e[2]), com.google.android.gms.internal.auth.g.q(uk.a1.f34493a)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f42068b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = ru1.f42727e;
        int i = 0;
        long jL = 0;
        Integer num = null;
        Map map = null;
        String str = null;
        boolean z5 = true;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                jL = aVarA.l(q0Var, 0);
                i |= 1;
            } else if (iV == 1) {
                num = (Integer) aVarA.g(q0Var, 1, uk.e0.f34508a, num);
                i |= 2;
            } else if (iV == 2) {
                map = (Map) aVarA.g(q0Var, 2, aVarArr[2], map);
                i |= 4;
            } else {
                if (iV != 3) {
                    throw new qk.e(iV);
                }
                str = (String) aVarA.g(q0Var, 3, uk.a1.f34493a, str);
                i |= 8;
            }
        }
        aVarA.m(q0Var);
        return new ru1(i, jL, num, map, str);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f42068b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ru1 ru1Var = (ru1) obj;
        uk.q0 q0Var = f42068b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = ru1.f42727e;
        oVarA.s(q0Var, 0, ru1Var.f42728a);
        oVarA.t(q0Var, 1, uk.e0.f34508a, ru1Var.f42729b);
        oVarA.t(q0Var, 2, aVarArr[2], ru1Var.f42730c);
        oVarA.t(q0Var, 3, uk.a1.f34493a, ru1Var.f42731d);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
