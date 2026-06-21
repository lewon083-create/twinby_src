package io.sentry;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.protocol.SdkVersion;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.SampleRateUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryReplayOptions extends SentryMaskingOptions {
    private static final String CUSTOM_MASKING_INTEGRATION_NAME = "ReplayCustomMasking";

    @NotNull
    private static final List<String> DEFAULT_HEADERS = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public static final int MAX_NETWORK_BODY_SIZE = 153600;

    @Nullable
    private BeforeErrorSamplingCallback beforeErrorSampling;
    private boolean captureSurfaceViews;
    private volatile boolean customMaskingTracked;
    private boolean debug;
    private long errorReplayDuration;
    private int frameRate;
    private boolean networkCaptureBodies;

    @NotNull
    private List<String> networkDetailAllowUrls;

    @NotNull
    private List<String> networkDetailDenyUrls;

    @NotNull
    private List<String> networkRequestHeaders;

    @NotNull
    private List<String> networkResponseHeaders;

    @Nullable
    private Double onErrorSampleRate;
    private SentryReplayQuality quality;

    @NotNull
    private ScreenshotStrategyType screenshotStrategy;

    @Nullable
    private SdkVersion sdkVersion;
    private long sessionDuration;

    @Nullable
    private Double sessionSampleRate;
    private long sessionSegmentDuration;
    private boolean trackConfiguration;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeErrorSamplingCallback {
        boolean execute(@NotNull SentryEvent sentryEvent, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum SentryReplayQuality {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        SentryReplayQuality(float f10, int i, int i10) {
            this.sizeScale = f10;
            this.bitRate = i;
            this.screenshotQuality = i10;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public SentryReplayOptions(boolean z5, @Nullable SdkVersion sdkVersion) {
        this.customMaskingTracked = false;
        this.quality = SentryReplayQuality.MEDIUM;
        this.frameRate = 1;
        this.errorReplayDuration = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.sessionSegmentDuration = 5000L;
        this.sessionDuration = 3600000L;
        this.trackConfiguration = true;
        this.debug = false;
        this.screenshotStrategy = ScreenshotStrategyType.PIXEL_COPY;
        this.captureSurfaceViews = false;
        List<String> list = Collections.EMPTY_LIST;
        this.networkDetailAllowUrls = list;
        this.networkDetailDenyUrls = list;
        this.networkCaptureBodies = true;
        List<String> list2 = DEFAULT_HEADERS;
        this.networkRequestHeaders = list2;
        this.networkResponseHeaders = list2;
        if (z5) {
            return;
        }
        this.maskViewClasses.add(SentryMaskingOptions.TEXT_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.IMAGE_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.WEB_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.VIDEO_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.CAMERAX_PREVIEW_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.EXOPLAYER_CLASS_NAME);
        this.maskViewClasses.add(SentryMaskingOptions.EXOPLAYER_STYLED_CLASS_NAME);
        this.sdkVersion = sdkVersion;
    }

    @NotNull
    public static List<String> getNetworkDetailsDefaultHeaders() {
        return DEFAULT_HEADERS;
    }

    @NotNull
    private static List<String> mergeHeaders(@NotNull List<String> list, @NotNull List<String> list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    @Override // io.sentry.SentryMaskingOptions
    public void addMaskViewClass(@NotNull String str) {
        trackCustomMasking();
        super.addMaskViewClass(str);
    }

    @Override // io.sentry.SentryMaskingOptions
    public void addUnmaskViewClass(@NotNull String str) {
        trackCustomMasking();
        super.addUnmaskViewClass(str);
    }

    @Nullable
    public BeforeErrorSamplingCallback getBeforeErrorSampling() {
        return this.beforeErrorSampling;
    }

    public long getErrorReplayDuration() {
        return this.errorReplayDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public List<String> getNetworkDetailAllowUrls() {
        return this.networkDetailAllowUrls;
    }

    @NotNull
    public List<String> getNetworkDetailDenyUrls() {
        return this.networkDetailDenyUrls;
    }

    @NotNull
    public List<String> getNetworkRequestHeaders() {
        return this.networkRequestHeaders;
    }

    @NotNull
    public List<String> getNetworkResponseHeaders() {
        return this.networkResponseHeaders;
    }

    @Nullable
    public Double getOnErrorSampleRate() {
        return this.onErrorSampleRate;
    }

    @NotNull
    public SentryReplayQuality getQuality() {
        return this.quality;
    }

    @NotNull
    public ScreenshotStrategyType getScreenshotStrategy() {
        return this.screenshotStrategy;
    }

    @Nullable
    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public long getSessionDuration() {
        return this.sessionDuration;
    }

    @Nullable
    public Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public long getSessionSegmentDuration() {
        return this.sessionSegmentDuration;
    }

    public boolean isCaptureSurfaceViews() {
        return this.captureSurfaceViews;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isNetworkCaptureBodies() {
        return this.networkCaptureBodies;
    }

    public boolean isSessionReplayEnabled() {
        return getSessionSampleRate() != null && getSessionSampleRate().doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public boolean isSessionReplayForErrorsEnabled() {
        return getOnErrorSampleRate() != null && getOnErrorSampleRate().doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public boolean isTrackConfiguration() {
        return this.trackConfiguration;
    }

    public void setBeforeErrorSampling(@Nullable BeforeErrorSamplingCallback beforeErrorSamplingCallback) {
        this.beforeErrorSampling = beforeErrorSamplingCallback;
    }

    public void setCaptureSurfaceViews(boolean z5) {
        this.captureSurfaceViews = z5;
    }

    public void setDebug(boolean z5) {
        this.debug = z5;
    }

    @Override // io.sentry.SentryMaskingOptions
    public void setMaskAllImages(boolean z5) {
        if (!z5) {
            trackCustomMasking();
        }
        super.setMaskAllImages(z5);
    }

    @Override // io.sentry.SentryMaskingOptions
    public void setMaskAllText(boolean z5) {
        if (!z5) {
            trackCustomMasking();
        }
        super.setMaskAllText(z5);
    }

    public void setNetworkCaptureBodies(boolean z5) {
        this.networkCaptureBodies = z5;
    }

    public void setNetworkDetailAllowUrls(@NotNull List<String> list) {
        this.networkDetailAllowUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public void setNetworkDetailDenyUrls(@NotNull List<String> list) {
        this.networkDetailDenyUrls = Collections.unmodifiableList(new ArrayList(list));
    }

    public void setNetworkRequestHeaders(@NotNull List<String> list) {
        this.networkRequestHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    public void setNetworkResponseHeaders(@NotNull List<String> list) {
        this.networkResponseHeaders = mergeHeaders(DEFAULT_HEADERS, list);
    }

    public void setOnErrorSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.onErrorSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setQuality(@NotNull SentryReplayQuality sentryReplayQuality) {
        this.quality = sentryReplayQuality;
    }

    public void setScreenshotStrategy(@NotNull ScreenshotStrategyType screenshotStrategyType) {
        this.screenshotStrategy = screenshotStrategyType;
    }

    public void setSdkVersion(@Nullable SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public void setSessionSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.sessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setTrackConfiguration(boolean z5) {
        this.trackConfiguration = z5;
    }

    @Override // io.sentry.SentryMaskingOptions
    public void trackCustomMasking() {
        if (this.customMaskingTracked) {
            return;
        }
        this.customMaskingTracked = true;
        IntegrationUtils.addIntegrationToSdkVersion(CUSTOM_MASKING_INTEGRATION_NAME);
    }

    public SentryReplayOptions(@Nullable Double d10, @Nullable Double d11, @Nullable SdkVersion sdkVersion) {
        this(false, sdkVersion);
        this.sessionSampleRate = d10;
        this.onErrorSampleRate = d11;
        this.sdkVersion = sdkVersion;
    }
}
