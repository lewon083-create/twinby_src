package gb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends fb.g implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f20099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, int i) {
        super(1);
        int size = qVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(hl.d.N(i, size, "index"));
        }
        this.f20097c = size;
        this.f20098d = i;
        this.f20099e = qVar;
    }

    public final Object a(int i) {
        return this.f20099e.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20098d < this.f20097c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20098d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f20098d;
        this.f20098d = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20098d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f20098d - 1;
        this.f20098d = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20098d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
