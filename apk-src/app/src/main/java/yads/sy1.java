package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z73 f43126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n32 f43127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v03 f43128c;

    public /* synthetic */ sy1(nu2 nu2Var) {
        this(new z73(), new n32(nu2Var), new v03(nu2Var));
    }

    public final x22 a(Context context, ty1 ty1Var, oi2 oi2Var, zz1 zz1Var, hz1 hz1Var) {
        ty1 ty1Var2 = ty1Var;
        jx0 jx0Var = new jx0();
        n32 n32Var = this.f43127b;
        n32Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<hy1> list = ty1Var2.f43486a.f38323a;
        zz1 zz1Var2 = zz1Var;
        n72 n72Var = zz1Var2.f45602c;
        for (hy1 hy1Var : list) {
            m72 m72VarA = n72Var.a(hy1Var);
            u02 u02Var = new u02(context, hy1Var, oi2Var, m72VarA);
            db dbVar = n32Var.f41162b;
            z73 z73Var = dbVar.f37684a;
            List list2 = hy1Var.f39370h;
            z73Var.getClass();
            ArrayList arrayListA = z73.a(list2, null);
            z73 z73Var2 = dbVar.f37684a;
            List list3 = hy1Var.f39369g;
            z73Var2.getClass();
            ArrayList arrayListA2 = z73.a(list3, null);
            List list4 = hy1Var.f39364b;
            o72 o72Var = new o72(list4, arrayListA, arrayListA2, hy1Var.f39365c, hy1Var.f39368f, hy1Var.i);
            ry1 ry1Var = n32Var.f41163c;
            va vaVar = va.f43973d;
            ry1Var.getClass();
            j22 j22VarA = i22.a();
            ArrayList arrayList2 = arrayList;
            py1 py1Var = new py1(list4, j22VarA);
            n72 n72Var2 = n72Var;
            up upVar = new up(ty1Var2, new m12(py1Var, ty1Var2.f43487b), o72Var, m72VarA, zz1Var2, new a6(jx0Var), new v12(context, py1Var, j22VarA), ry1Var.f42765a, hy1Var, vaVar);
            ty1 ty1Var3 = ty1Var2;
            m32 m32Var = n32Var.f41161a;
            eq2 eq2Var = hy1Var.f39363a;
            m32Var.getClass();
            int iOrdinal = eq2Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new ij.j();
            }
            if (m32Var.f40764a != null) {
                arrayList2.add(new qy1(context, hy1Var, u02Var, oi2Var, upVar, hz1Var));
                zz1Var2 = zz1Var;
                ty1Var2 = ty1Var3;
                arrayList = arrayList2;
                n72Var = n72Var2;
            } else {
                zz1Var2 = zz1Var;
                ty1Var2 = ty1Var3;
                n72Var = n72Var2;
                arrayList = arrayList2;
            }
        }
        ty1 ty1Var4 = ty1Var2;
        w22 w22Var = new w22(arrayList);
        v03 v03Var = this.f43128c;
        mb mbVar = v03Var.f43819b;
        mbVar.getClass();
        f12 f12Var = ty1Var4.f43486a;
        List list5 = f12Var.f38324b;
        z73 z73Var3 = mbVar.f40852a;
        List list6 = f12Var.f38329g;
        z73Var3.getClass();
        ArrayList arrayListA3 = z73.a(null, list6);
        z73 z73Var4 = mbVar.f40852a;
        List list7 = f12Var.f38325c;
        z73Var4.getClass();
        o72 o72Var2 = new o72(list5, arrayListA3, z73.a(null, list7), AdRevenueScheme.AD_UNIT, f12Var.f38326d, null);
        j22 j22VarA2 = i22.a();
        py1 py1Var2 = new py1(list5, j22VarA2);
        return new x22(context, w22Var, oi2Var, new up(ty1Var, new y03(w22Var, py1Var2, fw2.a(), ty1Var4.f43487b), o72Var2, new z03(list5), zz1Var, new lb(jx0Var), new v12(context, py1Var2, j22VarA2), v03Var.f43818a, null, va.f43972c), hz1Var);
    }

    public sy1(z73 z73Var, n32 n32Var, v03 v03Var) {
        this.f43126a = z73Var;
        this.f43127b = n32Var;
        this.f43128c = v03Var;
    }
}
