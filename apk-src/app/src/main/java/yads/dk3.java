package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wu3 f37796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p03 f37797b;

    public /* synthetic */ dk3(wu3 wu3Var) {
        this(wu3Var, new p03());
    }

    public final ck3 a(Context context, me3 me3Var, pf3 pf3Var) {
        vu3 vu3Var;
        zj3 zj3Var = new zj3(context);
        ph3 ph3Var = new ph3(context);
        uy uyVar = new uy();
        uyVar.f43806a.add(new j20(me3Var.f40899a, zj3Var, ph3Var));
        uyVar.f43806a.add(new og3(me3Var.f40900b, zj3Var));
        jg3 jg3VarA = this.f37797b.a(me3Var.f40899a);
        List list = me3Var.f40900b.f44661n;
        if (this.f37796a.f44480a.a(context)) {
            zj3 zj3Var2 = new zj3(context);
            ea2 ea2Var = new ea2();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            su3 su3Var = su3.f43085a;
            vu3Var = new vu3(context, pf3Var, jg3VarA, list, zj3Var2, ea2Var, cf.a(applicationContext, new fq3(applicationContext)));
        } else {
            vu3Var = null;
        }
        if (vu3Var != null) {
            uyVar.f43806a.add(vu3Var);
        }
        return new ck3(uyVar);
    }

    public dk3(wu3 wu3Var, p03 p03Var) {
        this.f37796a = wu3Var;
        this.f37797b = p03Var;
    }
}
