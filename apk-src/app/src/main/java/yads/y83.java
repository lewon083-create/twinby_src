package yads;

import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        a93 a93Var = a93.f36657g;
        a93Var.getClass();
        a93Var.f36662b.clear();
        Iterator it = Collections.unmodifiableCollection(qw3.f42411c.f42413b).iterator();
        while (it.hasNext()) {
            ((zv3) it.next()).getClass();
        }
        a93Var.f36666f = System.nanoTime();
        a93Var.f36664d.a();
        long jNanoTime = System.nanoTime();
        nw3 nw3Var = a93Var.f36663c.f38567b;
        if (a93Var.f36664d.f44501f.size() > 0) {
            for (String str : a93Var.f36664d.f44501f) {
                JSONObject jSONObjectA = nw3Var.a(null);
                View view = (View) a93Var.f36664d.f44498c.get(str);
                vw3 vw3Var = a93Var.f36663c.f38566a;
                String str2 = (String) a93Var.f36664d.f44502g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = vw3Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e3) {
                        ww3.a("Error with setting ad session id", e3);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException e7) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e7);
                    }
                    ow3.a(jSONObjectA, jSONObjectA2);
                }
                ow3.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                iw3 iw3Var = a93Var.f36665e;
                iw3Var.f39663b.a(new cx3(iw3Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (a93Var.f36664d.f44500e.size() > 0) {
            JSONObject jSONObjectA3 = nw3Var.a(null);
            nw3Var.a(null, jSONObjectA3, a93Var, true, false);
            ow3.a(jSONObjectA3);
            iw3 iw3Var2 = a93Var.f36665e;
            iw3Var2.f39663b.a(new fx3(iw3Var2, a93Var.f36664d.f44500e, jSONObjectA3, jNanoTime));
        } else {
            iw3 iw3Var3 = a93Var.f36665e;
            iw3Var3.f39663b.a(new xw3(iw3Var3));
        }
        wv3 wv3Var = a93Var.f36664d;
        wv3Var.f44496a.clear();
        wv3Var.f44497b.clear();
        wv3Var.f44498c.clear();
        wv3Var.f44499d.clear();
        wv3Var.f44500e.clear();
        wv3Var.f44501f.clear();
        wv3Var.f44502g.clear();
        wv3Var.f44504j = false;
        wv3Var.f44503h.clear();
        long jNanoTime2 = System.nanoTime() - a93Var.f36666f;
        if (a93Var.f36661a.size() > 0) {
            Iterator it2 = a93Var.f36661a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        ox3.f41764d.a();
    }
}
