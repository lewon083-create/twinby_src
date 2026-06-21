package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.wk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f33543a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33544b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f33545c;

    public a0(Context context) {
        this.f33545c = context;
    }

    public final void a() {
        wk wkVar = al.Fb;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            g0 g0Var = p9.k.C.f31297c;
            HashMap mapR = g0.R((String) sVar.f31970c.a(al.Kb));
            for (String str : mapR.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f33543a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f33545c) : this.f33545c.getSharedPreferences(str, 0);
                            y yVar = new y(this, str);
                            map.put(str, yVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(yVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            z zVar = new z(mapR);
            synchronized (this) {
                this.f33544b.add(zVar);
            }
        }
    }
}
