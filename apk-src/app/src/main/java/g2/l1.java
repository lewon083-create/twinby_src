package g2;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class l1 extends k1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x1.b f19890r;

    public l1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var, windowInsets);
        this.f19890r = null;
    }

    @Override // g2.t1
    public x1 b() {
        return x1.g(null, this.f19878c.consumeStableInsets());
    }

    @Override // g2.t1
    public x1 c() {
        return x1.g(null, this.f19878c.consumeSystemWindowInsets());
    }

    @Override // g2.t1
    public final x1.b j() {
        if (this.f19890r == null) {
            WindowInsets windowInsets = this.f19878c;
            this.f19890r = x1.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f19890r;
    }

    @Override // g2.t1
    public boolean q() {
        return this.f19878c.isConsumed();
    }

    @Override // g2.t1
    public void w(x1.b bVar) {
        this.f19890r = bVar;
    }
}
