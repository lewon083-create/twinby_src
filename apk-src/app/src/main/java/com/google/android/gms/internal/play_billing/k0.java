package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14226c;

    public k0(Object obj) {
        this.f14225b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14226c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14226c) {
            throw new NoSuchElementException();
        }
        this.f14226c = true;
        return this.f14225b;
    }
}
