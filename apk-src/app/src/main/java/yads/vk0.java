package yads;

import android.media.MediaDrm;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vk0 {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        int iA = lb3.a(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        if (iA == 2 || iA == 4) {
            return 6005;
        }
        if (iA == 10) {
            return 6004;
        }
        if (iA == 7) {
            return 6005;
        }
        if (iA == 8) {
            return 6003;
        }
        switch (iA) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (iA) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }
}
