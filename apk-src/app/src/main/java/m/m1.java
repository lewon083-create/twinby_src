package m;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f28298a;

    public m1(p1 p1Var) {
        this.f28298a = p1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            p1 p1Var = this.f28298a;
            if (p1Var.isInputMethodNotNeeded() || p1Var.mPopup.getContentView() == null) {
                return;
            }
            p1Var.mHandler.removeCallbacks(p1Var.mResizePopupRunnable);
            p1Var.mResizePopupRunnable.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i10, int i11) {
    }
}
