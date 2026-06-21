package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sg3 {
    public static rg3 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((xd3) obj).f44649a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new rg3(arrayList2, arrayList);
    }
}
