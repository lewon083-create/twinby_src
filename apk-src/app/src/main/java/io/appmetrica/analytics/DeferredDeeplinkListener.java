package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface DeferredDeeplinkListener {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21427a;

        Error(String str) {
            this.f21427a = str;
        }

        public String getDescription() {
            return this.f21427a;
        }
    }

    void onDeeplinkLoaded(@NonNull String str);

    void onError(@NonNull Error error, String str);
}
