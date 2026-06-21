package yads;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bb {
    public static String a(ab abVar) {
        ArrayList arrayList = new ArrayList();
        if (!StringsKt.D(abVar.a())) {
            arrayList.add(abVar.a());
        }
        if (!StringsKt.D(abVar.b())) {
            arrayList.add("erid: " + abVar.b());
        }
        return CollectionsKt.I(arrayList, " · ", null, null, null, 62);
    }
}
