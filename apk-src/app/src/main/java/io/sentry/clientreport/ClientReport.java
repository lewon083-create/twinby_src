package io.sentry.clientreport;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ClientReport implements JsonUnknown, JsonSerializable {

    @NotNull
    private final List<DiscardedEvent> discardedEvents;

    @NotNull
    private final Date timestamp;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<ClientReport> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public ClientReport deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            objectReader.beginObject();
            Date dateNextDateOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.DISCARDED_EVENTS)) {
                    arrayList.addAll(objectReader.nextListOrNull(iLogger, new DiscardedEvent.Deserializer()));
                } else if (strNextName.equals("timestamp")) {
                    dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (dateNextDateOrNull == null) {
                throw missingRequiredFieldException("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw missingRequiredFieldException(JsonKeys.DISCARDED_EVENTS, iLogger);
            }
            ClientReport clientReport = new ClientReport(dateNextDateOrNull, arrayList);
            clientReport.setUnknown(map);
            return clientReport;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DISCARDED_EVENTS = "discarded_events";
        public static final String TIMESTAMP = "timestamp";
    }

    public ClientReport(@NotNull Date date, @NotNull List<DiscardedEvent> list) {
        this.timestamp = date;
        this.discardedEvents = list;
    }

    @NotNull
    public List<DiscardedEvent> getDiscardedEvents() {
        return this.discardedEvents;
    }

    @NotNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(DateUtils.getTimestamp(this.timestamp));
        objectWriter.name(JsonKeys.DISCARDED_EVENTS).value(iLogger, this.discardedEvents);
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
}
