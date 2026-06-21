package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.om1;
import io.sentry.BackfillingEventProcessor;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.ProfileChunk;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryExceptionFactory;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanContext;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.anr.AnrCulpritIdentifier;
import io.sentry.android.core.anr.AnrProfile;
import io.sentry.android.core.anr.StackTraceConverter;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.cache.PersistingOptionsObserver;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.protocol.profiling.SentryProfile;
import io.sentry.util.HintUtils;
import io.sentry.util.SentryRandom;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationExitInfoEventProcessor implements BackfillingEventProcessor {

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @NotNull
    private final Context context;

    @NotNull
    private final List<HintEnricher> hintEnrichers = Collections.singletonList(new AnrHintEnricher());

    @NotNull
    private final SentryAndroidOptions options;

    @Nullable
    private final PersistingScopeObserver persistingScopeObserver;

    @NotNull
    private final SentryExceptionFactory sentryExceptionFactory;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public final class AnrHintEnricher implements HintEnricher {
        private AnrHintEnricher() {
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void applyAnrProfile(@org.jetbrains.annotations.NotNull io.sentry.SentryEvent r10, @org.jetbrains.annotations.NotNull io.sentry.hints.Backfillable r11, boolean r12) {
            /*
                Method dump skipped, instruction units count: 389
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ApplicationExitInfoEventProcessor.AnrHintEnricher.applyAnrProfile(io.sentry.SentryEvent, io.sentry.hints.Backfillable, boolean):void");
        }

        @Nullable
        private SentryId captureAnrProfile(long j10, @NotNull AnrProfile anrProfile) {
            SentryProfile sentryProfileConvert = StackTraceConverter.convert(anrProfile);
            ProfileChunk profileChunk = new ProfileChunk(new SentryId(), new SentryId(), null, new HashMap(0), Double.valueOf(j10 / 1000.0d), "java", ApplicationExitInfoEventProcessor.this.options);
            profileChunk.setSentryProfile(sentryProfileConvert);
            if (SentryId.EMPTY_ID.equals(Sentry.getCurrentScopes().captureProfileChunk(profileChunk))) {
                return null;
            }
            return profileChunk.getProfilerId();
        }

        @Nullable
        private SentryThread findMainThread(@Nullable List<SentryThread> list) {
            if (list == null) {
                return null;
            }
            for (SentryThread sentryThread : list) {
                String name = sentryThread.getName();
                if (name != null && name.equals(SentryThread.JsonKeys.MAIN)) {
                    return sentryThread;
                }
            }
            return null;
        }

        private boolean hasOnlySystemFrames(@NotNull SentryEvent sentryEvent) {
            List<SentryStackFrame> frames;
            List<SentryException> exceptions = sentryEvent.getExceptions();
            if (exceptions == null || exceptions.isEmpty()) {
                return false;
            }
            Iterator<SentryException> it = exceptions.iterator();
            while (it.hasNext()) {
                SentryStackTrace stacktrace = it.next().getStacktrace();
                if (stacktrace != null && (frames = stacktrace.getFrames()) != null && !frames.isEmpty()) {
                    for (SentryStackFrame sentryStackFrame : frames) {
                        if (sentryStackFrame.isInApp() != null && sentryStackFrame.isInApp().booleanValue()) {
                            return false;
                        }
                        String module = sentryStackFrame.getModule();
                        if (module != null && !AnrCulpritIdentifier.isSystemFrame(module)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private boolean isBackgroundAnr(@NotNull Object obj) {
            if (obj instanceof AbnormalExit) {
                return "anr_background".equals(((AbnormalExit) obj).mechanism());
            }
            return false;
        }

        private void setAnrExceptions(@NotNull SentryEvent sentryEvent, @NotNull Backfillable backfillable, boolean z5) {
            if (sentryEvent.getExceptions() != null) {
                return;
            }
            Mechanism mechanism = new Mechanism();
            if (backfillable.shouldEnrich()) {
                mechanism.setType("AppExitInfo");
            } else {
                mechanism.setType("HistoricalAppExitInfo");
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(z5 ? "Background ANR" : AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL, Thread.currentThread());
            SentryThread sentryThreadFindMainThread = findMainThread(sentryEvent.getThreads());
            if (sentryThreadFindMainThread == null) {
                sentryThreadFindMainThread = new SentryThread();
                sentryThreadFindMainThread.setStacktrace(new SentryStackTrace());
            }
            sentryEvent.setExceptions(ApplicationExitInfoEventProcessor.this.sentryExceptionFactory.getSentryExceptionsFromThread(sentryThreadFindMainThread, mechanism, applicationNotResponding));
        }

        private void setAppForeground(@NotNull SentryBaseEvent sentryBaseEvent, boolean z5) {
            App app = sentryBaseEvent.getContexts().getApp();
            if (app == null) {
                app = new App();
                sentryBaseEvent.getContexts().setApp(app);
            }
            if (app.getInForeground() == null) {
                app.setInForeground(Boolean.valueOf(z5));
            }
        }

        private void setDefaultAnrFingerprint(@NotNull SentryEvent sentryEvent, boolean z5) {
            if (sentryEvent.getFingerprints() != null) {
                return;
            }
            if (ApplicationExitInfoEventProcessor.this.options.isEnableAnrFingerprinting() && hasOnlySystemFrames(sentryEvent)) {
                sentryEvent.setFingerprints(Arrays.asList("system-frames-only-anr", z5 ? "background-anr" : "foreground-anr"));
            } else {
                sentryEvent.setFingerprints(Arrays.asList("{{ default }}", z5 ? "background-anr" : "foreground-anr"));
            }
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public void applyPostEnrichment(@NotNull SentryEvent sentryEvent, @NotNull Backfillable backfillable, @NotNull Object obj) {
            boolean zIsBackgroundAnr = isBackgroundAnr(obj);
            if (ApplicationExitInfoEventProcessor.this.options.isAnrProfilingEnabled()) {
                applyAnrProfile(sentryEvent, backfillable, zIsBackgroundAnr);
            }
            setDefaultAnrFingerprint(sentryEvent, zIsBackgroundAnr);
            setAppForeground(sentryEvent, !zIsBackgroundAnr);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public void applyPreEnrichment(@NotNull SentryEvent sentryEvent, @NotNull Backfillable backfillable, @NotNull Object obj) {
            boolean zIsBackgroundAnr = isBackgroundAnr(obj);
            ApplicationExitInfoEventProcessor.this.setDefaultPlatform(sentryEvent);
            setAnrExceptions(sentryEvent, backfillable, zIsBackgroundAnr);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public boolean supports(@NotNull Object obj) {
            return obj instanceof AbnormalExit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface HintEnricher {
        void applyPostEnrichment(@NotNull SentryEvent sentryEvent, @NotNull Backfillable backfillable, @NotNull Object obj);

        void applyPreEnrichment(@NotNull SentryEvent sentryEvent, @NotNull Backfillable backfillable, @NotNull Object obj);

        boolean supports(@NotNull Object obj);
    }

    public ApplicationExitInfoEventProcessor(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull BuildInfoProvider buildInfoProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.options = sentryAndroidOptions;
        this.buildInfoProvider = buildInfoProvider;
        this.persistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
        this.sentryExceptionFactory = new SentryExceptionFactory(new SentryStackTraceFactory(sentryAndroidOptions));
    }

    private void backfillOptions(@NotNull SentryEvent sentryEvent) {
        setRelease(sentryEvent);
        setEnvironment(sentryEvent);
        setDist(sentryEvent);
        setDebugMeta(sentryEvent);
        setSdk(sentryEvent);
        setApp(sentryEvent);
        setOptionsTags(sentryEvent);
    }

    private void backfillScope(@NotNull SentryEvent sentryEvent) {
        setRequest(sentryEvent);
        setUser(sentryEvent);
        setScopeTags(sentryEvent);
        setBreadcrumbs(sentryEvent);
        setExtras(sentryEvent);
        setContexts(sentryEvent);
        setTransaction(sentryEvent);
        setFingerprints(sentryEvent);
        setLevel(sentryEvent);
        setTrace(sentryEvent);
        setReplayId(sentryEvent);
    }

    @Nullable
    private HintEnricher findEnricher(@NotNull Object obj) {
        for (HintEnricher hintEnricher : this.hintEnrichers) {
            if (hintEnricher.supports(obj)) {
                return hintEnricher;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    private Device getDevice() {
        Device device = new Device();
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(ContextUtils.getFamily(this.options.getLogger()));
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setArchs(ContextUtils.getArchitectures());
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(this.context, this.options.getLogger());
        if (memInfo != null) {
            device.setMemorySize(getMemorySize(memInfo));
        }
        device.setSimulator(this.buildInfoProvider.isEmulator());
        DisplayMetrics displayMetrics = ContextUtils.getDisplayMetrics(this.context, this.options.getLogger());
        if (displayMetrics != null) {
            device.setScreenWidthPixels(Integer.valueOf(displayMetrics.widthPixels));
            device.setScreenHeightPixels(Integer.valueOf(displayMetrics.heightPixels));
            device.setScreenDensity(Float.valueOf(displayMetrics.density));
            device.setScreenDpi(Integer.valueOf(displayMetrics.densityDpi));
        }
        if (device.getId() == null) {
            device.setId(getDeviceId());
        }
        List<Integer> maxFrequencies = CpuInfoUtils.getInstance().readMaxFrequencies();
        if (!maxFrequencies.isEmpty()) {
            device.setProcessorFrequency(Double.valueOf(((Integer) Collections.max(maxFrequencies)).doubleValue()));
            device.setProcessorCount(Integer.valueOf(maxFrequencies.size()));
        }
        return device;
    }

    @Nullable
    private String getDeviceId() {
        try {
            return Installation.id(this.context);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    @NotNull
    private Long getMemorySize(@NotNull ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private void mergeOS(@NotNull SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        sentryBaseEvent.getContexts().setOperatingSystem(DeviceInfoUtil.getInstance(this.context, this.options).getOperatingSystem());
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            if (name == null || name.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + name.trim().toLowerCase(Locale.ROOT);
            }
            sentryBaseEvent.getContexts().put(str, operatingSystem);
        }
    }

    private void mergeUser(@NotNull SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getId() == null) {
            user.setId(getDeviceId());
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    @Nullable
    private <T> T readFromDisk(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls) {
        PersistingScopeObserver persistingScopeObserver = this.persistingScopeObserver;
        if (persistingScopeObserver == null) {
            return null;
        }
        return (T) persistingScopeObserver.read(sentryOptions, str, cls);
    }

    private boolean sampleReplay(@NotNull SentryEvent sentryEvent) {
        String str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.REPLAY_ERROR_SAMPLE_RATE_FILENAME, String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= SentryRandom.current().nextDouble()) {
                return true;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", sentryEvent.getEventId());
            return false;
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    private void setApp(@NotNull SentryBaseEvent sentryBaseEvent) {
        App app = sentryBaseEvent.getContexts().getApp();
        if (app == null) {
            app = new App();
        }
        app.setAppName(ContextUtils.getApplicationName(this.context));
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, this.buildInfoProvider);
        if (packageInfo != null) {
            app.setAppIdentifier(packageInfo.packageName);
        }
        String release = sentryBaseEvent.getRelease() != null ? sentryBaseEvent.getRelease() : (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class);
        if (release != null) {
            try {
                String strSubstring = release.substring(release.indexOf(64) + 1, release.indexOf(43));
                String strSubstring2 = release.substring(release.indexOf(43) + 1);
                app.setAppVersion(strSubstring);
                app.setAppBuild(strSubstring2);
            } catch (Throwable unused) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", release);
            }
        }
        try {
            ContextUtils.SplitApksInfo splitApksInfo = DeviceInfoUtil.getInstance(this.context, this.options).getSplitApksInfo();
            if (splitApksInfo != null) {
                app.setSplitApks(Boolean.valueOf(splitApksInfo.isSplitApks()));
                if (splitApksInfo.getSplitNames() != null) {
                    app.setSplitNames(Arrays.asList(splitApksInfo.getSplitNames()));
                }
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting split apks info.", th2);
        }
        sentryBaseEvent.getContexts().setApp(app);
    }

    private void setBreadcrumbs(@NotNull SentryBaseEvent sentryBaseEvent) {
        List<Breadcrumb> list = (List) readFromDisk(this.options, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
        if (list == null) {
            return;
        }
        if (sentryBaseEvent.getBreadcrumbs() == null) {
            sentryBaseEvent.setBreadcrumbs(list);
        } else {
            sentryBaseEvent.getBreadcrumbs().addAll(list);
        }
    }

    private void setContexts(@NotNull SentryBaseEvent sentryBaseEvent) {
        Contexts contexts = (Contexts) readFromDisk(this.options, PersistingScopeObserver.CONTEXTS_FILENAME, Contexts.class);
        if (contexts == null) {
            return;
        }
        Contexts contexts2 = sentryBaseEvent.getContexts();
        for (Map.Entry<String, Object> entry : new Contexts(contexts).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof SpanContext)) {
                if (!contexts2.containsKey(entry.getKey())) {
                    contexts2.put(entry.getKey(), value);
                }
            }
        }
    }

    private void setDebugMeta(@NotNull SentryBaseEvent sentryBaseEvent) {
        DebugMeta debugMeta = sentryBaseEvent.getDebugMeta();
        if (debugMeta == null) {
            debugMeta = new DebugMeta();
        }
        if (debugMeta.getImages() == null) {
            debugMeta.setImages(new ArrayList());
        }
        List<DebugImage> images = debugMeta.getImages();
        if (images != null) {
            String str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.PROGUARD_UUID_FILENAME, String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                images.add(debugImage);
            }
            sentryBaseEvent.setDebugMeta(debugMeta);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPlatform(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform("java");
        }
    }

    private void setDevice(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            sentryBaseEvent.getContexts().setDevice(getDevice());
        }
    }

    private void setDist(@NotNull SentryBaseEvent sentryBaseEvent) {
        String str;
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist((String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.DIST_FILENAME, String.class));
        }
        if (sentryBaseEvent.getDist() != null || (str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class)) == null) {
            return;
        }
        try {
            sentryBaseEvent.setDist(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void setEnvironment(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            String environment = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.ENVIRONMENT_FILENAME, String.class);
            if (environment == null) {
                environment = this.options.getEnvironment();
            }
            sentryBaseEvent.setEnvironment(environment);
        }
    }

    private void setExtras(@NotNull SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) readFromDisk(this.options, PersistingScopeObserver.EXTRAS_FILENAME, Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getExtras() == null) {
            sentryBaseEvent.setExtras(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getExtras().containsKey(entry.getKey())) {
                sentryBaseEvent.getExtras().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void setFingerprints(@NotNull SentryEvent sentryEvent) {
        List<String> list = (List) readFromDisk(this.options, PersistingScopeObserver.FINGERPRINT_FILENAME, List.class);
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(list);
        }
    }

    private void setLevel(@NotNull SentryEvent sentryEvent) {
        SentryLevel sentryLevel = (SentryLevel) readFromDisk(this.options, PersistingScopeObserver.LEVEL_FILENAME, SentryLevel.class);
        if (sentryEvent.getLevel() == null) {
            sentryEvent.setLevel(sentryLevel);
        }
    }

    private void setOptionsTags(@NotNull SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) PersistingOptionsObserver.read(this.options, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void setRelease(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease((String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class));
        }
    }

    private void setReplayId(@NotNull SentryEvent sentryEvent) {
        String str = (String) readFromDisk(this.options, PersistingScopeObserver.REPLAY_FILENAME, String.class);
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            return;
        }
        if (!new File(cacheDirPath, om1.k("replay_", str)).exists()) {
            if (!sampleReplay(sentryEvent)) {
                return;
            }
            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= sentryEvent.getTimestamp().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        PersistingScopeObserver.store(this.options, str, PersistingScopeObserver.REPLAY_FILENAME);
        sentryEvent.getContexts().put("replay_id", str);
    }

    private void setRequest(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRequest() == null) {
            sentryBaseEvent.setRequest((Request) readFromDisk(this.options, PersistingScopeObserver.REQUEST_FILENAME, Request.class));
        }
    }

    private void setScopeTags(@NotNull SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) readFromDisk(this.options, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void setSdk(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk((SdkVersion) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.SDK_VERSION_FILENAME, SdkVersion.class));
        }
    }

    private void setSideLoadedInfo(@NotNull SentryBaseEvent sentryBaseEvent) {
        try {
            ContextUtils.SideLoadedInfo sideLoadedInfo = DeviceInfoUtil.getInstance(this.context, this.options).getSideLoadedInfo();
            if (sideLoadedInfo != null) {
                for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                    sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void setStaticValues(@NotNull SentryEvent sentryEvent) {
        mergeUser(sentryEvent);
        setSideLoadedInfo(sentryEvent);
    }

    private void setTrace(@NotNull SentryEvent sentryEvent) {
        SpanContext spanContext = (SpanContext) readFromDisk(this.options, PersistingScopeObserver.TRACE_FILENAME, SpanContext.class);
        if (sentryEvent.getContexts().getTrace() != null || spanContext == null) {
            return;
        }
        sentryEvent.getContexts().setTrace(spanContext);
    }

    private void setTransaction(@NotNull SentryEvent sentryEvent) {
        String str = (String) readFromDisk(this.options, PersistingScopeObserver.TRANSACTION_FILENAME, String.class);
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(str);
        }
    }

    private void setUser(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getUser() == null) {
            sentryBaseEvent.setUser((User) readFromDisk(this.options, PersistingScopeObserver.USER_FILENAME, User.class));
        }
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 12000L;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (!(sentrySdkHint instanceof Backfillable)) {
            this.options.getLogger().log(SentryLevel.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return sentryEvent;
        }
        Backfillable backfillable = (Backfillable) sentrySdkHint;
        HintEnricher hintEnricherFindEnricher = findEnricher(sentrySdkHint);
        if (hintEnricherFindEnricher != null) {
            hintEnricherFindEnricher.applyPreEnrichment(sentryEvent, backfillable, sentrySdkHint);
        }
        mergeOS(sentryEvent);
        setDevice(sentryEvent);
        if (!backfillable.shouldEnrich()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return sentryEvent;
        }
        backfillScope(sentryEvent);
        backfillOptions(sentryEvent);
        setStaticValues(sentryEvent);
        if (hintEnricherFindEnricher != null) {
            hintEnricherFindEnricher.applyPostEnrichment(sentryEvent, backfillable, sentrySdkHint);
        }
        return sentryEvent;
    }
}
