package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ic {
    void a(Location location);

    void a(String str);

    void a(String str, String str2);

    void a(boolean z5);

    void a(boolean z5, boolean z10);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z5);

    void setUserProfileID(String str);
}
