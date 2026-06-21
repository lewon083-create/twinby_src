package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EventDropReason;
import io.sentry.protocol.SentryException;
import io.sentry.util.HintUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeduplicateMultithreadedEventProcessor implements EventProcessor {

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final Map<String, Long> processedEvents = Collections.synchronizedMap(new HashMap());

    public DeduplicateMultithreadedEventProcessor(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 7000L;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        SentryException unhandledException;
        String type;
        Long threadId;
        if (!HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class) || (unhandledException = sentryEvent.getUnhandledException()) == null || (type = unhandledException.getType()) == null || (threadId = unhandledException.getThreadId()) == null) {
            return sentryEvent;
        }
        Long l10 = this.processedEvents.get(type);
        if (l10 == null || l10.equals(threadId)) {
            this.processedEvents.put(type, threadId);
            return sentryEvent;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", sentryEvent.getEventId());
        HintUtils.setEventDropReason(hint, EventDropReason.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
