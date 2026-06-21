package t;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import g0.x2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f33302b;

    static {
        new ti.t(4);
        f33302b = new u1();
    }

    @Override // t.g0
    public final void a(x2 x2Var, g0.r0 r0Var) {
        super.a(x2Var, r0Var);
        if (!(x2Var instanceof g0.g1)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        g0.g1 g1Var = (g0.g1) x2Var;
        g0.q1 q1VarV = g0.q1.v();
        g0.g gVar = g0.g1.M;
        if (g1Var.h(gVar)) {
            int iIntValue = ((Integer) g1Var.a(gVar)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) w.a.f34941a.i(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    q1VarV.y(s.b.u(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    q1VarV.y(s.b.u(key2), Boolean.FALSE);
                }
            }
        }
        r0Var.c(new s.b(g0.u1.u(q1VarV)));
    }
}
