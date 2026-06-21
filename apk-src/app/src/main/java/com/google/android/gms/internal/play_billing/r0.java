package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f14290f = new r0(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f14291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f14292e;

    public r0(int i, Object[] objArr) {
        this.f14291d = objArr;
        this.f14292e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.c0, com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f14291d;
        int i = this.f14292e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int c() {
        return this.f14292e;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d3.h(i, this.f14292e);
        Object obj = this.f14291d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final Object[] n() {
        return this.f14291d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14292e;
    }
}
