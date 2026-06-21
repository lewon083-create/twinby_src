package g2;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends r1 {
    public s1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var, windowInsets);
    }

    @Override // g2.k1, g2.t1
    public List<Rect> e(int i) {
        return this.f19878c.getBoundingRects(w1.a(i));
    }

    @Override // g2.k1, g2.t1
    public List<Rect> f(int i) {
        return this.f19878c.getBoundingRectsIgnoringVisibility(w1.a(i));
    }

    @Override // g2.k1, g2.t1
    public void o() {
    }
}
