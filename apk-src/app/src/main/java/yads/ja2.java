package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ja2 implements ha2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f39796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f39797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedCallback f39798c = new a6.n(2, this);

    public ja2(Activity activity, w1 w1Var) {
        this.f39796a = activity;
        this.f39797b = w1Var;
    }

    public static final void a(ja2 ja2Var) {
        w1 w1Var = ja2Var.f39797b;
        if (w1Var == null || !w1Var.f44249c.d()) {
            return;
        }
        ja2Var.f39796a.finish();
    }

    @Override // yads.ha2
    public final void destroy() {
        this.f39796a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f39798c);
    }

    @Override // yads.ha2
    public final void a() {
        this.f39796a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f39798c);
    }
}
