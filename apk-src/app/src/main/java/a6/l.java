package a6;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f474f;

    public l(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f471c = onBackInvokedDispatcher;
        this.f472d = i;
        this.f473e = Build.VERSION.SDK_INT == 33 ? new n(0, this) : new o(this);
    }

    @Override // a6.f
    public final void b(boolean z5) {
        if (z5 && !this.f474f) {
            this.f471c.registerOnBackInvokedCallback(this.f472d, this.f473e);
            this.f474f = true;
        } else {
            if (z5 || !this.f474f) {
                return;
            }
            this.f471c.unregisterOnBackInvokedCallback(this.f473e);
            this.f474f = false;
        }
    }
}
