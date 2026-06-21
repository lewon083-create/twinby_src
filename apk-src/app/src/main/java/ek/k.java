package ek;

import com.google.android.gms.internal.measurement.h5;
import g2.s0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends l implements Iterator, mj.a, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f16415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mj.a f16416e;

    @Override // ek.l
    public final void a(Object obj, oj.h frame) {
        this.f16414c = obj;
        this.f16413b = 3;
        this.f16416e = frame;
        nj.a aVar = nj.a.f29512b;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // ek.l
    public final Object b(Iterator it, s0 frame) {
        if (!it.hasNext()) {
            return Unit.f27471a;
        }
        this.f16415d = it;
        this.f16413b = 2;
        this.f16416e = frame;
        nj.a aVar = nj.a.f29512b;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException c() {
        int i = this.f16413b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f16413b);
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f27499b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f16413b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f16415d;
                Intrinsics.b(it);
                if (it.hasNext()) {
                    this.f16413b = 2;
                    return true;
                }
                this.f16415d = null;
            }
            this.f16413b = 5;
            mj.a aVar = this.f16416e;
            Intrinsics.b(aVar);
            this.f16416e = null;
            Unit unit = Unit.f27471a;
            ij.k kVar = ij.m.f21341c;
            aVar.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16413b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f16413b = 1;
            Iterator it = this.f16415d;
            Intrinsics.b(it);
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.f16413b = 0;
        Object obj = this.f16414c;
        this.f16414c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // mj.a
    public final void resumeWith(Object obj) throws Throwable {
        h5.E(obj);
        this.f16413b = 4;
    }
}
