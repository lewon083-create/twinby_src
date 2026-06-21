package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9640b;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public qy1(String str, String str2) {
        this.f9639a = cq0.o(str);
        this.f9640b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qy1.class == obj.getClass()) {
            qy1 qy1Var = (qy1) obj;
            if (Objects.equals(this.f9639a, qy1Var.f9639a) && Objects.equals(this.f9640b, qy1Var.f9640b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9640b.hashCode() * 31;
        String str = this.f9639a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
