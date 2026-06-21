package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22954c;

    public S9(JSONObject jSONObject) {
        this.f22952a = jSONObject.getString("name");
        this.f22954c = jSONObject.getBoolean("required");
        this.f22953b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S9.class == obj.getClass()) {
            S9 s92 = (S9) obj;
            if (this.f22953b != s92.f22953b || this.f22954c != s92.f22954c) {
                return false;
            }
            String str = this.f22952a;
            String str2 = s92.f22952a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22952a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f22953b) * 31) + (this.f22954c ? 1 : 0);
    }

    public S9(String str, int i, boolean z5) {
        this.f22952a = str;
        this.f22953b = i;
        this.f22954c = z5;
    }
}
