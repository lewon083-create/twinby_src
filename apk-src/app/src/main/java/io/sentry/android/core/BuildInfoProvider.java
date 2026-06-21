package io.sentry.android.core;

import android.os.Build;
import io.sentry.ILogger;
import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class BuildInfoProvider {

    @NotNull
    final ILogger logger;

    public BuildInfoProvider(@NotNull ILogger iLogger) {
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The ILogger object is required.");
    }

    @Nullable
    public String getBuildTags() {
        return Build.TAGS;
    }

    @Nullable
    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    @Nullable
    public String getModel() {
        return Build.MODEL;
    }

    public int getSdkInfoVersion() {
        return Build.VERSION.SDK_INT;
    }

    @Nullable
    public String getVersionRelease() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean isEmulator() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            goto L18
        L15:
            r0 = move-exception
            goto L9d
        L18:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L15
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = "unknown"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "goldfish"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "ranchu"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Emulator"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "Genymotion"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "sdk_google"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L95
            goto L97
        L95:
            r0 = 0
            goto L98
        L97:
            r0 = 1
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L9d:
            io.sentry.ILogger r1 = r4.logger
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR
            java.lang.String r3 = "Error checking whether application is running in an emulator."
            r1.log(r2, r3, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.BuildInfoProvider.isEmulator():java.lang.Boolean");
    }
}
