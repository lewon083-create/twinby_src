package g2;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f19954e;

    public z0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f19954e = windowInsetsAnimation;
    }

    @Override // g2.a1
    public final long a() {
        return this.f19954e.getDurationMillis();
    }

    @Override // g2.a1
    public final float b() {
        return this.f19954e.getInterpolatedFraction();
    }

    @Override // g2.a1
    public final int c() {
        return this.f19954e.getTypeMask();
    }

    @Override // g2.a1
    public final void d(float f10) {
        this.f19954e.setFraction(f10);
    }
}
