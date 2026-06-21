package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0412pf implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f24582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final T7 f24585e;

    public C0412pf(String str, @NonNull JSONObject jSONObject, boolean z5, boolean z10, @NonNull T7 t72) {
        this.f24581a = str;
        this.f24582b = jSONObject;
        this.f24583c = z5;
        this.f24584d = z10;
        this.f24585e = t72;
    }

    @Override // io.appmetrica.analytics.impl.U7
    @NonNull
    public final T7 a() {
        return this.f24585e;
    }

    public final JSONObject b() {
        if (!this.f24583c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f24581a);
            if (this.f24582b.length() > 0) {
                jSONObject.put("additionalParams", this.f24582b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f24581a);
            jSONObject.put("additionalParams", this.f24582b);
            jSONObject.put("wasSet", this.f24583c);
            jSONObject.put("autoTracking", this.f24584d);
            jSONObject.put("source", this.f24585e.f23009a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f24581a + "', additionalParameters=" + this.f24582b + ", wasSet=" + this.f24583c + ", autoTrackingEnabled=" + this.f24584d + ", source=" + this.f24585e + '}';
    }

    @NonNull
    public static C0412pf a(JSONObject jSONObject) {
        T7 t72;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        T7[] t7ArrValues = T7.values();
        int length = t7ArrValues.length;
        while (true) {
            if (i >= length) {
                t72 = null;
                break;
            }
            t72 = t7ArrValues[i];
            if (Intrinsics.a(t72.f23009a, strOptStringOrNull2)) {
                break;
            }
            i++;
        }
        if (t72 == null) {
            t72 = T7.f23004b;
        }
        return new C0412pf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, t72);
    }
}
