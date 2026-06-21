package yads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UiModeManager f44196a;

    public static int a() {
        UiModeManager uiModeManager = f44196a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }

    public static void a(Context context) {
        f44196a = (UiModeManager) context.getSystemService("uimode");
    }
}
