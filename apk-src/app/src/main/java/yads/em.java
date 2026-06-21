package yads;

import io.sentry.rrweb.RRWebVideoEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class em {
    public static dm a(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(RRWebVideoEvent.JsonKeys.TOP);
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("right");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt(RRWebVideoEvent.JsonKeys.LEFT);
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("bottom");
        return new dm(str, str2, str3, objOpt4 instanceof String ? (String) objOpt4 : null);
    }
}
