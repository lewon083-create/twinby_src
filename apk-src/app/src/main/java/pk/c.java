package pk;

import d8.k;
import hk.c0;
import hk.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends g implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31507g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f31508a;

    public final Object c(oj.c frame) {
        if (d()) {
            return Unit.f27471a;
        }
        l lVarI = c0.i(nj.f.b(frame));
        try {
            a(new b(this, lVarI));
            Object objS = lVarI.s();
            nj.a aVar = nj.a.f29512b;
            if (objS == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objS != aVar) {
                objS = Unit.f27471a;
            }
            return objS == aVar ? objS : Unit.f27471a;
        } catch (Throwable th2) {
            lVarI.A();
            throw th2;
        }
    }

    public final boolean d() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f31515f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f31507g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (Math.max(g.f31515f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31507g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            k kVar = d.f31508a;
            if (obj2 != kVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(c0.h(this));
        sb2.append("[isLocked=");
        sb2.append(Math.max(g.f31515f.get(this), 0) == 0);
        sb2.append(",owner=");
        sb2.append(f31507g.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
