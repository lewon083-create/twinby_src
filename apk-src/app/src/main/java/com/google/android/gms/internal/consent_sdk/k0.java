package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends t0 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f13445d;

    public k0(m0 m0Var, int i) {
        int size = m0Var.size();
        h0.d(i, size);
        this.f13443b = size;
        this.f13444c = i;
        this.f13445d = m0Var;
    }

    public final Object a(int i) {
        return this.f13445d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13444c < this.f13443b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13444c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13444c;
        this.f13444c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13444c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f13444c - 1;
        this.f13444c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13444c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
