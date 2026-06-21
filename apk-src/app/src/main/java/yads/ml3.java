package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ml3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f40956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f40957b;

    public ml3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f40956a = onPreDrawListener;
        this.f40957b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f40956a.onPreDraw();
        this.f40957b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
