package ge;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.tasks.Task;
import fj.k0;
import he.m;
import he.o;
import he.p;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f20122l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd.c f20123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he.c f20125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final he.c f20126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final he.c f20127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final he.g f20128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final he.h f20129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f20130h;
    public final zd.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bb.e f20131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bb.e f20132k;

    public e(zd.d dVar, gd.c cVar, Executor executor, he.c cVar2, he.c cVar3, he.c cVar4, he.g gVar, he.h hVar, m mVar, bb.e eVar, bb.e eVar2) {
        this.i = dVar;
        this.f20123a = cVar;
        this.f20124b = executor;
        this.f20125c = cVar2;
        this.f20126d = cVar3;
        this.f20127e = cVar4;
        this.f20128f = gVar;
        this.f20129g = hVar;
        this.f20130h = mVar;
        this.f20131j = eVar;
        this.f20132k = eVar2;
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        he.g gVar = this.f20128f;
        long j10 = gVar.f20514g.f20547a.getLong("minimum_fetch_interval_in_seconds", he.g.i);
        HashMap map = new HashMap(gVar.f20515h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return gVar.f20512e.b().f(gVar.f20510c, new e9.g(gVar, j10, map)).j(nd.i.f29319b, new k0(13));
    }

    public final HashMap b() {
        String string;
        p pVar;
        he.h hVar = this.f20129g;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(he.h.a(hVar.f20519c));
        hashSet.addAll(he.h.a(hVar.f20520d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            he.d dVarC = hVar.f20519c.c();
            String string2 = null;
            if (dVarC == null) {
                string = null;
            } else {
                try {
                    string = dVarC.f20496b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                he.d dVarC2 = hVar.f20519c.c();
                if (dVarC2 != null) {
                    synchronized (hVar.f20517a) {
                        try {
                            Iterator it = hVar.f20517a.iterator();
                            while (it.hasNext()) {
                                hVar.f20518b.execute(new a1.c((j) it.next(), str, dVarC2, 16));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                pVar = new p(string, 2);
            } else {
                he.d dVarC3 = hVar.f20520d.c();
                if (dVarC3 != null) {
                    try {
                        string2 = dVarC3.f20496b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    pVar = new p(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    pVar = new p("", 0);
                }
            }
            map.put(str, pVar);
        }
        return map;
    }

    public final o c() {
        o oVar;
        m mVar = this.f20130h;
        synchronized (mVar.f20548b) {
            try {
                long j10 = mVar.f20547a.getLong("last_fetch_time_in_millis", -1L);
                int i = mVar.f20547a.getInt("last_fetch_status", 0);
                u0 u0Var = new u0();
                long j11 = mVar.f20547a.getLong("fetch_timeout_in_seconds", 60L);
                if (j11 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
                }
                u0Var.f10771b = j11;
                u0Var.a(mVar.f20547a.getLong("minimum_fetch_interval_in_seconds", he.g.i));
                oVar = new o(j10, i, new u0(u0Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public final void d(boolean z5) {
        HttpURLConnection httpURLConnection;
        bb.e eVar = this.f20131j;
        synchronized (eVar) {
            he.k kVar = (he.k) eVar.f2021e;
            synchronized (kVar.f20542r) {
                try {
                    kVar.f20530e = z5;
                    yi0 yi0Var = kVar.f20532g;
                    if (yi0Var != null) {
                        yi0Var.f12622b = z5;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z5 && (httpURLConnection = kVar.f20531f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z5) {
                eVar.a();
            }
        }
    }
}
