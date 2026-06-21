package io.flutter.plugin.platform;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f25761a;

    public w(x xVar) {
        this.f25761a = xVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i) {
        if (i != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f25761a.f25767g = true;
    }
}
