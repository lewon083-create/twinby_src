package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4378h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f4383n;

    public cy(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f4371a = a(jSONObject, "aggressive_media_codec_release", al.f3055j0);
        this.f4372b = b(jSONObject, "byte_buffer_precache_limit", al.f3101m);
        this.f4373c = b(jSONObject, "exo_cache_buffer_size", al.f3247w);
        this.f4374d = b(jSONObject, "exo_connect_timeout_millis", al.i);
        wk wkVar = al.f3025h;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f4375e = b(jSONObject, "exo_read_timeout_millis", al.f3054j);
        this.f4376f = b(jSONObject, "load_check_interval_bytes", al.f3070k);
        this.f4377g = b(jSONObject, "player_precache_limit", al.f3086l);
        this.f4378h = b(jSONObject, "socket_receive_buffer_size", al.f3115n);
        this.i = a(jSONObject, "use_cache_data_source", al.Z4);
        b(jSONObject, "min_retry_count", al.f3130o);
        this.f4379j = a(jSONObject, "treat_load_exception_as_non_fatal", al.f3160q);
        this.f4380k = a(jSONObject, "enable_multiple_video_playback", al.o2);
        this.f4381l = a(jSONObject, "use_range_http_data_source", al.q2);
        wk wkVar2 = al.f3176r2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) q9.s.f31967e.f31970c.a(wkVar2)).longValue();
            }
        } else {
            jLongValue = ((Long) q9.s.f31967e.f31970c.a(wkVar2)).longValue();
        }
        this.f4382m = jLongValue;
        wk wkVar3 = al.f3191s2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) q9.s.f31967e.f31970c.a(wkVar3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) q9.s.f31967e.f31970c.a(wkVar3)).longValue();
        }
        this.f4383n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, wk wkVar) {
        boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(wkVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, wk wkVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) q9.s.f31967e.f31970c.a(wkVar)).intValue();
    }
}
