package yads;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class og0 {
    public static final void a(Dialog dialog) {
        Activity activityA;
        Window window;
        Window window2;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        if (!ub.a(30) || (activityA = j1.a()) == null || (window = activityA.getWindow()) == null || (window2 = dialog.getWindow()) == null || (insetsController = window.getInsetsController()) == null || (insetsController2 = window2.getInsetsController()) == null) {
            return;
        }
        insetsController2.setSystemBarsAppearance(insetsController.getSystemBarsAppearance(), 24);
    }
}
