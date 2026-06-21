package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u31 extends d61 implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10812d;

    public u31(int i, int i10) {
        super(0);
        ix.o0(i10, i);
        this.f10811c = i;
        this.f10812d = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f10812d < this.f10811c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10812d > 0;
    }

    @Override // com.google.android.gms.internal.ads.d61, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f10812d;
        this.f10812d = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10812d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f10812d - 1;
        this.f10812d = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10812d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
