package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Feedback implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "feedback";

    @Nullable
    private SentryId associatedEventId;

    @Nullable
    private String contactEmail;

    @NotNull
    private String message;

    @Nullable
    private String name;

    @Nullable
    private SentryId replayId;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Feedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Feedback deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            SentryId sentryIdDeserialize = null;
            SentryId sentryIdDeserialize2 = null;
            String strNextStringOrNull4 = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "associated_event_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "replay_id":
                        sentryIdDeserialize2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "url":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "contact_email":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "message":
                        strNextStringOrNull = objectReader.nextStringOrNull();
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
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            Feedback feedback = new Feedback(strNextStringOrNull);
            feedback.contactEmail = strNextStringOrNull2;
            feedback.name = strNextStringOrNull3;
            feedback.associatedEventId = sentryIdDeserialize;
            feedback.replayId = sentryIdDeserialize2;
            feedback.url = strNextStringOrNull4;
            feedback.unknown = map;
            return feedback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ASSOCIATED_EVENT_ID = "associated_event_id";
        public static final String CONTACT_EMAIL = "contact_email";
        public static final String MESSAGE = "message";
        public static final String NAME = "name";
        public static final String REPLAY_ID = "replay_id";
        public static final String URL = "url";
    }

    public Feedback(@NotNull String str) {
        setMessage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) obj;
        return Objects.equals(this.message, feedback.message) && Objects.equals(this.contactEmail, feedback.contactEmail) && Objects.equals(this.name, feedback.name) && Objects.equals(this.associatedEventId, feedback.associatedEventId) && Objects.equals(this.replayId, feedback.replayId) && Objects.equals(this.url, feedback.url) && Objects.equals(this.unknown, feedback.unknown);
    }

    @Nullable
    public SentryId getAssociatedEventId() {
        return this.associatedEventId;
    }

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public SentryId getReplayId() {
        return this.replayId;
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
        return Objects.hash(this.message, this.contactEmail, this.name, this.associatedEventId, this.replayId, this.url, this.unknown);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("message").value(this.message);
        if (this.contactEmail != null) {
            objectWriter.name(JsonKeys.CONTACT_EMAIL).value(this.contactEmail);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.associatedEventId != null) {
            objectWriter.name(JsonKeys.ASSOCIATED_EVENT_ID);
            this.associatedEventId.serialize(objectWriter, iLogger);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id");
            this.replayId.serialize(objectWriter, iLogger);
        }
        if (this.url != null) {
            objectWriter.name("url").value(this.url);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAssociatedEventId(@NotNull SentryId sentryId) {
        this.associatedEventId = sentryId;
    }

    public void setContactEmail(@Nullable String str) {
        this.contactEmail = str;
    }

    public void setMessage(@NotNull String str) {
        if (str.length() > 4096) {
            this.message = str.substring(0, 4096);
        } else {
            this.message = str;
        }
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setReplayId(@NotNull SentryId sentryId) {
        this.replayId = sentryId;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUrl(@Nullable String str) {
        this.url = str;
    }

    public String toString() {
        return "Feedback{message='" + this.message + "', contactEmail='" + this.contactEmail + "', name='" + this.name + "', associatedEventId=" + this.associatedEventId + ", replayId=" + this.replayId + ", url='" + this.url + "', unknown=" + this.unknown + '}';
    }

    public Feedback(@NotNull Feedback feedback) {
        this.message = feedback.message;
        this.contactEmail = feedback.contactEmail;
        this.name = feedback.name;
        this.associatedEventId = feedback.associatedEventId;
        this.replayId = feedback.replayId;
        this.url = feedback.url;
        this.unknown = CollectionUtils.newConcurrentHashMap(feedback.unknown);
    }
}
