package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LoadClass extends io.sentry.util.LoadClass {
    private final io.sentry.util.LoadClass delegate = new io.sentry.util.LoadClass();

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(@NotNull String str, @Nullable ILogger iLogger) {
        return this.delegate.isClassAvailable(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    @Nullable
    public Class<?> loadClass(@NotNull String str, @Nullable ILogger iLogger) {
        return this.delegate.loadClass(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(@NotNull String str, @Nullable SentryOptions sentryOptions) {
        return this.delegate.isClassAvailable(str, sentryOptions);
    }
}
