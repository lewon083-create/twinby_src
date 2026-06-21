package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7551a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7552b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7553c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f7554d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f7555e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f7556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f7557g;

    public lk0(gx gxVar) {
        this.f7556f = gxVar;
    }

    public static final Bundle j(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized w51 a(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(p9.k.C.f31302h.g().n().f12770e) && (map = (Map) this.f7553c.get(str)) != null) {
                List<mk0> list = (List) map.get(str2);
                if (list == null) {
                    String strI = ix.i(this.f7557g, str2, str);
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3005fc)).booleanValue()) {
                        strI = strI.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strI);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (mk0 mk0Var : list) {
                        String str3 = mk0Var.f7901a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(mk0Var.f7902b);
                    }
                    return w51.a(map2);
                }
            }
            return w51.f11648h;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.f7551a;
            if (!map.containsKey(str)) {
                map.put(str, new mk0(new Bundle(), str));
            }
        }
    }

    public final synchronized void c() {
        this.f7552b.clear();
        this.f7551a.clear();
        this.f7555e.clear();
        this.f7554d.clear();
        f();
        d();
        e();
    }

    public final synchronized void d() {
        JSONObject jSONObject;
        if (!((Boolean) hm.f6183f.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3043i2)).booleanValue() && (jSONObject = p9.k.C.f31302h.g().n().f12772g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle bundleJ = j(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f7552b.put(strOptString, new ok0(strOptString, zOptBoolean2, zOptBoolean, true, bundleJ));
                        }
                    }
                } catch (JSONException e3) {
                    t9.c0.n("Malformed config loading JSON.", e3);
                }
            }
        }
    }

    public final synchronized void e() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) hm.f6179b.r()).booleanValue()) {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3057j2)).booleanValue() && (jSONObject = p9.k.C.f31302h.g().n().f12772g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString("platform");
                                ok0 ok0Var = new ok0(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f7554d.put(strOptString, ok0Var);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f7555e.put(strOptString, ok0Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e3) {
            t9.c0.n("Malformed config loading JSON.", e3);
        } finally {
        }
    }

    public final synchronized void f() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = p9.k.C.f31302h.g().n().f12772g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f7557g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) q9.s.f31967e.f31970c.a(al.f3005fc)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                    arrayList.addAll(g(jSONArrayOptJSONArray.getJSONObject(i10)));
                                }
                            }
                            h(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e3) {
                    t9.c0.n("Malformed config loading JSON.", e3);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleJ = j(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        String str = (String) arrayList2.get(i10);
                        b(str);
                        if (((mk0) this.f7551a.get(str)) != null) {
                            arrayList.add(new mk0(bundleJ, str));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = this.f7553c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList2 = (List) map2.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map2.put(str2, arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized w51 i(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(p9.k.C.f31302h.g().n().f12770e)) {
                wk wkVar = al.R3;
                q9.s sVar = q9.s.f31967e;
                boolean zMatches = Pattern.matches((String) sVar.f31970c.a(wkVar), str);
                boolean zMatches2 = Pattern.matches((String) sVar.f31970c.a(al.S3), str);
                if (zMatches) {
                    map = new HashMap(this.f7555e);
                } else if (zMatches2) {
                    map = new HashMap(this.f7554d);
                }
                return w51.a(map);
            }
            return w51.f11648h;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
