package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.sentry.SentryReplayEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0631ya f23263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X9 f23264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ei f23265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0660ze f23266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gm f23267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0199h3 f23268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0399p2 f23269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0233ib f23270h;
    public final Dm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0459rd f23271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E9 f23272k;

    public Xl() {
        this(new C0233ib(), new C0631ya(), new X9(), new Ei(), new C0660ze(), new Gm(), new C0199h3(), new C0399p2(), new Dm(), new C0459rd(), new E9());
    }

    public final void a(C0089cm c0089cm, C0181gb c0181gb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c0181gb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c0089cm.f23625g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0181gb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c0089cm.f23627j = Em.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c0181gb.optJSONObject("locale");
        String string2 = "";
        c0089cm.f23630m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject(AdRevenueScheme.COUNTRY)) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c0181gb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c0089cm.f23629l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C0543um c0543um = new C0543um();
        JSONObject jSONObjectOptJSONObject9 = c0181gb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c0543um.f24858a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c0543um.f24858a);
        }
        this.f23267e.getClass();
        c0089cm.f23633p = new Fm(c0543um.f24858a);
        this.f23264b.getClass();
        C0444qm c0444qm = new C0444qm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0181gb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C0276k4 c0276k4 = new C0276k4();
                c0276k4.f24198a = X9.a(jSONObjectOptJSONObject10, "permissions_collecting", c0444qm.f24662a);
                c0276k4.f24199b = X9.a(jSONObjectOptJSONObject10, "features_collecting", c0444qm.f24663b);
                c0276k4.f24200c = X9.a(jSONObjectOptJSONObject10, "google_aid", c0444qm.f24664c);
                c0276k4.f24201d = X9.a(jSONObjectOptJSONObject10, "sim_info", c0444qm.f24665d);
                c0276k4.f24202e = X9.a(jSONObjectOptJSONObject10, "huawei_oaid", c0444qm.f24666e);
                c0276k4.f24203f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0089cm.f23620b = new C0326m4(c0276k4);
            }
        } catch (Throwable unused4) {
        }
        this.f23263a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0181gb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray(SentryReplayEvent.JsonKeys.URLS).getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c0089cm.f23622d = string;
                }
                ArrayList arrayListA2 = C0631ya.a(jSONObjectOptJSONObject11, "report");
                if (!ko.a((Collection) arrayListA2)) {
                    c0089cm.f23623e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray(SentryReplayEvent.JsonKeys.URLS).getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c0089cm.f23624f = string2;
                }
                ArrayList arrayListA3 = C0631ya.a(jSONObjectOptJSONObject11, "startup");
                if (!ko.a((Collection) arrayListA3)) {
                    c0089cm.f23621c = arrayListA3;
                }
                ArrayList arrayListA4 = C0631ya.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!ko.a((Collection) arrayListA4)) {
                    c0089cm.f23631n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C0631ya.f25093a.contains(next2) && (arrayListA = C0631ya.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c0089cm.f23632o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f23265c.getClass();
        C0568vm c0568vm = new C0568vm();
        JSONObject jSONObjectOptJSONObject12 = c0181gb.optJSONObject("retry_policy");
        int iOptInt = c0568vm.f24940w;
        int iOptInt2 = c0568vm.f24941x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c0568vm.f24941x);
        }
        c0089cm.f23634q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f23266d.getClass();
        if (c0089cm.f23620b.f24331a) {
            JSONObject jSONObjectOptJSONObject13 = c0181gb.optJSONObject("permissions_collecting");
            C0493sm c0493sm = new C0493sm();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c0493sm.f24745a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c0493sm.f24746b);
            } else {
                jOptLong = c0493sm.f24745a;
                jOptLong2 = c0493sm.f24746b;
            }
            c0089cm.f23628k = new C0610xe(jOptLong, jOptLong2);
        }
        C0199h3 c0199h3 = this.f23268f;
        c0199h3.getClass();
        C0369nm c0369nm = new C0369nm();
        JSONObject jSONObjectOptJSONObject14 = c0181gb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject14 != null) {
            c0369nm.f24455a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject14, "last_known_location_ttl", c0369nm.f24455a);
        }
        c0199h3.f23960a.getClass();
        c0089cm.f23635r = new C0121e3(c0369nm.f24455a);
        this.f23269g.getClass();
        C0399p2.a(c0089cm, c0181gb);
        Dm dm = this.i;
        dm.getClass();
        JSONObject jSONObjectOptJSONObject15 = c0181gb.optJSONObject("startup_update");
        C0518tm c0518tm = new C0518tm();
        Integer numA = AbstractC0207hb.a(jSONObjectOptJSONObject15, "interval_seconds", null);
        if (numA != null) {
            c0518tm.f24815a = numA.intValue();
        }
        dm.f22261a.getClass();
        c0089cm.f23637t = new Bm(c0518tm.f24815a);
        Map<String, Yc> mapC = this.f23271j.f24686a.c();
        C0435qd c0435qd = new C0435qd(c0181gb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Yc> entry : mapC.entrySet()) {
            Object objInvoke = c0435qd.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c0089cm.f23638u = linkedHashMap;
        D9 d92 = this.f23272k.f22286a;
        C0419pm c0419pm = new C0419pm();
        JSONObject jSONObjectOptJSONObject16 = c0181gb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject16 != null) {
            c0419pm.f24594a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject16, "collecting_interval_seconds", c0419pm.f24594a);
        }
        d92.getClass();
        c0089cm.f23639v = new C9(c0419pm.f24594a);
    }

    public Xl(C0233ib c0233ib, C0631ya c0631ya, X9 x92, Ei ei2, C0660ze c0660ze, Gm gm, C0199h3 c0199h3, C0399p2 c0399p2, Dm dm, C0459rd c0459rd, E9 e92) {
        this.f23263a = c0631ya;
        this.f23264b = x92;
        this.f23265c = ei2;
        this.f23266d = c0660ze;
        this.f23267e = gm;
        this.f23268f = c0199h3;
        this.f23269g = c0399p2;
        this.f23270h = c0233ib;
        this.i = dm;
        this.f23271j = c0459rd;
        this.f23272k = e92;
    }
}
