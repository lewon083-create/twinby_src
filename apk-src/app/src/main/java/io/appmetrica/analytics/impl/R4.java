package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22910b;

    public R4(String str, String str2) {
        this.f22909a = str;
        this.f22910b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f22910b);
    }

    public final String b() {
        return this.f22910b;
    }

    public final String c() {
        return this.f22909a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f22909a + "_" + ApiKeyUtils.createPartialApiKey(this.f22910b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            R4 r42 = (R4) obj;
            String str = this.f22909a;
            if (str == null ? r42.f22909a != null : !str.equals(r42.f22909a)) {
                return false;
            }
            String str2 = this.f22910b;
            String str3 = r42.f22910b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22909a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22910b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f22909a + "_" + this.f22910b;
    }
}
