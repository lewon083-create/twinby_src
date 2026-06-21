package kotlin.coroutines;

import hk.u;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static Object a(CoroutineContext.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static CoroutineContext.Element b(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.a(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext c(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.a(element.getKey(), key) ? g.f27499b : element;
    }

    public static CoroutineContext d(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f27499b ? element : (CoroutineContext) context.fold(element, new u(5));
    }
}
