package io.sentry.util;

import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class EventSizeLimitingUtils {
    private static final int FRAMES_PER_SIDE = 250;
    private static final int MAX_FRAMES_PER_STACK = 500;

    private EventSizeLimitingUtils() {
    }

    private static boolean isSizeOk(@NotNull SentryEvent sentryEvent, @NotNull SentryOptions sentryOptions) {
        return JsonSerializationUtils.byteSizeOf(sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryEvent) <= SentryOptions.MAX_EVENT_SIZE_BYTES;
    }

    @Nullable
    public static SentryEvent limitEventSize(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, @NotNull SentryOptions sentryOptions) {
        SentryEvent sentryEventExecute;
        try {
            if (sentryOptions.isEnableEventSizeLimiting() && !isSizeOk(sentryEvent, sentryOptions)) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", sentryEvent.getEventId(), Long.valueOf(SentryOptions.MAX_EVENT_SIZE_BYTES));
                SentryOptions.OnOversizedEventCallback onOversizedEvent = sentryOptions.getOnOversizedEvent();
                if (onOversizedEvent != null) {
                    try {
                        sentryEventExecute = onOversizedEvent.execute(sentryEvent, hint);
                        if (isSizeOk(sentryEventExecute, sentryOptions)) {
                            return sentryEventExecute;
                        }
                    } catch (Throwable th2) {
                        sentryOptions.getLogger().log(SentryLevel.ERROR, "The onOversizedEvent callback threw an exception. It will be ignored and automatic reduction will continue.", th2);
                        sentryEventExecute = sentryEvent;
                    }
                } else {
                    sentryEventExecute = sentryEvent;
                }
                SentryEvent sentryEventRemoveAllBreadcrumbs = removeAllBreadcrumbs(sentryEventExecute, sentryOptions);
                if (isSizeOk(sentryEventRemoveAllBreadcrumbs, sentryOptions)) {
                    return sentryEventRemoveAllBreadcrumbs;
                }
                SentryEvent sentryEventTruncateStackFrames = truncateStackFrames(sentryEventRemoveAllBreadcrumbs, sentryOptions);
                if (!isSizeOk(sentryEventTruncateStackFrames, sentryOptions)) {
                    sentryOptions.getLogger().log(SentryLevel.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", sentryEvent.getEventId());
                }
                return sentryEventTruncateStackFrames;
            }
            return sentryEvent;
        } catch (Throwable th3) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th3);
            return sentryEvent;
        }
    }

    @NotNull
    private static SentryEvent removeAllBreadcrumbs(@NotNull SentryEvent sentryEvent, @NotNull SentryOptions sentryOptions) {
        List<Breadcrumb> breadcrumbs = sentryEvent.getBreadcrumbs();
        if (breadcrumbs != null && !breadcrumbs.isEmpty()) {
            sentryEvent.setBreadcrumbs(null);
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Removed breadcrumbs to reduce size of event %s", sentryEvent.getEventId());
        }
        return sentryEvent;
    }

    @NotNull
    private static SentryEvent truncateStackFrames(@NotNull SentryEvent sentryEvent, @NotNull SentryOptions sentryOptions) {
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions != null) {
            Iterator<SentryException> it = exceptions.iterator();
            while (it.hasNext()) {
                SentryStackTrace stacktrace = it.next().getStacktrace();
                if (stacktrace != null) {
                    truncateStackFramesInStackTrace(stacktrace, sentryEvent, sentryOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        List<SentryThread> threads = sentryEvent.getThreads();
        if (threads != null) {
            Iterator<SentryThread> it2 = threads.iterator();
            while (it2.hasNext()) {
                SentryStackTrace stacktrace2 = it2.next().getStacktrace();
                if (stacktrace2 != null) {
                    truncateStackFramesInStackTrace(stacktrace2, sentryEvent, sentryOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
        return sentryEvent;
    }

    private static void truncateStackFramesInStackTrace(@NotNull SentryStackTrace sentryStackTrace, @NotNull SentryEvent sentryEvent, @NotNull SentryOptions sentryOptions, @NotNull String str) {
        List<SentryStackFrame> frames = sentryStackTrace.getFrames();
        if (frames == null || frames.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(frames.subList(0, FRAMES_PER_SIDE));
        arrayList.addAll(frames.subList(frames.size() - FRAMES_PER_SIDE, frames.size()));
        sentryStackTrace.setFrames(arrayList);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, str, sentryEvent.getEventId());
    }
}
