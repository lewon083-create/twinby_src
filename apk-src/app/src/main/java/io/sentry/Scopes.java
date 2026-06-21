package io.sentry;

import io.sentry.Scope;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.logger.ILoggerApi;
import io.sentry.logger.LoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.SpanUtils;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Scopes implements IScopes {

    @NotNull
    private final CombinedScopeView combinedScope;

    @NotNull
    private final CompositePerformanceCollector compositePerformanceCollector;

    @NotNull
    private final String creator;

    @NotNull
    private final IFeedbackApi feedbackApi;

    @NotNull
    private final IScope globalScope;

    @NotNull
    private final IScope isolationScope;

    @NotNull
    private final ILoggerApi logger;

    @NotNull
    private final IMetricsApi metrics;

    @Nullable
    private final Scopes parentScopes;

    @NotNull
    private final IScope scope;

    public Scopes(@NotNull IScope iScope, @NotNull IScope iScope2, @NotNull IScope iScope3, @NotNull String str) {
        this(iScope, iScope2, iScope3, null, str);
    }

    private void assignTraceContext(@NotNull SentryEvent sentryEvent) {
        getCombinedScopeView().assignTraceContext(sentryEvent);
    }

    @NotNull
    private IScope buildLocalScope(@NotNull IScope iScope, @Nullable ScopeCallback scopeCallback) {
        if (scopeCallback != null) {
            try {
                IScope iScopeM605clone = iScope.m601clone();
                scopeCallback.run(iScopeM605clone);
                return iScopeM605clone;
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return iScope;
    }

    @NotNull
    private SentryId captureEventInternal(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureEvent = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        if (sentryEvent == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        try {
            assignTraceContext(sentryEvent);
            sentryIdCaptureEvent = getClient().captureEvent(sentryEvent, buildLocalScope(getCombinedScopeView(), scopeCallback), hint);
            updateLastEventId(sentryIdCaptureEvent);
            return sentryIdCaptureEvent;
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing event with id: " + sentryEvent.getEventId(), th2);
            return sentryIdCaptureEvent;
        }
    }

    @NotNull
    private SentryId captureExceptionInternal(@NotNull Throwable th2, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureEvent = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                SentryEvent sentryEvent = new SentryEvent(th2);
                assignTraceContext(sentryEvent);
                sentryIdCaptureEvent = getClient().captureEvent(sentryEvent, buildLocalScope(getCombinedScopeView(), scopeCallback), hint);
            } catch (Throwable th3) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        updateLastEventId(sentryIdCaptureEvent);
        return sentryIdCaptureEvent;
    }

    @NotNull
    private SentryId captureMessageInternal(@NotNull String str, @NotNull SentryLevel sentryLevel, @Nullable ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureMessage = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                sentryIdCaptureMessage = getClient().captureMessage(str, sentryLevel, buildLocalScope(getCombinedScopeView(), scopeCallback));
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing message: ".concat(str), th2);
            }
        }
        updateLastEventId(sentryIdCaptureMessage);
        return sentryIdCaptureMessage;
    }

    @NotNull
    private ITransaction createTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions) {
        ITransaction iTransactionCreateTransaction;
        Objects.requireNonNull(transactionContext, "transactionContext is required");
        transactionContext.setOrigin(transactionOptions.getOrigin());
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            iTransactionCreateTransaction = NoOpTransaction.getInstance();
        } else if (SpanUtils.isIgnored(getOptions().getIgnoredSpanOrigins(), transactionContext.getOrigin())) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", transactionContext.getOrigin());
            iTransactionCreateTransaction = NoOpTransaction.getInstance();
        } else if (!getOptions().getInstrumenter().equals(transactionContext.getInstrumenter())) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", transactionContext.getInstrumenter(), getOptions().getInstrumenter());
            iTransactionCreateTransaction = NoOpTransaction.getInstance();
        } else if (getOptions().isTracingEnabled()) {
            TracesSamplingDecision tracesSamplingDecisionSample = getOptions().getInternalTracesSampler().sample(new SamplingContext(transactionContext, transactionOptions.getCustomSamplingContext(), getSampleRand(transactionContext), null));
            transactionContext.setSamplingDecision(tracesSamplingDecisionSample);
            ISpanFactory spanFactory = transactionOptions.getSpanFactory();
            if (spanFactory == null) {
                spanFactory = getOptions().getSpanFactory();
            }
            if (tracesSamplingDecisionSample.getSampled().booleanValue() && getOptions().isContinuousProfilingEnabled()) {
                ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
                ProfileLifecycle profileLifecycle2 = ProfileLifecycle.TRACE;
                if (profileLifecycle == profileLifecycle2 && transactionContext.getProfilerId().equals(SentryId.EMPTY_ID)) {
                    getOptions().getContinuousProfiler().startProfiler(profileLifecycle2, getOptions().getInternalTracesSampler());
                }
            }
            iTransactionCreateTransaction = spanFactory.createTransaction(transactionContext, this, transactionOptions, this.compositePerformanceCollector);
            if (tracesSamplingDecisionSample.getSampled().booleanValue() && tracesSamplingDecisionSample.getProfileSampled().booleanValue()) {
                ITransactionProfiler transactionProfiler = getOptions().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.bindTransaction(iTransactionCreateTransaction);
                } else if (transactionOptions.isAppStartTransaction()) {
                    transactionProfiler.bindTransaction(iTransactionCreateTransaction);
                }
            }
        } else {
            getOptions().getLogger().log(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            iTransactionCreateTransaction = NoOpTransaction.getInstance();
        }
        if (transactionOptions.isBindToScope()) {
            iTransactionCreateTransaction.makeCurrent();
        }
        return iTransactionCreateTransaction;
    }

    @NotNull
    private Double getSampleRand(@NotNull TransactionContext transactionContext) {
        Double sampleRand;
        Baggage baggage = transactionContext.getBaggage();
        return (baggage == null || (sampleRand = baggage.getSampleRand()) == null) ? getCombinedScopeView().getPropagationContext().getSampleRand() : sampleRand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2(ISentryExecutorService iSentryExecutorService) {
        iSentryExecutorService.close(getOptions().getShutdownTimeoutMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$close$3(boolean z5, IScope iScope) {
        iScope.getClient().close(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$close$4(boolean z5, IScope iScope) {
        iScope.getClient().close(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$close$5(boolean z5, IScope iScope) {
        iScope.getClient().close(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$continueTrace$7(PropagationContext propagationContext, IScope iScope) {
        iScope.withPropagationContext(new e(3, iScope, propagationContext));
    }

    private void updateLastEventId(@NotNull SentryId sentryId) {
        getCombinedScopeView().setLastEventId(sentryId);
    }

    private static void validateOptions(@NotNull SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().addBreadcrumb(breadcrumb, hint);
        }
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        this.combinedScope.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.IScopes
    public void bindClient(@NotNull ISentryClient iSentryClient) {
        if (iSentryClient != null) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "New client bound to scope.", new Object[0]);
            getCombinedScopeView().bindClient(iSentryClient);
        } else {
            getOptions().getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.", new Object[0]);
            getCombinedScopeView().bindClient(NoOpSentryClient.getInstance());
        }
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureCheckIn(@NotNull CheckIn checkIn) {
        SentryId sentryIdCaptureCheckIn = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                sentryIdCaptureCheckIn = getClient().captureCheckIn(checkIn, getCombinedScopeView(), null);
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing check-in for slug", th2);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureCheckIn' call is a no-op.", new Object[0]);
        }
        updateLastEventId(sentryIdCaptureCheckIn);
        return sentryIdCaptureCheckIn;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                SentryId sentryIdCaptureEnvelope = getClient().captureEnvelope(sentryEnvelope, hint);
                if (sentryIdCaptureEnvelope != null) {
                    return sentryIdCaptureEnvelope;
                }
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return captureEventInternal(sentryEvent, hint, null);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint) {
        return captureExceptionInternal(th2, hint, null);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
        } else if (feedback.getMessage().isEmpty()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureFeedback called with empty message.", new Object[0]);
        } else {
            try {
                return getClient().captureFeedback(feedback, hint, buildLocalScope(getCombinedScopeView(), scopeCallback));
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing feedback: " + feedback.getMessage(), th2);
            }
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel) {
        return captureMessageInternal(str, sentryLevel, null);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk) {
        Objects.requireNonNull(profileChunk, "profilingContinuousData is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                return getClient().captureProfileChunk(profileChunk, getScope());
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing profile chunk with id: " + profileChunk.getChunkId(), th2);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureReplay(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable Hint hint) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                return getClient().captureReplayEvent(sentryReplayEvent, getCombinedScopeView(), hint);
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing replay", th2);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData) {
        SentryTransaction sentryTransaction2;
        Objects.requireNonNull(sentryTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!sentryTransaction.isFinished()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", sentryTransaction.getEventId());
        } else {
            if (Boolean.TRUE.equals(Boolean.valueOf(sentryTransaction.isSampled()))) {
                try {
                    sentryTransaction2 = sentryTransaction;
                } catch (Throwable th2) {
                    th = th2;
                    sentryTransaction2 = sentryTransaction;
                }
                try {
                    return getClient().captureTransaction(sentryTransaction2, traceContext, getCombinedScopeView(), hint, profilingTraceData);
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing transaction with id: " + sentryTransaction2.getEventId(), th4);
                    return sentryId;
                }
            }
            getOptions().getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", sentryTransaction.getEventId());
            if (getOptions().getBackpressureMonitor().getDownsampleFactor() > 0) {
                IClientReportRecorder clientReportRecorder = getOptions().getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.BACKPRESSURE;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
                getOptions().getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            } else {
                IClientReportRecorder clientReportRecorder2 = getOptions().getClientReportRecorder();
                DiscardReason discardReason2 = DiscardReason.SAMPLE_RATE;
                clientReportRecorder2.recordLostEvent(discardReason2, DataCategory.Transaction);
                getOptions().getClientReportRecorder().recordLostEvent(discardReason2, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            }
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void captureUserFeedback(@NotNull UserFeedback userFeedback) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            getClient().captureUserFeedback(userFeedback);
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing captureUserFeedback: " + userFeedback.toString(), th2);
        }
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
        if (isEnabled()) {
            getCombinedScopeView().clearBreadcrumbs();
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void close() {
        close(false);
    }

    @Override // io.sentry.IScopes
    public void configureScope(@Nullable ScopeType scopeType, @NotNull ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.combinedScope.getSpecificScope(scopeType));
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.IScopes
    @Nullable
    public TransactionContext continueTrace(@Nullable String str, @Nullable List<String> list) {
        PropagationContext propagationContextFromHeaders = PropagationContext.fromHeaders(getOptions().getLogger(), str, list, getOptions());
        configureScope(new b(1, propagationContextFromHeaders));
        if (getOptions().isTracingEnabled()) {
            return TransactionContext.fromPropagationContext(propagationContextFromHeaders);
        }
        return null;
    }

    @Override // io.sentry.IScopes
    public void endSession() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Session sessionEndSession = getCombinedScopeView().endSession();
        if (sessionEndSession != null) {
            getClient().captureSession(sessionEndSession, HintUtils.createWithTypeCheckHint(new SessionEndHint()));
        }
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IFeedbackApi feedback() {
        return this.feedbackApi;
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            getClient().flush(j10);
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedCurrentScope(@NotNull String str) {
        return new Scopes(this.scope.m601clone(), this.isolationScope, this.globalScope, this, str);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedRootScopes(@NotNull String str) {
        return Sentry.forkedRootScopes(str);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedScopes(@NotNull String str) {
        return new Scopes(this.scope.m601clone(), this.isolationScope.m601clone(), this.globalScope, this, str);
    }

    @Override // io.sentry.IScopes
    @Nullable
    public BaggageHeader getBaggage() {
        if (isEnabled()) {
            TracingUtils.TracingHeaders tracingHeadersTrace = TracingUtils.trace(this, null, getSpan());
            if (tracingHeadersTrace != null) {
                return tracingHeadersTrace.getBaggageHeader();
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getBaggage' call is a no-op.", new Object[0]);
        }
        return null;
    }

    @NotNull
    public ISentryClient getClient() {
        return getCombinedScopeView().getClient();
    }

    @NotNull
    public IScope getCombinedScopeView() {
        return this.combinedScope;
    }

    @NotNull
    public String getCreator() {
        return this.creator;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getGlobalScope() {
        return this.globalScope;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getIsolationScope() {
        return this.isolationScope;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId getLastEventId() {
        return getCombinedScopeView().getLastEventId();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryOptions getOptions() {
        return this.combinedScope.getOptions();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public IScopes getParentScopes() {
        return this.parentScopes;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public RateLimiter getRateLimiter() {
        return getClient().getRateLimiter();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getScope() {
        return this.scope;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ISpan getSpan() {
        if (isEnabled()) {
            return getCombinedScopeView().getSpan();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public SentryTraceHeader getTraceparent() {
        if (isEnabled()) {
            TracingUtils.TracingHeaders tracingHeadersTrace = TracingUtils.trace(this, null, getSpan());
            if (tracingHeadersTrace != null) {
                return tracingHeadersTrace.getSentryTraceHeader();
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTraceparent' call is a no-op.", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ITransaction getTransaction() {
        if (isEnabled()) {
            return getCombinedScopeView().getTransaction();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(@Nullable IScopes iScopes) {
        if (iScopes == null) {
            return false;
        }
        if (this == iScopes) {
            return true;
        }
        if (iScopes.getParentScopes() != null) {
            return isAncestorOf(iScopes.getParentScopes());
        }
        return false;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public Boolean isCrashedLastRun() {
        return SentryCrashLastRunState.getInstance().isCrashedLastRun(getOptions().getCacheDirPath(), !getOptions().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return getClient().isEnabled();
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return getClient().isHealthy();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ILoggerApi logger() {
        return this.logger;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        return Sentry.setCurrentScopes(this);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IMetricsApi metrics() {
        return this.metrics;
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
            return;
        }
        Scopes scopes = this.parentScopes;
        if (scopes != null) {
            scopes.makeCurrent();
        }
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushIsolationScope() {
        if (isEnabled()) {
            return forkedScopes("pushIsolationScope").makeCurrent();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushIsolationScope' call is a no-op.", new Object[0]);
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushScope() {
        if (isEnabled()) {
            return forkedCurrentScope("pushScope").makeCurrent();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public void removeAttribute(@Nullable String str) {
        if (isEnabled()) {
            getCombinedScopeView().removeAttribute(str);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeAttribute' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void removeExtra(@Nullable String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().removeExtra(str);
        }
    }

    @Override // io.sentry.IScopes
    public void removeTag(@Nullable String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().removeTag(str);
        }
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
        if (getOptions().isEnableTimeToFullDisplayTracing()) {
            getOptions().getFullyDisplayedReporter().reportFullyDrawn();
        }
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(@Nullable ISpan iSpan) {
        getCombinedScopeView().setActiveSpan(iSpan);
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable String str, @Nullable Object obj) {
        if (isEnabled()) {
            getCombinedScopeView().setAttribute(str, obj);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setAttribute' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
        if (isEnabled()) {
            getCombinedScopeView().setAttributes(sentryAttributes);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setAttributes' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setExtra(@Nullable String str, @Nullable String str2) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setExtra(str, str2);
        }
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(@NotNull List<String> list) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setFingerprint(list);
        }
    }

    @Override // io.sentry.IScopes
    public void setLevel(@Nullable SentryLevel sentryLevel) {
        if (isEnabled()) {
            getCombinedScopeView().setLevel(sentryLevel);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str) {
        getCombinedScopeView().setSpanContext(th2, iSpan, str);
    }

    @Override // io.sentry.IScopes
    public void setTag(@Nullable String str, @Nullable String str2) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setTag(str, str2);
        }
    }

    @Override // io.sentry.IScopes
    public void setTransaction(@Nullable String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else if (str != null) {
            getCombinedScopeView().setTransaction(str);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setUser(@Nullable User user) {
        if (isEnabled()) {
            getCombinedScopeView().setUser(user);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
        if (!getOptions().isContinuousProfilingEnabled()) {
            if (getOptions().isProfilingEnabled()) {
                getOptions().getLogger().log(SentryLevel.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            }
        } else {
            ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
            ProfileLifecycle profileLifecycle2 = ProfileLifecycle.MANUAL;
            if (profileLifecycle != profileLifecycle2) {
                getOptions().getLogger().log(SentryLevel.WARNING, "Profiling lifecycle is %s. Profiling cannot be started manually.", getOptions().getProfileLifecycle().name());
            } else {
                getOptions().getContinuousProfiler().startProfiler(profileLifecycle2, getOptions().getInternalTracesSampler());
            }
        }
    }

    @Override // io.sentry.IScopes
    public void startSession() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Scope.SessionPair sessionPairStartSession = getCombinedScopeView().startSession();
        if (sessionPairStartSession == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (sessionPairStartSession.getPrevious() != null) {
            getClient().captureSession(sessionPairStartSession.getPrevious(), HintUtils.createWithTypeCheckHint(new SessionEndHint()));
        }
        getClient().captureSession(sessionPairStartSession.getCurrent(), HintUtils.createWithTypeCheckHint(new SessionStartHint()));
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ITransaction startTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions) {
        return createTransaction(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
        if (!getOptions().isContinuousProfilingEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            return;
        }
        ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
        ProfileLifecycle profileLifecycle2 = ProfileLifecycle.MANUAL;
        if (profileLifecycle != profileLifecycle2) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Profiling lifecycle is %s. Profiling cannot be stopped manually.", getOptions().getProfileLifecycle().name());
        } else {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Stopped continuous Profiling.", new Object[0]);
            getOptions().getContinuousProfiler().stopProfiler(profileLifecycle2);
        }
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(@NotNull ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            try {
                scopeCallback.run(NoOpScope.getInstance());
                return;
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withIsolationScope' callback.", th2);
                return;
            }
        }
        IScopes iScopesForkedScopes = forkedScopes("withIsolationScope");
        try {
            ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopesForkedScopes.makeCurrent();
            try {
                scopeCallback.run(iScopesForkedScopes.getIsolationScope());
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
            } finally {
            }
        } catch (Throwable th3) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withIsolationScope' callback.", th3);
        }
    }

    @Override // io.sentry.IScopes
    public void withScope(@NotNull ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            try {
                scopeCallback.run(NoOpScope.getInstance());
                return;
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th2);
                return;
            }
        }
        IScopes iScopesForkedCurrentScope = forkedCurrentScope("withScope");
        try {
            ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopesForkedCurrentScope.makeCurrent();
            try {
                scopeCallback.run(iScopesForkedCurrentScope.getScope());
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
            } finally {
            }
        } catch (Throwable th3) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th3);
        }
    }

    private Scopes(@NotNull IScope iScope, @NotNull IScope iScope2, @NotNull IScope iScope3, @Nullable Scopes scopes, @NotNull String str) {
        this.combinedScope = new CombinedScopeView(iScope3, iScope2, iScope);
        this.scope = iScope;
        this.isolationScope = iScope2;
        this.globalScope = iScope3;
        this.parentScopes = scopes;
        this.creator = str;
        SentryOptions options = getOptions();
        validateOptions(options);
        this.compositePerformanceCollector = options.getCompositePerformanceCollector();
        this.logger = new LoggerApi(this);
        this.metrics = new MetricsApi(this);
        this.feedbackApi = new FeedbackApi(this);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return captureEventInternal(sentryEvent, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return captureExceptionInternal(th2, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @NotNull ScopeCallback scopeCallback) {
        return captureMessageInternal(str, sentryLevel, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m608clone() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new HubScopesWrapper(forkedScopes("scopes clone"));
    }

    @Override // io.sentry.IScopes
    public void close(boolean z5) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : getOptions().getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (Throwable th2) {
                        getOptions().getLogger().log(SentryLevel.WARNING, "Failed to close the integration {}.", integration, th2);
                    }
                }
            }
            for (EventProcessor eventProcessor : getOptions().getEventProcessors()) {
                if (eventProcessor instanceof Closeable) {
                    try {
                        ((Closeable) eventProcessor).close();
                    } catch (Throwable th3) {
                        getOptions().getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", eventProcessor, th3);
                    }
                }
            }
            configureScope(new f(3));
            configureScope(ScopeType.ISOLATION, new f(4));
            getOptions().getBackpressureMonitor().close();
            getOptions().getTransactionProfiler().close();
            getOptions().getContinuousProfiler().close(true);
            getOptions().getCompositePerformanceCollector().close();
            getOptions().getConnectionStatusProvider().close();
            ISentryExecutorService executorService = getOptions().getExecutorService();
            if (z5) {
                try {
                    executorService.submit(new h(0, this, executorService));
                } catch (RejectedExecutionException e3) {
                    getOptions().getLogger().log(SentryLevel.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e3);
                    executorService.close(getOptions().getShutdownTimeoutMillis());
                }
            } else {
                executorService.close(getOptions().getShutdownTimeoutMillis());
            }
            configureScope(ScopeType.CURRENT, new i(z5, 0));
            configureScope(ScopeType.ISOLATION, new i(z5, 1));
            configureScope(ScopeType.GLOBAL, new i(z5, 2));
        } catch (Throwable th4) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while closing the Scopes.", th4);
        }
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable SentryAttribute sentryAttribute) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setAttribute' call is a no-op.", new Object[0]);
        } else {
            getCombinedScopeView().setAttribute(sentryAttribute);
        }
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, new Hint());
    }
}
