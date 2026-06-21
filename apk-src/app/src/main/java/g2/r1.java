package g2;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class r1 extends q1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x1 f19914w = x1.g(null, WindowInsets.CONSUMED);

    public r1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var, windowInsets);
    }

    @Override // g2.p1, g2.k1
    public x1.b F(int i) {
        return x1.b.c(this.f19878c.getInsetsIgnoringVisibility(w1.a(i)));
    }

    @Override // g2.p1, g2.k1, g2.t1
    public x1.b h(int i) {
        return x1.b.c(this.f19878c.getInsets(w1.a(i)));
    }

    @Override // g2.p1, g2.k1, g2.t1
    public boolean s(int i) {
        return this.f19878c.isVisible(w1.a(i));
    }

    @Override // g2.k1, g2.t1
    public void n(View view) {
    }
}
