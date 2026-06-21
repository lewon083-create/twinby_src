package g2;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WindowInsetsController f19833h;
    public final Window i;

    public a2(Window window) {
        this.f19833h = window.getInsetsController();
        this.i = window;
    }

    public final void O(int i, int i10, boolean z5) {
        Window window = this.i;
        if (window == null) {
            if (z5) {
                this.f19833h.setSystemBarsAppearance(i10, i10);
                return;
            } else {
                this.f19833h.setSystemBarsAppearance(0, i10);
                return;
            }
        }
        if (z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public void v(boolean z5) {
        O(16, 16, z5);
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public void w(boolean z5) {
        O(8192, 8, z5);
    }
}
