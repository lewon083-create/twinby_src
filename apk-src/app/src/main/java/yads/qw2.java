package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb3 f42409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb3 f42410b;

    public /* synthetic */ qw2(Context context) {
        this(new nb3(context), new pb3(context));
    }

    public final void a() {
        boolean z5;
        pb3 pb3Var = this.f42410b;
        ud3 ud3Var = pb3Var.f41869a;
        Context context = pb3Var.f41871c;
        ud3Var.getClass();
        if (ub.a(context)) {
            ob3 ob3Var = pb3Var.f41870b;
            pt2 pt2VarA = ob3Var.f41505a.a(pb3Var.f41871c);
            if (pt2VarA != null && pt2VarA.f42049r) {
                pb3Var.f41872d.getClass();
                qb3.b();
            }
        }
        nb3 nb3Var = this.f42409a;
        ud3 ud3Var2 = nb3Var.f41209c;
        Context context2 = nb3Var.f41211e;
        ud3Var2.getClass();
        if (ub.a(context2)) {
            gw2 gw2Var = nb3Var.f41208b;
            gw2Var.getClass();
            synchronized (gw2.f38918j) {
                z5 = gw2Var.f38925f;
            }
            if (z5) {
                mb3 mb3Var = nb3Var.f41210d;
                pt2 pt2VarA2 = mb3Var.f40857a.a(nb3Var.f41211e);
                if (pt2VarA2 == null || !pt2VarA2.f42047q) {
                    return;
                }
                nb3Var.f41207a.a();
            }
        }
    }

    public qw2(nb3 nb3Var, pb3 pb3Var) {
        this.f42409a = nb3Var;
        this.f42410b = pb3Var;
    }
}
