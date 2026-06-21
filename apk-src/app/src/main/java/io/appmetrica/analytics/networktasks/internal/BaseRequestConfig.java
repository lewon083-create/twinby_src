package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SdkEnvironment f25304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f25305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppSetId f25306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f25307e;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f25308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f25309b;

        public ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f25308a = context;
            this.f25309b = str;
        }

        @NonNull
        public abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f25308a;
        }

        @NonNull
        public String getPackageName() {
            return this.f25309b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public T load(@NonNull D d10) {
            T t10 = (T) createBlankConfig();
            t10.setSdkIdentifiers(d10.sdkIdentifiers);
            t10.setSdkEnvironment(d10.sdkEnvironmentProvider.getSdkEnvironment());
            t10.setAppSetId(d10.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t10.setPackageName(this.f25309b);
            return t10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class DataSource<A> {

        @NonNull
        public final A componentArguments;

        @NonNull
        public final PlatformIdentifiers platformIdentifiers;

        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;

        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a10) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a10;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d10);
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f25306d;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f25306d.getId();
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f25306d;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f25305c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f25305c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f25305c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f25305c.getDeviceId();
        }
        return deviceId;
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f25304b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f25303a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f25307e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f25304b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    @NonNull
    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f25305c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f25305c.getUuid();
        }
        return uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isIdentifiersValid() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers r0 = r2.f25305c     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.getUuid()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L12
            goto L30
        L12:
            java.lang.String r1 = r0.getDeviceId()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L1f
            goto L30
        L1f:
            java.lang.String r0 = r0.getDeviceIdHash()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            r0 = 1
            goto L31
        L2e:
            r0 = move-exception
            goto L33
        L30:
            r0 = 0
        L31:
            monitor-exit(r2)
            return r0
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.isIdentifiersValid():boolean");
    }

    public void setAppSetId(@NonNull AppSetId appSetId) {
        this.f25306d = appSetId;
    }

    public void setPackageName(String str) {
        this.f25303a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f25307e = retryPolicyConfig;
    }

    public void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f25304b = sdkEnvironment;
    }

    public void setSdkIdentifiers(SdkIdentifiers sdkIdentifiers) {
        this.f25305c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f25303a + "', sdkEnvironment=" + this.f25304b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f25305c + ", retryPolicyConfig=" + this.f25307e + '}';
    }
}
