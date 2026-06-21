package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Request implements JsonUnknown, JsonSerializable {

    @Nullable
    private String apiTarget;

    @Nullable
    private Long bodySize;

    @Nullable
    private String cookies;

    @Nullable
    private Object data;

    @Nullable
    private Map<String, String> env;

    @Nullable
    private String fragment;

    @Nullable
    private Map<String, String> headers;

    @Nullable
    private String method;

    @Nullable
    private Map<String, String> other;

    @Nullable
    private String queryString;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Request> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Request deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Request request = new Request();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fragment":
                        request.fragment = objectReader.nextStringOrNull();
                        break;
                    case "method":
                        request.method = objectReader.nextStringOrNull();
                        break;
                    case "env":
                        Map map = (Map) objectReader.nextObjectOrNull();
                        if (map == null) {
                            break;
                        } else {
                            request.env = CollectionUtils.newConcurrentHashMap(map);
                            break;
                        }
                        break;
                    case "url":
                        request.url = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        request.data = objectReader.nextObjectOrNull();
                        break;
                    case "other":
                        Map map2 = (Map) objectReader.nextObjectOrNull();
                        if (map2 == null) {
                            break;
                        } else {
                            request.other = CollectionUtils.newConcurrentHashMap(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) objectReader.nextObjectOrNull();
                        if (map3 == null) {
                            break;
                        } else {
                            request.headers = CollectionUtils.newConcurrentHashMap(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        request.cookies = objectReader.nextStringOrNull();
                        break;
                    case "body_size":
                        request.bodySize = objectReader.nextLongOrNull();
                        break;
                    case "query_string":
                        request.queryString = objectReader.nextStringOrNull();
                        break;
                    case "api_target":
                        request.apiTarget = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            request.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return request;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String API_TARGET = "api_target";
        public static final String BODY_SIZE = "body_size";
        public static final String COOKIES = "cookies";
        public static final String DATA = "data";
        public static final String ENV = "env";
        public static final String FRAGMENT = "fragment";
        public static final String HEADERS = "headers";
        public static final String METHOD = "method";
        public static final String OTHER = "other";
        public static final String QUERY_STRING = "query_string";
        public static final String URL = "url";
    }

    public Request() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Request.class == obj.getClass()) {
            Request request = (Request) obj;
            if (Objects.equals(this.url, request.url) && Objects.equals(this.method, request.method) && Objects.equals(this.queryString, request.queryString) && Objects.equals(this.cookies, request.cookies) && Objects.equals(this.headers, request.headers) && Objects.equals(this.env, request.env) && Objects.equals(this.bodySize, request.bodySize) && Objects.equals(this.fragment, request.fragment) && Objects.equals(this.apiTarget, request.apiTarget)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getApiTarget() {
        return this.apiTarget;
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
    public Map<String, String> getEnvs() {
        return this.env;
    }

    @Nullable
    public String getFragment() {
        return this.fragment;
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    @Nullable
    public Map<String, String> getOthers() {
        return this.other;
    }

    @Nullable
    public String getQueryString() {
        return this.queryString;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.method, this.queryString, this.cookies, this.headers, this.env, this.bodySize, this.fragment, this.apiTarget);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.url != null) {
            objectWriter.name("url").value(this.url);
        }
        if (this.method != null) {
            objectWriter.name(JsonKeys.METHOD).value(this.method);
        }
        if (this.queryString != null) {
            objectWriter.name(JsonKeys.QUERY_STRING).value(this.queryString);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (this.cookies != null) {
            objectWriter.name("cookies").value(this.cookies);
        }
        if (this.headers != null) {
            objectWriter.name("headers").value(iLogger, this.headers);
        }
        if (this.env != null) {
            objectWriter.name(JsonKeys.ENV).value(iLogger, this.env);
        }
        if (this.other != null) {
            objectWriter.name(JsonKeys.OTHER).value(iLogger, this.other);
        }
        if (this.fragment != null) {
            objectWriter.name(JsonKeys.FRAGMENT).value(iLogger, this.fragment);
        }
        if (this.bodySize != null) {
            objectWriter.name("body_size").value(iLogger, this.bodySize);
        }
        if (this.apiTarget != null) {
            objectWriter.name(JsonKeys.API_TARGET).value(iLogger, this.apiTarget);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setApiTarget(@Nullable String str) {
        this.apiTarget = str;
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

    public void setEnvs(@Nullable Map<String, String> map) {
        this.env = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setFragment(@Nullable String str) {
        this.fragment = str;
    }

    public void setHeaders(@Nullable Map<String, String> map) {
        this.headers = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setMethod(@Nullable String str) {
        this.method = str;
    }

    public void setOthers(@Nullable Map<String, String> map) {
        this.other = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setQueryString(@Nullable String str) {
        this.queryString = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUrl(@Nullable String str) {
        this.url = str;
    }

    public Request(@NotNull Request request) {
        this.url = request.url;
        this.cookies = request.cookies;
        this.method = request.method;
        this.queryString = request.queryString;
        this.headers = CollectionUtils.newConcurrentHashMap(request.headers);
        this.env = CollectionUtils.newConcurrentHashMap(request.env);
        this.other = CollectionUtils.newConcurrentHashMap(request.other);
        this.unknown = CollectionUtils.newConcurrentHashMap(request.unknown);
        this.data = request.data;
        this.fragment = request.fragment;
        this.bodySize = request.bodySize;
        this.apiTarget = request.apiTarget;
    }
}
