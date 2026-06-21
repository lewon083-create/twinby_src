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
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private static final int POINTER_TYPE_TOUCH = 2;

    @Nullable
    private Map<String, Object> dataUnknown;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f26082id;

    @Nullable
    private InteractionType interactionType;
    private int pointerId;
    private int pointerType;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f26083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f26084y;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent> {
        private void deserializeData(@NotNull RRWebInteractionEvent rRWebInteractionEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "x":
                        rRWebInteractionEvent.f26083x = objectReader.nextFloat();
                        break;
                    case "y":
                        rRWebInteractionEvent.f26084y = objectReader.nextFloat();
                        break;
                    case "id":
                        rRWebInteractionEvent.f26082id = objectReader.nextInt();
                        break;
                    case "type":
                        rRWebInteractionEvent.interactionType = (InteractionType) objectReader.nextOrNull(iLogger, new InteractionType.Deserializer());
                        break;
                    case "pointerType":
                        rRWebInteractionEvent.pointerType = objectReader.nextInt();
                        break;
                    case "pointerId":
                        rRWebInteractionEvent.pointerId = objectReader.nextInt();
                        break;
                    default:
                        if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
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
            rRWebInteractionEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public RRWebInteractionEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum InteractionType implements JsonSerializable {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Deserializer implements JsonDeserializer<InteractionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            @NotNull
            public InteractionType deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
                return InteractionType.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String ID = "id";
        public static final String POINTER_ID = "pointerId";
        public static final String POINTER_TYPE = "pointerType";
        public static final String TYPE = "type";
        public static final String X = "x";
        public static final String Y = "y";
    }

    public RRWebInteractionEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.pointerType = 2;
    }

    private void serializeData(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("type").value(iLogger, this.interactionType);
        objectWriter.name("id").value(this.f26082id);
        objectWriter.name("x").value(this.f26083x);
        objectWriter.name("y").value(this.f26084y);
        objectWriter.name(JsonKeys.POINTER_TYPE).value(this.pointerType);
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

    public int getId() {
        return this.f26082id;
    }

    @Nullable
    public InteractionType getInteractionType() {
        return this.interactionType;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public int getPointerType() {
        return this.pointerType;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public float getX() {
        return this.f26083x;
    }

    public float getY() {
        return this.f26084y;
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

    public void setId(int i) {
        this.f26082id = i;
    }

    public void setInteractionType(@Nullable InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public void setPointerId(int i) {
        this.pointerId = i;
    }

    public void setPointerType(int i) {
        this.pointerType = i;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setX(float f10) {
        this.f26083x = f10;
    }

    public void setY(float f10) {
        this.f26084y = f10;
    }
}
