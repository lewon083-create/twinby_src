package yads;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zo3 {
    public static Rect a(View view) {
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i = -iArr[0];
        int i10 = -iArr[1];
        rect.offset(i, i10);
        return rect;
    }
}
