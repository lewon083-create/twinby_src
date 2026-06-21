package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7158b;

    public ka(String str, String str2) {
        this.f7157a = str;
        this.f7158b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ka.class == obj.getClass()) {
            ka kaVar = (ka) obj;
            if (TextUtils.equals(this.f7157a, kaVar.f7157a) && TextUtils.equals(this.f7158b, kaVar.f7158b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7158b.hashCode() + (this.f7157a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f7157a;
        int length = String.valueOf(str).length();
        String str2 = this.f7158b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        l7.o.t(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }
}
