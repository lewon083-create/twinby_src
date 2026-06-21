package be;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2079c;

    public b(String str, long j10, int i) {
        this.f2077a = str;
        this.f2078b = j10;
        this.f2079c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i = bVar.f2079c;
        String str = bVar.f2077a;
        String str2 = this.f2077a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f2078b != bVar.f2078b) {
            return false;
        }
        int i10 = this.f2079c;
        return i10 == 0 ? i == 0 : z.a(i10, i);
    }

    public final int hashCode() {
        String str = this.f2077a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f2078b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i10 = this.f2079c;
        return (i10 != 0 ? z.m(i10) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f2077a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f2078b);
        sb2.append(", responseCode=");
        int i = this.f2079c;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
