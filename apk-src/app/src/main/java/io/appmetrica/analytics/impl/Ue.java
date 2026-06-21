package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ue extends AbstractC0634yd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Xe f23074d = new Xe("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Xe f23075e = new Xe("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Xe f23076f = new Xe("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Xe f23077g = new Xe("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Xe f23078h = new Xe("AD_URL_REPORT_RESULT", null);
    public static final Xe i = new Xe("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Xe f23079j = new Xe("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Xe f23080k = new Xe("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Xe f23081l = new Xe("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Xe f23082m = new Xe("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xe f23083n = new Xe("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Xe f23084o = new Xe("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Xe f23085p = new Xe("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Xe f23086q = new Xe("GAID", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Xe f23087r = new Xe("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Xe f23088s = new Xe("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Xe f23089t = new Xe("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Xe f23090u = new Xe("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Xe f23091v = new Xe("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Xe f23092w = new Xe("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Xe f23093x = new Xe("APPMETRICA_CLIENT_CONFIG", null);

    public Ue(Ia ia2) {
        super(ia2);
    }

    public final boolean a(boolean z5) {
        return this.f23219a.getBoolean(f23089t.f23251b, z5);
    }

    public final long b(long j10) {
        return this.f23219a.getLong(f23079j.f23250a, j10);
    }

    @NonNull
    public final Ue c(IdentifiersResult identifiersResult) {
        return a(f23081l.f23251b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f23077g.f23251b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f23078h.f23251b);
    }

    @NonNull
    public final Ue f(IdentifiersResult identifiersResult) {
        return a(f23086q.f23251b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f23081l.f23251b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f23076f.f23251b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f23075e.f23251b);
    }

    @NonNull
    public final W9 k() {
        String string = this.f23219a.getString(f23092w.f23251b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new W9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new W9(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f23086q.f23251b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f23087r.f23251b);
    }

    @NonNull
    public final long n() {
        return this.f23219a.getLong(f23085p.f23251b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f23080k.f23251b);
    }

    public final ScreenInfo p() {
        return AbstractC0207hb.e(this.f23219a.getString(f23090u.f23251b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f23074d.f23251b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f23088s.f23251b);
    }

    public final boolean s() {
        return this.f23219a.getBoolean(f23083n.f23251b, false);
    }

    public final boolean t() {
        return this.f23219a.getBoolean(f23091v.f23251b, false);
    }

    public final Ue u() {
        return (Ue) b(f23083n.f23251b, true);
    }

    public final void v() {
        b(f23091v.f23251b, true);
    }

    public final List<String> g() {
        String string = this.f23219a.getString(i.f23251b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0207hb.b(string);
    }

    public final long a(long j10) {
        return this.f23219a.getLong(f23084o.f23251b, j10);
    }

    @NonNull
    public final Ue b(IdentifiersResult identifiersResult) {
        return a(f23078h.f23251b, identifiersResult);
    }

    public final Ue c(long j10) {
        return (Ue) b(f23084o.f23251b, j10);
    }

    @NonNull
    public final Ue d(IdentifiersResult identifiersResult) {
        return a(f23076f.f23251b, identifiersResult);
    }

    @NonNull
    public final Ue e(IdentifiersResult identifiersResult) {
        return a(f23075e.f23251b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f23219a.getString(f23093x.f23251b, null);
        if (string == null) {
            return null;
        }
        return new H3().a(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f23219a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    public final Ue i(IdentifiersResult identifiersResult) {
        return a(f23074d.f23251b, identifiersResult);
    }

    @NonNull
    public final Ue j(IdentifiersResult identifiersResult) {
        return a(f23088s.f23251b, identifiersResult);
    }

    @NonNull
    public final Ue g(IdentifiersResult identifiersResult) {
        return a(f23087r.f23251b, identifiersResult);
    }

    @NonNull
    public final Ue a(IdentifiersResult identifiersResult) {
        return a(f23077g.f23251b, identifiersResult);
    }

    public final Ue b(boolean z5) {
        return (Ue) b(f23089t.f23251b, z5);
    }

    @NonNull
    public final Ue d(long j10) {
        return (Ue) b(f23085p.f23251b, j10);
    }

    public final Ue e(long j10) {
        return (Ue) b(f23079j.f23251b, j10);
    }

    public final String i(String str) {
        return this.f23219a.getString(f23082m.f23251b, str);
    }

    public final Ue j(String str) {
        return (Ue) b(f23082m.f23251b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0634yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Xe(str, null).f23251b;
    }

    public final Ue a(List<String> list) {
        return (Ue) b(i.f23251b, ko.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final Ue h(IdentifiersResult identifiersResult) {
        return a(f23080k.f23251b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0634yd
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Ue g(@NonNull String str) {
        return (Ue) d(new Xe(str, null).f23251b);
    }

    @NonNull
    public final Ue a(@NonNull W9 w92) {
        String str = f23092w.f23251b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", w92.f23212a).put("STATUS", w92.f23213b.getValue()).putOpt("ERROR_EXPLANATION", w92.f23214c);
        } catch (Throwable unused) {
        }
        return (Ue) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f23090u.f23251b, AbstractC0207hb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f23093x.f23251b, appMetricaConfig.toJson());
    }

    public final Ue a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f25138id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
