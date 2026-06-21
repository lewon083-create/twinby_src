package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25769c;

    public /* synthetic */ z(int i, Object obj) {
        this.f25768b = i;
        this.f25769c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25768b) {
            case 0:
                i7.j jVar = (i7.j) this.f25769c;
                ((View) jVar.f21200c).postDelayed((m) jVar.f21201d, 128L);
                break;
            default:
                a0 a0Var = (a0) this.f25769c;
                a0Var.f25677b.getViewTreeObserver().removeOnDrawListener(a0Var);
                break;
        }
    }
}
