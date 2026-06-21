package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RRWebEvent {
    private long timestamp;

    @NotNull
    private RRWebEventType type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer {
        public boolean deserializeValue(@NotNull RRWebEvent rRWebEvent, @NotNull String str, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                rRWebEvent.type = (RRWebEventType) Objects.requireNonNull((RRWebEventType) objectReader.nextOrNull(iLogger, new RRWebEventType.Deserializer()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            rRWebEvent.timestamp = objectReader.nextLong();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String TAG = "tag";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Serializer {
        public void serialize(@NotNull RRWebEvent rRWebEvent, @NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.name("type").value(iLogger, rRWebEvent.type);
            objectWriter.name("timestamp").value(rRWebEvent.timestamp);
        }
    }

    public RRWebEvent(@NotNull RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
        this.timestamp = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RRWebEvent)) {
            return false;
        }
        RRWebEvent rRWebEvent = (RRWebEvent) obj;
        return this.timestamp == rRWebEvent.timestamp && this.type == rRWebEvent.type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public RRWebEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, Long.valueOf(this.timestamp));
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public void setType(@NotNull RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
    }

    public RRWebEvent() {
        this(RRWebEventType.Custom);
    }
}
