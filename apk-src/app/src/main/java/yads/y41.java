package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y41 {
    public static boolean a(w41 w41Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(w41Var.f44275c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !w41Var.f44278f;
    }
}
