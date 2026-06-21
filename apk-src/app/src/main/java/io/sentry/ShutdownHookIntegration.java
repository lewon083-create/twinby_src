package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {

    @NotNull
    private final Runtime runtime;

    @Nullable
    private Thread thread;

    public ShutdownHookIntegration(@NotNull Runtime runtime) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "Runtime is required");
    }

    private void handleShutdownInProgress(@NotNull Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e3) {
            String message = e3.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        this.runtime.removeShutdownHook(this.thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$0(IScopes iScopes, SentryOptions sentryOptions) {
        iScopes.flush(sentryOptions.getFlushTimeoutMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$1(SentryOptions sentryOptions) {
        this.runtime.addShutdownHook(this.thread);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ShutdownHook");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.thread != null) {
            handleShutdownInProgress(new m(2, this));
        }
    }

    @Nullable
    public Thread getHook() {
        return this.thread;
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.thread = new Thread(new h(2, iScopes, sentryOptions), "sentry-shutdownhook");
            handleShutdownInProgress(new h(3, this, sentryOptions));
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
