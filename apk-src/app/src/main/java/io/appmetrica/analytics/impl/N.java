package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.sentry.util.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f22705a;

    public N(@NonNull K k7) {
        this.f22705a = k7;
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(new L(this, context));
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Fi fi2) {
        return a(new M(this, context, fi2));
    }

    public static AdTrackingInfoResult a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !StringUtils.PROPER_NIL_UUID.equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
