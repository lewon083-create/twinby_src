package io.appmetrica.analytics.gpllibrary.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IGplLibraryWrapper {
    void startLocationUpdates(@NonNull GplLibraryWrapper.Priority priority);

    void stopLocationUpdates();

    void updateLastKnownLocation();
}
