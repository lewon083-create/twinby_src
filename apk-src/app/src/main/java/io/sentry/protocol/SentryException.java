package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryException implements JsonUnknown, JsonSerializable {

    @Nullable
    private Mechanism mechanism;

    @Nullable
    private String module;

    @Nullable
    private SentryStackTrace stacktrace;

    @Nullable
    private Long threadId;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String value;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryException> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryException deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SentryException sentryException = new SentryException();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        sentryException.threadId = objectReader.nextLongOrNull();
                        break;
                    case "module":
                        sentryException.module = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryException.type = objectReader.nextStringOrNull();
                        break;
                    case "value":
                        sentryException.value = objectReader.nextStringOrNull();
                        break;
                    case "mechanism":
                        sentryException.mechanism = (Mechanism) objectReader.nextOrNull(iLogger, new Mechanism.Deserializer());
                        break;
                    case "stacktrace":
                        sentryException.stacktrace = (SentryStackTrace) objectReader.nextOrNull(iLogger, new SentryStackTrace.Deserializer());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            sentryException.setUnknown(map);
            return sentryException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String MECHANISM = "mechanism";
        public static final String MODULE = "module";
        public static final String STACKTRACE = "stacktrace";
        public static final String THREAD_ID = "thread_id";
        public static final String TYPE = "type";
        public static final String VALUE = "value";
    }

    @Nullable
    public Mechanism getMechanism() {
        return this.mechanism;
    }

    @Nullable
    public String getModule() {
        return this.module;
    }

    @Nullable
    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    @Nullable
    public Long getThreadId() {
        return this.threadId;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.value != null) {
            objectWriter.name("value").value(this.value);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.threadId != null) {
            objectWriter.name("thread_id").value(this.threadId);
        }
        if (this.stacktrace != null) {
            objectWriter.name("stacktrace").value(iLogger, this.stacktrace);
        }
        if (this.mechanism != null) {
            objectWriter.name(JsonKeys.MECHANISM).value(iLogger, this.mechanism);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setMechanism(@Nullable Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public void setModule(@Nullable String str) {
        this.module = str;
    }

    public void setStacktrace(@Nullable SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setThreadId(@Nullable Long l10) {
        this.threadId = l10;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValue(@Nullable String str) {
        this.value = str;
    }
}
