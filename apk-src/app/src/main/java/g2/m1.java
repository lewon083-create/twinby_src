package g2;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class m1 extends l1 {
    public m1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var, windowInsets);
    }

    @Override // g2.t1
    public x1 a() {
        return x1.g(null, this.f19878c.consumeDisplayCutout());
    }

    @Override // g2.k1, g2.t1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Objects.equals(this.f19878c, m1Var.f19878c) && Objects.equals(this.f19882g, m1Var.f19882g) && k1.L(this.f19883h, m1Var.f19883h);
    }

    @Override // g2.t1
    public h g() {
        DisplayCutout displayCutout = this.f19878c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h(displayCutout);
    }

    @Override // g2.t1
    public int hashCode() {
        return this.f19878c.hashCode();
    }
}
