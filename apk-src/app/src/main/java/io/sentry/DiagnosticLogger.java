package io.sentry;

import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticLogger implements ILogger {

    @Nullable
    private final ILogger logger;

    @NotNull
    private final SentryOptions options;

    public DiagnosticLogger(@NotNull SentryOptions sentryOptions, @Nullable ILogger iLogger) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.logger = iLogger;
    }

    @Nullable
    public ILogger getLogger() {
        return this.logger;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(@Nullable SentryLevel sentryLevel) {
        return sentryLevel != null && this.options.isDebug() && sentryLevel.ordinal() >= this.options.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th2) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, str, th2);
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (this.logger == null || !isEnabled(sentryLevel)) {
            return;
        }
        this.logger.log(sentryLevel, th2, str, objArr);
    }
}
