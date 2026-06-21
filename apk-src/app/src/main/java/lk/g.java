package lk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mk.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8.k f28140a = new d8.k("NULL", 1);

    public static /* synthetic */ kk.e a(e eVar, ik.d dVar, int i, jk.a aVar, int i10) {
        CoroutineContext coroutineContext = dVar;
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f27499b;
        }
        if ((i10 & 2) != 0) {
            i = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = jk.a.f26675b;
        }
        return eVar.j(coroutineContext, i, aVar);
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, mj.a frame) {
        Object objInvoke;
        Object objC = u.c(coroutineContext, obj2);
        try {
            m mVar = new m(coroutineContext, frame);
            if (function2 == null) {
                objInvoke = nj.f.c(function2, obj, mVar);
            } else {
                k0.b(2, function2);
                objInvoke = function2.invoke(obj, mVar);
            }
            u.a(coroutineContext, objC);
            if (objInvoke == nj.a.f29512b) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th2) {
            u.a(coroutineContext, objC);
            throw th2;
        }
    }
}
