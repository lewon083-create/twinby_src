package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m32 f36602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry1 f36603b;

    public a02(m32 m32Var, ry1 ry1Var) {
        this.f36602a = m32Var;
        this.f36603b = ry1Var;
    }

    public final qy1 a(Context context, ty1 ty1Var, oi2 oi2Var, sy1 sy1Var, zz1 zz1Var, hz1 hz1Var, hy1 hy1Var) {
        if (hy1Var == null) {
            return null;
        }
        m32 m32Var = this.f36602a;
        eq2 eq2Var = hy1Var.f39363a;
        m32Var.getClass();
        int iOrdinal = eq2Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new ij.j();
        }
        pz1 pz1Var = m32Var.f40764a;
        m72 m72VarA = zz1Var.f45602c.a(hy1Var);
        jx0 jx0Var = new jx0();
        z73 z73Var = sy1Var.f43126a;
        List list = hy1Var.f39370h;
        List list2 = ty1Var.f43486a.f38329g;
        z73Var.getClass();
        ArrayList arrayListA = z73.a(list, list2);
        z73 z73Var2 = sy1Var.f43126a;
        List list3 = hy1Var.f39369g;
        List list4 = ty1Var.f43486a.f38325c;
        z73Var2.getClass();
        ArrayList arrayListA2 = z73.a(list3, list4);
        List list5 = hy1Var.f39364b;
        o72 o72Var = new o72(list5, arrayListA, arrayListA2, hy1Var.f39365c, hy1Var.f39368f, hy1Var.i);
        ry1 ry1Var = this.f36603b;
        va vaVar = va.f43971b;
        ry1Var.getClass();
        j22 j22VarA = i22.a();
        py1 py1Var = new py1(list5, j22VarA);
        up upVar = new up(ty1Var, new m12(py1Var, ty1Var.f43487b), o72Var, m72VarA, zz1Var, new a6(jx0Var), new v12(context, py1Var, j22VarA), ry1Var.f42765a, hy1Var, vaVar);
        u02 u02Var = new u02(context, hy1Var, oi2Var, m72VarA);
        pz1Var.getClass();
        return new qy1(context, hy1Var, u02Var, oi2Var, upVar, hz1Var);
    }

    public /* synthetic */ a02(nu2 nu2Var) {
        this(new m32(), new ry1(nu2Var));
    }
}
