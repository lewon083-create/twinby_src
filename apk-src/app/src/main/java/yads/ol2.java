package yads;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ol2 {
    public static Uri a(Uri uri, bd3 bd3Var) {
        Map mapD;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            int iB = kotlin.collections.i0.b(kotlin.collections.t.j(queryParameterNames, 10));
            if (iB < 16) {
                iB = 16;
            }
            mapD = new LinkedHashMap(iB);
            for (String str : queryParameterNames) {
                mapD.put(str, uri.getQueryParameter(str));
            }
        } else {
            mapD = null;
        }
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        pl2 pl2Var = (pl2) bd3Var.invoke(new pl2(mapD));
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : pl2Var.f41950a.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery.build();
    }
}
