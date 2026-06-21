package io.sentry;

import io.sentry.protocol.Contexts;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ISpan {
    void addFeatureFlag(@Nullable String str, @Nullable Boolean bool);

    void finish();

    void finish(@Nullable SpanStatus spanStatus);

    void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate);

    @NotNull
    Contexts getContexts();

    @Nullable
    Object getData(@Nullable String str);

    @Nullable
    String getDescription();

    @Nullable
    SentryDate getFinishDate();

    @NotNull
    String getOperation();

    @Nullable
    TracesSamplingDecision getSamplingDecision();

    @NotNull
    SpanContext getSpanContext();

    @NotNull
    SentryDate getStartDate();

    @Nullable
    SpanStatus getStatus();

    @Nullable
    String getTag(@Nullable String str);

    @Nullable
    Throwable getThrowable();

    boolean isFinished();

    boolean isNoOp();

    @Nullable
    Boolean isSampled();

    @NotNull
    ISentryLifecycleToken makeCurrent();

    void setContext(@Nullable String str, @Nullable Object obj);

    void setData(@Nullable String str, @Nullable Object obj);

    void setDescription(@Nullable String str);

    void setMeasurement(@NotNull String str, @NotNull Number number);

    void setMeasurement(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit);

    void setOperation(@NotNull String str);

    void setStatus(@Nullable SpanStatus spanStatus);

    void setTag(@Nullable String str, @Nullable String str2);

    void setThrowable(@Nullable Throwable th2);

    @NotNull
    ISpan startChild(@NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions);

    @NotNull
    ISpan startChild(@NotNull String str);

    @NotNull
    ISpan startChild(@NotNull String str, @Nullable String str2);

    @NotNull
    ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter);

    @NotNull
    ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions);

    @NotNull
    ISpan startChild(@NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions);

    @Nullable
    BaggageHeader toBaggageHeader(@Nullable List<String> list);

    @NotNull
    SentryTraceHeader toSentryTrace();

    @Nullable
    TraceContext traceContext();

    boolean updateEndDate(@NotNull SentryDate sentryDate);
}
