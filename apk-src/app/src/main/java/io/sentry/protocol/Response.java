package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Response implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "response";

    @Nullable
    private Long bodySize;

    @Nullable
    private String cookies;

    @Nullable
    private Object data;

    @Nullable
    private Map<String, String> headers;

    @Nullable
    private Integer statusCode;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Response deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Response response = new Response();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "status_code":
                        response.statusCode = objectReader.nextIntegerOrNull();
                        break;
                    case "data":
                        response.data = objectReader.nextObjectOrNull();
                        break;
                    case "headers":
                        Map map = (Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            response.headers = CollectionUtils.newConcurrentHashMap(map);
                            break;
                        }
                        break;
                    case "cookies":
                        response.cookies = objectReader.nextStringOrNull();
                        break;
                    case "body_size":
                        response.bodySize = objectReader.nextLongOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            response.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return response;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String BODY_SIZE = "body_size";
        public static final String COOKIES = "cookies";
        public static final String DATA = "data";
        public static final String HEADERS = "headers";
        public static final String STATUS_CODE = "status_code";
    }

    public Response() {
    }

    @Nullable
    public Long getBodySize() {
        return this.bodySize;
    }

    @Nullable
    public String getCookies() {
        return this.cookies;
    }

    @Nullable
    public Object getData() {
        return this.data;
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.statusCode != null) {
            objectWriter.name(JsonKeys.STATUS_CODE).value(iLogger, this.statusCode);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBodySize(@Nullable Long l10) {
        this.bodySize = l10;
    }

    public void setCookies(@Nullable String str) {
        this.cookies = str;
    }

    public void setData(@Nullable Object obj) {
        this.data = obj;
    }

    public void setHeaders(@Nullable Map<String, String> map) {
        this.headers = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setStatusCode(@Nullable Integer num) {
        this.statusCode = num;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public Response(@NotNull Response response) {
        this.cookies = response.cookies;
        this.headers = CollectionUtils.newConcurrentHashMap(response.headers);
        this.unknown = CollectionUtils.newConcurrentHashMap(response.unknown);
        this.statusCode = response.statusCode;
        this.bodySize = response.bodySize;
        this.data = response.data;
    }
}
