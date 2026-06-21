package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f21708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f21709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f21710c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f21708a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f21709b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f21710c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f21708a + ", mHuawei=" + this.f21709b + ", yandex=" + this.f21710c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f21708a = adTrackingInfoResult;
        this.f21709b = adTrackingInfoResult2;
        this.f21710c = adTrackingInfoResult3;
    }
}
