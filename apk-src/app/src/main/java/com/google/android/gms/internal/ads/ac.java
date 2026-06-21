package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ac f2837b = new ac(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2838a;

    public ac(byte[] bArr) {
        this.f2838a = bArr;
    }

    public static ac e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new ac(bArr2);
    }

    public static int f(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        return b2 & ((iArr[7] % 837626799) ^ a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15));
    }

    public final byte[] a() {
        byte[] bArr = this.f2838a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i) {
        int i10 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i11 = 2013725218 % 1633938701;
        int i12 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i13 = 1442767057 % 63299708;
        byte[] bArr = this.f2838a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(pe.a.a(i, i10 ^ i11));
            sb2.append(zb.a("Akelqh1fajntGgo="));
            sb2.append(i);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(pe.a.a(length, pe.a.a(i, i12 ^ i13)));
        sb3.append(zb.a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i);
        sb3.append(zb.a("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(zb.a("Hn2H4l0="));
        byte[] bArr = this.f2838a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final ac d(ac acVar) {
        byte[] bArr = acVar.f2838a;
        int length = bArr.length;
        byte[] bArr2 = this.f2838a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ac) {
            return Arrays.equals(this.f2838a, ((ac) obj).f2838a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f2838a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        String string = Arrays.toString(this.f2838a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i16 % 981766422) ^ iH));
        sb2.append(zb.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(zb.a("Ng=="));
        return sb2.toString();
    }
}
