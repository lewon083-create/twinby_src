package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ib2 extends y6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1 f39487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw1 f39488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39489c;

    public ib2(dx1 dx1Var, xw1 xw1Var) {
        this.f39487a = dx1Var;
        this.f39488b = xw1Var;
    }

    @Override // y6.h
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f39489c = false;
            return;
        }
        if (i != 1) {
            return;
        }
        xw1 xw1Var = this.f39488b;
        if (xw1Var != null) {
            xw1Var.a();
            xw1Var.f44827f = false;
        }
        this.f39489c = true;
    }

    @Override // y6.h
    public final void onPageSelected(int i) {
        if (this.f39489c) {
            dx1 dx1Var = this.f39487a;
            if (dx1Var.f37911d) {
                dx1Var.a("first_user_swipe");
                dx1Var.f37911d = false;
            }
            this.f39489c = false;
        }
    }
}
