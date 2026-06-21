package m;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f28308b;

    public n1(p1 p1Var) {
        this.f28308b = p1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        p1 p1Var = this.f28308b;
        if (action == 0 && (popupWindow = p1Var.mPopup) != null && popupWindow.isShowing() && x10 >= 0 && x10 < p1Var.mPopup.getWidth() && y7 >= 0 && y7 < p1Var.mPopup.getHeight()) {
            p1Var.mHandler.postDelayed(p1Var.mResizePopupRunnable, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        p1Var.mHandler.removeCallbacks(p1Var.mResizePopupRunnable);
        return false;
    }
}
