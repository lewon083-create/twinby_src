package x8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f36030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f36032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f36035g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f36029a = j10;
        this.f36030b = num;
        this.f36031c = j11;
        this.f36032d = bArr;
        this.f36033e = str;
        this.f36034f = j12;
        this.f36035g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f36035g;
            String str2 = kVar.f36033e;
            Integer num2 = kVar.f36030b;
            if (this.f36029a == kVar.f36029a && ((num = this.f36030b) != null ? num.equals(num2) : num2 == null) && this.f36031c == kVar.f36031c) {
                if (Arrays.equals(this.f36032d, rVar instanceof k ? ((k) rVar).f36032d : kVar.f36032d) && ((str = this.f36033e) != null ? str.equals(str2) : str2 == null) && this.f36034f == kVar.f36034f && ((vVar = this.f36035g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f36029a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f36030b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f36031c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f36032d)) * 1000003;
        String str = this.f36033e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f36034f;
        int i10 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f36035g;
        return i10 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f36029a + ", eventCode=" + this.f36030b + ", eventUptimeMs=" + this.f36031c + ", sourceExtension=" + Arrays.toString(this.f36032d) + ", sourceExtensionJsonProto3=" + this.f36033e + ", timezoneOffsetSeconds=" + this.f36034f + ", networkConnectionInfo=" + this.f36035g + "}";
    }
}
