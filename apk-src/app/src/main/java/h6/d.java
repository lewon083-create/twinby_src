package h6;

import com.google.android.gms.internal.ads.om1;
import l7.o;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20442c;

    public d(int i, long j10, long j11) {
        this.f20440a = j10;
        this.f20441b = j11;
        this.f20442c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20440a == dVar.f20440a && this.f20441b == dVar.f20441b && this.f20442c == dVar.f20442c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20442c) + o.d(this.f20441b, Long.hashCode(this.f20440a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f20440a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f20441b);
        sb2.append(", TopicCode=");
        return om1.k("Topic { ", z.d(this.f20442c, " }", sb2));
    }
}
