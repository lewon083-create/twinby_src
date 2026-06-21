package aa;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.ku;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f702b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ku f704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f705e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f708h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f703c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f706f = new Bundle();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public t(JsonReader jsonReader, ku kuVar) throws IOException {
        Bundle bundle;
        this.f707g = -1L;
        this.f708h = -1L;
        this.f704d = kuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.f707g = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals(Message.JsonKeys.PARAMS)) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f708h = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f701a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f706f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() || kuVar == null || (bundle = kuVar.f7308n) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f707g);
        bundle.putLong("get-signals-sdkcore-end", this.f708h);
    }
}
