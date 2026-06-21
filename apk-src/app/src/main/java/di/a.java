package di;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.i;
import j0.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15793b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f15794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f15795d;

    public a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f15794c = onFocusChangeListener;
        this.f15795d = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f15793b) {
            case 0:
                b bVar = (b) this.f15795d;
                this.f15794c.onFocusChange(bVar, g.U(bVar, new gg.b(5)));
                break;
            default:
                i iVar = (i) this.f15795d;
                this.f15794c.onFocusChange(iVar, g.U(iVar, new gg.b(5)));
                break;
        }
    }

    public a(i iVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f15795d = iVar;
        this.f15794c = onFocusChangeListener;
    }
}
