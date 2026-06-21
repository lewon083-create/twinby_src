package k6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27170b;

    public final void a(androidx.recyclerview.widget.p pVar) {
        View view = pVar.itemView;
        this.f27169a = view.getLeft();
        this.f27170b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
