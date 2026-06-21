package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n62 implements df3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o62 f41182a;

    public n62(o62 o62Var) {
        this.f41182a = o62Var;
    }

    @Override // yads.df3
    public final void a(me3 me3Var, float f10) {
    }

    @Override // yads.df3
    public final void b(me3 me3Var) {
        ef3 ef3Var = this.f41182a.f41474c;
        ef3Var.getClass();
        eo2 eo2Var = eo2.f38194c;
        ho2 ho2VarA = ef3Var.f38121a.a();
        Map map = ho2VarA.f39286a;
        ef3Var.f38122b.a(new go2("video_ad_start", kotlin.collections.j0.m(map), ho2VarA.f39287b));
        hf3 hf3Var = this.f41182a.f41476e;
        if (hf3Var != null) {
            hf3Var.c();
        }
    }

    @Override // yads.df3
    public final void c(me3 me3Var) {
        ef3 ef3Var = this.f41182a.f41474c;
        ef3Var.getClass();
        eo2 eo2Var = eo2.f38194c;
        ho2 ho2VarA = ef3Var.f38121a.a();
        Map map = ho2VarA.f39286a;
        ef3Var.f38122b.a(new go2("video_ad_complete", kotlin.collections.j0.m(map), ho2VarA.f39287b));
        hf3 hf3Var = this.f41182a.f41476e;
        if (hf3Var != null) {
            hf3Var.b();
        }
    }

    @Override // yads.df3
    public final void h(me3 me3Var) {
        hf3 hf3Var = this.f41182a.f41476e;
        if (hf3Var != null) {
            hf3Var.b();
        }
    }

    @Override // yads.df3
    public final void i(me3 me3Var) {
        this.f41182a.f41473b.h();
    }

    @Override // yads.df3
    public final void j(me3 me3Var) {
        this.f41182a.f41475d.f37718a.c();
    }

    @Override // yads.df3
    public final void a(me3 me3Var, mf3 mf3Var) {
        this.f41182a.f41472a.e();
        hf3 hf3Var = this.f41182a.f41476e;
        if (hf3Var != null) {
            hf3Var.a();
        }
    }

    @Override // yads.df3
    public final void a(me3 me3Var) {
        this.f41182a.f41473b.d();
    }

    @Override // yads.df3
    public final void d(me3 me3Var) {
    }

    @Override // yads.df3
    public final void f(me3 me3Var) {
    }

    @Override // yads.df3
    public final void g(me3 me3Var) {
    }

    @Override // yads.df3
    public final void k(me3 me3Var) {
    }
}
