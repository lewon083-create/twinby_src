package yads;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tn2 {
    public static void a(h72 h72Var, wn2 wn2Var, Bitmap bitmap) {
        wn2Var.setAlpha(0.0f);
        wn2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new sn2(wn2Var, bitmap)).withEndAction(new rn2(h72Var, wn2Var)).start();
    }
}
