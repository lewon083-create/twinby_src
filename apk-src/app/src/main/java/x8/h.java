package x8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f36016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36023h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f36024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f36026l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f36016a = num;
        this.f36017b = str;
        this.f36018c = str2;
        this.f36019d = str3;
        this.f36020e = str4;
        this.f36021f = str5;
        this.f36022g = str6;
        this.f36023h = str7;
        this.i = str8;
        this.f36024j = str9;
        this.f36025k = str10;
        this.f36026l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f36016a;
            if (num != null ? num.equals(((h) aVar).f36016a) : ((h) aVar).f36016a == null) {
                String str = this.f36017b;
                if (str != null ? str.equals(((h) aVar).f36017b) : ((h) aVar).f36017b == null) {
                    String str2 = this.f36018c;
                    if (str2 != null ? str2.equals(((h) aVar).f36018c) : ((h) aVar).f36018c == null) {
                        String str3 = this.f36019d;
                        if (str3 != null ? str3.equals(((h) aVar).f36019d) : ((h) aVar).f36019d == null) {
                            String str4 = this.f36020e;
                            if (str4 != null ? str4.equals(((h) aVar).f36020e) : ((h) aVar).f36020e == null) {
                                String str5 = this.f36021f;
                                if (str5 != null ? str5.equals(((h) aVar).f36021f) : ((h) aVar).f36021f == null) {
                                    String str6 = this.f36022g;
                                    if (str6 != null ? str6.equals(((h) aVar).f36022g) : ((h) aVar).f36022g == null) {
                                        String str7 = this.f36023h;
                                        if (str7 != null ? str7.equals(((h) aVar).f36023h) : ((h) aVar).f36023h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) aVar).i) : ((h) aVar).i == null) {
                                                String str9 = this.f36024j;
                                                if (str9 != null ? str9.equals(((h) aVar).f36024j) : ((h) aVar).f36024j == null) {
                                                    String str10 = this.f36025k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f36025k) : ((h) aVar).f36025k == null) {
                                                        String str11 = this.f36026l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f36026l) : ((h) aVar).f36026l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f36016a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f36017b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f36018c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f36019d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f36020e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f36021f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f36022g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f36023h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f36024j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f36025k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f36026l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f36016a);
        sb2.append(", model=");
        sb2.append(this.f36017b);
        sb2.append(", hardware=");
        sb2.append(this.f36018c);
        sb2.append(", device=");
        sb2.append(this.f36019d);
        sb2.append(", product=");
        sb2.append(this.f36020e);
        sb2.append(", osBuild=");
        sb2.append(this.f36021f);
        sb2.append(", manufacturer=");
        sb2.append(this.f36022g);
        sb2.append(", fingerprint=");
        sb2.append(this.f36023h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.f36024j);
        sb2.append(", mccMnc=");
        sb2.append(this.f36025k);
        sb2.append(", applicationBuild=");
        return a0.u.o(sb2, this.f36026l, "}");
    }
}
