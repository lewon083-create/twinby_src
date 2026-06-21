package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t22 implements uy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a02 f43165a;

    public t22(a02 a02Var) {
        this.f43165a = a02Var;
    }

    @Override // yads.uy1
    public final void a(Context context, ty1 ty1Var, oi2 oi2Var, sy1 sy1Var, zz1 zz1Var, hz1 hz1Var, jz1 jz1Var) {
        List list = ty1Var.f43486a.f38323a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qy1 qy1VarA = this.f43165a.a(context, ty1Var, oi2Var, sy1Var, zz1Var, hz1Var, (hy1) it.next());
            if (qy1VarA != null) {
                arrayList.add(qy1VarA);
            }
        }
        if (arrayList.isEmpty()) {
            jz1Var.a(h9.f39080a);
        } else {
            jz1Var.a(arrayList);
        }
    }

    public /* synthetic */ t22(nu2 nu2Var) {
        this(new a02(nu2Var));
    }
}
