package hk;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new u(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new u(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f27510b = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f27499b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new u(1));
        if (zBooleanValue2) {
            f0Var.f27510b = ((CoroutineContext) f0Var.f27510b).fold(gVar, new u(2));
        }
        return coroutineContext3.plus((CoroutineContext) f0Var.f27510b);
    }

    public static final CoroutineContext b(a0 a0Var, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(a0Var.e(), coroutineContext, true);
        ok.e eVar = k0.f20682a;
        return (coroutineContextA == eVar || coroutineContextA.get(kotlin.coroutines.d.R1) != null) ? coroutineContextA : coroutineContextA.plus(eVar);
    }

    public static final z1 c(mj.a aVar, CoroutineContext coroutineContext, Object obj) {
        z1 z1Var = null;
        if ((aVar instanceof oj.d) && coroutineContext.get(a2.f20631b) != null) {
            oj.d callerFrame = (oj.d) aVar;
            while (true) {
                if ((callerFrame instanceof i0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof z1) {
                    z1Var = (z1) callerFrame;
                    break;
                }
            }
            if (z1Var != null) {
                z1Var.Y(coroutineContext, obj);
            }
        }
        return z1Var;
    }
}
