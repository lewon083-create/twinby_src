package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.TransactionEnd;
import io.sentry.logger.ILoggerBatchProcessor;
import io.sentry.logger.NoOpLoggerBatchProcessor;
import io.sentry.metrics.IMetricsBatchProcessor;
import io.sentry.metrics.NoOpMetricsBatchProcessor;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransport;
import io.sentry.transport.RateLimiter;
import io.sentry.util.CheckInUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.util.Random;
import io.sentry.util.SentryRandom;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryClient implements ISentryClient {
    static final String SENTRY_PROTOCOL_VERSION = "7";

    @NotNull
    private final ILoggerBatchProcessor loggerBatchProcessor;

    @NotNull
    private final IMetricsBatchProcessor metricsBatchProcessor;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ITransport transport;

    @NotNull
    private final SortBreadcrumbsByDate sortBreadcrumbsByDate = new SortBreadcrumbsByDate();
    private boolean enabled = true;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
        private SortBreadcrumbsByDate() {
        }

        @Override // java.util.Comparator
        public int compare(@NotNull Breadcrumb breadcrumb, @NotNull Breadcrumb breadcrumb2) {
            return breadcrumb.getTimestamp().compareTo(breadcrumb2.getTimestamp());
        }
    }

    public SentryClient(@NotNull SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        ITransportFactory transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof NoOpTransportFactory) {
            transportFactory = new AsyncHttpTransportFactory();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.transport = transportFactory.create(sentryOptions, new RequestDetailsResolver(sentryOptions).resolve());
        if (sentryOptions.getLogs().isEnabled()) {
            this.loggerBatchProcessor = sentryOptions.getLogs().getLoggerBatchProcessorFactory().create(sentryOptions, this);
        } else {
            this.loggerBatchProcessor = NoOpLoggerBatchProcessor.getInstance();
        }
        if (sentryOptions.getMetrics().isEnabled()) {
            this.metricsBatchProcessor = sentryOptions.getMetrics().getMetricsBatchProcessorFactory().create(sentryOptions, this);
        } else {
            this.metricsBatchProcessor = NoOpMetricsBatchProcessor.getInstance();
        }
    }

    private void addScopeAttachmentsToHint(@Nullable IScope iScope, @NotNull Hint hint) {
        if (iScope != null) {
            hint.addAttachments(iScope.getAttachments());
        }
    }

    @Nullable
    private SentryEvent applyFeedbackScope(@NotNull SentryEvent sentryEvent, @NotNull IScope iScope, @NotNull Hint hint) {
        if (sentryEvent.getUser() == null) {
            sentryEvent.setUser(iScope.getUser());
        }
        if (sentryEvent.getTags() == null) {
            sentryEvent.setTags(new HashMap(iScope.getTags()));
        } else {
            for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                if (!sentryEvent.getTags().containsKey(entry.getKey())) {
                    sentryEvent.getTags().put(entry.getKey(), entry.getValue());
                }
            }
        }
        Contexts contexts = sentryEvent.getContexts();
        for (Map.Entry<String, Object> entry2 : new Contexts(iScope.getContexts()).entrySet()) {
            if (!contexts.containsKey(entry2.getKey())) {
                contexts.put(entry2.getKey(), entry2.getValue());
            }
        }
        ISpan span = iScope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null) {
            if (span == null) {
                sentryEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
            } else {
                sentryEvent.getContexts().setTrace(span.getSpanContext());
            }
        }
        return processFeedbackEvent(sentryEvent, hint, iScope.getEventProcessors());
    }

    @Nullable
    private SentryEvent applyScope(@NotNull SentryEvent sentryEvent, @Nullable IScope iScope, @NotNull Hint hint) {
        FeatureFlags featureFlags;
        if (iScope == null) {
            return sentryEvent;
        }
        applyScope(sentryEvent, iScope);
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(iScope.getTransactionName());
        }
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(iScope.getFingerprint());
        }
        if (iScope.getLevel() != null) {
            sentryEvent.setLevel(iScope.getLevel());
        }
        ISpan span = iScope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null) {
            if (span == null) {
                sentryEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
            } else {
                sentryEvent.getContexts().setTrace(span.getSpanContext());
            }
        }
        if (sentryEvent.getContexts().getFeatureFlags() == null && (featureFlags = iScope.getFeatureFlags()) != null) {
            sentryEvent.getContexts().setFeatureFlags(featureFlags);
        }
        return processEvent(sentryEvent, hint, iScope.getEventProcessors());
    }

    @Nullable
    private SentryEnvelope buildEnvelope(@Nullable SentryBaseEvent sentryBaseEvent, @Nullable List<Attachment> list, @Nullable Session session, @Nullable TraceContext traceContext, @Nullable ProfilingTraceData profilingTraceData) {
        SentryId sentryId;
        ArrayList arrayList = new ArrayList();
        if (sentryBaseEvent != null) {
            arrayList.add(SentryEnvelopeItem.fromEvent(this.options.getSerializer(), sentryBaseEvent));
            sentryId = sentryBaseEvent.getEventId();
        } else {
            sentryId = null;
        }
        if (session != null) {
            arrayList.add(SentryEnvelopeItem.fromSession(this.options.getSerializer(), session));
        }
        if (profilingTraceData != null) {
            arrayList.add(SentryEnvelopeItem.fromProfilingTrace(profilingTraceData, this.options.getMaxTraceFileSize(), this.options.getSerializer()));
            if (sentryId == null) {
                sentryId = new SentryId(profilingTraceData.getProfileId());
            }
        }
        if (list != null) {
            Iterator<Attachment> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SentryEnvelopeItem.fromAttachment(this.options.getSerializer(), this.options.getLogger(), it.next(), this.options.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new SentryEnvelope(new SentryEnvelopeHeader(sentryId, this.options.getSdkVersion(), traceContext), arrayList);
    }

    @Nullable
    private SentryEvent executeBeforeSend(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        SentryOptions.BeforeSendCallback beforeSend = this.options.getBeforeSend();
        if (beforeSend == null) {
            return sentryEvent;
        }
        try {
            return beforeSend.execute(sentryEvent, hint);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private SentryEvent executeBeforeSendFeedback(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        SentryOptions.BeforeSendCallback beforeSendFeedback = this.options.getBeforeSendFeedback();
        if (beforeSendFeedback == null) {
            return sentryEvent;
        }
        try {
            return beforeSendFeedback.execute(sentryEvent, hint);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendFeedback callback threw an exception.", th2);
            return null;
        }
    }

    @Nullable
    private SentryLogEvent executeBeforeSendLog(@NotNull SentryLogEvent sentryLogEvent) {
        SentryOptions.Logs.BeforeSendLogCallback beforeSend = this.options.getLogs().getBeforeSend();
        if (beforeSend == null) {
            return sentryLogEvent;
        }
        try {
            return beforeSend.execute(sentryLogEvent);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendLog callback threw an exception. Dropping log event.", th2);
            return null;
        }
    }

    @Nullable
    private SentryMetricsEvent executeBeforeSendMetric(@NotNull SentryMetricsEvent sentryMetricsEvent, @NotNull Hint hint) {
        SentryOptions.Metrics.BeforeSendMetricCallback beforeSend = this.options.getMetrics().getBeforeSend();
        if (beforeSend == null) {
            return sentryMetricsEvent;
        }
        try {
            return beforeSend.execute(sentryMetricsEvent, hint);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendMetric callback threw an exception. Dropping metrics event.", th2);
            return null;
        }
    }

    @Nullable
    private SentryReplayEvent executeBeforeSendReplay(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint) {
        SentryOptions.BeforeSendReplayCallback beforeSendReplay = this.options.getBeforeSendReplay();
        if (beforeSendReplay == null) {
            return sentryReplayEvent;
        }
        try {
            return beforeSendReplay.execute(sentryReplayEvent, hint);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendReplay callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private SentryTransaction executeBeforeSendTransaction(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        SentryOptions.BeforeSendTransactionCallback beforeSendTransaction = this.options.getBeforeSendTransaction();
        if (beforeSendTransaction == null) {
            return sentryTransaction;
        }
        try {
            return beforeSendTransaction.execute(sentryTransaction, hint);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private List<Attachment> filterForTransaction(@Nullable List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attachment attachment : list) {
            if (attachment.isAddToTransactions()) {
                arrayList.add(attachment);
            }
        }
        return arrayList;
    }

    private void finalizeTransaction(@NotNull IScope iScope, @NotNull Hint hint) {
        ITransaction transaction = iScope.getTransaction();
        if (transaction == null || !HintUtils.hasType(hint, TransactionEnd.class)) {
            return;
        }
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (!(sentrySdkHint instanceof DiskFlushNotification)) {
            transaction.forceFinish(SpanStatus.ABORTED, false, null);
        } else {
            ((DiskFlushNotification) sentrySdkHint).setFlushable(transaction.getEventId());
            transaction.forceFinish(SpanStatus.ABORTED, false, hint);
        }
    }

    @Nullable
    private List<Attachment> getAttachments(@NotNull Hint hint) {
        List<Attachment> attachments = hint.getAttachments();
        Attachment screenshot = hint.getScreenshot();
        if (screenshot != null) {
            attachments.add(screenshot);
        }
        Attachment viewHierarchy = hint.getViewHierarchy();
        if (viewHierarchy != null) {
            attachments.add(viewHierarchy);
        }
        Attachment threadDump = hint.getThreadDump();
        if (threadDump != null) {
            attachments.add(threadDump);
        }
        return attachments;
    }

    @Nullable
    private TraceContext getTraceContext(@Nullable IScope iScope, @NotNull Hint hint, @Nullable SentryEvent sentryEvent) {
        return getTraceContext(iScope, hint, sentryEvent, sentryEvent != null ? sentryEvent.getTransaction() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionData$1(SentryEvent sentryEvent, Hint hint, Session session) {
        if (session == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strMechanism = null;
        Session.State state = sentryEvent.isCrashed() ? Session.State.Crashed : null;
        boolean z5 = Session.State.Crashed == state || sentryEvent.isErrored();
        String str = (sentryEvent.getRequest() == null || sentryEvent.getRequest().getHeaders() == null || !sentryEvent.getRequest().getHeaders().containsKey("user-agent")) ? null : sentryEvent.getRequest().getHeaders().get("user-agent");
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (sentrySdkHint instanceof AbnormalExit) {
            strMechanism = ((AbnormalExit) sentrySdkHint).mechanism();
            state = Session.State.Abnormal;
        }
        if (session.update(state, str, z5, strMechanism) && session.isTerminated()) {
            session.end();
        }
    }

    @Nullable
    private SentryEvent processEvent(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, @NotNull List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                boolean z5 = next instanceof BackfillingEventProcessor;
                boolean zHasType = HintUtils.hasType(hint, Backfillable.class);
                if (zHasType && z5) {
                    sentryEvent = next.process(sentryEvent, hint);
                } else if (!zHasType && !z5) {
                    sentryEvent = next.process(sentryEvent, hint);
                }
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
                break;
            }
        }
        return sentryEvent;
    }

    @Nullable
    private SentryEvent processFeedbackEvent(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, @NotNull List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryEvent = next.process(sentryEvent, hint);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing feedback event by processor: %s", next.getClass().getName());
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Feedback event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Feedback);
                break;
            }
        }
        return sentryEvent;
    }

    @Nullable
    private SentryLogEvent processLogEvent(@NotNull SentryLogEvent sentryLogEvent, @NotNull List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryLogEvent = next.process(sentryLogEvent);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing log event by processor: %s", next.getClass().getName());
            }
            if (sentryLogEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Log event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.LogItem);
                break;
            }
        }
        return sentryLogEvent;
    }

    @Nullable
    private SentryMetricsEvent processMetricsEvent(@NotNull SentryMetricsEvent sentryMetricsEvent, @NotNull List<EventProcessor> list, @NotNull Hint hint) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryMetricsEvent = next.process(sentryMetricsEvent, hint);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing metrics event by processor: %s", next.getClass().getName());
            }
            if (sentryMetricsEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Metrics event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.TraceMetric);
                break;
            }
        }
        return sentryMetricsEvent;
    }

    @Nullable
    private SentryReplayEvent processReplayEvent(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint, @NotNull List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryReplayEvent = next.process(sentryReplayEvent, hint);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (sentryReplayEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Replay);
                break;
            }
        }
        return sentryReplayEvent;
    }

    @Nullable
    private SentryTransaction processTransaction(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint, @NotNull List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            int size = sentryTransaction.getSpans().size();
            try {
                sentryTransaction = next.process(sentryTransaction, hint);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            int size2 = sentryTransaction == null ? 0 : sentryTransaction.getSpans().size();
            if (sentryTransaction == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
                this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                this.options.getLogger().log(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, i);
            }
        }
        return sentryTransaction;
    }

    private boolean sample() {
        Random randomCurrent = this.options.getSampleRate() == null ? null : SentryRandom.current();
        return this.options.getSampleRate() == null || randomCurrent == null || this.options.getSampleRate().doubleValue() >= randomCurrent.nextDouble();
    }

    @NotNull
    private SentryId sendEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        SentryOptions.BeforeEnvelopeCallback beforeEnvelopeCallback = this.options.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.execute(sentryEnvelope, hint);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        SentryIntegrationPackageStorage.getInstance().checkForMixedVersions(this.options.getLogger());
        if (hint == null) {
            this.transport.send(sentryEnvelope);
        } else {
            this.transport.send(sentryEnvelope, hint);
        }
        SentryId eventId = sentryEnvelope.getHeader().getEventId();
        return eventId != null ? eventId : SentryId.EMPTY_ID;
    }

    private boolean shouldApplyScopeData(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private boolean shouldSendSessionUpdateForDroppedEvent(@Nullable Session session, @Nullable Session session2) {
        if (session2 == null) {
            return false;
        }
        if (session == null) {
            return true;
        }
        Session.State status = session2.getStatus();
        Session.State state = Session.State.Crashed;
        if (status != state || session.getStatus() == state) {
            return session2.errorCount() > 0 && session.errorCount() <= 0;
        }
        return true;
    }

    private void sortBreadcrumbsByDate(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull Collection<Breadcrumb> collection) {
        List<Breadcrumb> breadcrumbs = sentryBaseEvent.getBreadcrumbs();
        if (breadcrumbs == null || collection.isEmpty()) {
            return;
        }
        breadcrumbs.addAll(collection);
        Collections.sort(breadcrumbs, this.sortBreadcrumbsByDate);
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedLogEvents(@NotNull SentryLogEvents sentryLogEvents) {
        try {
            sendEnvelope(buildEnvelope(sentryLogEvents), null);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing logs failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedMetricsEvents(@NotNull SentryMetricsEvents sentryMetricsEvents) {
        try {
            sendEnvelope(buildEnvelope(sentryMetricsEvents), null);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing metrics failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureCheckIn(@NotNull CheckIn checkIn, @Nullable IScope iScope, @Nullable Hint hint) {
        if (hint == null) {
            hint = new Hint();
        }
        if (checkIn.getEnvironment() == null) {
            checkIn.setEnvironment(this.options.getEnvironment());
        }
        if (checkIn.getRelease() == null) {
            checkIn.setRelease(this.options.getRelease());
        }
        if (shouldApplyScopeData(checkIn, hint)) {
            checkIn = applyScope(checkIn, iScope);
        }
        if (CheckInUtils.isIgnored(this.options.getIgnoredCheckIns(), checkIn.getMonitorSlug())) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was dropped as slug %s is ignored", checkIn.getMonitorSlug());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Monitor);
            return SentryId.EMPTY_ID;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing check-in: %s", checkIn.getCheckInId());
        SentryId checkInId = checkIn.getCheckInId();
        try {
            SentryEnvelope sentryEnvelopeBuildEnvelope = buildEnvelope(checkIn, getTraceContext(iScope, hint, null));
            hint.clear();
            return sendEnvelope(sentryEnvelopeBuildEnvelope, hint);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing check-in %s failed.", checkInId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        if (hint == null) {
            hint = new Hint();
        }
        try {
            hint.clear();
            return sendEnvelope(sentryEnvelope, hint);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", e3);
            return SentryId.EMPTY_ID;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // io.sentry.ISentryClient
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.SentryId captureEvent(@org.jetbrains.annotations.NotNull io.sentry.SentryEvent r12, @org.jetbrains.annotations.Nullable io.sentry.IScope r13, @org.jetbrains.annotations.Nullable io.sentry.Hint r14) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SentryClient.captureEvent(io.sentry.SentryEvent, io.sentry.IScope, io.sentry.Hint):io.sentry.protocol.SentryId");
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @NotNull IScope iScope) {
        SentryClient sentryClient;
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.getContexts().setFeedback(feedback);
        if (hint == null) {
            hint = new Hint();
        }
        if (feedback.getUrl() == null) {
            feedback.setUrl(iScope.getScreen());
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing feedback: %s", sentryEvent.getEventId());
        if (shouldApplyScopeData(sentryEvent, hint) && (sentryEvent = applyFeedbackScope(sentryEvent, iScope, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Feedback was dropped by applyScope", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        SentryEvent sentryEventProcessFeedbackEvent = processFeedbackEvent(sentryEvent, hint, this.options.getEventProcessors());
        if (sentryEventProcessFeedbackEvent != null && (sentryEventProcessFeedbackEvent = executeBeforeSendFeedback(sentryEventProcessFeedbackEvent, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Feedback);
        }
        SentryEvent sentryEvent2 = sentryEventProcessFeedbackEvent;
        if (sentryEvent2 == null) {
            return SentryId.EMPTY_ID;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryEvent2.getEventId() != null ? sentryEvent2.getEventId() : sentryId;
        if (feedback.getReplayId() == null) {
            this.options.getReplayController().captureReplay(Boolean.FALSE);
            SentryId replayId = iScope.getReplayId();
            if (!replayId.equals(sentryId)) {
                feedback.setReplayId(replayId);
            }
        }
        try {
            sentryClient = this;
        } catch (SentryEnvelopeException | IOException e3) {
            e = e3;
            sentryClient = this;
        }
        try {
            SentryEnvelope sentryEnvelopeBuildEnvelope = sentryClient.buildEnvelope(sentryEvent2, getAttachments(hint), null, getTraceContext(iScope, hint, sentryEvent2), null);
            hint.clear();
            return sentryEnvelopeBuildEnvelope != null ? sendEnvelope(sentryEnvelopeBuildEnvelope, hint) : eventId;
        } catch (SentryEnvelopeException e7) {
            e = e7;
            sentryClient.options.getLogger().log(SentryLevel.WARNING, e, "Capturing feedback %s failed.", eventId);
            return SentryId.EMPTY_ID;
        } catch (IOException e10) {
            e = e10;
            sentryClient.options.getLogger().log(SentryLevel.WARNING, e, "Capturing feedback %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureLog(@Nullable SentryLogEvent sentryLogEvent, @Nullable IScope iScope) {
        if (sentryLogEvent == null || iScope == null || (sentryLogEvent = processLogEvent(sentryLogEvent, iScope.getEventProcessors())) != null) {
            if ((sentryLogEvent == null || (sentryLogEvent = processLogEvent(sentryLogEvent, this.options.getEventProcessors())) != null) && sentryLogEvent != null) {
                SentryLogEvent sentryLogEventExecuteBeforeSendLog = executeBeforeSendLog(sentryLogEvent);
                if (sentryLogEventExecuteBeforeSendLog != null) {
                    this.loggerBatchProcessor.add(sentryLogEventExecuteBeforeSendLog);
                    return;
                }
                this.options.getLogger().log(SentryLevel.DEBUG, "Log Event was dropped by beforeSendLog", new Object[0]);
                IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.BEFORE_SEND;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.LogItem);
                this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.LogByte, JsonSerializationUtils.byteSizeOf(this.options.getSerializer(), this.options.getLogger(), sentryLogEvent));
            }
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureMetric(@Nullable SentryMetricsEvent sentryMetricsEvent, @Nullable IScope iScope, @Nullable Hint hint) {
        if (hint == null) {
            hint = new Hint();
        }
        if (sentryMetricsEvent == null || iScope == null || (sentryMetricsEvent = processMetricsEvent(sentryMetricsEvent, iScope.getEventProcessors(), hint)) != null) {
            if ((sentryMetricsEvent == null || (sentryMetricsEvent = processMetricsEvent(sentryMetricsEvent, this.options.getEventProcessors(), hint)) != null) && sentryMetricsEvent != null) {
                SentryMetricsEvent sentryMetricsEventExecuteBeforeSendMetric = executeBeforeSendMetric(sentryMetricsEvent, hint);
                if (sentryMetricsEventExecuteBeforeSendMetric != null) {
                    this.metricsBatchProcessor.add(sentryMetricsEventExecuteBeforeSendMetric);
                } else {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Metrics Event was dropped by beforeSendMetrics", new Object[0]);
                    this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.TraceMetric);
                }
            }
        }
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk, @Nullable IScope iScope) {
        Objects.requireNonNull(profileChunk, "profileChunk is required.");
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing profile chunk: %s", profileChunk.getChunkId());
        SentryId chunkId = profileChunk.getChunkId();
        DebugMeta debugMetaBuildDebugMeta = DebugMeta.buildDebugMeta(profileChunk.getDebugMeta(), this.options);
        if (debugMetaBuildDebugMeta != null) {
            profileChunk.setDebugMeta(debugMetaBuildDebugMeta);
        }
        try {
            return sendEnvelope(new SentryEnvelope(new SentryEnvelopeHeader(chunkId, this.options.getSdkVersion(), null), Collections.singletonList(SentryEnvelopeItem.fromProfileChunk(profileChunk, this.options.getSerializer(), this.options.getProfilerConverter()))), null);
        } catch (SentryEnvelopeException | IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing profile chunk %s failed.", chunkId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureReplayEvent(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable IScope iScope, @Nullable Hint hint) {
        Objects.requireNonNull(sentryReplayEvent, "SessionReplay is required.");
        if (hint == null) {
            hint = new Hint();
        }
        if (shouldApplyScopeData(sentryReplayEvent, hint)) {
            applyScope(sentryReplayEvent, iScope);
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing session replay: %s", sentryReplayEvent.getEventId());
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryReplayEvent.getEventId() != null ? sentryReplayEvent.getEventId() : sentryId;
        SentryReplayEvent sentryReplayEventProcessReplayEvent = processReplayEvent(sentryReplayEvent, hint, this.options.getEventProcessors());
        if (sentryReplayEventProcessReplayEvent != null && (sentryReplayEventProcessReplayEvent = executeBeforeSendReplay(sentryReplayEventProcessReplayEvent, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSendReplay", new Object[0]);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Replay);
        }
        if (sentryReplayEventProcessReplayEvent == null) {
            return sentryId;
        }
        try {
            SentryEnvelope sentryEnvelopeBuildEnvelope = buildEnvelope(sentryReplayEventProcessReplayEvent, hint.getReplayRecording(), getTraceContext(iScope, hint, sentryReplayEventProcessReplayEvent, null), HintUtils.hasType(hint, Backfillable.class));
            hint.clear();
            this.transport.send(sentryEnvelopeBuildEnvelope, hint);
            return eventId;
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing event %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureSession(@NotNull Session session, @Nullable Hint hint) {
        Objects.requireNonNull(session, "Session is required.");
        if (session.getRelease() == null || session.getRelease().isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            captureEnvelope(SentryEnvelope.from(this.options.getSerializer(), session, this.options.getSdkVersion()), hint);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", e3);
        }
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable IScope iScope, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData) {
        Objects.requireNonNull(sentryTransaction, "Transaction is required.");
        if (hint == null) {
            hint = new Hint();
        }
        if (shouldApplyScopeData(sentryTransaction, hint)) {
            addScopeAttachmentsToHint(iScope, hint);
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing transaction: %s", sentryTransaction.getEventId());
        if (TracingUtils.isIgnored(this.options.getIgnoredTransactions(), sentryTransaction.getTransaction())) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped as transaction name %s is ignored", sentryTransaction.getTransaction());
            IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
            clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            return SentryId.EMPTY_ID;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryTransaction.getEventId() != null ? sentryTransaction.getEventId() : sentryId;
        if (shouldApplyScopeData(sentryTransaction, hint)) {
            sentryTransaction = (SentryTransaction) applyScope(sentryTransaction, iScope);
            if (sentryTransaction != null && iScope != null) {
                sentryTransaction = processTransaction(sentryTransaction, hint, iScope.getEventProcessors());
            }
            if (sentryTransaction == null) {
                this.options.getLogger().log(sentryLevel, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (sentryTransaction != null) {
            sentryTransaction = processTransaction(sentryTransaction, hint, this.options.getEventProcessors());
        }
        if (sentryTransaction == null) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped by Event processors.", new Object[0]);
            return sentryId;
        }
        int size = sentryTransaction.getSpans().size();
        SentryTransaction sentryTransactionExecuteBeforeSendTransaction = executeBeforeSendTransaction(sentryTransaction, hint);
        int size2 = sentryTransactionExecuteBeforeSendTransaction == null ? 0 : sentryTransactionExecuteBeforeSendTransaction.getSpans().size();
        if (sentryTransactionExecuteBeforeSendTransaction == null) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            IClientReportRecorder clientReportRecorder2 = this.options.getClientReportRecorder();
            DiscardReason discardReason2 = DiscardReason.BEFORE_SEND;
            clientReportRecorder2.recordLostEvent(discardReason2, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(discardReason2, DataCategory.Span, size + 1);
            return sentryId;
        }
        if (size2 < size) {
            int i = size - size2;
            this.options.getLogger().log(sentryLevel, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Span, i);
        }
        try {
            SentryEnvelope sentryEnvelopeBuildEnvelope = buildEnvelope(sentryTransactionExecuteBeforeSendTransaction, filterForTransaction(getAttachments(hint)), null, traceContext, profilingTraceData);
            hint.clear();
            return sentryEnvelopeBuildEnvelope != null ? sendEnvelope(sentryEnvelopeBuildEnvelope, hint) : eventId;
        } catch (SentryEnvelopeException | IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing transaction %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    @Deprecated
    public void captureUserFeedback(@NotNull UserFeedback userFeedback) {
        Objects.requireNonNull(userFeedback, "SentryEvent is required.");
        if (SentryId.EMPTY_ID.equals(userFeedback.getEventId())) {
            this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", userFeedback.getEventId());
        try {
            sendEnvelope(buildEnvelope(userFeedback), null);
        } catch (IOException e3) {
            this.options.getLogger().log(SentryLevel.WARNING, e3, "Capturing user feedback %s failed.", userFeedback.getEventId());
        }
    }

    @Override // io.sentry.ISentryClient
    public void close() {
        close(false);
    }

    @Override // io.sentry.ISentryClient
    public void flush(long j10) {
        this.loggerBatchProcessor.flush(j10);
        this.metricsBatchProcessor.flush(j10);
        this.transport.flush(j10);
    }

    @Override // io.sentry.ISentryClient
    @Nullable
    public RateLimiter getRateLimiter() {
        return this.transport.getRateLimiter();
    }

    @Override // io.sentry.ISentryClient
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // io.sentry.ISentryClient
    public boolean isHealthy() {
        return this.transport.isHealthy();
    }

    @Nullable
    public Session updateSessionData(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, @Nullable IScope iScope) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            if (iScope != null) {
                return iScope.withSession(new n(this, sentryEvent, hint));
            }
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Nullable
    private TraceContext getTraceContext(@Nullable IScope iScope, @NotNull Hint hint, @Nullable SentryBaseEvent sentryBaseEvent, @Nullable String str) {
        if (HintUtils.hasType(hint, Backfillable.class)) {
            if (sentryBaseEvent != null) {
                return Baggage.fromEvent(sentryBaseEvent, str, this.options).toTraceContext();
            }
            return null;
        }
        if (iScope == null) {
            return null;
        }
        ITransaction transaction = iScope.getTransaction();
        return transaction != null ? transaction.traceContext() : TracingUtils.maybeUpdateBaggage(iScope, this.options).traceContext();
    }

    @Override // io.sentry.ISentryClient
    public void close(boolean z5) {
        long shutdownTimeoutMillis;
        this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        if (z5) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.options.getShutdownTimeoutMillis();
            } catch (IOException e3) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e3);
            }
        }
        flush(shutdownTimeoutMillis);
        this.loggerBatchProcessor.close(z5);
        this.metricsBatchProcessor.close(z5);
        this.transport.close(z5);
        for (EventProcessor eventProcessor : this.options.getEventProcessors()) {
            if (eventProcessor instanceof Closeable) {
                try {
                    ((Closeable) eventProcessor).close();
                } catch (IOException e7) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", eventProcessor, e7);
                }
            }
        }
        this.enabled = false;
    }

    private boolean shouldApplyScopeData(@NotNull CheckIn checkIn, @NotNull Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was cached so not applying scope: %s", checkIn.getCheckInId());
        return false;
    }

    @NotNull
    private CheckIn applyScope(@NotNull CheckIn checkIn, @Nullable IScope iScope) {
        if (iScope != null) {
            ISpan span = iScope.getSpan();
            if (checkIn.getContexts().getTrace() == null) {
                if (span == null) {
                    checkIn.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
                    return checkIn;
                }
                checkIn.getContexts().setTrace(span.getSpanContext());
            }
        }
        return checkIn;
    }

    @NotNull
    private SentryReplayEvent applyScope(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable IScope iScope) {
        if (iScope != null) {
            if (sentryReplayEvent.getRequest() == null) {
                sentryReplayEvent.setRequest(iScope.getRequest());
            }
            if (sentryReplayEvent.getUser() == null) {
                sentryReplayEvent.setUser(iScope.getUser());
            }
            if (sentryReplayEvent.getTags() == null) {
                sentryReplayEvent.setTags(new HashMap(iScope.getTags()));
            } else {
                for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                    if (!sentryReplayEvent.getTags().containsKey(entry.getKey())) {
                        sentryReplayEvent.getTags().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Contexts contexts = sentryReplayEvent.getContexts();
            for (Map.Entry<String, Object> entry2 : new Contexts(iScope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry2.getKey())) {
                    contexts.put(entry2.getKey(), entry2.getValue());
                }
            }
            ISpan span = iScope.getSpan();
            if (sentryReplayEvent.getContexts().getTrace() == null) {
                if (span == null) {
                    sentryReplayEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
                    return sentryReplayEvent;
                }
                sentryReplayEvent.getContexts().setTrace(span.getSpanContext());
            }
        }
        return sentryReplayEvent;
    }

    @Deprecated
    @NotNull
    private SentryEnvelope buildEnvelope(@NotNull UserFeedback userFeedback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), userFeedback));
        return new SentryEnvelope(new SentryEnvelopeHeader(userFeedback.getEventId(), this.options.getSdkVersion()), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureEvent$0(Session session) {
    }

    @NotNull
    private SentryEnvelope buildEnvelope(@NotNull CheckIn checkIn, @Nullable TraceContext traceContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromCheckIn(this.options.getSerializer(), checkIn));
        return new SentryEnvelope(new SentryEnvelopeHeader(checkIn.getCheckInId(), this.options.getSdkVersion(), traceContext), arrayList);
    }

    @NotNull
    private SentryEnvelope buildEnvelope(@NotNull SentryLogEvents sentryLogEvents) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromLogs(this.options.getSerializer(), sentryLogEvents));
        return new SentryEnvelope(new SentryEnvelopeHeader(null, this.options.getSdkVersion(), null), arrayList);
    }

    @NotNull
    private <T extends SentryBaseEvent> T applyScope(@NotNull T t10, @Nullable IScope iScope) {
        if (iScope != null) {
            if (t10.getRequest() == null) {
                t10.setRequest(iScope.getRequest());
            }
            if (t10.getUser() == null) {
                t10.setUser(iScope.getUser());
            }
            if (t10.getTags() == null) {
                t10.setTags(new HashMap(iScope.getTags()));
            } else {
                for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                    if (!t10.getTags().containsKey(entry.getKey())) {
                        t10.getTags().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t10.getBreadcrumbs() == null) {
                t10.setBreadcrumbs(new ArrayList(iScope.getBreadcrumbs()));
            } else {
                sortBreadcrumbsByDate(t10, iScope.getBreadcrumbs());
            }
            if (t10.getExtras() == null) {
                t10.setExtras(new HashMap(iScope.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : iScope.getExtras().entrySet()) {
                    if (!t10.getExtras().containsKey(entry2.getKey())) {
                        t10.getExtras().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Contexts contexts = t10.getContexts();
            for (Map.Entry<String, Object> entry3 : new Contexts(iScope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry3.getKey())) {
                    contexts.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t10;
    }

    @NotNull
    private SentryEnvelope buildEnvelope(@NotNull SentryMetricsEvents sentryMetricsEvents) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromMetrics(this.options.getSerializer(), sentryMetricsEvents));
        return new SentryEnvelope(new SentryEnvelopeHeader(null, this.options.getSdkVersion(), null), arrayList);
    }

    @NotNull
    private SentryEnvelope buildEnvelope(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable ReplayRecording replayRecording, @Nullable TraceContext traceContext, boolean z5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromReplay(this.options.getSerializer(), this.options.getLogger(), sentryReplayEvent, replayRecording, z5));
        return new SentryEnvelope(new SentryEnvelopeHeader(sentryReplayEvent.getEventId(), this.options.getSessionReplay().getSdkVersion(), traceContext), arrayList);
    }
}
