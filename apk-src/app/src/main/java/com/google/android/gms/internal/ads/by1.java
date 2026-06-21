package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends wx1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3965e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3967d;

    public by1(ci ciVar, Object obj, Object obj2) {
        super(ciVar);
        this.f3966c = obj;
        this.f3967d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public final nh b(int i, nh nhVar, long j10) {
        this.f11916b.b(i, nhVar, j10);
        if (Objects.equals(nhVar.f8298a, this.f3966c)) {
            nhVar.f8298a = nh.f8296m;
        }
        return nhVar;
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public final bh d(int i, bh bhVar, boolean z5) {
        this.f11916b.d(i, bhVar, z5);
        if (Objects.equals(bhVar.f3785b, this.f3967d) && z5) {
            bhVar.f3785b = f3965e;
        }
        return bhVar;
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        Object obj2;
        if (f3965e.equals(obj) && (obj2 = this.f3967d) != null) {
            obj = obj2;
        }
        return this.f11916b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public final Object f(int i) {
        Object objF = this.f11916b.f(i);
        return Objects.equals(objF, this.f3967d) ? f3965e : objF;
    }
}
