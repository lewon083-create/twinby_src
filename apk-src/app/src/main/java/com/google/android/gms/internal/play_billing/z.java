package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b1 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f14384d;

    public z(c0 c0Var, int i) {
        int size = c0Var.size();
        d3.r(i, size);
        this.f14382b = size;
        this.f14383c = i;
        this.f14384d = c0Var;
    }

    public final Object a(int i) {
        return this.f14384d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14383c < this.f14382b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14383c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14383c;
        this.f14383c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14383c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14383c - 1;
        this.f14383c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14383c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
