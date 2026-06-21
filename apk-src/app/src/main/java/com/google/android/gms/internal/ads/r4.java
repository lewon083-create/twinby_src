package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9695c;

    public r4(String str, String str2, String str3) {
        super(str);
        this.f9694b = str2;
        this.f9695c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r4.class == obj.getClass()) {
            r4 r4Var = (r4) obj;
            if (this.f7384a.equals(r4Var.f7384a) && Objects.equals(this.f9694b, r4Var.f9694b) && Objects.equals(this.f9695c, r4Var.f9695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7384a.hashCode() + 527;
        String str = this.f9694b;
        return this.f9695c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f9695c;
        return t.z.g(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
