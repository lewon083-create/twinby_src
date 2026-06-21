package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class en0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5012b;

    public en0(String str, int i) {
        this.f5011a = str;
        this.f5012b = i;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        return vv.d(new fn0(this.f5011a, this.f5012b));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 31;
    }
}
