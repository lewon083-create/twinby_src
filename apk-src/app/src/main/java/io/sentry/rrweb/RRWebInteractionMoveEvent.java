package io.sentry.rrweb;

import gf.a;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RRWebInteractionMoveEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {

    @Nullable
    private Map<String, Object> dataUnknown;
    private int pointerId;

    @Nullable
    private List<Position> positions;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<RRWebInteractionMoveEvent> {
        private void deserializeData(@NotNull RRWebInteractionMoveEvent rRWebInteractionMoveEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    rRWebInteractionMoveEvent.pointerId = objectReader.nextInt();
                } else if (strNextName.equals(JsonKeys.POSITIONS)) {
                    rRWebInteractionMoveEvent.positions = objectReader.nextListOrNull(iLogger, new Position.Deserializer());
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public RRWebInteractionMoveEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionMoveEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionMoveEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String POINTER_ID = "pointerId";
        public static final String POSITIONS = "positions";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Position implements JsonSerializable, JsonUnknown {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f26085id;
        private long timeOffset;

        @Nullable
        private Map<String, Object> unknown;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f26086x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f26087y;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Deserializer implements JsonDeserializer<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            @NotNull
            public Position deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
                String strNextName;
                objectReader.beginObject();
                Position position = new Position();
                HashMap map = null;
                while (objectReader.peek() == JsonToken.NAME) {
                    strNextName = objectReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            position.f26086x = objectReader.nextFloat();
                            break;
                        case "y":
                            position.f26087y = objectReader.nextFloat();
                            break;
                        case "id":
                            position.f26085id = objectReader.nextInt();
                            break;
                        case "timeOffset":
                            position.timeOffset = objectReader.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                    }
                }
                position.setUnknown(map);
                objectReader.endObject();
                return position;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class JsonKeys {
            public static final String ID = "id";
            public static final String TIME_OFFSET = "timeOffset";
            public static final String X = "x";
            public static final String Y = "y";
        }

        public int getId() {
            return this.f26085id;
        }

        public long getTimeOffset() {
            return this.timeOffset;
        }

        @Override // io.sentry.JsonUnknown
        @Nullable
        public Map<String, Object> getUnknown() {
            return this.unknown;
        }

        public float getX() {
            return this.f26086x;
        }

        public float getY() {
            return this.f26087y;
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.beginObject();
            objectWriter.name("id").value(this.f26085id);
            objectWriter.name("x").value(this.f26086x);
            objectWriter.name("y").value(this.f26087y);
            objectWriter.name(JsonKeys.TIME_OFFSET).value(this.timeOffset);
            Map<String, Object> map = this.unknown;
            if (map != null) {
                for (String str : map.keySet()) {
                    a.v(this.unknown, str, objectWriter, str, iLogger);
                }
            }
            objectWriter.endObject();
        }

        public void setId(int i) {
            this.f26085id = i;
        }

        public void setTimeOffset(long j10) {
            this.timeOffset = j10;
        }

        @Override // io.sentry.JsonUnknown
        public void setUnknown(@Nullable Map<String, Object> map) {
            this.unknown = map;
        }

        public void setX(float f10) {
            this.f26086x = f10;
        }

        public void setY(float f10) {
            this.f26087y = f10;
        }
    }

    public RRWebInteractionMoveEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    private void serializeData(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        List<Position> list = this.positions;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.POSITIONS).value(iLogger, this.positions);
        }
        objectWriter.name("pointerId").value(this.pointerId);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Nullable
    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    @Nullable
    public List<Position> getPositions() {
        return this.positions;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setDataUnknown(@Nullable Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setPointerId(int i) {
        this.pointerId = i;
    }

    public void setPositions(@Nullable List<Position> list) {
        this.positions = list;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
