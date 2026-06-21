package yads;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ng0 {
    public static final void a(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z5 = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z5) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }
}
