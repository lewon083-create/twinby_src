package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f14335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f14336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f14337f;

    public v0(Object[] objArr, int i, int i10) {
        this.f14335d = objArr;
        this.f14336e = i;
        this.f14337f = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d3.h(i, this.f14337f);
        Object obj = this.f14335d[i + i + this.f14336e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14337f;
    }
}
