package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f6493c;

    public ih0(String str, String str2, Drawable drawable) {
        this.f6491a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f6492b = str2;
        this.f6493c = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ih0) {
            ih0 ih0Var = (ih0) obj;
            Drawable drawable2 = ih0Var.f6493c;
            String str = ih0Var.f6491a;
            String str2 = this.f6491a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f6492b.equals(ih0Var.f6492b) && ((drawable = this.f6493c) != null ? drawable.equals(drawable2) : drawable2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6491a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f6492b.hashCode();
        Drawable drawable = this.f6493c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6493c);
        String str = this.f6491a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.f6492b;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        l7.o.t(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return t.z.g(sb2, ", icon=", strValueOf, "}");
    }
}
