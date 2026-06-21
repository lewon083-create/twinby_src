package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mechanism implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, Object> data;

    @Nullable
    private String description;

    @Nullable
    private Boolean exceptionGroup;

    @Nullable
    private Integer exceptionId;

    @Nullable
    private Boolean handled;

    @Nullable
    private String helpLink;

    @Nullable
    private Map<String, Object> meta;

    @Nullable
    private Integer parentId;

    @Nullable
    private Boolean synthetic;

    @Nullable
    private final transient Thread thread;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Mechanism> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Mechanism deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            Mechanism mechanism = new Mechanism();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        mechanism.description = objectReader.nextStringOrNull();
                        break;
                    case "exception_id":
                        mechanism.exceptionId = objectReader.nextIntegerOrNull();
                        break;
                    case "data":
                        mechanism.data = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "meta":
                        mechanism.meta = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "type":
                        mechanism.type = objectReader.nextStringOrNull();
                        break;
                    case "handled":
                        mechanism.handled = objectReader.nextBooleanOrNull();
                        break;
                    case "synthetic":
                        mechanism.synthetic = objectReader.nextBooleanOrNull();
                        break;
                    case "is_exception_group":
                        mechanism.exceptionGroup = objectReader.nextBooleanOrNull();
                        break;
                    case "help_link":
                        mechanism.helpLink = objectReader.nextStringOrNull();
                        break;
                    case "parent_id":
                        mechanism.parentId = objectReader.nextIntegerOrNull();
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
            mechanism.setUnknown(map);
            return mechanism;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String EXCEPTION_ID = "exception_id";
        public static final String HANDLED = "handled";
        public static final String HELP_LINK = "help_link";
        public static final String IS_EXCEPTION_GROUP = "is_exception_group";
        public static final String META = "meta";
        public static final String PARENT_ID = "parent_id";
        public static final String SYNTHETIC = "synthetic";
        public static final String TYPE = "type";
    }

    public Mechanism() {
        this(null);
    }

    @Nullable
    public Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public Integer getExceptionId() {
        return this.exceptionId;
    }

    @Nullable
    public String getHelpLink() {
        return this.helpLink;
    }

    @Nullable
    public Map<String, Object> getMeta() {
        return this.meta;
    }

    @Nullable
    public Integer getParentId() {
        return this.parentId;
    }

    @Nullable
    public Boolean getSynthetic() {
        return this.synthetic;
    }

    @Nullable
    public Thread getThread() {
        return this.thread;
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
    public Boolean isExceptionGroup() {
        return this.exceptionGroup;
    }

    @Nullable
    public Boolean isHandled() {
        return this.handled;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.helpLink != null) {
            objectWriter.name(JsonKeys.HELP_LINK).value(this.helpLink);
        }
        if (this.handled != null) {
            objectWriter.name(JsonKeys.HANDLED).value(this.handled);
        }
        if (this.meta != null) {
            objectWriter.name(JsonKeys.META).value(iLogger, this.meta);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (this.synthetic != null) {
            objectWriter.name(JsonKeys.SYNTHETIC).value(this.synthetic);
        }
        if (this.exceptionId != null) {
            objectWriter.name(JsonKeys.EXCEPTION_ID).value(iLogger, this.exceptionId);
        }
        if (this.parentId != null) {
            objectWriter.name(JsonKeys.PARENT_ID).value(iLogger, this.parentId);
        }
        if (this.exceptionGroup != null) {
            objectWriter.name(JsonKeys.IS_EXCEPTION_GROUP).value(this.exceptionGroup);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setData(@Nullable Map<String, Object> map) {
        this.data = CollectionUtils.newHashMap(map);
    }

    public void setDescription(@Nullable String str) {
        this.description = str;
    }

    public void setExceptionGroup(@Nullable Boolean bool) {
        this.exceptionGroup = bool;
    }

    public void setExceptionId(@Nullable Integer num) {
        this.exceptionId = num;
    }

    public void setHandled(@Nullable Boolean bool) {
        this.handled = bool;
    }

    public void setHelpLink(@Nullable String str) {
        this.helpLink = str;
    }

    public void setMeta(@Nullable Map<String, Object> map) {
        this.meta = CollectionUtils.newHashMap(map);
    }

    public void setParentId(@Nullable Integer num) {
        this.parentId = num;
    }

    public void setSynthetic(@Nullable Boolean bool) {
        this.synthetic = bool;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public Mechanism(@Nullable Thread thread) {
        this.thread = thread;
    }
}
