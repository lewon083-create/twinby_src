package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j51 extends d61 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6725d;

    public j51(Object obj) {
        super(0);
        this.f6724c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6725d;
    }

    @Override // com.google.android.gms.internal.ads.d61, java.util.Iterator
    public final Object next() {
        if (this.f6725d) {
            throw new NoSuchElementException();
        }
        this.f6725d = true;
        return this.f6724c;
    }
}
