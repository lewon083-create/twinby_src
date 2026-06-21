package io.appmetrica.analytics.coreapi.internal.identifiers;

import a0.u;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AdTrackingInfoResult {
    public final AdTrackingInfo mAdTrackingInfo;
    public final String mErrorExplanation;

    @NonNull
    public final IdentifierStatus mStatus;

    public AdTrackingInfoResult() {
        this(null, IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }

    @NonNull
    public static AdTrackingInfoResult getProviderUnavailableResult(@NonNull String str) {
        return new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, str);
    }

    public boolean isValid() {
        AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        return (adTrackingInfo == null || TextUtils.isEmpty(adTrackingInfo.advId)) ? false : true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb2.append(this.mAdTrackingInfo);
        sb2.append(", mStatus=");
        sb2.append(this.mStatus);
        sb2.append(", mErrorExplanation='");
        return u.o(sb2, this.mErrorExplanation, "'}");
    }

    public AdTrackingInfoResult(AdTrackingInfo adTrackingInfo, @NonNull IdentifierStatus identifierStatus, String str) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = str;
    }
}
