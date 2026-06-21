package n2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public abstract boolean b(View view, int i);

    public abstract int clampViewPositionHorizontal(View view, int i, int i10);

    public abstract int clampViewPositionVertical(View view, int i, int i10);

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i) {
        return false;
    }

    public abstract void onViewDragStateChanged(int i);

    public abstract void onViewPositionChanged(View view, int i, int i10, int i11, int i12);

    public abstract void onViewReleased(View view, float f10, float f11);

    public int getOrderedChildIndex(int i) {
        return i;
    }

    public void a(int i, int i10) {
    }

    public void onEdgeTouched(int i, int i10) {
    }

    public void onViewCaptured(View view, int i) {
    }
}
