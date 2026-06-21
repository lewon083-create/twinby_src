package g0;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f19763a;

    public t0() {
        HashSet hashSet = new HashSet();
        q1 q1VarV = q1.v();
        ArrayList arrayList = new ArrayList();
        r1 r1VarA = r1.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        u1 u1VarU = u1.u(q1VarV);
        ArrayList arrayList3 = new ArrayList(arrayList);
        r2 r2Var = r2.f19734b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = r1VarA.f19735a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f19763a = new s0(arrayList2, u1VarU, -1, false, arrayList3, false, new r2(arrayMap), null);
    }
}
