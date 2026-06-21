package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscardedEvent implements JsonUnknown, JsonSerializable {

    @NotNull
    private final String category;

    @NotNull
    private final Long quantity;

    @NotNull
    private final String reason;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<DiscardedEvent> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public DiscardedEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            Long lNextLongOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "quantity":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        break;
                    case "reason":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
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
                throw missingRequiredFieldException(JsonKeys.REASON, iLogger);
            }
            if (strNextStringOrNull2 == null) {
                throw missingRequiredFieldException("category", iLogger);
            }
            if (lNextLongOrNull == null) {
                throw missingRequiredFieldException(JsonKeys.QUANTITY, iLogger);
            }
            DiscardedEvent discardedEvent = new DiscardedEvent(strNextStringOrNull, strNextStringOrNull2, lNextLongOrNull);
            discardedEvent.setUnknown(map);
            return discardedEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CATEGORY = "category";
        public static final String QUANTITY = "quantity";
        public static final String REASON = "reason";
    }

    public DiscardedEvent(@NotNull String str, @NotNull String str2, @NotNull Long l10) {
        this.reason = str;
        this.category = str2;
        this.quantity = l10;
    }

    @NotNull
    public String getCategory() {
        return this.category;
    }

    @NotNull
    public Long getQuantity() {
        return this.quantity;
    }

    @NotNull
    public String getReason() {
        return this.reason;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.REASON).value(this.reason);
        objectWriter.name("category").value(this.category);
        objectWriter.name(JsonKeys.QUANTITY).value(this.quantity);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.reason + "', category='" + this.category + "', quantity=" + this.quantity + '}';
    }
}
