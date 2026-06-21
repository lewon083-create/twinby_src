package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a51 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v41 f2778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d61 f2779d;

    public a51(f51 f51Var) {
        super(0);
        Objects.requireNonNull(f51Var);
        this.f2778c = ((x41) f51Var.f5243e.values()).listIterator(0);
        this.f2779d = h51.f6031f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2779d.hasNext() || this.f2778c.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.d61, java.util.Iterator
    public final Object next() {
        if (!this.f2779d.hasNext()) {
            this.f2779d = ((t41) this.f2778c.next()).a();
        }
        return this.f2779d.next();
    }
}
