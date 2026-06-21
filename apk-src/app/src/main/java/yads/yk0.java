package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f45077a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f45078b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f45079c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static nx0 a(byte[] bArr, String str, String str2) {
        kb2 kb2Var;
        if (bArr[0] == 127) {
            kb2Var = new kb2(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = bArrCopyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b10 = bArrCopyOf[i];
                    int i10 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i10];
                    bArrCopyOf[i10] = b10;
                }
            }
            kb2Var = new kb2(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                kb2 kb2Var2 = new kb2(bArrCopyOf.length, bArrCopyOf);
                while (kb2Var2.b() >= 16) {
                    kb2Var2.c(2);
                    int iA = kb2Var2.a(14) & 16383;
                    int iMin = Math.min(8 - kb2Var.f40146c, 14);
                    int i11 = kb2Var.f40146c;
                    int i12 = (8 - i11) - iMin;
                    byte[] bArr2 = kb2Var.f40144a;
                    int i13 = kb2Var.f40145b;
                    byte b11 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr2[i13]);
                    bArr2[i13] = b11;
                    int i14 = 14 - iMin;
                    bArr2[i13] = (byte) (b11 | ((iA >>> i14) << i12));
                    int i15 = i13 + 1;
                    while (i14 > 8) {
                        kb2Var.f40144a[i15] = (byte) (iA >>> (i14 - 8));
                        i14 -= 8;
                        i15++;
                    }
                    int i16 = 8 - i14;
                    byte[] bArr3 = kb2Var.f40144a;
                    byte b12 = (byte) (bArr3[i15] & ((1 << i16) - 1));
                    bArr3[i15] = b12;
                    bArr3[i15] = (byte) (((iA & ((1 << i14) - 1)) << i16) | b12);
                    kb2Var.c(14);
                    kb2Var.a();
                }
            }
            kb2Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        kb2Var.c(60);
        int i17 = f45077a[kb2Var.a(6)];
        int i18 = f45078b[kb2Var.a(4)];
        int iA2 = kb2Var.a(5);
        int i19 = iA2 < 29 ? (f45079c[iA2] * 1000) / 2 : -1;
        kb2Var.c(10);
        int i20 = i17 + (kb2Var.a(2) > 0 ? 1 : 0);
        mx0 mx0Var = new mx0();
        mx0Var.f41066a = str;
        mx0Var.f41075k = "audio/vnd.dts";
        mx0Var.f41071f = i19;
        mx0Var.f41088x = i20;
        mx0Var.f41089y = i18;
        mx0Var.f41078n = null;
        mx0Var.f41068c = str2;
        return new nx0(mx0Var);
    }
}
