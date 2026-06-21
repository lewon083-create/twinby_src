package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TraceContext implements JsonUnknown, JsonSerializable {

    @Nullable
    private final String environment;

    @NotNull
    private final String publicKey;

    @Nullable
    private final String release;

    @Nullable
    private final SentryId replayId;

    @Nullable
    private final String sampleRand;

    @Nullable
    private final String sampleRate;

    @Nullable
    private final String sampled;

    @NotNull
    private final SentryId traceId;

    @Nullable
    private final String transaction;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private final String userId;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<TraceContext> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public TraceContext deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            SentryId sentryIdDeserialize = null;
            String strNextString = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            String strNextStringOrNull5 = null;
            String strNextStringOrNull6 = null;
            SentryId sentryIdDeserialize2 = null;
            String strNextStringOrNull7 = null;
            while (true) {
                SentryId sentryId = sentryIdDeserialize;
                String str = strNextString;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw missingRequiredFieldException(JsonKeys.PUBLIC_KEY, iLogger);
                    }
                    TraceContext traceContext = new TraceContext(sentryId, str, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6, sentryIdDeserialize2, strNextStringOrNull7);
                    traceContext.setUnknown(concurrentHashMap);
                    objectReader.endObject();
                    return traceContext;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "replay_id":
                        sentryIdDeserialize2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "user_id":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "environment":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "sample_rand":
                        strNextStringOrNull7 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "sample_rate":
                        strNextStringOrNull5 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "release":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        strNextString = str;
                        break;
                    case "sampled":
                        strNextStringOrNull6 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    case "public_key":
                        strNextString = objectReader.nextString();
                        sentryIdDeserialize = sentryId;
                        break;
                    case "transaction":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        sentryIdDeserialize = sentryId;
                        strNextString = str;
                        break;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ENVIRONMENT = "environment";
        public static final String PUBLIC_KEY = "public_key";
        public static final String RELEASE = "release";
        public static final String REPLAY_ID = "replay_id";
        public static final String SAMPLED = "sampled";
        public static final String SAMPLE_RAND = "sample_rand";
        public static final String SAMPLE_RATE = "sample_rate";
        public static final String TRACE_ID = "trace_id";
        public static final String TRANSACTION = "transaction";
        public static final String USER_ID = "user_id";
    }

    public TraceContext(@NotNull SentryId sentryId, @NotNull String str) {
        this(sentryId, str, null, null, null, null, null, null, null);
    }

    @Nullable
    private static String getUserId(@NotNull SentryOptions sentryOptions, @Nullable User user) {
        if (!sentryOptions.isSendDefaultPii() || user == null) {
            return null;
        }
        return user.getId();
    }

    @Nullable
    public String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public String getPublicKey() {
        return this.publicKey;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @Nullable
    public SentryId getReplayId() {
        return this.replayId;
    }

    @Nullable
    public String getSampleRand() {
        return this.sampleRand;
    }

    @Nullable
    public String getSampleRate() {
        return this.sampleRate;
    }

    @Nullable
    public String getSampled() {
        return this.sampled;
    }

    @NotNull
    public SentryId getTraceId() {
        return this.traceId;
    }

    @Nullable
    public String getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name(JsonKeys.PUBLIC_KEY).value(this.publicKey);
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.userId != null) {
            objectWriter.name(JsonKeys.USER_ID).value(this.userId);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.sampleRate != null) {
            objectWriter.name(JsonKeys.SAMPLE_RATE).value(this.sampleRate);
        }
        if (this.sampleRand != null) {
            objectWriter.name(JsonKeys.SAMPLE_RAND).value(this.sampleRand);
        }
        if (this.sampled != null) {
            objectWriter.name(JsonKeys.SAMPLED).value(this.sampled);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    @Deprecated
    public TraceContext(@NotNull SentryId sentryId, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable SentryId sentryId2) {
        this(sentryId, str, str2, str3, str4, str5, str6, str7, sentryId2, null);
    }

    public TraceContext(@NotNull SentryId sentryId, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable SentryId sentryId2, @Nullable String str8) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.userId = str4;
        this.transaction = str5;
        this.sampleRate = str6;
        this.sampled = str7;
        this.replayId = sentryId2;
        this.sampleRand = str8;
    }

    @Nullable
    public String getUserId() {
        return this.userId;
    }
}
