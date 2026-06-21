package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f12772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12773h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12774j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12766a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12767b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12768c = new HashMap();
    public final ArrayList i = new ArrayList();

    public yw(String str, long j10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f12769d = "";
        this.f12773h = false;
        this.f12774j = false;
        this.f12770e = str;
        this.f12771f = j10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f12772g = new JSONObject(str);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Rc)).booleanValue() && a()) {
                return;
            }
            if (this.f12772g.optInt("status", -1) != 1) {
                this.f12773h = false;
                u9.i.h("App settings could not be fetched successfully.");
                return;
            }
            this.f12773h = true;
            this.f12769d = this.f12772g.optString(CommonUrlParts.APP_ID);
            JSONArray jSONArrayOptJSONArray2 = this.f12772g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f12767b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f12768c.put(strOptString2, new er(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f12772g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray3.length(); i10++) {
                    this.f12766a.add(jSONArrayOptJSONArray3.optString(i10));
                }
            }
            if (((Boolean) q9.s.f31967e.f31970c.a(al.E7)).booleanValue() && (jSONObjectOptJSONObject2 = this.f12772g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    this.i.add(jSONArrayOptJSONArray.get(i11).toString());
                }
            }
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.Z6)).booleanValue() || (jSONObjectOptJSONObject = this.f12772g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f12774j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e3) {
            u9.i.i("Exception occurred while processing app setting json", e3);
            p9.k.C.f31302h.d("AppSettings.parseAppSettingsJson", e3);
        }
    }

    public final boolean a() {
        if (b()) {
            return false;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.S4)).booleanValue()) {
            p9.k kVar = p9.k.C;
            sd0 sd0Var = kVar.f31302h.i;
            if (sd0Var != null) {
                zd1 zd1VarA = sd0Var.a();
                zd1VarA.v("action", "cld_reset");
                zd1VarA.v("cld_lut_ms", String.valueOf(this.f12771f));
                kVar.f31304k.getClass();
                zd1VarA.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
                zd1VarA.v("cld_ttl_sec", String.valueOf(c()));
                zd1VarA.w();
            }
        }
        this.f12766a.clear();
        this.f12767b.clear();
        this.f12768c.clear();
        this.f12769d = "";
        this.f12770e = "";
        this.f12772g = null;
        this.f12773h = false;
        this.i.clear();
        this.f12774j = false;
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f12770e) || this.f12772g == null) {
            return true;
        }
        long jC = c();
        p9.k.C.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jC < 0) {
            return true;
        }
        long j10 = this.f12771f;
        return j10 <= jCurrentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j10) <= jC;
    }

    public final long c() {
        wk wkVar = al.Uc;
        q9.s sVar = q9.s.f31967e;
        long jLongValue = ((Long) sVar.f31970c.a(wkVar)).longValue();
        wk wkVar2 = al.Tc;
        yk ykVar = sVar.f31970c;
        return (!((Boolean) ykVar.a(wkVar2)).booleanValue() || TextUtils.isEmpty(this.f12770e)) ? jLongValue : this.f12772g.optLong("cache_ttl_sec", ((Long) ykVar.a(wkVar)).longValue());
    }
}
