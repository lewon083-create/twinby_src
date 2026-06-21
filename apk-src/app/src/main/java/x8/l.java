package x8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f36038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f36039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36041f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f36051b;
        this.f36036a = j10;
        this.f36037b = j11;
        this.f36038c = jVar;
        this.f36039d = num;
        this.f36040e = str;
        this.f36041f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f36051b;
        ArrayList arrayList = lVar.f36041f;
        String str = lVar.f36040e;
        Integer num = lVar.f36039d;
        j jVar = lVar.f36038c;
        if (this.f36036a != lVar.f36036a || this.f36037b != lVar.f36037b || !this.f36038c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f36039d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f36040e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f36041f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j10 = this.f36036a;
        long j11 = this.f36037b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f36038c.hashCode()) * 1000003;
        Integer num = this.f36039d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f36040e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f36041f.hashCode()) * 1000003) ^ w.f36051b.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f36036a + ", requestUptimeMs=" + this.f36037b + ", clientInfo=" + this.f36038c + ", logSource=" + this.f36039d + ", logSourceName=" + this.f36040e + ", logEvents=" + this.f36041f + ", qosTier=" + w.f36051b + "}";
    }
}
