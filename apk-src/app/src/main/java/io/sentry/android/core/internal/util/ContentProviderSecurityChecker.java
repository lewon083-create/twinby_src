package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.NoOpLogger;
import io.sentry.android.core.BuildInfoProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ContentProviderSecurityChecker {

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    public ContentProviderSecurityChecker() {
        this(new BuildInfoProvider(NoOpLogger.getInstance()));
    }

    @SuppressLint({"NewApi"})
    public void checkPrivilegeEscalation(@NotNull ContentProvider contentProvider) {
        int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
        if (sdkInfoVersion < 26 || sdkInfoVersion > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public ContentProviderSecurityChecker(@NotNull BuildInfoProvider buildInfoProvider) {
        this.buildInfoProvider = buildInfoProvider;
    }
}
