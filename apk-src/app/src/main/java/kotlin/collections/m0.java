package kotlin.collections;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements ListIterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListIterator f27491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f27492c;

    public m0(n0 n0Var, int i) {
        this.f27492c = n0Var;
        this.f27491b = n0Var.f27493b.listIterator(y.s(n0Var, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f27491b;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27491b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27491b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f27491b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return s.e(this.f27492c) - this.f27491b.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f27491b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return s.e(this.f27492c) - this.f27491b.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f27491b.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f27491b.set(obj);
    }
}
