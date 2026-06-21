package a0;

import android.graphics.PointF;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Display f102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.d0 f103d;

    public h0(Display display, g0.d0 d0Var, float f10, float f11) {
        this.f100a = f10;
        this.f101b = f11;
        this.f102c = display;
        this.f103d = d0Var;
    }

    public final x1 a(float f10, float f11, float f12) {
        g0.d0 d0Var = this.f103d;
        int i = 0;
        boolean z5 = d0Var.l() == 0;
        try {
            int iN = d0Var.n(this.f102c.getRotation());
            i = z5 ? (360 - iN) % 360 : iN;
        } catch (Exception unused) {
        }
        float f13 = this.f100a;
        float f14 = this.f101b;
        if (i != 90 && i != 270) {
            f11 = f10;
            f10 = f11;
            f14 = f13;
            f13 = f14;
        }
        if (i == 90) {
            f10 = f13 - f10;
        } else if (i == 180) {
            f11 = f14 - f11;
            f10 = f13 - f10;
        } else if (i == 270) {
            f11 = f14 - f11;
        }
        if (z5) {
            f11 = f14 - f11;
        }
        PointF pointF = new PointF(f11 / f14, f10 / f13);
        float f15 = pointF.x;
        float f16 = pointF.y;
        x1 x1Var = new x1();
        x1Var.f269a = f15;
        x1Var.f270b = f16;
        x1Var.f271c = f12;
        return x1Var;
    }
}
