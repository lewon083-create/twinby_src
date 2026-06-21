package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r51 extends x41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r51 f9713f = new r51(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f9714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f9715e;

    public r51(int i, Object[] objArr) {
        this.f9714d = objArr;
        this.f9715e = i;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final Object[] c() {
        return this.f9714d;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int f() {
        return this.f9715e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ix.n0(i, this.f9715e);
        Object obj = this.f9714d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x41, com.google.android.gms.internal.ads.t41
    public final int o(Object[] objArr, int i) {
        Object[] objArr2 = this.f9714d;
        int i10 = this.f9715e;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9715e;
    }
}
