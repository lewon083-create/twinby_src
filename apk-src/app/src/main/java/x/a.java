package x;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import g0.a2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35494b;

    public a(a2 a2Var, int i) {
        boolean z5;
        switch (i) {
            case 1:
                this.f35494b = false;
                this.f35493a = a2Var.i(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 2:
                Iterator it = a2Var.j(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                        z5 = true;
                    }
                }
                this.f35493a = z5;
                this.f35494b = a2Var.h(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.f35493a = a2Var.h(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f35494b = w.a.f34941a.i(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }
}
