package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p0 f13513f = new p0(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13515e;

    public p0(int i, Object[] objArr) {
        this.f13514d = objArr;
        this.f13515e = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m0, com.google.android.gms.internal.consent_sdk.j0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f13514d;
        int i = this.f13515e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int c() {
        return this.f13515e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final Object[] f() {
        return this.f13514d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.b(i, this.f13515e);
        Object obj = this.f13514d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13515e;
    }
}
