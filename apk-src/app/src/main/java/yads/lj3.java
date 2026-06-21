package yads;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b03 f40563a;

    public lj3(b03 b03Var, b03 b03Var2) {
        this.f40563a = b03Var;
    }

    public final Matrix a(float f10, float f11, jj3 jj3Var) {
        int iOrdinal = jj3Var.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new ij.j();
        }
        b03 b03Var = this.f40563a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, b03Var.f36892b / 2.0f, b03Var.f36893c / 2.0f);
        return matrix2;
    }
}
