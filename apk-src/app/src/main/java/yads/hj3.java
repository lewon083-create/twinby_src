package yads;

import android.graphics.Matrix;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hj3 implements j3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b03 f39222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b03 f39223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f39224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nj3 f39225d;

    public final void a() {
        Matrix matrixA;
        b03 b03Var = this.f39223b;
        nj3 nj3Var = this.f39225d;
        b03 b03Var2 = this.f39222a;
        TextureView textureView = this.f39224c;
        if (b03Var2 == null || b03Var == null || nj3Var == null || textureView == null) {
            return;
        }
        lj3 lj3Var = new lj3(b03Var, b03Var2);
        if (b03Var2.f36892b <= 0 || b03Var2.f36893c <= 0 || b03Var.f36892b <= 0 || b03Var.f36893c <= 0) {
            matrixA = null;
        } else {
            int iOrdinal = nj3Var.ordinal();
            if (iOrdinal == 0) {
                matrixA = lj3Var.a(1.0f, 1.0f, jj3.f39879b);
            } else if (iOrdinal == 1) {
                float f10 = b03Var.f36892b / b03Var2.f36892b;
                float f11 = b03Var.f36893c / b03Var2.f36893c;
                float fMin = Math.min(f10, f11);
                matrixA = lj3Var.a(fMin / f10, fMin / f11, jj3.f39880c);
            } else {
                if (iOrdinal != 2) {
                    throw new ij.j();
                }
                float f12 = b03Var.f36892b / b03Var2.f36892b;
                float f13 = b03Var.f36893c / b03Var2.f36893c;
                float fMax = Math.max(f12, f13);
                matrixA = lj3Var.a(fMax / f12, fMax / f13, jj3.f39880c);
            }
        }
        if (matrixA != null) {
            textureView.setTransform(matrixA);
        }
    }

    public final void b() {
        TextureView textureView = this.f39224c;
        if (this.f39225d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // j3.h0
    public final void onSurfaceSizeChanged(int i, int i10) {
        this.f39223b = new b03(i, i10);
        a();
    }

    @Override // j3.h0
    public final void onVideoSizeChanged(j3.y0 y0Var) {
        int iB = y0Var.f26416a;
        float f10 = y0Var.f26418c;
        if (f10 > 0.0f) {
            iB = yj.b.b(iB * f10);
        }
        this.f39222a = new b03(iB, y0Var.f26417b);
        a();
    }
}
