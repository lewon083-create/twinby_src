package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vh3 implements th3, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f44050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sh3 f44051b;

    public vh3(DisplayManager displayManager) {
        this.f44050a = displayManager;
    }

    public static vh3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new vh3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        sh3 sh3Var = this.f44051b;
        if (sh3Var == null || i != 0) {
            return;
        }
        ((yi.f0) sh3Var).b(this.f44050a.getDisplay(0));
    }

    @Override // yads.th3
    public final void a(sh3 sh3Var) {
        this.f44051b = sh3Var;
        this.f44050a.registerDisplayListener(this, lb3.a((Handler.Callback) null));
        ((yi.f0) sh3Var).b(this.f44050a.getDisplay(0));
    }

    @Override // yads.th3
    public final void a() {
        this.f44050a.unregisterDisplayListener(this);
        this.f44051b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
