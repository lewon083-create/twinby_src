package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnrIntegrationFactory {
    @NotNull
    public static Integration create(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
