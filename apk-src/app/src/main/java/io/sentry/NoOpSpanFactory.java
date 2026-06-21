package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpSpanFactory implements ISpanFactory {
    private static final NoOpSpanFactory instance = new NoOpSpanFactory();

    private NoOpSpanFactory() {
    }

    public static NoOpSpanFactory getInstance() {
        return instance;
    }

    @Override // io.sentry.ISpanFactory
    @NotNull
    public ISpan createSpan(@NotNull IScopes iScopes, @NotNull SpanOptions spanOptions, @NotNull SpanContext spanContext, @Nullable ISpan iSpan) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpanFactory
    @NotNull
    public ITransaction createTransaction(@NotNull TransactionContext transactionContext, @NotNull IScopes iScopes, @NotNull TransactionOptions transactionOptions, @Nullable CompositePerformanceCollector compositePerformanceCollector) {
        return NoOpTransaction.getInstance();
    }
}
