package y8;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f36547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f36548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f36551f;

    public i(String str, Integer num, m mVar, long j10, long j11, HashMap map) {
        this.f36546a = str;
        this.f36547b = num;
        this.f36548c = mVar;
        this.f36549d = j10;
        this.f36550e = j11;
        this.f36551f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f36551f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f36551f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final q9.o c() {
        q9.o oVar = new q9.o();
        String str = this.f36546a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        oVar.f31946a = str;
        oVar.f31947b = this.f36547b;
        m mVar = this.f36548c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        oVar.f31948c = mVar;
        oVar.f31949d = Long.valueOf(this.f36549d);
        oVar.f31950e = Long.valueOf(this.f36550e);
        oVar.f31951f = new HashMap(this.f36551f);
        return oVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            Integer num2 = iVar.f36547b;
            if (this.f36546a.equals(iVar.f36546a) && ((num = this.f36547b) != null ? num.equals(num2) : num2 == null) && this.f36548c.equals(iVar.f36548c) && this.f36549d == iVar.f36549d && this.f36550e == iVar.f36550e && this.f36551f.equals(iVar.f36551f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f36546a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f36547b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f36548c.hashCode()) * 1000003;
        long j10 = this.f36549d;
        int i = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f36550e;
        return ((i ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f36551f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f36546a + ", code=" + this.f36547b + ", encodedPayload=" + this.f36548c + ", eventMillis=" + this.f36549d + ", uptimeMillis=" + this.f36550e + ", autoMetadata=" + this.f36551f + "}";
    }
}
