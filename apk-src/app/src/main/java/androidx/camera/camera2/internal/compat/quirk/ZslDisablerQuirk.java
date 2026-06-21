package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import g0.w1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f1251a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f1252b = Arrays.asList("MI 8");

    public static boolean e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
