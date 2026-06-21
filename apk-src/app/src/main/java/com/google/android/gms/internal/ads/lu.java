package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.Session;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f7622h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7626m;

    public lu(JSONObject jSONObject) {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f7620f = jSONObject.optString("url");
        this.f7616b = jSONObject.optString("base_uri");
        this.f7617c = jSONObject.optString("post_parameters");
        this.f7618d = a(jSONObject.optString("drt_include"));
        this.f7626m = jSONObject.optString(SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE);
        this.f7625l = a(jSONObject.optString("use_compression"));
        this.f7619e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString(CommonUrlParts.REQUEST_ID);
        jSONObject.optString("type");
        String strOptString = jSONObject.optString(Session.JsonKeys.ERRORS);
        this.f7615a = strOptString == null ? null : Arrays.asList(strOptString.split(StringUtils.COMMA));
        this.f7621g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f7622h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
                lValueOf = lValueOf2;
            }
        }
        this.f7623j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f7624k = lValueOf2.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
