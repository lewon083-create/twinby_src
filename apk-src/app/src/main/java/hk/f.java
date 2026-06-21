package hk;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f20659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0 f20660f;

    public f(CoroutineContext coroutineContext, Thread thread, u0 u0Var) {
        super(coroutineContext, true);
        this.f20659e = thread;
        this.f20660f = u0Var;
    }

    @Override // hk.k1
    public final void k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f20659e;
        if (Intrinsics.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
