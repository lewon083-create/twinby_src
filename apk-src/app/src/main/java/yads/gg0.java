package yads;

import io.sentry.protocol.Request;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class gg0 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "ctv";
        }
        if (i == 2) {
            return "mobile";
        }
        if (i == 3) {
            return Request.JsonKeys.OTHER;
        }
        throw null;
    }
}
