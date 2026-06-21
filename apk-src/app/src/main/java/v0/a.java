package v0;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34638a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34639b;

    public a(ArrayList arrayList) {
        this.f34639b = arrayList;
    }

    public final n a(SessionConfiguration sessionConfiguration) {
        switch (this.f34638a) {
            case 0:
                Iterator it = ((ArrayList) this.f34639b).iterator();
                while (it.hasNext()) {
                    n nVarA = ((a) it.next()).a(sessionConfiguration);
                    if (nVarA.f28052c != 0) {
                        return nVarA;
                    }
                }
                return new n(0, 12);
            default:
                int i = ((CameraDevice.CameraDeviceSetup) this.f34639b).isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                return new n(i, 12);
        }
    }

    public a(CameraManager cameraManager, String str) {
        this.f34639b = cameraManager.getCameraDeviceSetup(str);
    }
}
