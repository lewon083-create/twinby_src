package yads;

import io.sentry.SentryLogEvent;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hm2 {
    public static fm2 a(String str) throws JSONException {
        new gm2();
        JSONObject jSONObject = new JSONObject(ln.b(str));
        HashMap map = new HashMap();
        String string = jSONObject.getString(SentryLogEvent.JsonKeys.BODY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        return new fm2(string, map);
    }
}
