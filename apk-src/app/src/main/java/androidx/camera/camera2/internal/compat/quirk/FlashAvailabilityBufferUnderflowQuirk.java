package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import g0.w1;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f1229a;

    static {
        HashSet hashSet = new HashSet();
        f1229a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
