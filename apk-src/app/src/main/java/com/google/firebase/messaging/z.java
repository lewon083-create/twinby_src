package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f14903d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14906c;

    public z(String str, String str2, long j10) {
        this.f14904a = str;
        this.f14905b = str2;
        this.f14906c = j10;
    }

    public static String a(String str, String str2, long j10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e3);
            return null;
        }
    }

    public static z b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new z(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new z(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e3);
            return null;
        }
    }
}
