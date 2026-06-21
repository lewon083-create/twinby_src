package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ILogger {
    boolean isEnabled(@Nullable SentryLevel sentryLevel);

    void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th2);

    void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr);

    void log(@NotNull SentryLevel sentryLevel, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr);
}
