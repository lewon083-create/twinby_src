package yads;

import android.os.Build;
import io.sentry.protocol.OperatingSystem;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hw3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        ow3.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        ow3.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        ow3.a(jSONObject, OperatingSystem.TYPE, "Android");
        return jSONObject;
    }
}
