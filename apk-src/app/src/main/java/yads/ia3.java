package yads;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ia3 {
    public static final int a(int i) {
        return i >= 0 ? yj.b.b(i / Resources.getSystem().getDisplayMetrics().density) : i;
    }
}
