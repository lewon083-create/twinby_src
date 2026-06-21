package ti;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f33824d;

    public g(k9.m mVar) {
        this.f33821a = mVar.f28098c;
        this.f33822b = (String) mVar.f28100e;
        this.f33823c = (String) mVar.f28099d;
        k9.r rVar = mVar.f27274j;
        if (rVar != null) {
            this.f33824d = new i(rVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f33821a == gVar.f33821a && this.f33822b.equals(gVar.f33822b) && Objects.equals(this.f33824d, gVar.f33824d)) {
            return this.f33823c.equals(gVar.f33823c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f33821a), this.f33822b, this.f33823c, this.f33824d);
    }

    public g(int i, String str, String str2, i iVar) {
        this.f33821a = i;
        this.f33822b = str;
        this.f33823c = str2;
        this.f33824d = iVar;
    }
}
