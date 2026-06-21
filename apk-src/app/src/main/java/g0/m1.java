package g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements a0.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19658b;

    public m1(int i) {
        this.f19658b = i;
    }

    @Override // a0.t
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            f2.g.a("The camera info doesn't contain internal implementation.", d0Var instanceof d0);
            if (d0Var.l() == this.f19658b) {
                arrayList.add(d0Var);
            }
        }
        return arrayList;
    }
}
