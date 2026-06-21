package yads;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f37542b;

    public cw3(gw3 gw3Var) {
        this.f37542b = gw3Var.f38928g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37542b.destroy();
    }
}
