package fj;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DisplayManager f19380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19381d;

    public /* synthetic */ n(Object obj, DisplayManager displayManager, int i) {
        this.f19379b = i;
        this.f19381d = obj;
        this.f19380c = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.f19379b) {
            case 0:
                Iterator it = ((ArrayList) this.f19381d).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f19379b) {
            case 0:
                if (this.f19380c.getDisplay(i) != null) {
                    Iterator it = ((ArrayList) this.f19381d).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i);
                    }
                    break;
                }
                break;
            default:
                if (i == 0) {
                    float refreshRate = this.f19380c.getDisplay(0).getRefreshRate();
                    dl.k kVar = (dl.k) this.f19381d;
                    kVar.f15871b = (long) (1.0E9d / ((double) refreshRate));
                    ((FlutterJNI) kVar.f15872c).setRefreshRateFPS(refreshRate);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.f19379b) {
            case 0:
                Iterator it = ((ArrayList) this.f19381d).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i);
                }
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }
}
