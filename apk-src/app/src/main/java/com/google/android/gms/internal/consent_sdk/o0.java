package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13505c;

    public o0(Object obj) {
        this.f13504b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13505c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13505c) {
            throw new NoSuchElementException();
        }
        this.f13505c = true;
        return this.f13504b;
    }
}
