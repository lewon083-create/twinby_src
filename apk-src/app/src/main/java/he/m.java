package he;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f20545f = new Date(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Date f20546g = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20548b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20549c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20550d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20551e = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f20547a = sharedPreferences;
    }

    public final l a() {
        l lVar;
        synchronized (this.f20549c) {
            int i = this.f20547a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f20547a.getLong("backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f20543a = i;
            lVar.f20544b = date;
        }
        return lVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f20547a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final l c() {
        l lVar;
        synchronized (this.f20550d) {
            int i = this.f20547a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f20547a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f20543a = i;
            lVar.f20544b = date;
        }
        return lVar;
    }

    public final void d(int i, Date date) {
        synchronized (this.f20549c) {
            this.f20547a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.f20550d) {
            this.f20547a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
