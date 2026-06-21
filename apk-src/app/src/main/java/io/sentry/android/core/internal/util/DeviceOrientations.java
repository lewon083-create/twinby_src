package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    @Nullable
    public static Device.DeviceOrientation getOrientation(int i) {
        if (i == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
