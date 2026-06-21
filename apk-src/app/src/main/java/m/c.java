package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f28167c;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f28166b = i;
        this.f28167c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28166b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f28167c;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1113u = actionBarOverlayLayout.f1097d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1114v);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f28167c;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1113u = actionBarOverlayLayout2.f1097d.animate().translationY(-actionBarOverlayLayout2.f1097d.getHeight()).setListener(actionBarOverlayLayout2.f1114v);
                break;
        }
    }
}
