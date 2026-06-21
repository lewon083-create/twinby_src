package oj;

import hk.l;
import hk.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient mj.a intercepted;

    public c(CoroutineContext coroutineContext, mj.a aVar) {
        super(aVar);
        this._context = coroutineContext;
    }

    @Override // mj.a
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.b(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final mj.a intercepted() {
        mj.a aVar = this.intercepted;
        if (aVar != null) {
            return aVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.R1);
        mj.a fVar = dVar != null ? new mk.f((x) dVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // oj.a
    public void releaseIntercepted() {
        mj.a aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.R1);
            Intrinsics.b(element);
            mk.f fVar = (mk.f) aVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mk.f.i;
            while (atomicReferenceFieldUpdater.get(fVar) == mk.a.f28906c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.p();
            }
        }
        this.intercepted = b.f30693b;
    }

    public c(mj.a aVar) {
        this(aVar != null ? aVar.getContext() : null, aVar);
    }
}
