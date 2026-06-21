package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewHierarchyNode implements JsonUnknown, JsonSerializable {

    @Nullable
    private Double alpha;

    @Nullable
    private List<ViewHierarchyNode> children;

    @Nullable
    private Double height;

    @Nullable
    private String identifier;

    @Nullable
    private String renderingSystem;

    @Nullable
    private String tag;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String visibility;

    @Nullable
    private Double width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    private Double f26068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private Double f26069y;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<ViewHierarchyNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public ViewHierarchyNode deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            ViewHierarchyNode viewHierarchyNode = new ViewHierarchyNode();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rendering_system":
                        viewHierarchyNode.renderingSystem = objectReader.nextStringOrNull();
                        break;
                    case "identifier":
                        viewHierarchyNode.identifier = objectReader.nextStringOrNull();
                        break;
                    case "height":
                        viewHierarchyNode.height = objectReader.nextDoubleOrNull();
                        break;
                    case "x":
                        viewHierarchyNode.f26068x = objectReader.nextDoubleOrNull();
                        break;
                    case "y":
                        viewHierarchyNode.f26069y = objectReader.nextDoubleOrNull();
                        break;
                    case "tag":
                        viewHierarchyNode.tag = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        viewHierarchyNode.type = objectReader.nextStringOrNull();
                        break;
                    case "alpha":
                        viewHierarchyNode.alpha = objectReader.nextDoubleOrNull();
                        break;
                    case "width":
                        viewHierarchyNode.width = objectReader.nextDoubleOrNull();
                        break;
                    case "children":
                        viewHierarchyNode.children = objectReader.nextListOrNull(iLogger, this);
                        break;
                    case "visibility":
                        viewHierarchyNode.visibility = objectReader.nextStringOrNull();
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
            viewHierarchyNode.setUnknown(map);
            return viewHierarchyNode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ALPHA = "alpha";
        public static final String CHILDREN = "children";
        public static final String HEIGHT = "height";
        public static final String IDENTIFIER = "identifier";
        public static final String RENDERING_SYSTEM = "rendering_system";
        public static final String TAG = "tag";
        public static final String TYPE = "type";
        public static final String VISIBILITY = "visibility";
        public static final String WIDTH = "width";
        public static final String X = "x";
        public static final String Y = "y";
    }

    @Nullable
    public Double getAlpha() {
        return this.alpha;
    }

    @Nullable
    public List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    @Nullable
    public Double getHeight() {
        return this.height;
    }

    @Nullable
    public String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public String getRenderingSystem() {
        return this.renderingSystem;
    }

    @Nullable
    public String getTag() {
        return this.tag;
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
    public String getVisibility() {
        return this.visibility;
    }

    @Nullable
    public Double getWidth() {
        return this.width;
    }

    @Nullable
    public Double getX() {
        return this.f26068x;
    }

    @Nullable
    public Double getY() {
        return this.f26069y;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.renderingSystem != null) {
            objectWriter.name("rendering_system").value(this.renderingSystem);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.identifier != null) {
            objectWriter.name(JsonKeys.IDENTIFIER).value(this.identifier);
        }
        if (this.tag != null) {
            objectWriter.name("tag").value(this.tag);
        }
        if (this.width != null) {
            objectWriter.name("width").value(this.width);
        }
        if (this.height != null) {
            objectWriter.name("height").value(this.height);
        }
        if (this.f26068x != null) {
            objectWriter.name("x").value(this.f26068x);
        }
        if (this.f26069y != null) {
            objectWriter.name("y").value(this.f26069y);
        }
        if (this.visibility != null) {
            objectWriter.name(JsonKeys.VISIBILITY).value(this.visibility);
        }
        if (this.alpha != null) {
            objectWriter.name(JsonKeys.ALPHA).value(this.alpha);
        }
        List<ViewHierarchyNode> list = this.children;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.CHILDREN).value(iLogger, this.children);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAlpha(@Nullable Double d10) {
        this.alpha = d10;
    }

    public void setChildren(@Nullable List<ViewHierarchyNode> list) {
        this.children = list;
    }

    public void setHeight(@Nullable Double d10) {
        this.height = d10;
    }

    public void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

    public void setRenderingSystem(String str) {
        this.renderingSystem = str;
    }

    public void setTag(@Nullable String str) {
        this.tag = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVisibility(@Nullable String str) {
        this.visibility = str;
    }

    public void setWidth(@Nullable Double d10) {
        this.width = d10;
    }

    public void setX(@Nullable Double d10) {
        this.f26068x = d10;
    }

    public void setY(@Nullable Double d10) {
        this.f26069y = d10;
    }
}
