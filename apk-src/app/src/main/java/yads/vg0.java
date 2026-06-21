package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg0 {
    public static File a(Context context, String str) {
        return new File(gf.a.k(context.getCacheDir().getPath(), File.separator, str));
    }
}
