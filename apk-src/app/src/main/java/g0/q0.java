package g0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0.w f19722a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new m1(2));
        f19722a = new a0.w(linkedHashSet);
    }

    public static void a(Context context, l0 l0Var, a0.w wVar) throws p0 {
        Integer numB;
        if (Build.VERSION.SDK_INT >= 34 && f0.g.f(context) != 0) {
            com.google.android.gms.internal.auth.g.e("CameraValidator", "Virtual device with ID: " + f0.g.f(context) + " has " + l0Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e3 = null;
        if (wVar != null) {
            try {
                numB = wVar.b();
                if (numB == null) {
                    com.google.android.gms.internal.auth.g.O("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e7) {
                com.google.android.gms.internal.auth.g.l("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e7);
                return;
            }
        } else {
            numB = null;
        }
        com.google.android.gms.internal.auth.g.e("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numB);
        PackageManager packageManager = context.getPackageManager();
        int i = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (wVar == null || numB.intValue() == 1)) {
                a0.w.f238c.c(l0Var.c());
                i = 1;
            }
        } catch (IllegalArgumentException e10) {
            e3 = e10;
            com.google.android.gms.internal.auth.g.P("CameraValidator", "Camera LENS_FACING_BACK verification failed", e3);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (wVar == null || numB.intValue() == 0)) {
                a0.w.f237b.c(l0Var.c());
                i++;
            }
        } catch (IllegalArgumentException e11) {
            e3 = e11;
            com.google.android.gms.internal.auth.g.P("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e3);
        }
        try {
            f19722a.c(l0Var.c());
            com.google.android.gms.internal.auth.g.e("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (e3 == null) {
            return;
        }
        com.google.android.gms.internal.auth.g.k("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + l0Var.c());
        throw new p0(i, e3);
    }
}
