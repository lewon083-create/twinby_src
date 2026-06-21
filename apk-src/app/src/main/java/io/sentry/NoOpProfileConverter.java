package io.sentry;

import io.sentry.protocol.profiling.SentryProfile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpProfileConverter implements IProfileConverter {
    private static final NoOpProfileConverter instance = new NoOpProfileConverter();

    private NoOpProfileConverter() {
    }

    public static NoOpProfileConverter getInstance() {
        return instance;
    }

    @Override // io.sentry.IProfileConverter
    @NotNull
    public SentryProfile convertFromFile(@NotNull String str) {
        return new SentryProfile();
    }
}
