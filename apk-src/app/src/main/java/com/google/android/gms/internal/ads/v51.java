package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v51 extends x41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f11247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f11248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f11249f;

    public v51(Object[] objArr, int i, int i10) {
        this.f11247d = objArr;
        this.f11248e = i;
        this.f11249f = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ix.n0(i, this.f11249f);
        Object obj = this.f11247d[i + i + this.f11248e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11249f;
    }
}
