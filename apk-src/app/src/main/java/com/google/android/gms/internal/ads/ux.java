package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ux implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vx f11123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11124d;

    public ux(vx vxVar) {
        this.f11122b = 2;
        this.f11124d = false;
        this.f11123c = vxVar;
    }

    public void a() {
        this.f11124d = true;
        this.f11123c.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11122b) {
            case 0:
                this.f11123c.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f11124d));
                break;
            case 1:
                boolean z5 = this.f11124d;
                vx vxVar = this.f11123c;
                vxVar.getClass();
                vxVar.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z5));
                break;
            default:
                if (!this.f11124d) {
                    this.f11123c.b();
                    t9.d0 d0Var = t9.g0.f33596l;
                    d0Var.removeCallbacks(this);
                    d0Var.postDelayed(this, 250L);
                }
                break;
        }
    }

    public /* synthetic */ ux(vx vxVar, boolean z5, int i) {
        this.f11122b = i;
        this.f11124d = z5;
        this.f11123c = vxVar;
    }
}
