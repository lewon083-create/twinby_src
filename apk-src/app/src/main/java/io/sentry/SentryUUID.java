package io.sentry;

import io.sentry.util.UUIDGenerator;
import io.sentry.util.UUIDStringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryUUID {
    private SentryUUID() {
    }

    public static String generateSentryId() {
        return UUIDStringUtils.toSentryIdString(UUIDGenerator.randomUUID());
    }

    public static String generateSpanId() {
        return UUIDStringUtils.toSentrySpanIdString(UUIDGenerator.randomHalfLengthUUID());
    }
}
