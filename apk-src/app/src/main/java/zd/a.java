package zd;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46246c;

    public a(String str, long j10, long j11) {
        this.f46244a = str;
        this.f46245b = j10;
        this.f46246c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f46244a.equals(aVar.f46244a) && this.f46245b == aVar.f46245b && this.f46246c == aVar.f46246c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f46244a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f46245b;
        long j11 = this.f46246c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f46244a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f46245b);
        sb2.append(", tokenCreationTimestamp=");
        return pe.a.h(sb2, this.f46246c, "}");
    }
}
