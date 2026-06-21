package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sf1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        kx.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(vd1.b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
