package g2;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class o1 extends m1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x1.b f19906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x1.b f19907t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x1.b f19908u;

    public o1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var, windowInsets);
        this.f19906s = null;
        this.f19907t = null;
        this.f19908u = null;
    }

    @Override // g2.t1
    public x1.b i() {
        if (this.f19907t == null) {
            this.f19907t = x1.b.c(this.f19878c.getMandatorySystemGestureInsets());
        }
        return this.f19907t;
    }

    @Override // g2.t1
    public x1.b k() {
        if (this.f19906s == null) {
            this.f19906s = x1.b.c(this.f19878c.getSystemGestureInsets());
        }
        return this.f19906s;
    }

    @Override // g2.t1
    public x1.b m() {
        if (this.f19908u == null) {
            this.f19908u = x1.b.c(this.f19878c.getTappableElementInsets());
        }
        return this.f19908u;
    }

    @Override // g2.k1, g2.t1
    public x1 p(int i, int i10, int i11, int i12) {
        return x1.g(null, this.f19878c.inset(i, i10, i11, i12));
    }

    @Override // g2.l1, g2.t1
    public void w(x1.b bVar) {
    }
}
