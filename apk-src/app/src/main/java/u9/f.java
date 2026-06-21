package u9;

import android.util.JsonWriter;
import com.google.firebase.messaging.y;
import d8.e0;
import d8.u;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34381c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f34382d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f34380b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f34383e = new HashSet(Arrays.asList(new String[0]));

    public f() {
        this.f34384a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z5;
        synchronized (f34380b) {
            try {
                z5 = false;
                if (f34381c && f34382d) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    public static void d(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f34383e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        i.e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            e("onNetworkRequest", new y(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i) {
        if (c()) {
            String responseMessage = null;
            e("onNetworkResponse", new e0(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), 15));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e3) {
                    i.h("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e3.getMessage())));
                }
                e("onNetworkRequestError", new u(responseMessage, 3));
            }
        }
    }

    public final void e(String str, e eVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f34384a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            eVar.q(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e3) {
            i.f("unable to log", e3);
        }
        String string = stringWriter.toString();
        synchronized (f.class) {
            try {
                i.g("GMA Debug BEGIN");
                int i = 0;
                while (i < string.length()) {
                    int i10 = i + 4000;
                    i.g("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i, Math.min(i10, string.length())))));
                    i = i10;
                }
                i.g("GMA Debug FINISH");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
