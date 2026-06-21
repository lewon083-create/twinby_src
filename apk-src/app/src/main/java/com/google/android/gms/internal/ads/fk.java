package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum fk implements un1 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5373b;

    fk(int i) {
        this.f5373b = i;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final int h() {
        return this.f5373b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f5373b);
    }
}
