package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.util.SpanUtils;
import io.sentry.util.thread.IThreadChecker;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryTracer implements ITransaction {

    @NotNull
    private final List<Span> children;

    @Nullable
    private final CompositePerformanceCollector compositePerformanceCollector;

    @NotNull
    private final Contexts contexts;

    @Nullable
    private volatile TimerTask deadlineTimeoutTask;

    @NotNull
    private final SentryId eventId;

    @NotNull
    private FinishStatus finishStatus;

    @Nullable
    private volatile TimerTask idleTimeoutTask;

    @NotNull
    private final Instrumenter instrumenter;

    @NotNull
    private final AtomicBoolean isDeadlineTimerRunning;

    @NotNull
    private final AtomicBoolean isIdleFinishTimerRunning;

    @NotNull
    private String name;

    @NotNull
    private final Span root;

    @NotNull
    private final IScopes scopes;

    @Nullable
    private volatile Timer timer;

    @NotNull
    private final AutoClosableReentrantLock timerLock;

    @NotNull
    private final AutoClosableReentrantLock tracerLock;

    @NotNull
    private TransactionNameSource transactionNameSource;

    @NotNull
    private final TransactionOptions transactionOptions;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class FinishStatus {
        static final FinishStatus NOT_FINISHED = notFinished();
        private final boolean isFinishing;

        @Nullable
        private final SpanStatus spanStatus;

        private FinishStatus(boolean z5, @Nullable SpanStatus spanStatus) {
            this.isFinishing = z5;
            this.spanStatus = spanStatus;
        }

        @NotNull
        public static FinishStatus finishing(@Nullable SpanStatus spanStatus) {
            return new FinishStatus(true, spanStatus);
        }

        @NotNull
        private static FinishStatus notFinished() {
            return new FinishStatus(false, null);
        }
    }

    public SentryTracer(@NotNull TransactionContext transactionContext, @NotNull IScopes iScopes) {
        this(transactionContext, iScopes, new TransactionOptions(), null);
    }

    private void cancelDeadlineTimer() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            if (this.deadlineTimeoutTask != null) {
                this.deadlineTimeoutTask.cancel();
                this.isDeadlineTimerRunning.set(false);
                this.deadlineTimeoutTask = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void cancelIdleTimer() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            if (this.idleTimeoutTask != null) {
                this.idleTimeoutTask.cancel();
                this.isIdleFinishTimerRunning.set(false);
                this.idleTimeoutTask = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NotNull
    private ISpan createChild(@NotNull SpanId spanId, @NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions) {
        SpanContext spanContextCopyForChild = getSpanContext().copyForChild(str, spanId, null);
        spanContextCopyForChild.setDescription(str2);
        spanContextCopyForChild.setInstrumenter(Instrumenter.SENTRY);
        return createChild(spanContextCopyForChild, spanOptions);
    }

    @NotNull
    private SentryId getProfilerId() {
        return !this.root.getSpanContext().getProfilerId().equals(SentryId.EMPTY_ID) ? this.root.getSpanContext().getProfilerId() : this.scopes.getOptions().getContinuousProfiler().getProfilerId();
    }

    private boolean hasAllChildrenFinished() {
        ListIterator<Span> listIterator = this.children.listIterator();
        while (listIterator.hasNext()) {
            Span next = listIterator.next();
            if (!next.isFinished() && next.getFinishDate() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createChild$3(Span span) {
        CompositePerformanceCollector compositePerformanceCollector = this.compositePerformanceCollector;
        if (compositePerformanceCollector != null) {
            compositePerformanceCollector.onSpanFinished(span);
        }
        FinishStatus finishStatus = this.finishStatus;
        if (this.transactionOptions.getIdleTimeout() == null) {
            if (finishStatus.isFinishing) {
                finish(finishStatus.spanStatus);
            }
        } else if (!this.transactionOptions.isWaitForChildren() || hasAllChildrenFinished()) {
            scheduleFinish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$0(SpanFinishedCallback spanFinishedCallback, AtomicReference atomicReference, Span span) {
        if (spanFinishedCallback != null) {
            spanFinishedCallback.execute(span);
        }
        TransactionFinishedCallback transactionFinishedCallback = this.transactionOptions.getTransactionFinishedCallback();
        if (transactionFinishedCallback != null) {
            transactionFinishedCallback.execute(this);
        }
        CompositePerformanceCollector compositePerformanceCollector = this.compositePerformanceCollector;
        if (compositePerformanceCollector != null) {
            atomicReference.set(compositePerformanceCollector.stop(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$1(IScope iScope, ITransaction iTransaction) {
        if (iTransaction == this) {
            iScope.clearTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finish$2(IScope iScope) {
        iScope.withTransaction(new e(4, this, iScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$makeCurrent$5(IScope iScope) {
        iScope.setTransaction(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateBaggageValues$4(AtomicReference atomicReference, IScope iScope) {
        atomicReference.set(iScope.getReplayId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDeadlineTimeoutReached() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.DEADLINE_EXCEEDED;
        }
        forceFinish(status, this.transactionOptions.getIdleTimeout() != null, null);
        this.isDeadlineTimerRunning.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdleTimeoutReached() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        finish(status);
        this.isIdleFinishTimerRunning.set(false);
    }

    private void scheduleDeadlineTimeout() {
        Long deadlineTimeout = this.transactionOptions.getDeadlineTimeout();
        if (deadlineTimeout != null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
            try {
                if (this.timer != null) {
                    cancelDeadlineTimer();
                    this.isDeadlineTimerRunning.set(true);
                    this.deadlineTimeoutTask = new TimerTask() { // from class: io.sentry.SentryTracer.2
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            SentryTracer.this.onDeadlineTimeoutReached();
                        }
                    };
                    try {
                        this.timer.schedule(this.deadlineTimeoutTask, deadlineTimeout.longValue());
                    } catch (Throwable th2) {
                        this.scopes.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", th2);
                        onDeadlineTimeoutReached();
                    }
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th3) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private void setDefaultSpanData(@NotNull ISpan iSpan) {
        IThreadChecker threadChecker = this.scopes.getOptions().getThreadChecker();
        SentryId profilerId = getProfilerId();
        if (!profilerId.equals(SentryId.EMPTY_ID) && Boolean.TRUE.equals(iSpan.isSampled())) {
            iSpan.setData("profiler_id", profilerId.toString());
        }
        iSpan.setData(SpanDataConvention.THREAD_ID, String.valueOf(threadChecker.currentThreadSystemId()));
        iSpan.setData(SpanDataConvention.THREAD_NAME, threadChecker.getCurrentThreadName());
    }

    private void updateBaggageValues(@NotNull Baggage baggage) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.tracerLock.acquire();
        try {
            if (baggage.isMutable()) {
                AtomicReference atomicReference = new AtomicReference();
                this.scopes.configureScope(new b(4, atomicReference));
                baggage.setValuesFromTransaction(getSpanContext().getTraceId(), (SentryId) atomicReference.get(), this.scopes.getOptions(), getSamplingDecision(), getName(), getTransactionNameSource());
                baggage.freeze();
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th2;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.ISpan
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        this.root.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.ITransaction
    public void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate, boolean z5, @Nullable Hint hint) {
        SentryDate finishDate = this.root.getFinishDate();
        if (sentryDate == null) {
            sentryDate = finishDate;
        }
        if (sentryDate == null) {
            sentryDate = this.scopes.getOptions().getDateProvider().now();
        }
        for (Span span : this.children) {
            if (span.getOptions().isIdle()) {
                span.finish(spanStatus != null ? spanStatus : getSpanContext().status, sentryDate);
            }
        }
        this.finishStatus = FinishStatus.finishing(spanStatus);
        if (this.root.isFinished()) {
            return;
        }
        if (!this.transactionOptions.isWaitForChildren() || hasAllChildrenFinished()) {
            AtomicReference atomicReference = new AtomicReference();
            this.root.setSpanFinishedCallback(new n(this, this.root.getSpanFinishedCallback(), atomicReference));
            this.root.finish(this.finishStatus.spanStatus, sentryDate);
            Boolean bool = Boolean.TRUE;
            ProfilingTraceData profilingTraceDataOnTransactionFinish = (bool.equals(isSampled()) && bool.equals(isProfileSampled())) ? this.scopes.getOptions().getTransactionProfiler().onTransactionFinish(this, (List) atomicReference.get(), this.scopes.getOptions()) : null;
            if (this.scopes.getOptions().isContinuousProfilingEnabled()) {
                ProfileLifecycle profileLifecycle = this.scopes.getOptions().getProfileLifecycle();
                ProfileLifecycle profileLifecycle2 = ProfileLifecycle.TRACE;
                if (profileLifecycle == profileLifecycle2 && this.root.getSpanContext().getProfilerId().equals(SentryId.EMPTY_ID)) {
                    this.scopes.getOptions().getContinuousProfiler().stopProfiler(profileLifecycle2);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.scopes.configureScope(new v(this, 0));
            SentryTransaction sentryTransaction = new SentryTransaction(this);
            if (this.timer != null) {
                ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
                try {
                    if (this.timer != null) {
                        cancelIdleTimer();
                        cancelDeadlineTimer();
                        this.timer.cancel();
                        this.timer = null;
                    }
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                } catch (Throwable th2) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        try {
                            iSentryLifecycleTokenAcquire.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (z5 && this.children.isEmpty() && this.transactionOptions.getIdleTimeout() != null) {
                this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "Dropping idle transaction %s because it has no child spans", this.name);
            } else {
                sentryTransaction.getMeasurements().putAll(this.root.getMeasurements());
                this.scopes.captureTransaction(sentryTransaction, traceContext(), hint, profilingTraceDataOnTransactionFinish);
            }
        }
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public void forceFinish(@NotNull SpanStatus spanStatus, boolean z5, @Nullable Hint hint) {
        if (isFinished()) {
            return;
        }
        SentryDate sentryDateNow = this.scopes.getOptions().getDateProvider().now();
        ListIterator listIteratorReverseListIterator = CollectionUtils.reverseListIterator((CopyOnWriteArrayList) this.children);
        while (listIteratorReverseListIterator.hasPrevious()) {
            Span span = (Span) listIteratorReverseListIterator.previous();
            span.setSpanFinishedCallback(null);
            span.finish(spanStatus, sentryDateNow);
        }
        finish(spanStatus, sentryDateNow, z5, hint);
    }

    @NotNull
    public List<Span> getChildren() {
        return this.children;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public Contexts getContexts() {
        return this.contexts;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Object getData(@Nullable String str) {
        return this.root.getData(str);
    }

    @Nullable
    public TimerTask getDeadlineTimeoutTask() {
        return this.deadlineTimeoutTask;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getDescription() {
        return this.root.getDescription();
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public SentryId getEventId() {
        return this.eventId;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public SentryDate getFinishDate() {
        return this.root.getFinishDate();
    }

    @Nullable
    public TimerTask getIdleTimeoutTask() {
        return this.idleTimeoutTask;
    }

    @Override // io.sentry.ITransaction
    @Nullable
    public ISpan getLatestActiveSpan() {
        ListIterator listIteratorReverseListIterator = CollectionUtils.reverseListIterator((CopyOnWriteArrayList) this.children);
        while (listIteratorReverseListIterator.hasPrevious()) {
            Span span = (Span) listIteratorReverseListIterator.previous();
            if (!span.isFinished()) {
                return span;
            }
        }
        return null;
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public String getOperation() {
        return this.root.getOperation();
    }

    @NotNull
    public Span getRoot() {
        return this.root;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public TracesSamplingDecision getSamplingDecision() {
        return this.root.getSamplingDecision();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SpanContext getSpanContext() {
        return this.root.getSpanContext();
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public List<Span> getSpans() {
        return this.children;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryDate getStartDate() {
        return this.root.getStartDate();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public SpanStatus getStatus() {
        return this.root.getStatus();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getTag(@Nullable String str) {
        return this.root.getTag(str);
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Throwable getThrowable() {
        return this.root.getThrowable();
    }

    @Nullable
    public Timer getTimer() {
        return this.timer;
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    @NotNull
    public AtomicBoolean isDeadlineTimerRunning() {
        return this.isDeadlineTimerRunning;
    }

    @NotNull
    public AtomicBoolean isFinishTimerRunning() {
        return this.isIdleFinishTimerRunning;
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.root.isFinished();
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return false;
    }

    @Override // io.sentry.ITransaction
    @Nullable
    public Boolean isProfileSampled() {
        return this.root.isProfileSampled();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Boolean isSampled() {
        return this.root.isSampled();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        this.scopes.configureScope(new v(this, 2));
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ITransaction
    public void scheduleFinish() {
        Long idleTimeout;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            if (this.timer != null && (idleTimeout = this.transactionOptions.getIdleTimeout()) != null) {
                cancelIdleTimer();
                this.isIdleFinishTimerRunning.set(true);
                this.idleTimeoutTask = new TimerTask() { // from class: io.sentry.SentryTracer.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        SentryTracer.this.onIdleTimeoutReached();
                    }
                };
                try {
                    this.timer.schedule(this.idleTimeoutTask, idleTimeout.longValue());
                } catch (Throwable th2) {
                    this.scopes.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", th2);
                    onIdleTimeoutReached();
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.ISpan
    public void setContext(@Nullable String str, @Nullable Object obj) {
        this.contexts.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public void setData(@Nullable String str, @Nullable Object obj) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.root.setData(str, obj);
        }
    }

    @Override // io.sentry.ISpan
    public void setDescription(@Nullable String str) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.root.setDescription(str);
        }
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number) {
        this.root.setMeasurement(str, number);
    }

    public void setMeasurementFromChild(@NotNull String str, @NotNull Number number) {
        if (this.root.getMeasurements().containsKey(str)) {
            return;
        }
        setMeasurement(str, number);
    }

    @Override // io.sentry.ITransaction
    public void setName(@NotNull String str) {
        setName(str, TransactionNameSource.CUSTOM);
    }

    @Override // io.sentry.ISpan
    public void setOperation(@NotNull String str) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Operation %s cannot be set", str);
        } else {
            this.root.setOperation(str);
        }
    }

    @Override // io.sentry.ISpan
    public void setStatus(@Nullable SpanStatus spanStatus) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Status %s cannot be set", spanStatus == null ? "null" : spanStatus.name());
        } else {
            this.root.setStatus(spanStatus);
        }
    }

    @Override // io.sentry.ISpan
    public void setTag(@Nullable String str, @Nullable String str2) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Tag %s cannot be set", str);
        } else {
            this.root.setTag(str, str2);
        }
    }

    @Override // io.sentry.ISpan
    public void setThrowable(@Nullable Throwable th2) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            this.root.setThrowable(th2);
        }
    }

    @NotNull
    public ISpan startChild(@NotNull SpanId spanId, @NotNull String str, @Nullable String str2) {
        return startChild(spanId, str, str2, new SpanOptions());
    }

    @Override // io.sentry.ISpan
    @Nullable
    public BaggageHeader toBaggageHeader(@Nullable List<String> list) {
        Baggage baggage;
        if (!this.scopes.getOptions().isTraceSampling() || (baggage = getSpanContext().getBaggage()) == null) {
            return null;
        }
        updateBaggageValues(baggage);
        return BaggageHeader.fromBaggageAndOutgoingHeader(baggage, list);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryTraceHeader toSentryTrace() {
        return this.root.toSentryTrace();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public TraceContext traceContext() {
        Baggage baggage;
        if (!this.scopes.getOptions().isTraceSampling() || (baggage = getSpanContext().getBaggage()) == null) {
            return null;
        }
        updateBaggageValues(baggage);
        return baggage.toTraceContext();
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(@NotNull SentryDate sentryDate) {
        return this.root.updateEndDate(sentryDate);
    }

    public SentryTracer(@NotNull TransactionContext transactionContext, @NotNull IScopes iScopes, @NotNull TransactionOptions transactionOptions) {
        this(transactionContext, iScopes, transactionOptions, null);
    }

    @Nullable
    public Map<String, Object> getData() {
        return this.root.getData();
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        this.root.setMeasurement(str, number, measurementUnit);
    }

    @Override // io.sentry.ITransaction
    public void setName(@NotNull String str, @NotNull TransactionNameSource transactionNameSource) {
        if (this.root.isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Name %s cannot be set", str);
        } else {
            this.name = str;
            this.transactionNameSource = transactionNameSource;
        }
    }

    @NotNull
    public ISpan startChild(@NotNull SpanId spanId, @NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions) {
        return createChild(spanId, str, str2, spanOptions);
    }

    public SentryTracer(@NotNull TransactionContext transactionContext, @NotNull IScopes iScopes, @NotNull TransactionOptions transactionOptions, @Nullable CompositePerformanceCollector compositePerformanceCollector) {
        this.eventId = new SentryId();
        this.children = new CopyOnWriteArrayList();
        this.finishStatus = FinishStatus.NOT_FINISHED;
        this.timer = null;
        this.timerLock = new AutoClosableReentrantLock();
        this.tracerLock = new AutoClosableReentrantLock();
        this.isIdleFinishTimerRunning = new AtomicBoolean(false);
        this.isDeadlineTimerRunning = new AtomicBoolean(false);
        Contexts contexts = new Contexts();
        this.contexts = contexts;
        Objects.requireNonNull(transactionContext, "context is required");
        Objects.requireNonNull(iScopes, "scopes are required");
        Span span = new Span(transactionContext, this, iScopes, transactionOptions);
        this.root = span;
        this.name = transactionContext.getName();
        this.instrumenter = transactionContext.getInstrumenter();
        this.scopes = iScopes;
        Boolean bool = Boolean.TRUE;
        compositePerformanceCollector = bool.equals(isSampled()) ? compositePerformanceCollector : null;
        this.compositePerformanceCollector = compositePerformanceCollector;
        this.transactionNameSource = transactionContext.getTransactionNameSource();
        this.transactionOptions = transactionOptions;
        setDefaultSpanData(span);
        SentryId profilerId = getProfilerId();
        if (!profilerId.equals(SentryId.EMPTY_ID) && bool.equals(isSampled())) {
            contexts.setProfile(new ProfileContext(profilerId));
        }
        if (compositePerformanceCollector != null) {
            compositePerformanceCollector.start(this);
        }
        if (transactionOptions.getIdleTimeout() == null && transactionOptions.getDeadlineTimeout() == null) {
            return;
        }
        this.timer = new Timer(true);
        scheduleDeadlineTimeout();
        scheduleFinish();
    }

    public void setMeasurementFromChild(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        if (this.root.getMeasurements().containsKey(str)) {
            return;
        }
        setMeasurement(str, number, measurementUnit);
    }

    @NotNull
    public ISpan startChild(@NotNull SpanId spanId, @NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter) {
        SpanContext spanContextCopyForChild = getSpanContext().copyForChild(str, spanId, null);
        spanContextCopyForChild.setDescription(str2);
        spanContextCopyForChild.setInstrumenter(instrumenter);
        SpanOptions spanOptions = new SpanOptions();
        spanOptions.setStartTimestamp(sentryDate);
        return createChild(spanContextCopyForChild, spanOptions);
    }

    @NotNull
    private ISpan createChild(@NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions) {
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        if (!this.instrumenter.equals(spanContext.getInstrumenter())) {
            return NoOpSpan.getInstance();
        }
        if (SpanUtils.isIgnored(this.scopes.getOptions().getIgnoredSpanOrigins(), spanOptions.getOrigin())) {
            return NoOpSpan.getInstance();
        }
        SpanId parentSpanId = spanContext.getParentSpanId();
        String operation = spanContext.getOperation();
        String description = spanContext.getDescription();
        if (this.children.size() < this.scopes.getOptions().getMaxSpans()) {
            Objects.requireNonNull(parentSpanId, "parentSpanId is required");
            Objects.requireNonNull(operation, "operation is required");
            cancelIdleTimer();
            Span span = new Span(this, this.scopes, spanContext, spanOptions, new v(this, 1));
            setDefaultSpanData(span);
            this.children.add(span);
            CompositePerformanceCollector compositePerformanceCollector = this.compositePerformanceCollector;
            if (compositePerformanceCollector != null) {
                compositePerformanceCollector.onSpanStarted(span);
            }
            return span;
        }
        this.scopes.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", operation, description);
        return NoOpSpan.getInstance();
    }

    @NotNull
    public ISpan startChild(@NotNull SpanId spanId, @NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions) {
        SpanContext spanContextCopyForChild = getSpanContext().copyForChild(str, spanId, null);
        spanContextCopyForChild.setDescription(str2);
        spanContextCopyForChild.setInstrumenter(instrumenter);
        spanOptions.setStartTimestamp(sentryDate);
        return createChild(spanContextCopyForChild, spanOptions);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str) {
        return startChild(str, (String) null);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter) {
        return startChild(str, str2, sentryDate, instrumenter, new SpanOptions());
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions) {
        return createChild(str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate) {
        return createChild(str, str2, sentryDate, Instrumenter.SENTRY, new SpanOptions());
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2) {
        return startChild(str, str2, (SentryDate) null, Instrumenter.SENTRY, new SpanOptions());
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions) {
        return createChild(str, str2, null, Instrumenter.SENTRY, spanOptions);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions) {
        return createChild(spanContext, spanOptions);
    }

    @NotNull
    private ISpan createChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions) {
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        if (!this.instrumenter.equals(instrumenter)) {
            return NoOpSpan.getInstance();
        }
        if (this.children.size() < this.scopes.getOptions().getMaxSpans()) {
            return this.root.startChild(str, str2, sentryDate, instrumenter, spanOptions);
        }
        this.scopes.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(getStatus());
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus) {
        finish(spanStatus, null);
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate) {
        finish(spanStatus, sentryDate, true, null);
    }
}
