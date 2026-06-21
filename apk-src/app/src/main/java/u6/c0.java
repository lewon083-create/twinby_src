package u6;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends com.google.android.gms.internal.auth.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f34254n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f34255o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f34256p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f34257q = true;

    @Override // com.google.android.gms.internal.auth.g
    public void G(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.G(view, i);
        } else if (f34257q) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f34257q = false;
            }
        }
    }

    public void R(View view, int i, int i10, int i11, int i12) {
        if (f34256p) {
            try {
                view.setLeftTopRightBottom(i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f34256p = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f34254n) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f34254n = false;
            }
        }
    }

    public void T(View view, Matrix matrix) {
        if (f34255o) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f34255o = false;
            }
        }
    }
}
