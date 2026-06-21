package io.sentry.android.core.internal.tombstone;

import androidx.annotation.NonNull;
import io.sentry.android.core.cache.AndroidEnvelopeCache;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum NativeExceptionMechanism {
    TOMBSTONE(AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");


    @NonNull
    private final String value;

    NativeExceptionMechanism(@NonNull String str) {
        this.value = str;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
