package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Geo;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class User implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, String> data;

    @Nullable
    private String email;

    @Nullable
    private Geo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private String f26067id;

    @Nullable
    private String ipAddress;

    @Deprecated
    @Nullable
    private String name;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String username;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public User deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            User user = new User();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "username":
                        user.username = objectReader.nextStringOrNull();
                        break;
                    case "id":
                        user.f26067id = objectReader.nextStringOrNull();
                        break;
                    case "geo":
                        user.geo = new Geo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "data":
                        user.data = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "name":
                        user.name = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        user.email = objectReader.nextStringOrNull();
                        break;
                    case "ip_address":
                        user.ipAddress = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            user.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return user;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String EMAIL = "email";
        public static final String GEO = "geo";
        public static final String ID = "id";
        public static final String IP_ADDRESS = "ip_address";
        public static final String NAME = "name";
        public static final String USERNAME = "username";
    }

    public User() {
    }

    public static User fromMap(@NotNull Map<String, Object> map, @NotNull SentryOptions sentryOptions) {
        Object value;
        User user = new User();
        ConcurrentHashMap concurrentHashMap = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "username":
                    user.username = value instanceof String ? (String) value : null;
                    break;
                case "id":
                    user.f26067id = value instanceof String ? (String) value : null;
                    break;
                case "geo":
                    Map map2 = value instanceof Map ? (Map) value : null;
                    if (map2 != null) {
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof String) || entry2.getValue() == null) {
                                sentryOptions.getLogger().log(SentryLevel.WARNING, "Invalid key type in gep map.", new Object[0]);
                            } else {
                                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        user.geo = Geo.fromMap(concurrentHashMap2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "data":
                    Map map3 = value instanceof Map ? (Map) value : null;
                    if (map3 != null) {
                        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (!(entry3.getKey() instanceof String) || entry3.getValue() == null) {
                                sentryOptions.getLogger().log(SentryLevel.WARNING, "Invalid key or null value in data map.", new Object[0]);
                            } else {
                                concurrentHashMap3.put((String) entry3.getKey(), entry3.getValue().toString());
                            }
                        }
                        user.data = concurrentHashMap3;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "name":
                    user.name = value instanceof String ? (String) value : null;
                    break;
                case "email":
                    user.email = value instanceof String ? (String) value : null;
                    break;
                case "ip_address":
                    user.ipAddress = value instanceof String ? (String) value : null;
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        user.unknown = concurrentHashMap;
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && User.class == obj.getClass()) {
            User user = (User) obj;
            if (Objects.equals(this.email, user.email) && Objects.equals(this.f26067id, user.f26067id) && Objects.equals(this.username, user.username) && Objects.equals(this.ipAddress, user.ipAddress)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Map<String, String> getData() {
        return this.data;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    @Nullable
    public Geo getGeo() {
        return this.geo;
    }

    @Nullable
    public String getId() {
        return this.f26067id;
    }

    @Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }

    @Deprecated
    @Nullable
    public String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Objects.hash(this.email, this.f26067id, this.username, this.ipAddress);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.f26067id != null) {
            objectWriter.name("id").value(this.f26067id);
        }
        if (this.username != null) {
            objectWriter.name(JsonKeys.USERNAME).value(this.username);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(this.ipAddress);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.geo != null) {
            objectWriter.name(JsonKeys.GEO);
            this.geo.serialize(objectWriter, iLogger);
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

    public void setData(@Nullable Map<String, String> map) {
        this.data = CollectionUtils.newConcurrentHashMap(map);
    }

    public void setEmail(@Nullable String str) {
        this.email = str;
    }

    public void setGeo(@Nullable Geo geo) {
        this.geo = geo;
    }

    public void setId(@Nullable String str) {
        this.f26067id = str;
    }

    public void setIpAddress(@Nullable String str) {
        this.ipAddress = str;
    }

    @Deprecated
    public void setName(@Nullable String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUsername(@Nullable String str) {
        this.username = str;
    }

    public User(@NotNull User user) {
        this.email = user.email;
        this.username = user.username;
        this.f26067id = user.f26067id;
        this.ipAddress = user.ipAddress;
        this.name = user.name;
        this.geo = user.geo;
        this.data = CollectionUtils.newConcurrentHashMap(user.data);
        this.unknown = CollectionUtils.newConcurrentHashMap(user.unknown);
    }
}
