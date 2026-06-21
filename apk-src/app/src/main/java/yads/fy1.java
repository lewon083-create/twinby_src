package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38575a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f38576b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38577c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f38578d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ey1 b(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fy1.b(byte[], int, int):yads.ey1");
    }

    public static int a(byte[] bArr, int i, int i10, boolean[] zArr) {
        int i11 = i10 - i;
        if (i11 < 0) {
            throw new IllegalStateException();
        }
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b2 = bArr[i13];
            if ((b2 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static cy1 a(byte[] bArr, int i, int i10) {
        boolean z5;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15 = 2;
        mb2 mb2Var = new mb2(bArr, i + 2, i10);
        mb2Var.d(4);
        int iB = mb2Var.b(3);
        mb2Var.f();
        int iB2 = mb2Var.b(2);
        boolean zC = mb2Var.c();
        int iB3 = mb2Var.b(5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            z5 = true;
            if (i16 >= 32) {
                break;
            }
            if (mb2Var.c()) {
                i17 |= 1 << i16;
            }
            i16++;
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = mb2Var.b(8);
        }
        int i19 = i17;
        int iB4 = mb2Var.b(8);
        int i20 = 0;
        for (int i21 = 0; i21 < iB; i21++) {
            if (mb2Var.c()) {
                i20 += 89;
            }
            if (mb2Var.c()) {
                i20 += 8;
            }
        }
        mb2Var.d(i20);
        if (iB > 0) {
            mb2Var.d((8 - iB) * 2);
        }
        mb2Var.d();
        int iD = mb2Var.d();
        if (iD == 3) {
            mb2Var.f();
        }
        int iD2 = mb2Var.d();
        int iD3 = mb2Var.d();
        if (mb2Var.c()) {
            int iD4 = mb2Var.d();
            int iD5 = mb2Var.d();
            int iD6 = mb2Var.d();
            i11 = iB2;
            int iD7 = mb2Var.d();
            if (iD != 1 && iD != 2) {
                i15 = 1;
            }
            int i22 = iD == 1 ? 2 : 1;
            iD2 = l7.o.w(iD4, iD5, i15, iD2);
            iD3 = l7.o.w(iD6, iD7, i22, iD3);
        } else {
            i11 = iB2;
        }
        mb2Var.d();
        mb2Var.d();
        int iD8 = mb2Var.d();
        for (int i23 = mb2Var.c() ? 0 : iB; i23 <= iB; i23++) {
            mb2Var.d();
            mb2Var.d();
            mb2Var.d();
        }
        mb2Var.d();
        mb2Var.d();
        mb2Var.d();
        mb2Var.d();
        mb2Var.d();
        mb2Var.d();
        if (mb2Var.c() && mb2Var.c()) {
            int i24 = 0;
            while (true) {
                int i25 = 4;
                if (i24 >= 4) {
                    break;
                }
                int i26 = 0;
                while (i26 < 6) {
                    if (!mb2Var.c()) {
                        mb2Var.d();
                    } else {
                        int iMin = Math.min(64, 1 << ((i24 << 1) + i25));
                        if (i24 > 1) {
                            mb2Var.e();
                        }
                        for (int i27 = 0; i27 < iMin; i27++) {
                            mb2Var.e();
                        }
                    }
                    i26 += i24 == 3 ? 3 : 1;
                    i25 = 4;
                }
                i24++;
            }
        }
        mb2Var.d(2);
        if (mb2Var.c()) {
            mb2Var.d(8);
            mb2Var.d();
            mb2Var.d();
            mb2Var.f();
        }
        int iD9 = mb2Var.d();
        int i28 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i29 = -1;
        int i30 = -1;
        while (i28 < iD9) {
            if (i28 != 0 && mb2Var.c()) {
                z10 = z5;
                int i31 = i29 + i30;
                int iD10 = (1 - ((mb2Var.c() ? 1 : 0) * 2)) * (mb2Var.d() + 1);
                i12 = iD8;
                int i32 = i31 + 1;
                i13 = iD9;
                boolean[] zArr = new boolean[i32];
                for (int i33 = 0; i33 <= i31; i33++) {
                    if (!mb2Var.c()) {
                        zArr[i33] = mb2Var.c();
                    } else {
                        zArr[i33] = z10;
                    }
                }
                int[] iArr3 = new int[i32];
                int[] iArr4 = new int[i32];
                int i34 = 0;
                for (int i35 = i30 - 1; i35 >= 0; i35--) {
                    int i36 = iArrCopyOf[i35] + iD10;
                    if (i36 < 0 && zArr[i29 + i35]) {
                        iArr3[i34] = i36;
                        i34++;
                    }
                }
                if (iD10 < 0 && zArr[i31]) {
                    iArr3[i34] = iD10;
                    i34++;
                }
                i14 = i28;
                int i37 = i34;
                int[] iArr5 = iArr2;
                for (int i38 = 0; i38 < i29; i38++) {
                    int i39 = iArr5[i38] + iD10;
                    if (i39 < 0 && zArr[i38]) {
                        iArr3[i37] = i39;
                        i37++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, i37);
                int i40 = 0;
                for (int i41 = i29 - 1; i41 >= 0; i41--) {
                    int i42 = iArr5[i41] + iD10;
                    if (i42 > 0 && zArr[i41]) {
                        iArr4[i40] = i42;
                        i40++;
                    }
                }
                if (iD10 > 0 && zArr[i31]) {
                    iArr4[i40] = iD10;
                    i40++;
                }
                int i43 = i40;
                for (int i44 = 0; i44 < i30; i44++) {
                    int i45 = iArrCopyOf[i44] + iD10;
                    if (i45 > 0 && zArr[i29 + i44]) {
                        iArr4[i43] = i45;
                        i43++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr4, i43);
                i29 = i37;
                i30 = i43;
                iArr2 = iArrCopyOf2;
            } else {
                i12 = iD8;
                i13 = iD9;
                i14 = i28;
                z10 = z5;
                int iD11 = mb2Var.d();
                int iD12 = mb2Var.d();
                int[] iArr6 = new int[iD11];
                for (int i46 = 0; i46 < iD11; i46++) {
                    iArr6[i46] = mb2Var.d() + 1;
                    mb2Var.f();
                }
                int[] iArr7 = new int[iD12];
                for (int i47 = 0; i47 < iD12; i47++) {
                    iArr7[i47] = mb2Var.d() + 1;
                    mb2Var.f();
                }
                i29 = iD11;
                i30 = iD12;
                iArrCopyOf = iArr7;
                iArr2 = iArr6;
            }
            i28 = i14 + 1;
            z5 = z10;
            iD8 = i12;
            iD9 = i13;
        }
        int i48 = iD8;
        if (mb2Var.c()) {
            for (int i49 = 0; i49 < mb2Var.d(); i49++) {
                mb2Var.d(i48 + 5);
            }
        }
        mb2Var.d(2);
        float f10 = 1.0f;
        if (mb2Var.c()) {
            if (mb2Var.c()) {
                int iB5 = mb2Var.b(8);
                if (iB5 == 255) {
                    int iB6 = mb2Var.b(16);
                    int iB7 = mb2Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f38576b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        mf1.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (mb2Var.c()) {
                mb2Var.f();
            }
            if (mb2Var.c()) {
                mb2Var.d(4);
                if (mb2Var.c()) {
                    mb2Var.d(24);
                }
            }
            if (mb2Var.c()) {
                mb2Var.d();
                mb2Var.d();
            }
            mb2Var.f();
            if (mb2Var.c()) {
                iD3 *= 2;
            }
        }
        return new cy1(i11, zC, iB3, i19, iArr, iB4, iD2, iD3, f10);
    }

    public static int a(int i, byte[] bArr) {
        int i10;
        synchronized (f38577c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    if (i11 >= i - 2) {
                        i11 = i;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i11 < i) {
                    int[] iArr = f38578d;
                    if (iArr.length <= i12) {
                        f38578d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f38578d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f38578d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
