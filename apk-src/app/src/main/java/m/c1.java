package m;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28173c;

    public /* synthetic */ c1(int i, Object obj) {
        this.f28172b = i;
        this.f28173c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        switch (this.f28172b) {
            case 0:
                d1 d1Var = (d1) this.f28173c;
                d1Var.f28188m = null;
                d1Var.drawableStateChanged();
                break;
            case 1:
                p1 p1Var = (p1) this.f28173c;
                View anchorView = p1Var.getAnchorView();
                if (anchorView != null && anchorView.getWindowToken() != null) {
                    p1Var.show();
                    break;
                }
                break;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.f28173c).f1186b;
                if (actionMenuView != null && (jVar = actionMenuView.f1121t) != null) {
                    jVar.k();
                    break;
                }
                break;
        }
    }
}
