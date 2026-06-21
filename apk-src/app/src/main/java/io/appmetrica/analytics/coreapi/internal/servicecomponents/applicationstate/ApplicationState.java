package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(A2.f22054g),
    VISIBLE("visible");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21747a;

    ApplicationState(String str) {
        this.f21747a = str;
    }

    @NonNull
    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f21747a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f21747a;
    }
}
