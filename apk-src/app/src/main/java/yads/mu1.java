package yads;

import io.sentry.SentryLogEvent;
import io.sentry.protocol.Request;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mu1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mu1 f41015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f41016b;

    static {
        mu1 mu1Var = new mu1();
        f41015a = mu1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", mu1Var, 5);
        q0Var.k("timestamp", false);
        q0Var.k(Request.JsonKeys.METHOD, false);
        q0Var.k("url", false);
        q0Var.k("headers", false);
        q0Var.k(SentryLogEvent.JsonKeys.BODY, false);
        f41016b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        qk.a[] aVarArr = ou1.f41729f;
        uk.a1 a1Var = uk.a1.f34493a;
        return new qk.a[]{uk.k0.f34539a, a1Var, a1Var, com.google.android.gms.internal.auth.g.q(aVarArr[3]), com.google.android.gms.internal.auth.g.q(a1Var)};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f41016b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = ou1.f41729f;
        int i = 0;
        long jL = 0;
        String strF = null;
        String strF2 = null;
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
                strF = aVarA.f(q0Var, 1);
                i |= 2;
            } else if (iV == 2) {
                strF2 = aVarA.f(q0Var, 2);
                i |= 4;
            } else if (iV == 3) {
                map = (Map) aVarA.g(q0Var, 3, aVarArr[3], map);
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
        return new ou1(i, jL, strF, strF2, map, str);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f41016b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        ou1 ou1Var = (ou1) obj;
        uk.q0 q0Var = f41016b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = ou1.f41729f;
        oVarA.s(q0Var, 0, ou1Var.f41730a);
        oVarA.v(q0Var, 1, ou1Var.f41731b);
        oVarA.v(q0Var, 2, ou1Var.f41732c);
        oVarA.t(q0Var, 3, aVarArr[3], ou1Var.f41733d);
        oVarA.t(q0Var, 4, uk.a1.f34493a, ou1Var.f41734e);
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
