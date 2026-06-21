package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class lb0 implements pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk3 f40462a;

    public lb0(kk3 kk3Var) {
        this.f40462a = kk3Var;
    }

    @Override // yads.pi
    public final void a() {
        View viewB = this.f40462a.b();
        if (viewB == null) {
            return;
        }
        this.f40462a.a(viewB);
    }

    @Override // yads.pi
    public final boolean b() {
        return this.f40462a.b() != null;
    }

    @Override // yads.pi
    public final cl3 c() {
        View viewB = this.f40462a.b();
        if (viewB != null) {
            return new cl3(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final boolean d() {
        return nl3.a(this.f40462a.b()) >= 100;
    }

    @Override // yads.pi
    public final boolean e() {
        return this.f40462a.c();
    }

    @Override // yads.pi
    public final void a(oi oiVar, nk3 nk3Var) {
        this.f40462a.a(oiVar, nk3Var, oiVar.f41542c);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        View viewB = this.f40462a.b();
        if (viewB == null) {
            return;
        }
        this.f40462a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        View viewB = this.f40462a.b();
        return viewB != null && this.f40462a.a(viewB, obj);
    }
}
