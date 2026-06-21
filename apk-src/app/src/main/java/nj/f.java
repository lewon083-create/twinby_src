package nj;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static mj.a a(Function2 function2, mj.a aVar, mj.a completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof oj.a) {
            return ((oj.a) function2).create(aVar, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == g.f27499b ? new b(function2, completion, aVar) : new c(completion, context, function2, aVar);
    }

    public static mj.a b(mj.a aVar) {
        mj.a aVarIntercepted;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        oj.c cVar = aVar instanceof oj.c ? (oj.c) aVar : null;
        return (cVar == null || (aVarIntercepted = cVar.intercepted()) == null) ? aVar : aVarIntercepted;
    }

    public static Object c(Function2 function2, Object obj, mj.a completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Object dVar = context == g.f27499b ? new d(completion) : new e(context, completion);
        k0.b(2, function2);
        return function2.invoke(obj, dVar);
    }
}
