package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k51 extends c61 implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractList f7125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k51(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f7124c = i;
        this.f7125d = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.c61
    public final Object a(Object obj) {
        switch (this.f7124c) {
            case 0:
                return ((c31) ((ad.t0) this.f7125d).f874d).apply(obj);
            default:
                return ((c31) ((ad.u0) this.f7125d).f880d).apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4058b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4058b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f4058b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4058b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
