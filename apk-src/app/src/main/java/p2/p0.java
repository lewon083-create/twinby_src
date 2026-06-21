package p2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj.i f31042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk.r f31043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f31044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f31045d;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(Function2 transform, hk.r ack, w0 w0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f31042a = (oj.i) transform;
        this.f31043b = ack;
        this.f31044c = w0Var;
        this.f31045d = callerContext;
    }
}
