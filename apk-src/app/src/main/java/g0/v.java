package g0;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface v {
    default void a(i0.k kVar) {
        int i;
        ArrayList arrayList = kVar.f20787a;
        int iD = d();
        if (iD == 1) {
            return;
        }
        int iM = t.z.m(iD);
        if (iM == 1) {
            i = 32;
        } else if (iM == 2) {
            i = 0;
        } else {
            if (iM != 3) {
                com.google.android.gms.internal.auth.g.O("ExifData", "Unknown flash state: ".concat(iD != 1 ? iD != 2 ? iD != 3 ? iD != 4 ? "null" : "FIRED" : "READY" : "NONE" : "UNKNOWN"));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            kVar.c("LightSource", String.valueOf(4), arrayList);
        }
        kVar.c("Flash", String.valueOf(i), arrayList);
    }

    r2 c();

    int d();

    long getTimestamp();

    u h();

    s k();

    default CaptureResult m() {
        return null;
    }

    t n();
}
