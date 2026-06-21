package ni;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f29507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f29509c;

    static {
        new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
    }

    public z(c cVar) {
        this.f29507a = cVar;
    }

    public final int a() {
        int rotation;
        c cVar = this.f29507a;
        Display displayB = cVar.f29359a.b();
        if (displayB == null) {
            Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
            rotation = 0;
        } else {
            rotation = displayB.getRotation();
        }
        int i = ((Context) cVar.f29359a.f6857h).getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i == 2) {
                return (rotation == 0 || rotation == 1) ? 3 : 4;
            }
        } else if (rotation != 0 && rotation != 1) {
            return 2;
        }
        return 1;
    }
}
