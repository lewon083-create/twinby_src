package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8177d;

    public n4(String str, String str2, String str3) {
        super("----");
        this.f8175b = str;
        this.f8176c = str2;
        this.f8177d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n4.class == obj.getClass()) {
            n4 n4Var = (n4) obj;
            if (Objects.equals(this.f8176c, n4Var.f8176c) && Objects.equals(this.f8175b, n4Var.f8175b) && Objects.equals(this.f8177d, n4Var.f8177d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8177d.hashCode() + ((this.f8176c.hashCode() + ((this.f8175b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final String toString() {
        String str = this.f7384a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f8175b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f8176c;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        l7.o.t(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
