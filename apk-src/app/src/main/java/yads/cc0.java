package yads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cc0 {
    public static HashMap a(String str) {
        int[] iArrA = dc0.a(str);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        um2 um2Var = dc0.f37699n;
        map.put(2, (Long) um2Var.get(iArrA[0]));
        map.put(3, (Long) dc0.f37700o.get(iArrA[1]));
        map.put(4, (Long) dc0.f37701p.get(iArrA[2]));
        map.put(5, (Long) dc0.f37702q.get(iArrA[3]));
        map.put(10, (Long) dc0.f37703r.get(iArrA[4]));
        map.put(9, (Long) dc0.f37704s.get(iArrA[5]));
        map.put(7, (Long) um2Var.get(iArrA[0]));
        return map;
    }
}
