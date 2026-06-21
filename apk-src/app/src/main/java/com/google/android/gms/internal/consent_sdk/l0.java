package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f13456f;

    public l0(m0 m0Var, int i, int i10) {
        this.f13456f = m0Var;
        this.f13454d = i;
        this.f13455e = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int c() {
        return this.f13456f.e() + this.f13454d + this.f13455e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int e() {
        return this.f13456f.e() + this.f13454d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final Object[] f() {
        return this.f13456f.f();
    }

    @Override // com.google.android.gms.internal.consent_sdk.m0, java.util.List
    /* JADX INFO: renamed from: g */
    public final m0 subList(int i, int i10) {
        h0.f(i, i10, this.f13455e);
        int i11 = this.f13454d;
        return this.f13456f.subList(i + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.b(i, this.f13455e);
        return this.f13456f.get(i + this.f13454d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13455e;
    }
}
