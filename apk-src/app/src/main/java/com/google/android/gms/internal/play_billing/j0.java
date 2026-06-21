package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f14216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14218d;

    public j0(Iterator it) {
        it.getClass();
        this.f14216b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14217c || this.f14216b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14217c) {
            return this.f14216b.next();
        }
        Object obj = this.f14218d;
        this.f14217c = false;
        this.f14218d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f14217c) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f14216b.remove();
    }
}
