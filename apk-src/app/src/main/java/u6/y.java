package u6;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f34306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f34307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f34308c;

    static {
        int i = Build.VERSION.SDK_INT;
        f34306a = true;
        f34307b = true;
        f34308c = i >= 28;
    }
}
