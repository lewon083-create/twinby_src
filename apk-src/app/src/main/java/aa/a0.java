package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f551d = new Object();

    public a0(Context context) {
        this.f550c = context;
    }

    public final String a(String str) {
        String string;
        e();
        synchronized (this.f551d) {
            string = this.f548a.getString(str, null);
            this.f549b.remove(str).commit();
        }
        return string;
    }

    public final void b(int i, int i10, String str) {
        String str2 = Build.MODEL;
        e();
        synchronized (this.f551d) {
            this.f549b.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i10).commit();
        }
    }

    public final void c() {
        e();
        synchronized (this.f551d) {
            this.f549b.clear().commit();
        }
    }

    public final HashMap d() {
        HashMap map;
        e();
        synchronized (this.f551d) {
            try {
                Map<String, ?> all = this.f548a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public final void e() {
        synchronized (this.f551d) {
            try {
                if (this.f548a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f550c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f548a = sharedPreferences;
                this.f549b = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
