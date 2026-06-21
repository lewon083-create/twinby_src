package yads;

import io.sentry.TransactionOptions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fs1 implements uk.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fs1 f38543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uk.q0 f38544b;

    static {
        fs1 fs1Var = new fs1();
        f38543a = fs1Var;
        uk.q0 q0Var = new uk.q0("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", fs1Var, 2);
        q0Var.k("load_timeout_millis", true);
        q0Var.k("mediation_prefetch_ad_units", true);
        f38544b = q0Var;
    }

    @Override // uk.z
    public final qk.a[] childSerializers() {
        return new qk.a[]{uk.k0.f34539a, is1.f39627d[1]};
    }

    @Override // qk.a
    public final Object deserialize(tk.b bVar) {
        uk.q0 q0Var = f38544b;
        tk.a aVarA = bVar.a(q0Var);
        qk.a[] aVarArr = is1.f39627d;
        long jL = 0;
        List list = null;
        boolean z5 = true;
        int i = 0;
        while (z5) {
            int iV = aVarA.v(q0Var);
            if (iV == -1) {
                z5 = false;
            } else if (iV == 0) {
                jL = aVarA.l(q0Var, 0);
                i |= 1;
            } else {
                if (iV != 1) {
                    throw new qk.e(iV);
                }
                list = (List) aVarA.i(q0Var, 1, aVarArr[1], list);
                i |= 2;
            }
        }
        aVarA.m(q0Var);
        return new is1(i, jL, list);
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f38544b;
    }

    @Override // qk.a
    public final void serialize(tk.c cVar, Object obj) {
        is1 is1Var = (is1) obj;
        uk.q0 q0Var = f38544b;
        wk.o oVarA = cVar.a(q0Var);
        qk.a[] aVarArr = is1.f39627d;
        if (oVarA.x(q0Var) || is1Var.f39628b != TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            oVarA.s(q0Var, 0, is1Var.f39628b);
        }
        if (oVarA.x(q0Var) || !Intrinsics.a(is1Var.f39629c, kotlin.collections.b0.f27475b)) {
            oVarA.u(q0Var, 1, aVarArr[1], is1Var.f39629c);
        }
        oVarA.w(q0Var);
    }

    @Override // uk.z
    public final qk.a[] typeParametersSerializers() {
        return uk.o0.f34560b;
    }
}
