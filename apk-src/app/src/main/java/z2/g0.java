package z2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f45836a;

    public g0(h0 h0Var) {
        this.f45836a = h0Var;
    }

    @Override // z2.e0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        h0 h0Var = this.f45836a;
        ArrayList arrayList3 = h0Var.f45853m;
        a aVar = (a) gf.a.g(1, h0Var.f45845d);
        h0Var.f45849h = aVar;
        Iterator it = aVar.f45785a.iterator();
        while (it.hasNext()) {
            t tVar = ((n0) it.next()).f45910b;
            if (tVar != null) {
                tVar.f45979n = true;
            }
        }
        boolean zT = h0Var.T(arrayList, arrayList2, -1, 0);
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(h0.F((a) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zT;
    }
}
