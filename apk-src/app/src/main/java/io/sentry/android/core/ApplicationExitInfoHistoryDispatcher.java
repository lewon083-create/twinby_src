package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class ApplicationExitInfoHistoryDispatcher implements Runnable {
    static final long NINETY_DAYS_THRESHOLD = TimeUnit.DAYS.toMillis(91);

    @NotNull
    private final Context context;

    @NotNull
    private final SentryAndroidOptions options;

    @NotNull
    private final ApplicationExitInfoPolicy policy;

    @NotNull
    private final IScopes scopes;
    private final long threshold;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface ApplicationExitInfoPolicy {
        @Nullable
        Report buildReport(@NotNull ApplicationExitInfo applicationExitInfo, boolean z5);

        @NotNull
        String getLabel();

        @Nullable
        Long getLastReportedTimestamp();

        int getTargetReason();

        boolean shouldReportHistorical();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Report {

        @NotNull
        private final SentryEvent event;

        @Nullable
        private final BlockingFlushHint flushHint;

        @NotNull
        private final Hint hint;

        public Report(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, @Nullable BlockingFlushHint blockingFlushHint) {
            this.event = sentryEvent;
            this.hint = hint;
            this.flushHint = blockingFlushHint;
        }

        @NotNull
        public SentryEvent getEvent() {
            return this.event;
        }

        @Nullable
        public BlockingFlushHint getFlushHint() {
            return this.flushHint;
        }

        @NotNull
        public Hint getHint() {
            return this.hint;
        }
    }

    public ApplicationExitInfoHistoryDispatcher(@NotNull Context context, @NotNull IScopes iScopes, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ICurrentDateProvider iCurrentDateProvider, @NotNull ApplicationExitInfoPolicy applicationExitInfoPolicy) {
        this.context = ContextUtils.getApplicationContext(context);
        this.scopes = iScopes;
        this.options = sentryAndroidOptions;
        this.policy = applicationExitInfoPolicy;
        this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - NINETY_DAYS_THRESHOLD;
    }

    @Nullable
    private ApplicationExitInfo removeLatest(@NotNull List<ApplicationExitInfo> list) {
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoF = j7.a.f(it.next());
            if (applicationExitInfoF.getReason() == this.policy.getTargetReason()) {
                it.remove();
                return applicationExitInfoF;
            }
        }
        return null;
    }

    private void report(@NotNull ApplicationExitInfo applicationExitInfo, boolean z5) {
        BlockingFlushHint flushHint;
        Report reportBuildReport = this.policy.buildReport(applicationExitInfo, z5);
        if (reportBuildReport == null || this.scopes.captureEvent(reportBuildReport.getEvent(), reportBuildReport.getHint()).equals(SentryId.EMPTY_ID) || (flushHint = reportBuildReport.getFlushHint()) == null || flushHint.waitFlush()) {
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", this.policy.getLabel(), reportBuildReport.getEvent().getEventId());
    }

    private void reportHistorical(@NotNull List<ApplicationExitInfo> list, @Nullable Long l10) {
        Collections.reverse(list);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoF = j7.a.f(it.next());
            if (applicationExitInfoF.getReason() == this.policy.getTargetReason()) {
                if (applicationExitInfoF.getTimestamp() < this.threshold) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "%s happened too long ago %s.", this.policy.getLabel(), applicationExitInfoF);
                } else if (l10 == null || applicationExitInfoF.getTimestamp() > l10.longValue()) {
                    report(applicationExitInfoF, false);
                } else {
                    this.options.getLogger().log(SentryLevel.DEBUG, "%s has already been reported %s.", this.policy.getLabel(), applicationExitInfoF);
                }
            }
        }
    }

    private void waitPreviousSessionFlush() {
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
            EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
            if (envelopeCache.waitPreviousSessionFlush()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
            envelopeCache.flushPreviousSession();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        waitPreviousSessionFlush();
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        Long lastReportedTimestamp = this.policy.getLastReportedTimestamp();
        ApplicationExitInfo applicationExitInfoRemoveLatest = removeLatest(arrayList);
        if (applicationExitInfoRemoveLatest == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No %ss have been found in the historical exit reasons list.", this.policy.getLabel());
            return;
        }
        if (applicationExitInfoRemoveLatest.getTimestamp() < this.threshold) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s happened too long ago, returning early.", this.policy.getLabel());
            return;
        }
        if (lastReportedTimestamp != null && applicationExitInfoRemoveLatest.getTimestamp() <= lastReportedTimestamp.longValue()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s has already been reported, returning early.", this.policy.getLabel());
            return;
        }
        if (this.policy.shouldReportHistorical()) {
            reportHistorical(arrayList, lastReportedTimestamp);
        }
        report(applicationExitInfoRemoveLatest, true);
    }
}
