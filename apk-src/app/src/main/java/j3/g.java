package j3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f26240h = new g(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f26244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26247g;

    static {
        gf.a.o(0, 1, 2, 3, 4);
        m3.z.G(5);
    }

    public g(int i, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f26241a = i;
        this.f26242b = i10;
        this.f26243c = i11;
        this.f26244d = bArr;
        this.f26245e = i12;
        this.f26246f = i13;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? l7.o.i(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? l7.o.i(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? l7.o.i(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(g gVar) {
        if (gVar == null) {
            return true;
        }
        int i = gVar.f26241a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i10 = gVar.f26242b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = gVar.f26243c;
        if ((i11 != -1 && i11 != 3) || gVar.f26244d != null) {
            return false;
        }
        int i12 = gVar.f26246f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = gVar.f26245e;
        return i13 == -1 || i13 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f26241a == -1 || this.f26242b == -1 || this.f26243c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f26241a == gVar.f26241a && this.f26242b == gVar.f26242b && this.f26243c == gVar.f26243c && Arrays.equals(this.f26244d, gVar.f26244d) && this.f26245e == gVar.f26245e && this.f26246f == gVar.f26246f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26247g == 0) {
            this.f26247g = ((((Arrays.hashCode(this.f26244d) + ((((((527 + this.f26241a) * 31) + this.f26242b) * 31) + this.f26243c) * 31)) * 31) + this.f26245e) * 31) + this.f26246f;
        }
        return this.f26247g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f26241a));
        sb2.append(", ");
        sb2.append(a(this.f26242b));
        sb2.append(", ");
        sb2.append(c(this.f26243c));
        sb2.append(", ");
        sb2.append(this.f26244d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i = this.f26245e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f26246f;
        if (i10 != -1) {
            str2 = i10 + "bit Chroma";
        }
        return a0.u.o(sb2, str2, ")");
    }
}
