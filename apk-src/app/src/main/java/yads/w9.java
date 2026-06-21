package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w9 {
    public static c a(Map map) {
        Set setV;
        Long lValueOf;
        String strC = u01.c(map, v11.f43834n);
        String strOptString = "";
        if (strC == null) {
            strC = "";
        }
        String strC2 = u01.c(map, v11.L);
        if (strC2 == null) {
            setV = kotlin.collections.d0.f27478b;
        } else {
            try {
                strOptString = new JSONObject(strC2).optString("test_ids", "");
            } catch (Throwable unused) {
            }
            List listSplit$default = StringsKt__StringsKt.split$default(strOptString, new String[]{";"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                try {
                    lValueOf = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            setV = CollectionsKt.V(arrayList);
        }
        return new c(strC, setV);
    }
}
