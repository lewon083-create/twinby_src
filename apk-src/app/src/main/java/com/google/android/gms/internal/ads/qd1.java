package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f9464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f9465c;

    public /* synthetic */ qd1(Iterator it, Iterator it2) {
        this.f9464b = it;
        this.f9465c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9464b.hasNext() || this.f9465c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f9464b;
        return it.hasNext() ? it.next() : this.f9465c.next();
    }
}
