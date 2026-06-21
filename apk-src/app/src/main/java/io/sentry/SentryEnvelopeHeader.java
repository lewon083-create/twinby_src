package io.sentry;

import io.sentry.TraceContext;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelopeHeader implements JsonSerializable, JsonUnknown {

    @Nullable
    private final SentryId eventId;

    @Nullable
    private final SdkVersion sdkVersion;

    @Nullable
    private Date sentAt;

    @Nullable
    private final TraceContext traceContext;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryEnvelopeHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryEnvelopeHeader deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryId = null;
            SdkVersion sdkVersion = null;
            TraceContext traceContext = null;
            Date dateNextDateOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk":
                        sdkVersion = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                        break;
                    case "trace":
                        traceContext = (TraceContext) objectReader.nextOrNull(iLogger, new TraceContext.Deserializer());
                        break;
                    case "event_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    case "sent_at":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            SentryEnvelopeHeader sentryEnvelopeHeader = new SentryEnvelopeHeader(sentryId, sdkVersion, traceContext);
            sentryEnvelopeHeader.setSentAt(dateNextDateOrNull);
            sentryEnvelopeHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeHeader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String EVENT_ID = "event_id";
        public static final String SDK = "sdk";
        public static final String SENT_AT = "sent_at";
        public static final String TRACE = "trace";
    }

    public SentryEnvelopeHeader(@Nullable SentryId sentryId, @Nullable SdkVersion sdkVersion) {
        this(sentryId, sdkVersion, null);
    }

    @Nullable
    public SentryId getEventId() {
        return this.eventId;
    }

    @Nullable
    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public Date getSentAt() {
        return this.sentAt;
    }

    @Nullable
    public TraceContext getTraceContext() {
        return this.traceContext;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.eventId != null) {
            objectWriter.name("event_id").value(iLogger, this.eventId);
        }
        if (this.sdkVersion != null) {
            objectWriter.name("sdk").value(iLogger, this.sdkVersion);
        }
        if (this.traceContext != null) {
            objectWriter.name("trace").value(iLogger, this.traceContext);
        }
        if (this.sentAt != null) {
            objectWriter.name(JsonKeys.SENT_AT).value(iLogger, DateUtils.getTimestamp(this.sentAt));
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setSentAt(@Nullable Date date) {
        this.sentAt = date;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeHeader(@Nullable SentryId sentryId, @Nullable SdkVersion sdkVersion, @Nullable TraceContext traceContext) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion;
        this.traceContext = traceContext;
    }

    public SentryEnvelopeHeader(@Nullable SentryId sentryId) {
        this(sentryId, null);
    }

    public SentryEnvelopeHeader() {
        this(new SentryId());
    }
}
