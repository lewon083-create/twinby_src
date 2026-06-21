package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f37405a;

    public cj(List list) {
        int iB = kotlin.collections.i0.b(kotlin.collections.t.j(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            linkedHashMap.put(oiVar.b(), oiVar.c());
        }
        this.f37405a = linkedHashMap;
    }
}
