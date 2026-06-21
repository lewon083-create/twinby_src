package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends ci {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5 f4391b;

    public cy1(n5 n5Var) {
        this.f4391b = n5Var;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final nh b(int i, nh nhVar, long j10) {
        Object obj = nh.f8296m;
        nhVar.a(this.f4391b, false, true, null, -9223372036854775807L);
        nhVar.i = true;
        return nhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final bh d(int i, bh bhVar, boolean z5) {
        Integer num = z5 ? 0 : null;
        Object obj = z5 ? by1.f3965e : null;
        ou ouVar = ou.f8799b;
        bhVar.a(num, obj, 0, -9223372036854775807L, true);
        return bhVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        return obj == by1.f3965e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i) {
        return by1.f3965e;
    }
}
