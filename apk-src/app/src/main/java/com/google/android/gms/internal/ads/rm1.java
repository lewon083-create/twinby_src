package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rm1 f9992h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9999g;

    static {
        int i = -1;
        f9992h = new rm1(1, 2, 3, i, i, null);
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ rm1(int i, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f9993a = i;
        this.f9994b = i10;
        this.f9995c = i11;
        this.f9996d = bArr;
        this.f9997e = i12;
        this.f9998f = i13;
    }

    public static boolean a(rm1 rm1Var) {
        if (rm1Var == null) {
            return true;
        }
        int i = rm1Var.f9993a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i10 = rm1Var.f9994b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = rm1Var.f9995c;
        if ((i11 != -1 && i11 != 3) || rm1Var.f9996d != null) {
            return false;
        }
        int i12 = rm1Var.f9998f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = rm1Var.f9997e;
        return i13 == -1 || i13 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
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

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? l7.o.j(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? l7.o.j(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? l7.o.j(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f9993a == -1 || this.f9994b == -1 || this.f9995c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rm1.class == obj.getClass()) {
            rm1 rm1Var = (rm1) obj;
            if (this.f9993a == rm1Var.f9993a && this.f9994b == rm1Var.f9994b && this.f9995c == rm1Var.f9995c && Arrays.equals(this.f9996d, rm1Var.f9996d) && this.f9997e == rm1Var.f9997e && this.f9998f == rm1Var.f9998f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9999g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.f9996d) + ((((((this.f9993a + 527) * 31) + this.f9994b) * 31) + this.f9995c) * 31)) * 31) + this.f9997e) * 31) + this.f9998f;
        this.f9999g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.f9993a);
        String strG = g(this.f9994b);
        String strF = f(this.f9995c);
        int i = this.f9997e;
        String strD = i != -1 ? t.z.d(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i10 = this.f9998f;
        String strD2 = i10 != -1 ? t.z.d(i10, "bit Chroma", new StringBuilder(String.valueOf(i10).length() + 10)) : "NA";
        boolean z5 = this.f9996d != null;
        StringBuilder sb2 = new StringBuilder(pe.a.b(pe.a.b(pe.a.b(pe.a.b(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z5)), 2, strD), 1, strD2));
        sb2.append("ColorInfo(");
        sb2.append(strE);
        sb2.append(", ");
        sb2.append(strG);
        sb2.append(", ");
        sb2.append(strF);
        sb2.append(", ");
        sb2.append(z5);
        l7.o.t(sb2, ", ", strD, ", ", strD2);
        sb2.append(")");
        return sb2.toString();
    }
}
