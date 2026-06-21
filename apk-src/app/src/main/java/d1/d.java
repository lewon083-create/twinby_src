package d1;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15516b;

    public d(int i, int i10) {
        this.f15515a = i;
        this.f15516b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15515a == dVar.f15515a && this.f15516b == dVar.f15516b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15516b) + (Integer.hashCode(this.f15515a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb2.append(this.f15515a);
        sb2.append(", encodeRate=");
        return om1.l(sb2, this.f15516b, ')');
    }
}
