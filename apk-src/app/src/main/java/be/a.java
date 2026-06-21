package be;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2076e;

    public a(String str, String str2, String str3, b bVar, int i) {
        this.f2072a = str;
        this.f2073b = str2;
        this.f2074c = str3;
        this.f2075d = bVar;
        this.f2076e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i = aVar.f2076e;
        b bVar = aVar.f2075d;
        String str = aVar.f2074c;
        String str2 = aVar.f2073b;
        String str3 = aVar.f2072a;
        String str4 = this.f2072a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f2073b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2074c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f2075d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i10 = this.f2076e;
        return i10 == 0 ? i == 0 : z.a(i10, i);
    }

    public final int hashCode() {
        String str = this.f2072a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f2073b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2074c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f2075d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.f2076e;
        return (i != 0 ? z.m(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f2072a);
        sb2.append(", fid=");
        sb2.append(this.f2073b);
        sb2.append(", refreshToken=");
        sb2.append(this.f2074c);
        sb2.append(", authToken=");
        sb2.append(this.f2075d);
        sb2.append(", responseCode=");
        int i = this.f2076e;
        sb2.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
