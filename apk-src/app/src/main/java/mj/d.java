package mj;

import ij.l;
import io.sentry.protocol.FeatureFlag;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements a, oj.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f28901c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f28902d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, FeatureFlag.JsonKeys.RESULT);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f28903b;

    @Nullable
    private volatile Object result;

    public d(a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        nj.a aVar = nj.a.f29513c;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f28903b = delegate;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        nj.a aVar = nj.a.f29513c;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28902d;
            nj.a aVar2 = nj.a.f29512b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return nj.a.f29512b;
        }
        if (obj == nj.a.f29514d) {
            return nj.a.f29512b;
        }
        if (obj instanceof l) {
            throw ((l) obj).f21340b;
        }
        return obj;
    }

    @Override // oj.d
    public final oj.d getCallerFrame() {
        a aVar = this.f28903b;
        if (aVar instanceof oj.d) {
            return (oj.d) aVar;
        }
        return null;
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f28903b.getContext();
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            nj.a aVar = nj.a.f29513c;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28902d;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            nj.a aVar2 = nj.a.f29512b;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28902d;
            nj.a aVar3 = nj.a.f29514d;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f28903b.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f28903b;
    }
}
