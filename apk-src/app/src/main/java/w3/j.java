package w3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35072d;

    public j(String str, long j10, long j11) {
        this.f35071c = str == null ? "" : str;
        this.f35069a = j10;
        this.f35070b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strP = m3.b.p(str, this.f35071c);
        if (jVar != null) {
            long j10 = jVar.f35070b;
            if (strP.equals(m3.b.p(str, jVar.f35071c))) {
                long j11 = this.f35070b;
                if (j11 != -1) {
                    long j12 = this.f35069a;
                    jVar2 = null;
                    if (j12 + j11 == jVar.f35069a) {
                        return new j(strP, j12, j10 != -1 ? j11 + j10 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j13 = jVar.f35069a;
                if (j13 + j10 == this.f35069a) {
                    return new j(strP, j13, j11 != -1 ? j10 + j11 : -1L);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f35069a == jVar.f35069a && this.f35070b == jVar.f35070b && this.f35071c.equals(jVar.f35071c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f35072d == 0) {
            this.f35072d = this.f35071c.hashCode() + ((((527 + ((int) this.f35069a)) * 31) + ((int) this.f35070b)) * 31);
        }
        return this.f35072d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f35071c);
        sb2.append(", start=");
        sb2.append(this.f35069a);
        sb2.append(", length=");
        return pe.a.h(sb2, this.f35070b, ")");
    }
}
