package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NdkIntegration implements Integration, Closeable {
    public static final String SENTRY_NDK_CLASS_NAME = "io.sentry.android.ndk.SentryNdk";

    @Nullable
    private SentryAndroidOptions options;

    @Nullable
    private final Class<?> sentryNdkClass;

    public NdkIntegration(@Nullable Class<?> cls) {
        this.sentryNdkClass = cls;
    }

    private void disableNdkIntegration(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.sentryNdkClass;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.options.getLogger().log(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
                        disableNdkIntegration(this.options);
                    } catch (Throwable th2) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Failed to close SentryNdk.", th2);
                        disableNdkIntegration(this.options);
                    }
                } catch (NoSuchMethodException e3) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e3);
                    disableNdkIntegration(this.options);
                }
            }
        } catch (Throwable th3) {
            disableNdkIntegration(this.options);
            throw th3;
        }
    }

    @Nullable
    public Class<?> getSentryNdkClass() {
        return this.sentryNdkClass;
    }

    @Override // io.sentry.Integration
    public final void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.sentryNdkClass == null) {
            disableNdkIntegration(this.options);
            return;
        }
        if (this.options.getCacheDirPath() == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            disableNdkIntegration(this.options);
            return;
        }
        try {
            this.sentryNdkClass.getMethod(Session.JsonKeys.INIT, SentryAndroidOptions.class).invoke(null, this.options);
            this.options.getLogger().log(sentryLevel, "NdkIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("Ndk");
        } catch (NoSuchMethodException e3) {
            disableNdkIntegration(this.options);
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e3);
        } catch (Throwable th2) {
            disableNdkIntegration(this.options);
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
