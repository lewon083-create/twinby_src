package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10172c;

    public s4(int i, long j10, long j11) {
        ix.o(j10 < j11);
        this.f10170a = j10;
        this.f10171b = j11;
        this.f10172c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s4.class == obj.getClass()) {
            s4 s4Var = (s4) obj;
            if (this.f10170a == s4Var.f10170a && this.f10171b == s4Var.f10171b && this.f10172c == s4Var.f10172c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10170a), Long.valueOf(this.f10171b), Integer.valueOf(this.f10172c));
    }

    public final String toString() {
        String str = cq0.f4293a;
        Locale locale = Locale.US;
        StringBuilder sbN = gf.a.n("Segment: startTimeMs=", ", endTimeMs=", this.f10170a);
        sbN.append(this.f10171b);
        sbN.append(", speedDivisor=");
        sbN.append(this.f10172c);
        return sbN.toString();
    }
}
