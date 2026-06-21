package yads;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y10 implements hk.z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sm0 f44884b;

    public y10(sm0 sm0Var) {
        this.f44884b = sm0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.e.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return hk.y.f20728b;
    }

    @Override // hk.z
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        try {
            ij.k kVar = ij.m.f21341c;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            this.f44884b.reportError(message, th2);
            Unit unit = Unit.f27471a;
        } catch (Throwable th3) {
            ij.k kVar2 = ij.m.f21341c;
            com.google.android.gms.internal.measurement.h5.s(th3);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }
}
