package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ml1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ll1 f40946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f40949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40951h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f40952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f40953k;

    public ml1(String str, String str2, ll1 ll1Var, String str3, String str4, Float f10, int i, int i10, int i11, String str5) {
        this.f40944a = str;
        this.f40945b = str2;
        this.f40946c = ll1Var;
        this.f40947d = str3;
        this.f40948e = str4;
        this.f40949f = f10;
        this.f40950g = i;
        this.f40951h = i10;
        this.i = i11;
        this.f40952j = str5;
        this.f40953k = Intrinsics.a(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1Var = (ml1) obj;
        return Intrinsics.a(this.f40944a, ml1Var.f40944a) && Intrinsics.a(this.f40945b, ml1Var.f40945b) && this.f40946c == ml1Var.f40946c && Intrinsics.a(this.f40947d, ml1Var.f40947d) && Intrinsics.a(this.f40948e, ml1Var.f40948e) && Intrinsics.a(this.f40949f, ml1Var.f40949f) && this.f40950g == ml1Var.f40950g && this.f40951h == ml1Var.f40951h && this.i == ml1Var.i && Intrinsics.a(this.f40952j, ml1Var.f40952j);
    }

    public final int hashCode() {
        int iHashCode = this.f40944a.hashCode() * 31;
        String str = this.f40945b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ll1 ll1Var = this.f40946c;
        int iHashCode3 = (iHashCode2 + (ll1Var == null ? 0 : ll1Var.hashCode())) * 31;
        String str2 = this.f40947d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40948e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f40949f;
        int iA = qd3.a(this.i, qd3.a(this.f40951h, qd3.a(this.f40950g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f40952j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f40944a;
        String str2 = this.f40945b;
        ll1 ll1Var = this.f40946c;
        String str3 = this.f40947d;
        String str4 = this.f40948e;
        Float f10 = this.f40949f;
        int i = this.f40950g;
        int i10 = this.f40951h;
        int i11 = this.i;
        String str5 = this.f40952j;
        StringBuilder sbJ = t.z.j("MediaFile(uri=", str, ", id=", str2, ", deliveryMethod=");
        sbJ.append(ll1Var);
        sbJ.append(", mimeType=");
        sbJ.append(str3);
        sbJ.append(", codec=");
        sbJ.append(str4);
        sbJ.append(", vmafMetric=");
        sbJ.append(f10);
        sbJ.append(", height=");
        com.google.android.gms.internal.ads.om1.t(sbJ, i, ", width=", i10, ", bitrate=");
        sbJ.append(i11);
        sbJ.append(", apiFramework=");
        sbJ.append(str5);
        sbJ.append(")");
        return sbJ.toString();
    }
}
