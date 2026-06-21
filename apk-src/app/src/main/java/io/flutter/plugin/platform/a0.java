package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f25677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f25678c;

    public a0(View view, z zVar) {
        this.f25677b = view;
        this.f25678c = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        z zVar = this.f25678c;
        if (zVar == null) {
            return;
        }
        zVar.run();
        this.f25678c = null;
        this.f25677b.post(new z(1, this));
    }
}
