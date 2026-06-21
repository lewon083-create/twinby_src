package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.d f6847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6849d;

    public jh0(Activity activity, s9.d dVar, String str, String str2) {
        this.f6846a = activity;
        this.f6847b = dVar;
        this.f6848c = str;
        this.f6849d = str2;
    }

    public final boolean equals(Object obj) {
        s9.d dVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jh0) {
            jh0 jh0Var = (jh0) obj;
            String str3 = jh0Var.f6849d;
            String str4 = jh0Var.f6848c;
            s9.d dVar2 = jh0Var.f6847b;
            if (this.f6846a.equals(jh0Var.f6846a) && ((dVar = this.f6847b) != null ? dVar.equals(dVar2) : dVar2 == null) && ((str = this.f6848c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f6849d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6846a.hashCode() ^ 1000003;
        s9.d dVar = this.f6847b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        String str = this.f6848c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6849d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f6846a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f6847b);
        int length2 = strValueOf.length();
        String str = this.f6848c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f6849d;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        l7.o.t(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        l7.o.t(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
