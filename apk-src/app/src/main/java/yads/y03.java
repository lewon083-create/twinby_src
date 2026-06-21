package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y03 extends m12 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w22 f44882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gw2 f44883f;

    public y03(w22 w22Var, py1 py1Var, gw2 gw2Var, v9 v9Var) {
        super(py1Var, v9Var);
        this.f44882e = w22Var;
        this.f44883f = gw2Var;
    }

    @Override // yads.m12
    public final wb3 a(int i, Context context, boolean z5) {
        pt2 pt2VarA = this.f44883f.a(context);
        wb3 wb3VarA = (pt2VarA == null || pt2VarA.f42045p) ? super.a(i, context, z5) : new ub3(kotlin.collections.b0.f27475b);
        if (wb3VarA instanceof ub3) {
            List list = this.f44882e.f44260a;
            ArrayList<r32> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof r32) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (r32 r32Var : arrayList) {
                    l52 l52Var = r32Var.f42461d;
                    o72 o72Var = r32Var.f42462e;
                    pt2 pt2VarA2 = this.f44883f.a(context);
                    boolean z10 = pt2VarA2 != null ? pt2VarA2.f42045p : true;
                    Iterator it = o72Var.f41479b.iterator();
                    while (it.hasNext()) {
                        int i10 = z10 ? ((sy2) it.next()).f43131c : i;
                        if ((z5 ? ((m12) l52Var).a(i10, context, true) : ((m12) l52Var).a(i10, context, false)) instanceof tb3) {
                            break;
                        }
                    }
                }
            }
            return new tb3(sb3.f42885d, null, null);
        }
        return wb3VarA;
    }
}
