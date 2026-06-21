package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ve extends AbstractC0634yd implements Ao {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f23135d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23136e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f23137f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f23138g = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f23148r = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Xe f23139h = new Xe("PERMISSIONS_CHECK_TIME", null);
    public static final Xe i = new Xe("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Xe f23140j = new Xe("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Xe f23141k = new Xe("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Xe f23142l = new Xe("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Xe f23143m = new Xe("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xe f23144n = new Xe("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Xe f23145o = new Xe("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Xe f23146p = new Xe("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Xe f23147q = new Xe("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Xe f23149s = new Xe("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public Ve(Ia ia2) {
        super(ia2);
    }

    public final Ve a(C0222i0 c0222i0) {
        synchronized (this) {
            b(f23140j.f23251b, c0222i0.f24033a);
            b(f23141k.f23251b, c0222i0.f24034b);
        }
        return this;
    }

    public final void b(boolean z5) {
        b(f23149s.f23251b, z5);
    }

    @Override // io.appmetrica.analytics.impl.We
    @NonNull
    public final Set<String> c() {
        return this.f23219a.a();
    }

    public final C0222i0 d() {
        C0222i0 c0222i0;
        synchronized (this) {
            c0222i0 = new C0222i0(this.f23219a.getString(f23140j.f23251b, "{}"), this.f23219a.getLong(f23141k.f23251b, 0L));
        }
        return c0222i0;
    }

    public final String e() {
        return this.f23219a.getString(f23143m.f23251b, "");
    }

    public final Map<String, Long> f() {
        HashMap map = new HashMap();
        try {
            String string = this.f23219a.getString(f23147q.f23251b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    @NonNull
    public final List<String> g() {
        String str = f23144n.f23251b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f23219a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f23219a.getInt(f23142l.f23251b, -1);
    }

    public final long i() {
        return this.f23219a.getLong(f23139h.f23251b, 0L);
    }

    public final String j() {
        return this.f23219a.getString(i.f23251b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap map = new HashMap();
        try {
            String string = this.f23219a.getString(f23146p.f23251b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f23146p.f23251b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f23219a.getString(new Xe(f23148r, str).f23251b, "");
    }

    public final Ve i(String str) {
        return (Ve) b(f23143m.f23251b, str);
    }

    public final Ve j(String str) {
        return (Ve) b(i.f23251b, str);
    }

    public final Ve e(String str, String str2) {
        return (Ve) b(new Xe(f23148r, str).f23251b, str2);
    }

    public final Ve a(long j10) {
        return (Ve) b(f23139h.f23251b, j10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0634yd
    @NonNull
    public final String f(@NonNull String str) {
        return new Xe(str, null).f23251b;
    }

    public final Ve a(int i10) {
        return (Ve) b(f23142l.f23251b, i10);
    }

    public final Ve a(List<String> list) {
        return (Ve) a(f23144n.f23251b, list);
    }

    public final boolean a(boolean z5) {
        return this.f23219a.getBoolean(f23149s.f23251b, z5);
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final String a() {
        return this.f23219a.getString(f23145o.f23251b, null);
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final void a(@NonNull String str) {
        b(f23145o.f23251b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f23147q.f23251b, jSONObject.toString());
    }
}
