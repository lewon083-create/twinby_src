package ke;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27395f;

    public c(String str, String str2, String str3, String str4, long j10) {
        this.f27391b = str;
        this.f27392c = str2;
        this.f27393d = str3;
        this.f27394e = str4;
        this.f27395f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f27391b.equals(cVar.f27391b) && this.f27392c.equals(cVar.f27392c) && this.f27393d.equals(cVar.f27393d) && this.f27394e.equals(cVar.f27394e) && this.f27395f == cVar.f27395f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f27391b.hashCode() ^ 1000003) * 1000003) ^ this.f27392c.hashCode()) * 1000003) ^ this.f27393d.hashCode()) * 1000003) ^ this.f27394e.hashCode()) * 1000003;
        long j10 = this.f27395f;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f27391b);
        sb2.append(", variantId=");
        sb2.append(this.f27392c);
        sb2.append(", parameterKey=");
        sb2.append(this.f27393d);
        sb2.append(", parameterValue=");
        sb2.append(this.f27394e);
        sb2.append(", templateVersion=");
        return pe.a.h(sb2, this.f27395f, "}");
    }
}
