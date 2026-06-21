package io.sentry;

import io.sentry.Breadcrumb;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SentryBaseEvent {
    public static final String DEFAULT_PLATFORM = "java";

    @Nullable
    private List<Breadcrumb> breadcrumbs;

    @NotNull
    private final Contexts contexts;

    @Nullable
    private DebugMeta debugMeta;

    @Nullable
    private String dist;

    @Nullable
    private String environment;

    @Nullable
    private SentryId eventId;

    @Nullable
    private Map<String, Object> extra;

    @Nullable
    private String platform;

    @Nullable
    private String release;

    @Nullable
    private Request request;

    @Nullable
    private SdkVersion sdk;

    @Nullable
    private String serverName;

    @Nullable
    private Map<String, String> tags;

    @Nullable
    protected transient Throwable throwable;

    @Nullable
    private User user;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer {
        public boolean deserializeValue(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull String str, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    sentryBaseEvent.debugMeta = (DebugMeta) objectReader.nextOrNull(iLogger, new DebugMeta.Deserializer());
                    return true;
                case "server_name":
                    sentryBaseEvent.serverName = objectReader.nextStringOrNull();
                    return true;
                case "contexts":
                    sentryBaseEvent.contexts.putAll(new Contexts.Deserializer().deserialize(objectReader, iLogger));
                    return true;
                case "environment":
                    sentryBaseEvent.environment = objectReader.nextStringOrNull();
                    return true;
                case "breadcrumbs":
                    sentryBaseEvent.breadcrumbs = objectReader.nextListOrNull(iLogger, new Breadcrumb.Deserializer());
                    return true;
                case "sdk":
                    sentryBaseEvent.sdk = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                    return true;
                case "dist":
                    sentryBaseEvent.dist = objectReader.nextStringOrNull();
                    return true;
                case "tags":
                    sentryBaseEvent.tags = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                    return true;
                case "user":
                    sentryBaseEvent.user = (User) objectReader.nextOrNull(iLogger, new User.Deserializer());
                    return true;
                case "extra":
                    sentryBaseEvent.extra = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                    return true;
                case "event_id":
                    sentryBaseEvent.eventId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                    return true;
                case "release":
                    sentryBaseEvent.release = objectReader.nextStringOrNull();
                    return true;
                case "request":
                    sentryBaseEvent.request = (Request) objectReader.nextOrNull(iLogger, new Request.Deserializer());
                    return true;
                case "platform":
                    sentryBaseEvent.platform = objectReader.nextStringOrNull();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String BREADCRUMBS = "breadcrumbs";
        public static final String CONTEXTS = "contexts";
        public static final String DEBUG_META = "debug_meta";
        public static final String DIST = "dist";
        public static final String ENVIRONMENT = "environment";
        public static final String EVENT_ID = "event_id";
        public static final String EXTRA = "extra";
        public static final String PLATFORM = "platform";
        public static final String RELEASE = "release";
        public static final String REQUEST = "request";
        public static final String SDK = "sdk";
        public static final String SERVER_NAME = "server_name";
        public static final String TAGS = "tags";
        public static final String USER = "user";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Serializer {
        public void serialize(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            if (sentryBaseEvent.eventId != null) {
                objectWriter.name("event_id").value(iLogger, sentryBaseEvent.eventId);
            }
            objectWriter.name("contexts").value(iLogger, sentryBaseEvent.contexts);
            if (sentryBaseEvent.sdk != null) {
                objectWriter.name("sdk").value(iLogger, sentryBaseEvent.sdk);
            }
            if (sentryBaseEvent.request != null) {
                objectWriter.name(JsonKeys.REQUEST).value(iLogger, sentryBaseEvent.request);
            }
            if (sentryBaseEvent.tags != null && !sentryBaseEvent.tags.isEmpty()) {
                objectWriter.name("tags").value(iLogger, sentryBaseEvent.tags);
            }
            if (sentryBaseEvent.release != null) {
                objectWriter.name("release").value(sentryBaseEvent.release);
            }
            if (sentryBaseEvent.environment != null) {
                objectWriter.name("environment").value(sentryBaseEvent.environment);
            }
            if (sentryBaseEvent.platform != null) {
                objectWriter.name("platform").value(sentryBaseEvent.platform);
            }
            if (sentryBaseEvent.user != null) {
                objectWriter.name(JsonKeys.USER).value(iLogger, sentryBaseEvent.user);
            }
            if (sentryBaseEvent.serverName != null) {
                objectWriter.name(JsonKeys.SERVER_NAME).value(sentryBaseEvent.serverName);
            }
            if (sentryBaseEvent.dist != null) {
                objectWriter.name(JsonKeys.DIST).value(sentryBaseEvent.dist);
            }
            if (sentryBaseEvent.breadcrumbs != null && !sentryBaseEvent.breadcrumbs.isEmpty()) {
                objectWriter.name(JsonKeys.BREADCRUMBS).value(iLogger, sentryBaseEvent.breadcrumbs);
            }
            if (sentryBaseEvent.debugMeta != null) {
                objectWriter.name("debug_meta").value(iLogger, sentryBaseEvent.debugMeta);
            }
            if (sentryBaseEvent.extra == null || sentryBaseEvent.extra.isEmpty()) {
                return;
            }
            objectWriter.name(JsonKeys.EXTRA).value(iLogger, sentryBaseEvent.extra);
        }
    }

    public SentryBaseEvent(@NotNull SentryId sentryId) {
        this.contexts = new Contexts();
        this.eventId = sentryId;
    }

    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        if (this.breadcrumbs == null) {
            this.breadcrumbs = new ArrayList();
        }
        this.breadcrumbs.add(breadcrumb);
    }

    @Nullable
    public List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @NotNull
    public Contexts getContexts() {
        return this.contexts;
    }

    @Nullable
    public DebugMeta getDebugMeta() {
        return this.debugMeta;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getEnvironment() {
        return this.environment;
    }

    @Nullable
    public SentryId getEventId() {
        return this.eventId;
    }

    @Nullable
    public Object getExtra(@Nullable String str) {
        Map<String, Object> map = this.extra;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Nullable
    public Map<String, Object> getExtras() {
        return this.extra;
    }

    @Nullable
    public String getPlatform() {
        return this.platform;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @Nullable
    public Request getRequest() {
        return this.request;
    }

    @Nullable
    public SdkVersion getSdk() {
        return this.sdk;
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @Nullable
    public String getTag(@Nullable String str) {
        Map<String, String> map = this.tags;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Nullable
    public Map<String, String> getTags() {
        return this.tags;
    }

    @Nullable
    public Throwable getThrowable() {
        Throwable th2 = this.throwable;
        return th2 instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th2).getThrowable() : th2;
    }

    @Nullable
    public Throwable getThrowableMechanism() {
        return this.throwable;
    }

    @Nullable
    public User getUser() {
        return this.user;
    }

    public void removeExtra(@Nullable String str) {
        Map<String, Object> map = this.extra;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void removeTag(@Nullable String str) {
        Map<String, String> map = this.tags;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void setBreadcrumbs(@Nullable List<Breadcrumb> list) {
        this.breadcrumbs = CollectionUtils.newArrayList(list);
    }

    public void setDebugMeta(@Nullable DebugMeta debugMeta) {
        this.debugMeta = debugMeta;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    public void setEventId(@Nullable SentryId sentryId) {
        this.eventId = sentryId;
    }

    public void setExtra(@Nullable String str, @Nullable Object obj) {
        if (this.extra == null) {
            this.extra = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (obj == null) {
            removeExtra(str);
        } else {
            this.extra.put(str, obj);
        }
    }

    public void setExtras(@Nullable Map<String, Object> map) {
        this.extra = CollectionUtils.newHashMap(map);
    }

    public void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setRequest(@Nullable Request request) {
        this.request = request;
    }

    public void setSdk(@Nullable SdkVersion sdkVersion) {
        this.sdk = sdkVersion;
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setTags(@Nullable Map<String, String> map) {
        this.tags = CollectionUtils.newHashMap(map);
    }

    public void setThrowable(@Nullable Throwable th2) {
        this.throwable = th2;
    }

    public void setUser(@Nullable User user) {
        this.user = user;
    }

    public SentryBaseEvent() {
        this(new SentryId());
    }

    public void addBreadcrumb(@Nullable String str) {
        addBreadcrumb(new Breadcrumb(str));
    }
}
