package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a93 implements qv3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a93 f36657g = new a93();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f36658h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y83 f36659j = new y83();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z83 f36660k = new z83();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f36666f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f36661a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36662b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wv3 f36664d = new wv3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fw3 f36663c = new fw3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iw3 f36665e = new iw3(new pw3());

    public final void a(View view, tv3 tv3Var, JSONObject jSONObject, boolean z5) {
        Object obj;
        boolean z10;
        if (kx3.a(view) == null) {
            wv3 wv3Var = this.f36664d;
            char c8 = wv3Var.f44499d.contains(view) ? (char) 1 : wv3Var.f44504j ? (char) 2 : (char) 3;
            if (c8 == 3) {
                return;
            }
            JSONObject jSONObjectA = tv3Var.a(view);
            ow3.a(jSONObject, jSONObjectA);
            wv3 wv3Var2 = this.f36664d;
            if (wv3Var2.f44496a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) wv3Var2.f44496a.get(view);
                if (obj2 != null) {
                    wv3Var2.f44496a.remove(view);
                }
                obj = obj2;
            }
            boolean z11 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e3) {
                    ww3.a("Error with setting ad session id", e3);
                }
                wv3 wv3Var3 = this.f36664d;
                if (wv3Var3.i.containsKey(view)) {
                    wv3Var3.i.put(view, Boolean.TRUE);
                } else {
                    z11 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z11));
                } catch (JSONException e7) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e7);
                }
                boolean zContains = this.f36664d.f44503h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException e10) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e10);
                    }
                }
                this.f36664d.f44504j = true;
                return;
            }
            wv3 wv3Var4 = this.f36664d;
            pv3 pv3Var = (pv3) wv3Var4.f44497b.get(view);
            if (pv3Var != null) {
                wv3Var4.f44497b.remove(view);
            }
            if (pv3Var != null) {
                ax3 ax3Var = pv3Var.f42083a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = pv3Var.f42084b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", ax3Var.f36878b);
                    jSONObjectA.put("friendlyObstructionPurpose", ax3Var.f36879c);
                    jSONObjectA.put("friendlyObstructionReason", ax3Var.f36880d);
                } catch (JSONException e11) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e11);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            tv3Var.a(view, jSONObjectA, this, c8 == 1, z5 || z10);
        }
    }
}
