package u6;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {
    @Override // com.google.android.gms.internal.auth.g
    public final void F(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // u6.c0, com.google.android.gms.internal.auth.g
    public final void G(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // u6.c0
    public final void R(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }

    @Override // u6.c0
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // u6.c0
    public final void T(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // com.google.android.gms.internal.auth.g
    public final float r(View view) {
        return view.getTransitionAlpha();
    }
}
