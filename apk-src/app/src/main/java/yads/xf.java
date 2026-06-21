package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xf {
    public static void a(Context context, ct1 ct1Var) {
        vf vfVar;
        ok.e eVar = hk.k0.f20682a;
        ok.d dVar = ok.d.f30722d;
        mk.c cVarA = hk.c0.a(kotlin.coroutines.e.d(new hk.s1(), dVar).plus(new y10(ct1Var)));
        jf jfVar = new jf(dVar, new Handler(Looper.getMainLooper()));
        pf pfVar = new pf(ct1Var);
        g63 g63Var = new g63();
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA != null) {
            int i = 1;
            if (pt2VarA.f42029f0) {
                Long l10 = pt2VarA.f42031g0;
                long jLongValue = l10 != null ? l10.longValue() : 1000L;
                Long l11 = pt2VarA.h0;
                long jLongValue2 = l11 != null ? l11.longValue() : 6000L;
                Set set = pt2VarA.f42043n0;
                if (set == null) {
                    set = kotlin.collections.d0.f27478b;
                }
                Set set2 = set;
                vf vfVar2 = vf.f44014k;
                if (vfVar2 == null) {
                    synchronized (vf.f44013j) {
                        vfVar = vf.f44014k;
                        if (vfVar == null) {
                            vf vfVar3 = new vf(jLongValue, jLongValue2, set2, cVarA, jfVar, pfVar, g63Var);
                            vf.f44014k = vfVar3;
                            vfVar = vfVar3;
                        }
                    }
                    vfVar2 = vfVar;
                }
                if (vfVar2.i.getAndSet(true)) {
                    return;
                }
                hk.c0.m(vfVar2.f44018d, vfVar2.f44022h, new tf(vfVar2, null), 2).E(true, new hk.n0(i, new uf(vfVar2)));
            }
        }
    }
}
