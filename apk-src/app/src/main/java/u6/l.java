package u6;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) ((rect2.left - r0) * f10)), rect.top + ((int) ((rect2.top - r1) * f10)), rect.right + ((int) ((rect2.right - r2) * f10)), rect.bottom + ((int) ((rect2.bottom - r6) * f10)));
    }
}
