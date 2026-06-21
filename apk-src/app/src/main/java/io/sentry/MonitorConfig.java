package io.sentry;

import io.sentry.MonitorSchedule;
import io.sentry.SentryOptions;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class MonitorConfig implements JsonUnknown, JsonSerializable {

    @Nullable
    private Long checkinMargin;

    @Nullable
    private Long failureIssueThreshold;

    @Nullable
    private Long maxRuntime;

    @Nullable
    private Long recoveryThreshold;

    @NotNull
    private MonitorSchedule schedule;

    @Nullable
    private String timezone;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<MonitorConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public MonitorConfig deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            MonitorSchedule monitorScheduleDeserialize = null;
            Long lNextLongOrNull = null;
            Long lNextLongOrNull2 = null;
            String strNextStringOrNull = null;
            Long lNextLongOrNull3 = null;
            Long lNextLongOrNull4 = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "timezone":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "checkin_margin":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        break;
                    case "schedule":
                        monitorScheduleDeserialize = new MonitorSchedule.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "recovery_threshold":
                        lNextLongOrNull4 = objectReader.nextLongOrNull();
                        break;
                    case "max_runtime":
                        lNextLongOrNull2 = objectReader.nextLongOrNull();
                        break;
                    case "failure_issue_threshold":
                        lNextLongOrNull3 = objectReader.nextLongOrNull();
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
            if (monitorScheduleDeserialize == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"schedule\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"schedule\"", illegalStateException);
                throw illegalStateException;
            }
            MonitorConfig monitorConfig = new MonitorConfig(monitorScheduleDeserialize);
            monitorConfig.setCheckinMargin(lNextLongOrNull);
            monitorConfig.setMaxRuntime(lNextLongOrNull2);
            monitorConfig.setTimezone(strNextStringOrNull);
            monitorConfig.setFailureIssueThreshold(lNextLongOrNull3);
            monitorConfig.setRecoveryThreshold(lNextLongOrNull4);
            monitorConfig.setUnknown(map);
            return monitorConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CHECKIN_MARGIN = "checkin_margin";
        public static final String FAILURE_ISSUE_THRESHOLD = "failure_issue_threshold";
        public static final String MAX_RUNTIME = "max_runtime";
        public static final String RECOVERY_THRESHOLD = "recovery_threshold";
        public static final String SCHEDULE = "schedule";
        public static final String TIMEZONE = "timezone";
    }

    public MonitorConfig(@NotNull MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
        SentryOptions.Cron cron = ScopesAdapter.getInstance().getOptions().getCron();
        if (cron != null) {
            this.checkinMargin = cron.getDefaultCheckinMargin();
            this.maxRuntime = cron.getDefaultMaxRuntime();
            this.timezone = cron.getDefaultTimezone();
            this.failureIssueThreshold = cron.getDefaultFailureIssueThreshold();
            this.recoveryThreshold = cron.getDefaultRecoveryThreshold();
        }
    }

    @Nullable
    public Long getCheckinMargin() {
        return this.checkinMargin;
    }

    @Nullable
    public Long getFailureIssueThreshold() {
        return this.failureIssueThreshold;
    }

    @Nullable
    public Long getMaxRuntime() {
        return this.maxRuntime;
    }

    @Nullable
    public Long getRecoveryThreshold() {
        return this.recoveryThreshold;
    }

    @NotNull
    public MonitorSchedule getSchedule() {
        return this.schedule;
    }

    @Nullable
    public String getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.SCHEDULE);
        this.schedule.serialize(objectWriter, iLogger);
        if (this.checkinMargin != null) {
            objectWriter.name(JsonKeys.CHECKIN_MARGIN).value(this.checkinMargin);
        }
        if (this.maxRuntime != null) {
            objectWriter.name(JsonKeys.MAX_RUNTIME).value(this.maxRuntime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(this.timezone);
        }
        if (this.failureIssueThreshold != null) {
            objectWriter.name(JsonKeys.FAILURE_ISSUE_THRESHOLD).value(this.failureIssueThreshold);
        }
        if (this.recoveryThreshold != null) {
            objectWriter.name(JsonKeys.RECOVERY_THRESHOLD).value(this.recoveryThreshold);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setCheckinMargin(@Nullable Long l10) {
        this.checkinMargin = l10;
    }

    public void setFailureIssueThreshold(@Nullable Long l10) {
        this.failureIssueThreshold = l10;
    }

    public void setMaxRuntime(@Nullable Long l10) {
        this.maxRuntime = l10;
    }

    public void setRecoveryThreshold(@Nullable Long l10) {
        this.recoveryThreshold = l10;
    }

    public void setSchedule(@NotNull MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
    }

    public void setTimezone(@Nullable String str) {
        this.timezone = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
