package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j20 implements bk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20 f39703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj3 f39704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ph3 f39705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fb1 f39706d = new fb1(new c20());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39707e;

    public j20(b20 b20Var, zj3 zj3Var, ph3 ph3Var) {
        this.f39703a = b20Var;
        this.f39704b = zj3Var;
        this.f39705c = ph3Var;
    }

    @Override // yads.bk3
    public final void a(float f10) {
    }

    @Override // yads.bk3
    public final void b() {
        this.f39704b.a(this.f39703a, "complete");
    }

    @Override // yads.bk3
    public final void c() {
        this.f39704b.a(this.f39703a, "resume");
    }

    @Override // yads.bk3
    public final void d() {
        this.f39704b.a(this.f39703a, "pause");
    }

    @Override // yads.bk3
    public final void h() {
        this.f39704b.a(this.f39703a, "creativeView");
    }

    @Override // yads.bk3
    public final void i() {
        this.f39704b.a(new g20(this.f39703a), "creativeRenderingStart");
    }

    @Override // yads.bk3
    public final void k() {
        this.f39707e = false;
    }

    @Override // yads.bk3
    public final void l() {
        this.f39704b.a(this.f39703a, "mute");
    }

    @Override // yads.bk3
    public final void m() {
        if (!this.f39707e) {
            this.f39707e = true;
            this.f39704b.a(this.f39703a, "start");
        }
        this.f39704b.a(this.f39703a, "clickTracking");
    }

    @Override // yads.bk3
    public final void a(View view, List list) {
    }

    @Override // yads.bk3
    public final void a(mf3 mf3Var) {
    }

    @Override // yads.bk3
    public final void a(ak3 ak3Var) {
        String str;
        int iOrdinal = ak3Var.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = "midpoint";
        } else if (iOrdinal == 2) {
            str = "thirdQuartile";
        } else {
            throw new ij.j();
        }
        this.f39704b.a(this.f39703a, str);
    }

    @Override // yads.bk3
    public final void a(float f10, long j10) {
        if (this.f39707e) {
            return;
        }
        this.f39707e = true;
        this.f39704b.a(this.f39703a, "start");
    }

    @Override // yads.bk3
    public final void a() {
        this.f39704b.a(this.f39703a, "unmute");
    }

    @Override // yads.bk3
    public final void f() {
    }

    @Override // yads.bk3
    public final void g() {
    }

    @Override // yads.bk3
    public final void j() {
    }

    @Override // yads.bk3
    public final void n() {
    }
}
