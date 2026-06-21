package androidx.camera.core.impl.utils;

import android.view.Surface;
import fh.of;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static of a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        of ofVar = new of();
        int i = iArrNativeGetSurfaceInfo[0];
        int i10 = iArrNativeGetSurfaceInfo[1];
        int i11 = iArrNativeGetSurfaceInfo[2];
        return ofVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
