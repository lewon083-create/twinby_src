package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11826e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk(int i, String str, Object obj, Object obj2, int i10) {
        this(i, obj, obj2, str);
        this.f11826e = i10;
    }

    public static wk e(int i, int i10, String str) {
        return new wk(1, str, Integer.valueOf(i), Integer.valueOf(i10), 1);
    }

    public static wk f(long j10, long j11, String str) {
        return new wk(1, str, Long.valueOf(j10), Long.valueOf(j11), 2);
    }

    public static wk g(String str, float f10, float f11) {
        return new wk(1, str, Float.valueOf(f10), Float.valueOf(f11), 3);
    }

    public static void h() {
        Object obj = null;
        ((ArrayList) q9.s.f31967e.f31968a.f8763d).add(new wk(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        ((ArrayList) q9.s.f31967e.f31968a.f8764e).add(new wk(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f11826e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f11823b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f11823b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f11823b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f11823b, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(this.f11823b, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f11826e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f11823b, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f11823b, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f11823b, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f11823b, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(this.f11823b, (String) c());
        }
    }

    public final Object c() {
        return q9.s.f31967e.f31970c.i ? this.f11825d : this.f11824c;
    }

    public final Object d() {
        return q9.s.f31967e.f31970c.a(this);
    }

    public wk(int i, Object obj, Object obj2, String str) {
        this.f11822a = i;
        this.f11823b = str;
        this.f11824c = obj;
        this.f11825d = obj2;
        ((ArrayList) q9.s.f31967e.f31968a.f8762c).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wk(String str, String str2, String str3) {
        this(1, str2, str3, str);
        this.f11826e = 4;
    }
}
