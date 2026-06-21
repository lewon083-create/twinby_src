package fb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f16730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i) {
        super(0);
        int size = eVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(j0.g.o0(i, size, "index"));
        }
        this.f16728c = size;
        this.f16729d = i;
        this.f16730e = eVar;
    }

    public final Object a(int i) {
        return this.f16730e.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16729d < this.f16728c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16729d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f16729d;
        this.f16729d = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16729d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f16729d - 1;
        this.f16729d = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16729d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
