package a0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f91e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1 f92f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f94h;

    public g2(r1 r1Var, Size size, m1 m1Var) {
        super(r1Var);
        this.f91e = new Object();
        if (size == null) {
            this.f93g = this.f172c.getWidth();
            this.f94h = this.f172c.getHeight();
        } else {
            this.f93g = size.getWidth();
            this.f94h = size.getHeight();
        }
        this.f92f = m1Var;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f93g, this.f94h)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f91e) {
        }
    }

    @Override // a0.o0, a0.r1
    public final int getHeight() {
        return this.f94h;
    }

    @Override // a0.o0, a0.r1
    public final int getWidth() {
        return this.f93g;
    }

    @Override // a0.o0, a0.r1
    public final m1 x() {
        return this.f92f;
    }
}
