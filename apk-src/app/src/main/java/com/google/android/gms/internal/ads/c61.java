package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c61 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f4058b;

    public c61(Iterator it) {
        it.getClass();
        this.f4058b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4058b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f4058b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4058b.remove();
    }
}
