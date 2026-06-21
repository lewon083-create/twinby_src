package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.sentry.SentryLockReason;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0283kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f24223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f24225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24227h;
    public final CounterConfigurationReporterType i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24228j;

    public C0283kb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f24220a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f24221b = jSONObject2.getString("name");
        this.f24222c = jSONObject2.getInt("bytes_truncated");
        this.f24228j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f24223d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC0207hb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f24223d.put(M3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f24224e = jSONObject3.getString(SentryLockReason.JsonKeys.PACKAGE_NAME);
        this.f24225f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f24226g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f24227h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
    }

    public final String a() {
        return this.f24227h;
    }

    public final int b() {
        return this.f24222c;
    }

    public final byte[] c() {
        return this.f24220a;
    }

    public final String d() {
        return this.f24228j;
    }

    public final String e() {
        return this.f24221b;
    }

    public final String f() {
        return this.f24224e;
    }

    public final Integer g() {
        return this.f24225f;
    }

    public final String h() {
        return this.f24226g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.i;
    }

    @NonNull
    public final HashMap<M3, Integer> j() {
        return this.f24223d;
    }

    public final String k() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f24223d.entrySet()) {
            map.put(((M3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f24225f).put("psid", this.f24226g).put(SentryLockReason.JsonKeys.PACKAGE_NAME, this.f24224e)).put("reporter_configuration", new JSONObject().put("api_key", this.f24227h).put("reporter_type", this.i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f24220a, 0)).put("name", this.f24221b).put("bytes_truncated", this.f24222c).put("trimmed_fields", AbstractC0207hb.b(map)).putOpt("environment", this.f24228j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0283kb(@NonNull Q5 q5, @NonNull I3 i32, HashMap<M3, Integer> map) {
        this.f24220a = q5.getValueBytes();
        this.f24221b = q5.getName();
        this.f24222c = q5.getBytesTruncated();
        if (map != null) {
            this.f24223d = map;
        } else {
            this.f24223d = new HashMap();
        }
        Af afA = i32.a();
        this.f24224e = afA.e();
        this.f24225f = afA.f();
        this.f24226g = afA.g();
        CounterConfiguration counterConfigurationB = i32.b();
        this.f24227h = counterConfigurationB.getApiKey();
        this.i = counterConfigurationB.getReporterType();
        this.f24228j = q5.f();
    }
}
