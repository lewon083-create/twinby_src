package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l32 implements uy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a02 f40417a;

    public l32(a02 a02Var) {
        this.f40417a = a02Var;
    }

    @Override // yads.uy1
    public final void a(Context context, ty1 ty1Var, oi2 oi2Var, sy1 sy1Var, zz1 zz1Var, hz1 hz1Var, jz1 jz1Var) {
        y02 y02VarA;
        List list = ty1Var.f43486a.f38323a;
        if (list == null || list.isEmpty()) {
            y02VarA = null;
        } else if (list.size() > 1) {
            y02VarA = sy1Var.a(context, ty1Var, oi2Var, zz1Var, hz1Var);
        } else {
            y02VarA = this.f40417a.a(context, ty1Var, oi2Var, sy1Var, zz1Var, hz1Var, (hy1) list.get(0));
        }
        if (y02VarA != null) {
            jz1Var.a(y02VarA);
        } else {
            jz1Var.a(h9.f39080a);
        }
    }

    public /* synthetic */ l32(nu2 nu2Var) {
        this(new a02(nu2Var));
    }
}
