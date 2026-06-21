package io.sentry.android.core.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.cache.EnvelopeCache;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidEnvelopeCache extends EnvelopeCache {
    public static final String LAST_ANR_MARKER_LABEL = "ANR";
    public static final String LAST_ANR_REPORT = "last_anr_report";
    public static final String LAST_TOMBSTONE_MARKER_LABEL = "Tombstone";
    public static final String LAST_TOMBSTONE_REPORT = "last_tombstone_report";
    private static final List<TimestampMarkerHandler<?>> TIMESTAMP_MARKER_HANDLERS;

    @NotNull
    private final ICurrentDateProvider currentDateProvider;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class TimestampMarkerHandler<T> {

        @NotNull
        private final String label;

        @NotNull
        private final String reportFilename;

        @NotNull
        private final TimestampExtractor<T> timestampProvider;

        @NotNull
        private final Class<T> type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public interface TimestampExtractor<T> {
            @NotNull
            Long extract(T t10);
        }

        public TimestampMarkerHandler(@NotNull Class<T> cls, @NotNull String str, @NotNull String str2, @NotNull TimestampExtractor<T> timestampExtractor) {
            this.type = cls;
            this.label = str;
            this.reportFilename = str2;
            this.timestampProvider = timestampExtractor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handle$0(SentryAndroidOptions sentryAndroidOptions, AndroidEnvelopeCache androidEnvelopeCache, Object obj) {
            Long lExtract = this.timestampProvider.extract(obj);
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Writing last reported %s marker with timestamp %d", this.label, lExtract);
            androidEnvelopeCache.writeLastReportedMarker(lExtract, this.reportFilename, this.label);
        }

        public void handle(@NotNull final AndroidEnvelopeCache androidEnvelopeCache, @NotNull Hint hint, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
            HintUtils.runIfHasType(hint, this.type, new HintUtils.SentryConsumer() { // from class: io.sentry.android.core.cache.b
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    this.f25894b.lambda$handle$0(sentryAndroidOptions, androidEnvelopeCache, obj);
                }
            });
        }
    }

    static {
        final int i = 0;
        final int i10 = 1;
        TIMESTAMP_MARKER_HANDLERS = Arrays.asList(new TimestampMarkerHandler(AnrV2Integration.AnrV2Hint.class, LAST_ANR_MARKER_LABEL, LAST_ANR_REPORT, new TimestampMarkerHandler.TimestampExtractor() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.android.core.cache.AndroidEnvelopeCache.TimestampMarkerHandler.TimestampExtractor
            public final Long extract(Object obj) {
                switch (i) {
                    case 0:
                        return ((AnrV2Integration.AnrV2Hint) obj).timestamp();
                    default:
                        return ((TombstoneIntegration.TombstoneHint) obj).timestamp();
                }
            }
        }), new TimestampMarkerHandler(TombstoneIntegration.TombstoneHint.class, LAST_TOMBSTONE_MARKER_LABEL, LAST_TOMBSTONE_REPORT, new TimestampMarkerHandler.TimestampExtractor() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.android.core.cache.AndroidEnvelopeCache.TimestampMarkerHandler.TimestampExtractor
            public final Long extract(Object obj) {
                switch (i10) {
                    case 0:
                        return ((AnrV2Integration.AnrV2Hint) obj).timestamp();
                    default:
                        return ((TombstoneIntegration.TombstoneHint) obj).timestamp();
                }
            }
        }));
    }

    public AndroidEnvelopeCache(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, AndroidCurrentDateProvider.getInstance());
    }

    public static boolean hasStartupCrashMarker(@NotNull SentryOptions sentryOptions) {
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, EnvelopeCache.STARTUP_CRASH_MARKER_FILE);
        try {
            boolean zExists = file.exists();
            if (!zExists || file.delete()) {
                return zExists;
            }
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zExists;
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    @Nullable
    public static Long lastReportedAnr(@NotNull SentryOptions sentryOptions) {
        return lastReportedMarker(sentryOptions, LAST_ANR_REPORT, LAST_ANR_MARKER_LABEL);
    }

    @Nullable
    private static Long lastReportedMarker(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull String str2) {
        File file = new File((String) Objects.requireNonNull(sentryOptions.getCacheDirPath(), "Cache dir path should be set for getting " + str2 + "s reported"), str);
        try {
            String text = FileUtils.readText(file);
            if (text != null && !text.equals("null")) {
                return Long.valueOf(Long.parseLong(text.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, pe.a.f("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
            } else {
                sentryOptions.getLogger().log(SentryLevel.ERROR, pe.a.f("Error reading last ", str2, " marker"), th2);
            }
            return null;
        }
    }

    @Nullable
    public static Long lastReportedTombstone(@NotNull SentryOptions sentryOptions) {
        return lastReportedMarker(sentryOptions, LAST_TOMBSTONE_REPORT, LAST_TOMBSTONE_MARKER_LABEL);
    }

    private boolean storeInternalAndroid(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        boolean zStoreEnvelope = super.storeEnvelope(sentryEnvelope, hint);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.options;
        TimeSpan sdkInitTimeSpan = AppStartMetrics.getInstance().getSdkInitTimeSpan();
        if (HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class) && sdkInitTimeSpan.hasStarted()) {
            long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis() - sdkInitTimeSpan.getStartUptimeMs();
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                writeStartupCrashMarkerFile();
            }
        }
        Iterator<TimestampMarkerHandler<?>> it = TIMESTAMP_MARKER_HANDLERS.iterator();
        while (it.hasNext()) {
            it.next().handle(this, hint, sentryAndroidOptions);
        }
        return zStoreEnvelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeLastReportedMarker(@Nullable Long l10, @NotNull String str, @NotNull String str2) {
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, pe.a.f("Cache dir path is null, the ", str2, " marker will not be written"), new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(UTF_8));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, pe.a.f("Error writing the ", str2, " marker to the disk"), th2);
        }
    }

    private void writeStartupCrashMarkerFile() {
        String outboxPath = this.options.getOutboxPath();
        if (outboxPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, EnvelopeCache.STARTUP_CRASH_MARKER_FILE).createNewFile();
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @NotNull
    public File getDirectory() {
        return this.directory;
    }

    @Override // io.sentry.cache.EnvelopeCache, io.sentry.cache.IEnvelopeCache
    public void store(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        storeInternalAndroid(sentryEnvelope, hint);
    }

    @Override // io.sentry.cache.EnvelopeCache, io.sentry.cache.IEnvelopeCache
    public boolean storeEnvelope(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        return storeInternalAndroid(sentryEnvelope, hint);
    }

    public AndroidEnvelopeCache(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ICurrentDateProvider iCurrentDateProvider) {
        super(sentryAndroidOptions, (String) Objects.requireNonNull(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.currentDateProvider = iCurrentDateProvider;
    }
}
