package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import yads.f9;
import yads.g9;
import yads.ip2;
import yads.kp2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp2 f15314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9 f15315b;

    public e(kp2 kp2Var, f9 f9Var) {
        this.f15314a = kp2Var;
        this.f15315b = f9Var;
    }

    public final g9 a(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        ip2 ip2VarA;
        AdTheme preferredTheme = nativeAdRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f15314a.getClass();
            ip2VarA = kp2.a(preferredTheme);
        } else {
            ip2VarA = null;
        }
        ip2 ip2Var = ip2VarA;
        this.f15315b.getClass();
        return new g9(nativeAdRequestConfiguration.getAdUnitId(), nativeAdRequestConfiguration.getAge(), nativeAdRequestConfiguration.getGender(), nativeAdRequestConfiguration.getContextQuery(), nativeAdRequestConfiguration.getContextTags(), nativeAdRequestConfiguration.getLocation(), nativeAdRequestConfiguration.getParameters(), nativeAdRequestConfiguration.getBiddingData(), null, ip2Var, nativeAdRequestConfiguration.getShouldLoadImagesAutomatically(), null);
    }

    public /* synthetic */ e() {
        this(new kp2(), new f9());
    }
}
