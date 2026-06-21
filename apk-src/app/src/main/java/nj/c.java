package nj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f29520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mj.a f29521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mj.a aVar, CoroutineContext coroutineContext, Function2 function2, mj.a aVar2) {
        super(coroutineContext, aVar);
        this.f29520m = function2;
        this.f29521n = aVar2;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f29519l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f29519l = 2;
            h5.E(obj);
            return obj;
        }
        this.f29519l = 1;
        h5.E(obj);
        Function2 function2 = this.f29520m;
        Intrinsics.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        k0.b(2, function2);
        return function2.invoke(this.f29521n, this);
    }
}
