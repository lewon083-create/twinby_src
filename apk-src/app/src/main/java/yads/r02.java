package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s02 f42437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o02 f42438b;

    public r02(Context context, nu2 nu2Var, c12 c12Var, q02 q02Var, w5 w5Var, d4 d4Var, m02 m02Var, p02 p02Var) {
        this.f42437a = q02Var;
        m02Var.getClass();
        x02 x02VarA = m02.a(context, d4Var, nu2Var, w5Var, this);
        p02Var.getClass();
        o02 o02VarA = p02.a(context, nu2Var, c12Var, d4Var, x02VarA, w5Var);
        this.f42438b = o02VarA;
        x02VarA.a(o02VarA.e());
    }

    public final void a() {
        o02 o02Var = this.f42438b;
        c12 c12Var = o02Var.f41422w;
        g9 g9Var = c12Var.f37247a;
        if (!c12Var.f37249c.a()) {
            o02Var.b(h9.f39087h);
            return;
        }
        o02Var.f45467b.a(v5.f43874e, null);
        o02Var.A.b(ke1.f40176b, o02Var);
        o02Var.f45468c.f37621j = Integer.valueOf(o02Var.f41422w.f37250d);
        o02Var.f45468c.a(g9Var.f38676a);
        d4 d4Var = o02Var.f45468c;
        d4Var.f37618f = o02Var.f41422w.f37248b;
        d4Var.f37624m = g9Var.f38685k;
        synchronized (o02Var) {
            o02Var.c(g9Var);
        }
    }

    public /* synthetic */ r02(Context context, nu2 nu2Var, c12 c12Var, q02 q02Var, e00 e00Var, int i) {
        this(context, nu2Var, c12Var, q02Var, new w5(), new d4((i & 32) != 0 ? e00.f37945g : e00Var), new m02(), new p02());
    }
}
