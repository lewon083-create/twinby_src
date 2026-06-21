package aa;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.yk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f668f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f669g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wd0 f670h;
    public ConcurrentHashMap i;

    public n0(wd0 wd0Var) {
        this.f670h = wd0Var;
        wk wkVar = al.G7;
        q9.s sVar = q9.s.f31967e;
        this.f663a = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        wk wkVar2 = al.H7;
        yk ykVar = sVar.f31970c;
        this.f664b = ((Long) ykVar.a(wkVar2)).longValue();
        this.f665c = ((Boolean) ykVar.a(al.L7)).booleanValue();
        this.f666d = ((Boolean) ykVar.a(al.K7)).booleanValue();
        this.f667e = Collections.synchronizedMap(new l0(this));
    }

    public final synchronized void a(String str, String str2, qd0 qd0Var) {
        p9.k.C.f31304k.getClass();
        this.f667e.put(str, new m0(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        c();
        d(qd0Var);
    }

    public final synchronized String b(String str, qd0 qd0Var) {
        m0 m0Var = (m0) this.f667e.get(str);
        qd0Var.f9459a.put(CommonUrlParts.REQUEST_ID, str);
        if (m0Var == null) {
            qd0Var.f9459a.put("mhit", "false");
            return null;
        }
        qd0Var.f9459a.put("mhit", "true");
        return m0Var.f659b;
    }

    public final synchronized void c() {
        p9.k.C.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f667e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((m0) entry.getValue()).f658a.longValue() <= this.f664b) {
                    break;
                }
                this.f669g.add(new Pair((String) entry.getKey(), ((m0) entry.getValue()).f659b));
                it.remove();
            }
        } catch (ConcurrentModificationException e3) {
            p9.k.C.f31302h.d("QueryJsonMap.removeExpiredEntries", e3);
        }
    }

    public final synchronized void d(qd0 qd0Var) throws Throwable {
        try {
            try {
                if (this.f665c) {
                    ArrayDeque arrayDeque = this.f669g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f668f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    hx.f6279a.execute(new b(this, qd0Var, arrayDequeClone, arrayDequeClone2, 1));
                    return;
                }
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final void e(qd0 qd0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(qd0Var.f9459a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f666d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(hl.l.w(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f670h.a(this.i, false);
        }
    }
}
