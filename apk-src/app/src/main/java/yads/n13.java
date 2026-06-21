package yads;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n13 {
    public static final float a(j13 j13Var, RectF rectF, RectF rectF2) {
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float fHeight2 = rectF2.height();
        float fWidth2 = rectF2.width();
        if (fHeight == 0.0f || fWidth == 0.0f || fHeight2 == 0.0f || fWidth2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float fMin = Math.min(1.0f, fWidth2 / fHeight2 > fWidth / fHeight ? fHeight / fHeight2 : fWidth / fWidth2);
        float f10 = j13Var.f39700c * fMin;
        if (fWidth < ((int) f10) || fHeight < ((int) (j13Var.f39701d * fMin))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(fHeight - (j13Var.f39701d * fMin)) + Math.abs(fWidth - f10);
    }
}
