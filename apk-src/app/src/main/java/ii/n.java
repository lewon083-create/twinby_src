package ii;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21316b;

    public n(String str, Object obj) {
        this.f21315a = str;
        this.f21316b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f21316b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
