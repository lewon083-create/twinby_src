package f0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.e f16487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.e f16488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16490d;

    public c(d2.e eVar, d2.e eVar2, int i, ArrayList arrayList) {
        this.f16487a = eVar;
        this.f16488b = eVar2;
        this.f16489c = i;
        this.f16490d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16487a.equals(cVar.f16487a) && this.f16488b.equals(cVar.f16488b) && this.f16489c == cVar.f16489c && this.f16490d.equals(cVar.f16490d);
    }

    public final int hashCode() {
        return ((((((this.f16487a.hashCode() ^ 1000003) * 1000003) ^ this.f16488b.hashCode()) * 1000003) ^ this.f16489c) * 1000003) ^ this.f16490d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.f16487a + ", postviewEdge=" + this.f16488b + ", inputFormat=" + this.f16489c + ", outputFormats=" + this.f16490d + "}";
    }
}
