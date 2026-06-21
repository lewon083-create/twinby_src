package t9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f33638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f33639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f33640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33641e;

    public p(String str, double d10, double d11, double d12, int i) {
        this.f33637a = str;
        this.f33639c = d10;
        this.f33638b = d11;
        this.f33640d = d12;
        this.f33641e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pa.c0.m(this.f33637a, pVar.f33637a) && this.f33638b == pVar.f33638b && this.f33639c == pVar.f33639c && this.f33641e == pVar.f33641e && Double.compare(this.f33640d, pVar.f33640d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33637a, Double.valueOf(this.f33638b), Double.valueOf(this.f33639c), Double.valueOf(this.f33640d), Integer.valueOf(this.f33641e)});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(this.f33637a, "name");
        iVar.b(Double.valueOf(this.f33639c), "minBound");
        iVar.b(Double.valueOf(this.f33638b), "maxBound");
        iVar.b(Double.valueOf(this.f33640d), "percent");
        iVar.b(Integer.valueOf(this.f33641e), "count");
        return iVar.toString();
    }
}
