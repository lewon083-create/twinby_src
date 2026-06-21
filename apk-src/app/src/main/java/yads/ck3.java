package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ck3 implements bk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk3 f37420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37422c;

    public ck3(uy uyVar) {
        this.f37420a = uyVar;
    }

    @Override // yads.bk3
    public final void a(View view, List list) {
        this.f37420a.a(view, list);
        this.f37421b = false;
        this.f37422c = false;
    }

    @Override // yads.bk3
    public final void b() {
        this.f37420a.b();
        k();
    }

    @Override // yads.bk3
    public final void c() {
        this.f37420a.c();
    }

    @Override // yads.bk3
    public final void d() {
        this.f37420a.d();
    }

    @Override // yads.bk3
    public final void f() {
        this.f37420a.f();
    }

    @Override // yads.bk3
    public final void g() {
        this.f37420a.g();
        k();
    }

    @Override // yads.bk3
    public final void h() {
        if (this.f37421b) {
            return;
        }
        this.f37421b = true;
        this.f37420a.h();
    }

    @Override // yads.bk3
    public final void i() {
        this.f37420a.i();
    }

    @Override // yads.bk3
    public final void j() {
        this.f37420a.j();
    }

    @Override // yads.bk3
    public final void k() {
        this.f37420a.k();
        this.f37421b = false;
        this.f37422c = false;
    }

    @Override // yads.bk3
    public final void l() {
        this.f37420a.l();
    }

    @Override // yads.bk3
    public final void m() {
        this.f37420a.m();
        h();
        n();
    }

    @Override // yads.bk3
    public final void n() {
        if (this.f37422c) {
            return;
        }
        this.f37422c = true;
        this.f37420a.n();
    }

    @Override // yads.bk3
    public final void a(mf3 mf3Var) {
        this.f37420a.a(mf3Var);
        k();
    }

    @Override // yads.bk3
    public final void a(ak3 ak3Var) {
        this.f37420a.a(ak3Var);
    }

    @Override // yads.bk3
    public final void a(float f10, long j10) {
        this.f37420a.a(f10, j10);
    }

    @Override // yads.bk3
    public final void a() {
        this.f37420a.a();
    }

    @Override // yads.bk3
    public final void a(float f10) {
        this.f37420a.a(f10);
    }
}
