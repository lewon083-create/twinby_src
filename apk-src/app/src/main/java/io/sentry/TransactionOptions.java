package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TransactionOptions extends SpanOptions {
    public static final long DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION = 30000;

    @Nullable
    private CustomSamplingContext customSamplingContext = null;
    private boolean isAppStartTransaction = false;
    private boolean waitForChildren = false;

    @Nullable
    private Long idleTimeout = null;

    @Nullable
    private Long deadlineTimeout = null;

    @Nullable
    private TransactionFinishedCallback transactionFinishedCallback = null;

    @Nullable
    private ISpanFactory spanFactory = null;

    @Nullable
    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    @Nullable
    public Long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Nullable
    public ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    @Nullable
    public TransactionFinishedCallback getTransactionFinishedCallback() {
        return this.transactionFinishedCallback;
    }

    public boolean isAppStartTransaction() {
        return this.isAppStartTransaction;
    }

    public boolean isBindToScope() {
        return ScopeBindingMode.ON == getScopeBindingMode();
    }

    public boolean isWaitForChildren() {
        return this.waitForChildren;
    }

    public void setAppStartTransaction(boolean z5) {
        this.isAppStartTransaction = z5;
    }

    public void setBindToScope(boolean z5) {
        setScopeBindingMode(z5 ? ScopeBindingMode.ON : ScopeBindingMode.OFF);
    }

    public void setCustomSamplingContext(@Nullable CustomSamplingContext customSamplingContext) {
        this.customSamplingContext = customSamplingContext;
    }

    public void setDeadlineTimeout(@Nullable Long l10) {
        this.deadlineTimeout = l10;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    public void setSpanFactory(@NotNull ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setTransactionFinishedCallback(@Nullable TransactionFinishedCallback transactionFinishedCallback) {
        this.transactionFinishedCallback = transactionFinishedCallback;
    }

    public void setWaitForChildren(boolean z5) {
        this.waitForChildren = z5;
    }
}
