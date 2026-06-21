package ad;

import com.google.android.gms.internal.measurement.h5;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends q1 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f805d;

    public h0(j0 j0Var, int i) {
        int size = j0Var.size();
        h5.o(i, size);
        this.f803b = size;
        this.f804c = i;
        this.f805d = j0Var;
    }

    public final Object a(int i) {
        return this.f805d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f804c < this.f803b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f804c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f804c;
        this.f804c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f804c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f804c - 1;
        this.f804c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f804c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
