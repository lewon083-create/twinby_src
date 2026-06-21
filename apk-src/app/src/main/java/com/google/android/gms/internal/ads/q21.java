package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f9296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9301f;

    public q21(IBinder iBinder, String str, int i, float f10, int i10, String str2) {
        this.f9296a = iBinder;
        this.f9297b = str;
        this.f9298c = i;
        this.f9299d = f10;
        this.f9300e = i10;
        this.f9301f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q21) {
            q21 q21Var = (q21) obj;
            String str3 = q21Var.f9301f;
            String str4 = q21Var.f9297b;
            if (this.f9296a.equals(q21Var.f9296a) && ((str = this.f9297b) != null ? str.equals(str4) : str4 == null) && this.f9298c == q21Var.f9298c && Float.floatToIntBits(this.f9299d) == Float.floatToIntBits(q21Var.f9299d) && this.f9300e == q21Var.f9300e && ((str2 = this.f9301f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9296a.hashCode() ^ 1000003;
        String str = this.f9297b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f9298c) * 1000003) ^ Float.floatToIntBits(this.f9299d);
        String str2 = this.f9301f;
        return ((((iHashCode2 * 1525764945) ^ this.f9300e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.f9296a.toString();
        int length = string.length();
        String str = this.f9297b;
        int length2 = String.valueOf(str).length();
        int i = this.f9298c;
        int length3 = String.valueOf(i).length();
        float f10 = this.f9299d;
        int length4 = String.valueOf(f10).length();
        int i10 = this.f9300e;
        int length5 = String.valueOf(i10).length();
        String str2 = this.f9301f;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        l7.o.t(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb2.append(i10);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }
}
