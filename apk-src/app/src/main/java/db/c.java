package db;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15737a;

    static {
        f15737a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
