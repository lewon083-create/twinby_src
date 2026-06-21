package a6;

import android.window.OnBackInvokedCallback;
import yads.ja2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ n(int i, Object obj) {
        this.f475a = i;
        this.f476b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f475a) {
            case 0:
                ((l) this.f476b).a();
                break;
            case 1:
                ((Runnable) this.f476b).run();
                break;
            default:
                ja2.a((ja2) this.f476b);
                break;
        }
    }
}
