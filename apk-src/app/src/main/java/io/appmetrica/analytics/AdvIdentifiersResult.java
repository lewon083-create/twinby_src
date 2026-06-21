package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AdvIdentifiersResult {

    @NonNull
    public final AdvId googleAdvId;

    @NonNull
    public final AdvId huaweiAdvId;

    @NonNull
    public final AdvId yandexAdvId;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class AdvId {
        public final String advId;

        @NonNull
        public final Details details;
        public final String errorExplanation;

        public AdvId(String str, @NonNull Details details, String str2) {
            this.advId = str;
            this.details = details;
            this.errorExplanation = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Details {
        OK,
        IDENTIFIER_PROVIDER_UNAVAILABLE,
        INVALID_ADV_ID,
        FEATURE_DISABLED,
        NO_STARTUP,
        INTERNAL_ERROR,
        FORBIDDEN_BY_CLIENT_CONFIG
    }

    public AdvIdentifiersResult(@NonNull AdvId advId, @NonNull AdvId advId2, @NonNull AdvId advId3) {
        this.googleAdvId = advId;
        this.huaweiAdvId = advId2;
        this.yandexAdvId = advId3;
    }
}
