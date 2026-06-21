package io.sentry;

import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryReplayEvent extends SentryBaseEvent implements JsonUnknown, JsonSerializable {
    public static final String REPLAY_EVENT_TYPE = "replay_event";
    public static final long REPLAY_VIDEO_MAX_SIZE = 10485760;

    @Nullable
    private Date replayStartTimestamp;
    private int segmentId;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private File videoFile;

    @Nullable
    private SentryId replayId = new SentryId();

    @NotNull
    private String type = REPLAY_EVENT_TYPE;

    @NotNull
    private ReplayType replayType = ReplayType.SESSION;

    @Nullable
    private List<String> errorIds = new ArrayList();

    @Nullable
    private List<String> traceIds = new ArrayList();

    @Nullable
    private List<String> urls = new ArrayList();

    @NotNull
    private Date timestamp = DateUtils.getCurrentDateTime();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryReplayEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryReplayEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SentryBaseEvent.Deserializer deserializer = new SentryBaseEvent.Deserializer();
            SentryReplayEvent sentryReplayEvent = new SentryReplayEvent();
            objectReader.beginObject();
            String strNextStringOrNull = null;
            ReplayType replayType = null;
            Integer numNextIntegerOrNull = null;
            Date dateNextDateOrNull = null;
            HashMap map = null;
            SentryId sentryId = null;
            Date dateNextDateOrNull2 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "replay_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    case "replay_start_timestamp":
                        dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "urls":
                        list = (List) objectReader.nextObjectOrNull();
                        break;
                    case "timestamp":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) objectReader.nextObjectOrNull();
                        break;
                    case "trace_ids":
                        list3 = (List) objectReader.nextObjectOrNull();
                        break;
                    case "replay_type":
                        replayType = (ReplayType) objectReader.nextOrNull(iLogger, new ReplayType.Deserializer());
                        break;
                    case "segment_id":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (!deserializer.deserializeValue(sentryReplayEvent, strNextName, objectReader, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            objectReader.endObject();
            if (strNextStringOrNull != null) {
                sentryReplayEvent.setType(strNextStringOrNull);
            }
            if (replayType != null) {
                sentryReplayEvent.setReplayType(replayType);
            }
            if (numNextIntegerOrNull != null) {
                sentryReplayEvent.setSegmentId(numNextIntegerOrNull.intValue());
            }
            if (dateNextDateOrNull != null) {
                sentryReplayEvent.setTimestamp(dateNextDateOrNull);
            }
            sentryReplayEvent.setReplayId(sentryId);
            sentryReplayEvent.setReplayStartTimestamp(dateNextDateOrNull2);
            sentryReplayEvent.setUrls(list);
            sentryReplayEvent.setErrorIds(list2);
            sentryReplayEvent.setTraceIds(list3);
            sentryReplayEvent.setUnknown(map);
            return sentryReplayEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ERROR_IDS = "error_ids";
        public static final String REPLAY_ID = "replay_id";
        public static final String REPLAY_START_TIMESTAMP = "replay_start_timestamp";
        public static final String REPLAY_TYPE = "replay_type";
        public static final String SEGMENT_ID = "segment_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_IDS = "trace_ids";
        public static final String TYPE = "type";
        public static final String URLS = "urls";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum ReplayType implements JsonSerializable {
        SESSION,
        BUFFER;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Deserializer implements JsonDeserializer<ReplayType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            @NotNull
            public ReplayType deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
                return ReplayType.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.value(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SentryReplayEvent.class == obj.getClass()) {
            SentryReplayEvent sentryReplayEvent = (SentryReplayEvent) obj;
            if (this.segmentId == sentryReplayEvent.segmentId && Objects.equals(this.type, sentryReplayEvent.type) && this.replayType == sentryReplayEvent.replayType && Objects.equals(this.replayId, sentryReplayEvent.replayId) && Objects.equals(this.urls, sentryReplayEvent.urls) && Objects.equals(this.errorIds, sentryReplayEvent.errorIds) && Objects.equals(this.traceIds, sentryReplayEvent.traceIds)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public List<String> getErrorIds() {
        return this.errorIds;
    }

    @Nullable
    public SentryId getReplayId() {
        return this.replayId;
    }

    @Nullable
    public Date getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @NotNull
    public ReplayType getReplayType() {
        return this.replayType;
    }

    public int getSegmentId() {
        return this.segmentId;
    }

    @NotNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public List<String> getTraceIds() {
        return this.traceIds;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public List<String> getUrls() {
        return this.urls;
    }

    @Nullable
    public File getVideoFile() {
        return this.videoFile;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.replayType, this.replayId, Integer.valueOf(this.segmentId), this.urls, this.errorIds, this.traceIds);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(this.type);
        objectWriter.name(JsonKeys.REPLAY_TYPE).value(iLogger, this.replayType);
        objectWriter.name("segment_id").value(this.segmentId);
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
        if (this.replayStartTimestamp != null) {
            objectWriter.name(JsonKeys.REPLAY_START_TIMESTAMP).value(iLogger, this.replayStartTimestamp);
        }
        if (this.urls != null) {
            objectWriter.name(JsonKeys.URLS).value(iLogger, this.urls);
        }
        if (this.errorIds != null) {
            objectWriter.name(JsonKeys.ERROR_IDS).value(iLogger, this.errorIds);
        }
        if (this.traceIds != null) {
            objectWriter.name(JsonKeys.TRACE_IDS).value(iLogger, this.traceIds);
        }
        new SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setErrorIds(@Nullable List<String> list) {
        this.errorIds = list;
    }

    public void setReplayId(@Nullable SentryId sentryId) {
        this.replayId = sentryId;
    }

    public void setReplayStartTimestamp(@Nullable Date date) {
        this.replayStartTimestamp = date;
    }

    public void setReplayType(@NotNull ReplayType replayType) {
        this.replayType = replayType;
    }

    public void setSegmentId(int i) {
        this.segmentId = i;
    }

    public void setTimestamp(@NotNull Date date) {
        this.timestamp = date;
    }

    public void setTraceIds(@Nullable List<String> list) {
        this.traceIds = list;
    }

    public void setType(@NotNull String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUrls(@Nullable List<String> list) {
        this.urls = list;
    }

    public void setVideoFile(@Nullable File file) {
        this.videoFile = file;
    }
}
