package ek;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f16392d;

    public b(Iterator iterator) {
        this.f16390b = 2;
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f16392d = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f16390b) {
            case 0:
                break;
            case 1:
                return this.f16391c > 0 && this.f16392d.hasNext();
            default:
                return this.f16392d.hasNext();
        }
        while (true) {
            int i = this.f16391c;
            it = this.f16392d;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f16391c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f16390b) {
            case 0:
                break;
            case 1:
                int i = this.f16391c;
                if (i == 0) {
                    throw new NoSuchElementException();
                }
                this.f16391c = i - 1;
                return this.f16392d.next();
            default:
                int i10 = this.f16391c;
                this.f16391c = i10 + 1;
                if (i10 >= 0) {
                    return new IndexedValue(i10, this.f16392d.next());
                }
                kotlin.collections.s.i();
                throw null;
        }
        while (true) {
            int i11 = this.f16391c;
            it = this.f16392d;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f16391c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16390b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(w wVar) {
        this.f16390b = 1;
        this.f16391c = 50;
        this.f16392d = wVar.f16427a.iterator();
    }

    public b(c cVar) {
        this.f16390b = 0;
        this.f16392d = cVar.f16393a.iterator();
        this.f16391c = cVar.f16394b;
    }
}
