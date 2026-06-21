package xh;

import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.FlutterEngine;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f36124a;

    public g(k kVar) {
        this.f36124a = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z5) {
        int i = k.Z;
        k kVar = this.f36124a;
        if (kVar.U("onWindowFocusChanged")) {
            d dVar = kVar.W;
            dVar.c();
            dVar.f36106a.getClass();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                e4.j jVar = flutterEngine.f25547g;
                if (z5) {
                    jVar.f(jVar.f16132a, true);
                } else {
                    jVar.f(jVar.f16132a, false);
                }
            }
        }
    }
}
