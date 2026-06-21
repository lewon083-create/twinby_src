package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f35578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f35579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35580c;

    public e(k kVar, a aVar, int i) {
        this.f35578a = kVar;
        this.f35579b = aVar;
        this.f35580c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f35578a.equals(eVar.f35578a) && this.f35579b.equals(eVar.f35579b) && this.f35580c == eVar.f35580c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f35578a.hashCode() ^ 1000003) * 1000003) ^ this.f35579b.hashCode()) * 1000003) ^ this.f35580c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSpec{videoSpec=");
        sb2.append(this.f35578a);
        sb2.append(", audioSpec=");
        sb2.append(this.f35579b);
        sb2.append(", outputFormat=");
        return t.z.d(this.f35580c, "}", sb2);
    }
}
