package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SentryRandom;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SamplingContext {

    @NotNull
    private final Map<String, Object> attributes;

    @Nullable
    private final CustomSamplingContext customSamplingContext;

    @NotNull
    private final Double sampleRand;

    @NotNull
    private final TransactionContext transactionContext;

    @Deprecated
    public SamplingContext(@NotNull TransactionContext transactionContext, @Nullable CustomSamplingContext customSamplingContext) {
        this(transactionContext, customSamplingContext, Double.valueOf(SentryRandom.current().nextDouble()), null);
    }

    @Nullable
    public Object getAttribute(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.attributes.get(str);
    }

    @Nullable
    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    @NotNull
    public Double getSampleRand() {
        return this.sampleRand;
    }

    @NotNull
    public TransactionContext getTransactionContext() {
        return this.transactionContext;
    }

    public SamplingContext(@NotNull TransactionContext transactionContext, @Nullable CustomSamplingContext customSamplingContext, @NotNull Double d10, @Nullable Map<String, Object> map) {
        this.transactionContext = (TransactionContext) Objects.requireNonNull(transactionContext, "transactionContexts is required");
        this.customSamplingContext = customSamplingContext;
        this.sampleRand = d10;
        this.attributes = map == null ? Collections.EMPTY_MAP : map;
    }
}
