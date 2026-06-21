package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f24991a;

    public wo(Ve ve2, Ao ao, String str) {
        this.f24991a = new xo(ve2, ao, new ig.a(18));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC0207hb.a(jSONObject2, "report_request_id", AbstractC0207hb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC0207hb.a(jSONObject2, "open_id", AbstractC0207hb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC0207hb.a(jSONObject2, "attribution_id", AbstractC0207hb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC0207hb.a(jSONObject2, "last_migration_api_level", AbstractC0207hb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j10) {
        xo xoVar = this.f24991a;
        xoVar.a(xoVar.a().put("session_id", j10));
    }

    public final synchronized boolean c() {
        return this.f24991a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f24991a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f24991a.a().optInt("open_id", 1);
    }

    public final synchronized void c(int i) {
        xo xoVar = this.f24991a;
        xoVar.a(xoVar.a().put("open_id", i));
    }

    public final synchronized void b(int i) {
        xo xoVar = this.f24991a;
        xoVar.a(xoVar.a().put("last_migration_api_level", i));
    }

    public final synchronized int a() {
        return this.f24991a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i) {
        xo xoVar = this.f24991a;
        xoVar.a(xoVar.a().put("attribution_id", i));
    }

    public final synchronized void a(long j10) {
        xo xoVar = this.f24991a;
        xoVar.a(xoVar.a().put("external_attribution_window_start", j10));
    }
}
