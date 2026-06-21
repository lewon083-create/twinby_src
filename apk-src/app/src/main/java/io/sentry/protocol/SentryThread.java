package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryThread implements JsonUnknown, JsonSerializable {

    @Nullable
    private Boolean crashed;

    @Nullable
    private Boolean current;

    @Nullable
    private Boolean daemon;

    @Nullable
    private Map<String, SentryLockReason> heldLocks;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private Long f26066id;

    @Nullable
    private Boolean main;

    @Nullable
    private String name;

    @Nullable
    private Integer priority;

    @Nullable
    private SentryStackTrace stacktrace;

    @Nullable
    private String state;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryThread> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryThread deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SentryThread sentryThread = new SentryThread();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "daemon":
                        sentryThread.daemon = objectReader.nextBooleanOrNull();
                        break;
                    case "priority":
                        sentryThread.priority = objectReader.nextIntegerOrNull();
                        break;
                    case "held_locks":
                        Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new SentryLockReason.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            sentryThread.heldLocks = new HashMap(mapNextMapOrNull);
                            break;
                        }
                        break;
                    case "id":
                        sentryThread.f26066id = objectReader.nextLongOrNull();
                        break;
                    case "main":
                        sentryThread.main = objectReader.nextBooleanOrNull();
                        break;
                    case "name":
                        sentryThread.name = objectReader.nextStringOrNull();
                        break;
                    case "state":
                        sentryThread.state = objectReader.nextStringOrNull();
                        break;
                    case "crashed":
                        sentryThread.crashed = objectReader.nextBooleanOrNull();
                        break;
                    case "current":
                        sentryThread.current = objectReader.nextBooleanOrNull();
                        break;
                    case "stacktrace":
                        sentryThread.stacktrace = (SentryStackTrace) objectReader.nextOrNull(iLogger, new SentryStackTrace.Deserializer());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryThread.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CRASHED = "crashed";
        public static final String CURRENT = "current";
        public static final String DAEMON = "daemon";
        public static final String HELD_LOCKS = "held_locks";
        public static final String ID = "id";
        public static final String MAIN = "main";
        public static final String NAME = "name";
        public static final String PRIORITY = "priority";
        public static final String STACKTRACE = "stacktrace";
        public static final String STATE = "state";
    }

    @Nullable
    public Map<String, SentryLockReason> getHeldLocks() {
        return this.heldLocks;
    }

    @Nullable
    public Long getId() {
        return this.f26066id;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public Boolean isCrashed() {
        return this.crashed;
    }

    @Nullable
    public Boolean isCurrent() {
        return this.current;
    }

    @Nullable
    public Boolean isDaemon() {
        return this.daemon;
    }

    @Nullable
    public Boolean isMain() {
        return this.main;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.f26066id != null) {
            objectWriter.name("id").value(this.f26066id);
        }
        if (this.priority != null) {
            objectWriter.name("priority").value(this.priority);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.state != null) {
            objectWriter.name(JsonKeys.STATE).value(this.state);
        }
        if (this.crashed != null) {
            objectWriter.name(JsonKeys.CRASHED).value(this.crashed);
        }
        if (this.current != null) {
            objectWriter.name(JsonKeys.CURRENT).value(this.current);
        }
        if (this.daemon != null) {
            objectWriter.name(JsonKeys.DAEMON).value(this.daemon);
        }
        if (this.main != null) {
            objectWriter.name(JsonKeys.MAIN).value(this.main);
        }
        if (this.stacktrace != null) {
            objectWriter.name("stacktrace").value(iLogger, this.stacktrace);
        }
        if (this.heldLocks != null) {
            objectWriter.name(JsonKeys.HELD_LOCKS).value(iLogger, this.heldLocks);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCrashed(@Nullable Boolean bool) {
        this.crashed = bool;
    }

    public void setCurrent(@Nullable Boolean bool) {
        this.current = bool;
    }

    public void setDaemon(@Nullable Boolean bool) {
        this.daemon = bool;
    }

    public void setHeldLocks(@Nullable Map<String, SentryLockReason> map) {
        this.heldLocks = map;
    }

    public void setId(@Nullable Long l10) {
        this.f26066id = l10;
    }

    public void setMain(@Nullable Boolean bool) {
        this.main = bool;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setPriority(@Nullable Integer num) {
        this.priority = num;
    }

    public void setStacktrace(@Nullable SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setState(@Nullable String str) {
        this.state = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
