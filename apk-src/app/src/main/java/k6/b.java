package k6;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f27035b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f27034a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ic.l f27036c = new ic.l(4);

    public static int a(f1 f1Var, h0 h0Var, View view, View view2, androidx.recyclerview.widget.i iVar, boolean z5) {
        if (iVar.getChildCount() == 0 || f1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1;
        }
        return Math.min(h0Var.l(), h0Var.b(view2) - h0Var.e(view));
    }

    public static int b(f1 f1Var, h0 h0Var, View view, View view2, androidx.recyclerview.widget.i iVar, boolean z5, boolean z10) {
        if (iVar.getChildCount() == 0 || f1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (f1Var.b() - Math.max(iVar.getPosition(view), iVar.getPosition(view2))) - 1) : Math.max(0, Math.min(iVar.getPosition(view), iVar.getPosition(view2)));
        if (z5) {
            return Math.round((iMax * (Math.abs(h0Var.b(view2) - h0Var.e(view)) / (Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1))) + (h0Var.k() - h0Var.e(view)));
        }
        return iMax;
    }

    public static int c(f1 f1Var, h0 h0Var, View view, View view2, androidx.recyclerview.widget.i iVar, boolean z5) {
        if (iVar.getChildCount() == 0 || f1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return f1Var.b();
        }
        return (int) (((h0Var.b(view2) - h0Var.e(view)) / (Math.abs(iVar.getPosition(view) - iVar.getPosition(view2)) + 1)) * f1Var.b());
    }
}
