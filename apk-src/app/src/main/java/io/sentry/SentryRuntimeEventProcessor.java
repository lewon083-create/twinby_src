package io.sentry;

import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentryTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class SentryRuntimeEventProcessor implements EventProcessor {

    @Nullable
    private final String javaVendor;

    @Nullable
    private final String javaVersion;

    public SentryRuntimeEventProcessor(@Nullable String str, @Nullable String str2) {
        this.javaVersion = str;
        this.javaVendor = str2;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 2000L;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return (SentryEvent) process(sentryEvent);
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @Nullable Hint hint) {
        return (SentryTransaction) process(sentryTransaction);
    }

    @NotNull
    private <T extends SentryBaseEvent> T process(@NotNull T t10) {
        if (t10.getContexts().getRuntime() == null) {
            t10.getContexts().setRuntime(new SentryRuntime());
        }
        SentryRuntime runtime = t10.getContexts().getRuntime();
        if (runtime != null && runtime.getName() == null && runtime.getVersion() == null) {
            runtime.setName(this.javaVendor);
            runtime.setVersion(this.javaVersion);
        }
        return t10;
    }

    public SentryRuntimeEventProcessor() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
