package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0 f5338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf0 f5339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0 f5340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bf0 f5341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac.i f5342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf0 f5343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gw f5344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gw f5345h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f5346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5347k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public JSONObject f5352p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5357u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f5348l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f5349m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f5350n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5351o = "{}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5353q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public cf0 f5354r = cf0.f4194b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ef0 f5358v = ef0.f4930b;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5359w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5360x = "";

    public ff0(hf0 hf0Var, qf0 qf0Var, ue0 ue0Var, Context context, u9.a aVar, bf0 bf0Var, pf0 pf0Var, gw gwVar, gw gwVar2, String str) {
        this.f5338a = hf0Var;
        this.f5339b = qf0Var;
        this.f5340c = ue0Var;
        this.f5342e = new ac.i(context, 1);
        this.i = aVar.f34365b;
        this.f5347k = str;
        this.f5341d = bf0Var;
        this.f5343f = pf0Var;
        this.f5344g = gwVar;
        this.f5345h = gwVar2;
        this.f5346j = context;
        p9.k.C.f31308o.f33632g = this;
    }

    public final void a() {
        String str;
        boolean z5;
        wk wkVar = al.fa;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            if (((Boolean) sVar.f31970c.a(al.f3229ua)).booleanValue()) {
                t9.e0 e0VarG = p9.k.C.f31302h.g();
                e0VarG.i();
                synchronized (e0VarG.f33564a) {
                    z5 = e0VarG.f33587y;
                }
                if (z5) {
                    j();
                    return;
                }
            }
            t9.e0 e0VarG2 = p9.k.C.f31302h.g();
            e0VarG2.i();
            synchronized (e0VarG2.f33564a) {
                str = e0VarG2.f33586x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z5) {
        if (!this.f5357u && z5) {
            j();
        }
        g(z5, true);
    }

    public final synchronized void c(String str, we0 we0Var) {
        wk wkVar = al.fa;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && f()) {
            if (this.f5356t >= ((Integer) sVar.f31970c.a(al.f3035ha)).intValue()) {
                u9.i.h("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.f5348l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f5356t++;
            ((List) map.get(str)).add(we0Var);
            if (((Boolean) sVar.f31970c.a(al.Da)).booleanValue()) {
                String str2 = we0Var.f11783d;
                this.f5349m.put(str2, we0Var);
                HashMap map2 = this.f5350n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((jx) it.next()).b(we0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized jx d(String str) {
        jx jxVar;
        try {
            jxVar = new jx();
            HashMap map = this.f5349m;
            if (map.containsKey(str)) {
                jxVar.b((we0) map.get(str));
            } else {
                HashMap map2 = this.f5350n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(jxVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jxVar;
    }

    public final synchronized void e(q9.o1 o1Var, ef0 ef0Var) {
        if (!f()) {
            try {
                o1Var.j0(vv.C(18, null, null));
                return;
            } catch (RemoteException unused) {
                u9.i.h("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.fa)).booleanValue()) {
            this.f5358v = ef0Var;
            this.f5338a.a(o1Var, new wo(this, 1), new ko(4, this.f5343f), new wo(this, 0));
            return;
        } else {
            try {
                o1Var.j0(vv.C(1, null, null));
                return;
            } catch (RemoteException unused2) {
                u9.i.h("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3229ua)).booleanValue()) {
            return this.f5355s || p9.k.C.f31308o.g();
        }
        return this.f5355s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f5355s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f5355s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f3229ua     // Catch: java.lang.Throwable -> L27
            q9.s r0 = q9.s.f31967e     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.yk r0 = r0.f31970c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            p9.k r2 = p9.k.C     // Catch: java.lang.Throwable -> L27
            t9.l r2 = r2.f31308o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.k()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.l()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.m()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ff0.g(boolean, boolean):void");
    }

    public final synchronized void h(cf0 cf0Var, boolean z5) {
        try {
            if (this.f5354r != cf0Var) {
                if (f()) {
                    l();
                }
                this.f5354r = cf0Var;
                if (f()) {
                    k();
                }
                if (z5) {
                    m();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f5348l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (we0 we0Var : (List) entry.getValue()) {
                    if (we0Var.f11785f != ve0.f11366b) {
                        jSONArray.put(we0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final void j() {
        String str;
        String str2;
        this.f5357u = true;
        bf0 bf0Var = this.f5341d;
        bf0Var.getClass();
        ye0 ye0Var = new ye0(0, bf0Var);
        se0 se0Var = bf0Var.f3769a;
        se0Var.getClass();
        se0Var.f10271e.f6961b.a(new l81(27, se0Var, ye0Var), se0Var.f10275j);
        this.f5338a.f6121d = this;
        this.f5339b.f9494f = this;
        this.f5340c.i = this;
        this.f5343f.f9046g = this;
        wk wkVar = al.Ja;
        q9.s sVar = q9.s.f31967e;
        if (!TextUtils.isEmpty((CharSequence) sVar.f31970c.a(wkVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5346j);
            List listAsList = Arrays.asList(((String) sVar.f31970c.a(wkVar)).split(StringUtils.COMMA));
            gw gwVar = this.f5344g;
            gwVar.f5921c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gwVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                gwVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        wk wkVar2 = al.Ka;
        if (!TextUtils.isEmpty((CharSequence) sVar.f31970c.a(wkVar2))) {
            SharedPreferences sharedPreferences = this.f5346j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) sVar.f31970c.a(wkVar2)).split(StringUtils.COMMA));
            gw gwVar2 = this.f5345h;
            gwVar2.f5921c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(gwVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                gwVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        t9.e0 e0VarG = p9.k.C.f31302h.g();
        e0VarG.i();
        synchronized (e0VarG.f33564a) {
            str = e0VarG.f33586x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((cf0) Enum.valueOf(cf0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f5351o = jSONObject.optString("networkExtras", "{}");
                    this.f5353q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        t9.e0 e0VarG2 = p9.k.C.f31302h.g();
        e0VarG2.i();
        synchronized (e0VarG2.f33564a) {
            str2 = e0VarG2.A;
        }
        this.f5360x = str2;
    }

    public final synchronized void k() {
        int iOrdinal = this.f5354r.ordinal();
        if (iOrdinal == 1) {
            this.f5339b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f5340c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.f5354r.ordinal();
            if (iOrdinal == 1) {
                qf0 qf0Var = this.f5339b;
                synchronized (qf0Var) {
                    try {
                        if (qf0Var.f9495g) {
                            SensorManager sensorManager2 = qf0Var.f9490b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(qf0Var, qf0Var.f9491c);
                                t9.c0.m("Stopped listening for shake gestures.");
                            }
                            qf0Var.f9495g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            ue0 ue0Var = this.f5340c;
            synchronized (ue0Var) {
                try {
                    if (ue0Var.f10926j && (sensorManager = ue0Var.f10918a) != null && (sensor = ue0Var.f10919b) != null) {
                        sensorManager.unregisterListener(ue0Var, sensor);
                        ue0Var.f10926j = false;
                        t9.c0.m("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public final void m() {
        String string;
        p9.k kVar = p9.k.C;
        t9.e0 e0VarG = kVar.f31302h.g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f5355s);
                jSONObject.put("gesture", this.f5354r);
                long j10 = this.f5353q;
                kVar.f31304k.getClass();
                if (j10 > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.f5351o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f5353q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        e0VarG.getClass();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.fa)).booleanValue()) {
            e0VarG.i();
            synchronized (e0VarG.f33564a) {
                try {
                    if (e0VarG.f33586x.equals(string)) {
                        return;
                    }
                    e0VarG.f33586x = string;
                    SharedPreferences.Editor editor = e0VarG.f33570g;
                    if (editor != null) {
                        editor.putString("inspector_info", string);
                        e0VarG.f33570g.apply();
                    }
                    e0VarG.j();
                } finally {
                }
            }
        }
    }
}
