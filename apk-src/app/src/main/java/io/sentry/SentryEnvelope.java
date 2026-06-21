package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelope {

    @NotNull
    private final SentryEnvelopeHeader header;

    @NotNull
    private final Iterable<SentryEnvelopeItem> items;

    public SentryEnvelope(@NotNull SentryEnvelopeHeader sentryEnvelopeHeader, @NotNull Iterable<SentryEnvelopeItem> iterable) {
        this.header = (SentryEnvelopeHeader) Objects.requireNonNull(sentryEnvelopeHeader, "SentryEnvelopeHeader is required.");
        this.items = (Iterable) Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    @NotNull
    public static SentryEnvelope from(@NotNull ISerializer iSerializer, @NotNull Session session, @Nullable SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(session, "session is required.");
        return new SentryEnvelope((SentryId) null, sdkVersion, SentryEnvelopeItem.fromSession(iSerializer, session));
    }

    @NotNull
    public SentryEnvelopeHeader getHeader() {
        return this.header;
    }

    @NotNull
    public Iterable<SentryEnvelopeItem> getItems() {
        return this.items;
    }

    public SentryEnvelope(@Nullable SentryId sentryId, @Nullable SdkVersion sdkVersion, @NotNull Iterable<SentryEnvelopeItem> iterable) {
        this.header = new SentryEnvelopeHeader(sentryId, sdkVersion);
        this.items = (Iterable) Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    @NotNull
    public static SentryEnvelope from(@NotNull ISerializer iSerializer, @NotNull SentryBaseEvent sentryBaseEvent, @Nullable SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "item is required.");
        return new SentryEnvelope(sentryBaseEvent.getEventId(), sdkVersion, SentryEnvelopeItem.fromEvent(iSerializer, sentryBaseEvent));
    }

    public SentryEnvelope(@Nullable SentryId sentryId, @Nullable SdkVersion sdkVersion, @NotNull SentryEnvelopeItem sentryEnvelopeItem) {
        Objects.requireNonNull(sentryEnvelopeItem, "SentryEnvelopeItem is required.");
        this.header = new SentryEnvelopeHeader(sentryId, sdkVersion);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryEnvelopeItem);
        this.items = arrayList;
    }

    @NotNull
    public static SentryEnvelope from(@NotNull ISerializer iSerializer, @NotNull ProfilingTraceData profilingTraceData, long j10, @Nullable SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(profilingTraceData, "Profiling trace data is required.");
        return new SentryEnvelope(new SentryId(profilingTraceData.getProfileId()), sdkVersion, SentryEnvelopeItem.fromProfilingTrace(profilingTraceData, j10, iSerializer));
    }
}
