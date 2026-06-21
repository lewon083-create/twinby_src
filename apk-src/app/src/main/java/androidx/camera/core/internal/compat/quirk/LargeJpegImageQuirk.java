package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import g0.w1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f1257a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f1258b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    public static boolean e() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND)) {
            return f1258b.contains(Build.MODEL.toUpperCase(Locale.US));
        }
        return false;
    }
}
