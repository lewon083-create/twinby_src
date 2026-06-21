package io.sentry;

import io.sentry.util.Platform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAutoDateProvider implements SentryDateProvider {

    @NotNull
    private final SentryDateProvider dateProvider;

    public SentryAutoDateProvider() {
        if (checkInstantAvailabilityAndPrecision()) {
            this.dateProvider = new SentryInstantDateProvider();
        } else {
            this.dateProvider = new SentryNanotimeDateProvider();
        }
    }

    private static boolean checkInstantAvailabilityAndPrecision() {
        return Platform.isJvm() && Platform.isJavaNinePlus();
    }

    @Override // io.sentry.SentryDateProvider
    @NotNull
    public SentryDate now() {
        return this.dateProvider.now();
    }
}
