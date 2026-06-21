package mk;

import hk.t1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8.k f28941a = new d8.k("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hk.u f28942b = new hk.u(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hk.u f28943c = new hk.u(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hk.u f28944d = new hk.u(8);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f28941a) {
            return;
        }
        if (!(obj instanceof w)) {
            Object objFold = coroutineContext.fold(null, f28943c);
            Intrinsics.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a0.u.q(objFold);
            throw null;
        }
        w wVar = (w) obj;
        t1[] t1VarArr = wVar.f28949c;
        int length = t1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        t1 t1Var = t1VarArr[length];
        Intrinsics.b(null);
        Object obj2 = wVar.f28948b[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f28942b);
        Intrinsics.b(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f28941a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new w(((Number) obj).intValue(), coroutineContext), f28944d);
        }
        a0.u.q(obj);
        throw null;
    }
}
