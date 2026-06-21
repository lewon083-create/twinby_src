package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ITransaction extends ISpan {
    void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate, boolean z5, @Nullable Hint hint);

    void forceFinish(@NotNull SpanStatus spanStatus, boolean z5, @Nullable Hint hint);

    @NotNull
    SentryId getEventId();

    @Nullable
    ISpan getLatestActiveSpan();

    @NotNull
    String getName();

    @NotNull
    List<Span> getSpans();

    @NotNull
    TransactionNameSource getTransactionNameSource();

    @Nullable
    Boolean isProfileSampled();

    void scheduleFinish();

    void setName(@NotNull String str);

    void setName(@NotNull String str, @NotNull TransactionNameSource transactionNameSource);

    @NotNull
    ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate);
}
