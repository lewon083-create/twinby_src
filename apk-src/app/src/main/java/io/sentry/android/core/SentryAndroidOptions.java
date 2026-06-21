package io.sentry.android.core;

import android.app.Activity;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.Hint;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryFeedbackOptions;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryUserFeedbackForm;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.util.SampleRateUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAndroidOptions extends SentryOptions {

    @Nullable
    private Double anrProfilingSampleRate;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;

    @Nullable
    private BeforeCaptureCallback beforeScreenshotCaptureCallback;

    @Nullable
    private BeforeCaptureCallback beforeViewHierarchyCaptureCallback;

    @Nullable
    private SentryFrameMetricsCollector frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;

    @NotNull
    private IDebugImagesLoader debugImagesLoader = NoOpDebugImagesLoader.getInstance();
    private boolean collectAdditionalContext = true;
    private boolean collectExternalStorageContext = false;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;

    @Nullable
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;

    @NotNull
    private NdkHandlerStrategy ndkHandlerStrategy = NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean reportHistoricalTombstones = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;
    private boolean enableTombstone = false;

    @NotNull
    private final SentryScreenshotOptions screenshot = new SentryScreenshotOptions();
    private boolean enableAnrFingerprinting = true;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class AndroidUserFeedbackFormHandler implements SentryFeedbackOptions.IFormHandler {
        @Override // io.sentry.SentryFeedbackOptions.IFormHandler
        public void showForm(@Nullable SentryId sentryId, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
            Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity == null) {
                Sentry.getCurrentScopes().getOptions().getLogger().log(SentryLevel.ERROR, "Cannot show user feedback dialog, no activity is available. Make sure to call SentryAndroid.init() in your Application.onCreate() method.", new Object[0]);
            } else {
                new SentryUserFeedbackForm.Builder(activity).associatedEventId(sentryId).configurator(optionsConfigurator).create().show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeCaptureCallback {
        boolean execute(@NotNull SentryEvent sentryEvent, @NotNull Hint hint, boolean z5);
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.41.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    @NotNull
    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersionUpdateSdkVersion = SdkVersion.updateSdkVersion(getSdkVersion(), BuildConfig.SENTRY_ANDROID_SDK_NAME, "8.41.0");
        sdkVersionUpdateSdkVersion.addPackage("maven:io.sentry:sentry-android-core", "8.41.0");
        return sdkVersionUpdateSdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z5) {
        this.enableActivityLifecycleBreadcrumbs = z5;
        this.enableAppComponentBreadcrumbs = z5;
        this.enableSystemEventBreadcrumbs = z5;
        this.enableAppLifecycleBreadcrumbs = z5;
        this.enableNetworkEventBreadcrumbs = z5;
        setEnableUserInteractionBreadcrumbs(z5);
    }

    @Nullable
    public Double getAnrProfilingSampleRate() {
        return this.anrProfilingSampleRate;
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    @Nullable
    public BeforeCaptureCallback getBeforeScreenshotCaptureCallback() {
        return this.beforeScreenshotCaptureCallback;
    }

    @Nullable
    public BeforeCaptureCallback getBeforeViewHierarchyCaptureCallback() {
        return this.beforeViewHierarchyCaptureCallback;
    }

    @NotNull
    public IDebugImagesLoader getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    @Nullable
    public SentryFrameMetricsCollector getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    @Nullable
    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    @NotNull
    public SentryScreenshotOptions getScreenshot() {
        return this.screenshot;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrProfilingEnabled() {
        Double d10 = this.anrProfilingSampleRate;
        return d10 != null && d10.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isCollectExternalStorageContext() {
        return this.collectExternalStorageContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAnrFingerprinting() {
        return this.enableAnrFingerprinting;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public boolean isReportHistoricalTombstones() {
        return this.reportHistoricalTombstones;
    }

    public boolean isTombstoneEnabled() {
        return this.enableTombstone;
    }

    public void setAnrEnabled(boolean z5) {
        this.anrEnabled = z5;
    }

    public void setAnrProfilingSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.anrProfilingSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setAnrReportInDebug(boolean z5) {
        this.anrReportInDebug = z5;
    }

    public void setAnrTimeoutIntervalMillis(long j10) {
        this.anrTimeoutIntervalMillis = j10;
    }

    public void setAttachAnrThreadDump(boolean z5) {
        this.attachAnrThreadDump = z5;
    }

    public void setAttachScreenshot(boolean z5) {
        this.attachScreenshot = z5;
    }

    public void setAttachViewHierarchy(boolean z5) {
        this.attachViewHierarchy = z5;
    }

    public void setBeforeScreenshotCaptureCallback(@NotNull BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeScreenshotCaptureCallback = beforeCaptureCallback;
    }

    public void setBeforeViewHierarchyCaptureCallback(@NotNull BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeViewHierarchyCaptureCallback = beforeCaptureCallback;
    }

    public void setCollectAdditionalContext(boolean z5) {
        this.collectAdditionalContext = z5;
    }

    public void setCollectExternalStorageContext(boolean z5) {
        this.collectExternalStorageContext = z5;
    }

    public void setDebugImagesLoader(@NotNull IDebugImagesLoader iDebugImagesLoader) {
        if (iDebugImagesLoader == null) {
            iDebugImagesLoader = NoOpDebugImagesLoader.getInstance();
        }
        this.debugImagesLoader = iDebugImagesLoader;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z5) {
        this.enableActivityLifecycleBreadcrumbs = z5;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z5) {
        this.enableActivityLifecycleTracingAutoFinish = z5;
    }

    public void setEnableAnrFingerprinting(boolean z5) {
        this.enableAnrFingerprinting = z5;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z5) {
        this.enableAppComponentBreadcrumbs = z5;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z5) {
        this.enableAppLifecycleBreadcrumbs = z5;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z5) {
        this.enableAutoActivityLifecycleTracing = z5;
    }

    public void setEnableAutoTraceIdGeneration(boolean z5) {
        this.enableAutoTraceIdGeneration = z5;
    }

    public void setEnableFramesTracking(boolean z5) {
        this.enableFramesTracking = z5;
    }

    public void setEnableNdk(boolean z5) {
        this.enableNdk = z5;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z5) {
        this.enableNetworkEventBreadcrumbs = z5;
    }

    public void setEnablePerformanceV2(boolean z5) {
        this.enablePerformanceV2 = z5;
    }

    public void setEnableRootCheck(boolean z5) {
        this.enableRootCheck = z5;
    }

    public void setEnableScopeSync(boolean z5) {
        this.enableScopeSync = z5;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z5) {
        this.enableSystemEventBreadcrumbs = z5;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z5) {
        this.enableSystemEventBreadcrumbsExtras = z5;
    }

    public void setFrameMetricsCollector(@Nullable SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
    }

    public void setNativeHandlerStrategy(@NotNull NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }

    public void setNativeSdkName(@Nullable String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z5) {
        this.reportHistoricalAnrs = z5;
    }

    public void setReportHistoricalTombstones(boolean z5) {
        this.reportHistoricalTombstones = z5;
    }

    public void setStartupCrashFlushTimeoutMillis(long j10) {
        this.startupCrashFlushTimeoutMillis = j10;
    }

    public void setTombstoneEnabled(boolean z5) {
        this.enableTombstone = z5;
    }
}
