package io.sentry;

import io.sentry.protocol.User;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.StringUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Session implements JsonUnknown, JsonSerializable {

    @Nullable
    private String abnormalMechanism;

    @Nullable
    private final String distinctId;

    @Nullable
    private Double duration;

    @Nullable
    private final String environment;

    @NotNull
    private final AtomicInteger errorCount;

    @Nullable
    private Boolean init;

    @Nullable
    private final String ipAddress;

    @NotNull
    private final String release;

    @Nullable
    private Long sequence;

    @Nullable
    private final String sessionId;

    @NotNull
    private final AutoClosableReentrantLock sessionLock;

    @NotNull
    private final Date started;

    @NotNull
    private State status;

    @Nullable
    private Date timestamp;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String userAgent;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Session> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Session deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            Integer numNextIntegerOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            State stateValueOf = null;
            Date dateNextDateOrNull = null;
            Date dateNextDateOrNull2 = null;
            String strNextStringOrNull = null;
            String str = null;
            Boolean boolNextBooleanOrNull = null;
            Long lNextLongOrNull = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            String strNextStringOrNull5 = null;
            String strNextStringOrNull6 = null;
            while (true) {
                Integer num = numNextIntegerOrNull;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                State state = stateValueOf;
                Date date = dateNextDateOrNull;
                Date date2 = dateNextDateOrNull2;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (state == null) {
                        throw missingRequiredFieldException("status", iLogger);
                    }
                    if (date == null) {
                        throw missingRequiredFieldException(JsonKeys.STARTED, iLogger);
                    }
                    if (num == null) {
                        throw missingRequiredFieldException(JsonKeys.ERRORS, iLogger);
                    }
                    if (strNextStringOrNull5 == null) {
                        throw missingRequiredFieldException("release", iLogger);
                    }
                    Session session = new Session(state, date, date2, num.intValue(), strNextStringOrNull, str, boolNextBooleanOrNull, lNextLongOrNull, dNextDoubleOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6);
                    session.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return session;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "duration":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "started":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "errors":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "status":
                        String strCapitalize = StringUtils.capitalize(objectReader.nextStringOrNull());
                        if (strCapitalize != null) {
                            stateValueOf = State.valueOf(strCapitalize);
                            numNextIntegerOrNull = num;
                            concurrentHashMap = concurrentHashMap2;
                            dateNextDateOrNull = date;
                            dateNextDateOrNull2 = date2;
                            break;
                        }
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "did":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "seq":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "sid":
                        String strNextStringOrNull7 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull7 == null || !(strNextStringOrNull7.length() == 36 || strNextStringOrNull7.length() == 32)) {
                            iLogger.log(SentryLevel.ERROR, "%s sid is not valid.", strNextStringOrNull7);
                        } else {
                            str = strNextStringOrNull7;
                        }
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "init":
                        boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "timestamp":
                        dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        break;
                    case "attrs":
                        objectReader.beginObject();
                        while (objectReader.peek() == JsonToken.NAME) {
                            String strNextName2 = objectReader.nextName();
                            strNextName2.getClass();
                            switch (strNextName2) {
                                case "environment":
                                    strNextStringOrNull4 = objectReader.nextStringOrNull();
                                    break;
                                case "release":
                                    strNextStringOrNull5 = objectReader.nextStringOrNull();
                                    break;
                                case "ip_address":
                                    strNextStringOrNull2 = objectReader.nextStringOrNull();
                                    break;
                                case "user_agent":
                                    strNextStringOrNull3 = objectReader.nextStringOrNull();
                                    break;
                                default:
                                    objectReader.skipValue();
                                    break;
                            }
                        }
                        objectReader.endObject();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    case "abnormal_mechanism":
                        strNextStringOrNull6 = objectReader.nextStringOrNull();
                        numNextIntegerOrNull = num;
                        concurrentHashMap = concurrentHashMap2;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        numNextIntegerOrNull = num;
                        stateValueOf = state;
                        dateNextDateOrNull = date;
                        dateNextDateOrNull2 = date2;
                        break;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ABNORMAL_MECHANISM = "abnormal_mechanism";
        public static final String ATTRS = "attrs";
        public static final String DID = "did";
        public static final String DURATION = "duration";
        public static final String ENVIRONMENT = "environment";
        public static final String ERRORS = "errors";
        public static final String INIT = "init";
        public static final String IP_ADDRESS = "ip_address";
        public static final String RELEASE = "release";
        public static final String SEQ = "seq";
        public static final String SID = "sid";
        public static final String STARTED = "started";
        public static final String STATUS = "status";
        public static final String TIMESTAMP = "timestamp";
        public static final String USER_AGENT = "user_agent";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(@NotNull State state, @NotNull Date date, @Nullable Date date2, int i, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Long l10, @Nullable Double d10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, @Nullable String str7) {
        this.sessionLock = new AutoClosableReentrantLock();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new AtomicInteger(i);
        this.distinctId = str;
        this.sessionId = str2;
        this.init = bool;
        this.sequence = l10;
        this.duration = d10;
        this.ipAddress = str3;
        this.userAgent = str4;
        this.environment = str5;
        this.release = str6;
        this.abnormalMechanism = str7;
    }

    private double calculateDurationTime(@NotNull Date date) {
        return Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    private long getSequenceTimestamp(@NotNull Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    public void end() {
        end(DateUtils.getCurrentDateTime());
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    @Nullable
    public String getAbnormalMechanism() {
        return this.abnormalMechanism;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @Nullable
    public Double getDuration() {
        return this.duration;
    }

    @Nullable
    public String getEnvironment() {
        return this.environment;
    }

    @Nullable
    public Boolean getInit() {
        return this.init;
    }

    @Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }

    @NotNull
    public String getRelease() {
        return this.release;
    }

    @Nullable
    public Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public Date getStarted() {
        Date date = this.started;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    @NotNull
    public State getStatus() {
        return this.status;
    }

    @Nullable
    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isTerminated() {
        return this.status != State.Ok;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sessionId != null) {
            objectWriter.name(JsonKeys.SID).value(this.sessionId);
        }
        if (this.distinctId != null) {
            objectWriter.name(JsonKeys.DID).value(this.distinctId);
        }
        if (this.init != null) {
            objectWriter.name(JsonKeys.INIT).value(this.init);
        }
        objectWriter.name(JsonKeys.STARTED).value(iLogger, this.started);
        objectWriter.name("status").value(iLogger, this.status.name().toLowerCase(Locale.ROOT));
        if (this.sequence != null) {
            objectWriter.name(JsonKeys.SEQ).value(this.sequence);
        }
        objectWriter.name(JsonKeys.ERRORS).value(this.errorCount.intValue());
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, this.timestamp);
        }
        if (this.abnormalMechanism != null) {
            objectWriter.name(JsonKeys.ABNORMAL_MECHANISM).value(iLogger, this.abnormalMechanism);
        }
        objectWriter.name(JsonKeys.ATTRS);
        objectWriter.beginObject();
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(iLogger, this.ipAddress);
        }
        if (this.userAgent != null) {
            objectWriter.name(JsonKeys.USER_AGENT).value(iLogger, this.userAgent);
        }
        objectWriter.endObject();
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setInitAsTrue() {
        this.init = Boolean.TRUE;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public boolean update(@Nullable State state, @Nullable String str, boolean z5) {
        return update(state, str, z5, null);
    }

    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Session m610clone() {
        return new Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release, this.abnormalMechanism);
    }

    public void end(@Nullable Date date) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            this.init = null;
            if (this.status == State.Ok) {
                this.status = State.Exited;
            }
            if (date != null) {
                this.timestamp = date;
            } else {
                this.timestamp = DateUtils.getCurrentDateTime();
            }
            Date date2 = this.timestamp;
            if (date2 != null) {
                this.duration = Double.valueOf(calculateDurationTime(date2));
                this.sequence = Long.valueOf(getSequenceTimestamp(this.timestamp));
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public boolean update(@Nullable State state, @Nullable String str, boolean z5, @Nullable String str2) {
        boolean z10;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        boolean z11 = true;
        if (state != null) {
            try {
                this.status = state;
                z10 = true;
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            z10 = false;
        }
        if (str != null) {
            this.userAgent = str;
            z10 = true;
        }
        if (z5) {
            this.errorCount.addAndGet(1);
            z10 = true;
        }
        if (str2 != null) {
            this.abnormalMechanism = str2;
        } else {
            z11 = z10;
        }
        if (z11) {
            this.init = null;
            Date currentDateTime = DateUtils.getCurrentDateTime();
            this.timestamp = currentDateTime;
            if (currentDateTime != null) {
                this.sequence = Long.valueOf(getSequenceTimestamp(currentDateTime));
            }
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
        return z11;
    }

    public Session(@Nullable String str, @Nullable User user, @Nullable String str2, @NotNull String str3) {
        this(State.Ok, DateUtils.getCurrentDateTime(), DateUtils.getCurrentDateTime(), 0, str, SentryUUID.generateSentryId(), Boolean.TRUE, null, null, user != null ? user.getIpAddress() : null, null, str2, str3, null);
    }
}
