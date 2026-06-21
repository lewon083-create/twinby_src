package yads;

import android.graphics.Bitmap;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kq {
    public static Bitmap a(Bitmap bitmap, double d10) {
        int i;
        int i10;
        int[] iArr;
        int i11 = 0;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, yj.b.a(((double) bitmap.getWidth()) * d10), yj.b.a(((double) bitmap.getHeight()) * d10), false);
        int i12 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr2 = new int[i13];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[i13];
        int[] iArr6 = new int[width < height ? height : width];
        int[] iArr7 = new int[1024];
        for (int i16 = 0; i16 < 1024; i16++) {
            iArr7[i16] = i16 / 4;
        }
        char c8 = 3;
        int[][] iArr8 = new int[3][];
        int i17 = 0;
        while (true) {
            i = i11;
            if (i17 >= 3) {
                break;
            }
            iArr8[i17] = new int[3];
            i17++;
            i11 = i;
        }
        int i18 = i11;
        int i19 = i18;
        while (i11 < height) {
            int i20 = i;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            char c9 = c8;
            int i28 = -1;
            int i29 = i27;
            while (i28 <= i12) {
                int i30 = i12;
                int i31 = i28 < 0 ? i : i28;
                if (i14 <= i31) {
                    i31 = i14;
                }
                int i32 = iArr2[i31 + i18];
                int i33 = i28 + 1;
                int[] iArr9 = iArr8[i33];
                iArr9[i] = (i32 & 16711680) >> 16;
                iArr9[i30] = (i32 & 65280) >> 8;
                iArr9[2] = i32 & KotlinVersion.MAX_COMPONENT_VALUE;
                int iAbs = 2 - StrictMath.abs(i28);
                int i34 = iArr9[i];
                i29 = (i34 * iAbs) + i29;
                int i35 = iArr9[i30];
                i20 = (i35 * iAbs) + i20;
                int i36 = iArr9[2];
                i21 = (iAbs * i36) + i21;
                if (i28 > 0) {
                    i27 += i34;
                    i26 += i35;
                    i25 += i36;
                } else {
                    i24 += i34;
                    i23 += i35;
                    i22 += i36;
                }
                i12 = i30;
                i28 = i33;
            }
            int i37 = i12;
            int i38 = i;
            int i39 = i37;
            while (i38 < width) {
                iArr3[i18] = iArr7[i29];
                iArr4[i18] = iArr7[i20];
                iArr5[i18] = iArr7[i21];
                int i40 = i29 - i24;
                int i41 = i20 - i23;
                int i42 = i21 - i22;
                int[] iArr10 = iArr8[(i39 + 2) % 3];
                int i43 = i24 - iArr10[i];
                int i44 = i23 - iArr10[i37];
                int i45 = i22 - iArr10[2];
                if (i11 == 0) {
                    iArr = iArr5;
                    iArr6[i38] = Math.min(i38 + 2, i14);
                } else {
                    iArr = iArr5;
                }
                int i46 = iArr2[i19 + iArr6[i38]];
                int i47 = (i46 & 16711680) >> 16;
                iArr10[i] = i47;
                int i48 = (i46 & 65280) >> 8;
                iArr10[i37] = i48;
                int i49 = i46 & KotlinVersion.MAX_COMPONENT_VALUE;
                iArr10[2] = i49;
                int i50 = i27 + i47;
                int i51 = i26 + i48;
                int i52 = i25 + i49;
                i29 = i40 + i50;
                i20 = i41 + i51;
                i21 = i42 + i52;
                i39 = (i39 + 1) % 3;
                int[] iArr11 = iArr8[i39 % 3];
                int i53 = iArr11[i];
                i24 = i43 + i53;
                int i54 = iArr11[i37];
                i23 = i44 + i54;
                int i55 = iArr11[2];
                i22 = i45 + i55;
                i27 = i50 - i53;
                i26 = i51 - i54;
                i25 = i52 - i55;
                i18++;
                i38++;
                iArr5 = iArr;
            }
            i19 += width;
            i11++;
            c8 = c9;
            i12 = i37;
        }
        int[] iArr12 = iArr5;
        int i56 = i12;
        int i57 = i;
        while (i57 < width) {
            int i58 = i;
            int i59 = i58;
            int i60 = i59;
            int i61 = i60;
            int i62 = i61;
            int i63 = i62;
            int i64 = i63;
            int i65 = i64;
            int i66 = i65;
            int i67 = i57;
            int i68 = width * (-1);
            int i69 = -1;
            for (int i70 = i56; i69 <= i70; i70 = 1) {
                int i71 = i70;
                int i72 = i;
                int iMax = Math.max(i72, i68) + i67;
                int i73 = i69 + 1;
                int[] iArr13 = iArr8[i73];
                iArr13[i72] = iArr3[iMax];
                iArr13[i71] = iArr4[iMax];
                iArr13[2] = iArr12[iMax];
                int iAbs2 = 2 - StrictMath.abs(i69);
                i65 = (iArr3[iMax] * iAbs2) + i65;
                i66 = (iArr4[iMax] * iAbs2) + i66;
                i58 = (iArr12[iMax] * iAbs2) + i58;
                if (i69 > 0) {
                    i64 += iArr13[0];
                    i63 += iArr13[1];
                    i62 += iArr13[2];
                } else {
                    i61 += iArr13[0];
                    i60 += iArr13[1];
                    i59 += iArr13[2];
                }
                if (i69 < i15) {
                    i68 += width;
                }
                i69 = i73;
                i = 0;
            }
            int i74 = i65;
            int i75 = 1;
            int i76 = i67;
            for (int i77 = 0; i77 < height; i77++) {
                iArr2[i76] = (iArr2[i76] & (-16777216)) | (iArr7[i74] << 16) | (iArr7[i66] << 8) | iArr7[i58];
                int i78 = i74 - i61;
                int i79 = i66 - i60;
                int i80 = i58 - i59;
                int[] iArr14 = iArr8[(i75 + 2) % 3];
                int i81 = i61 - iArr14[0];
                int i82 = i60 - iArr14[1];
                int i83 = i59 - iArr14[2];
                if (i67 == 0) {
                    i10 = i75;
                    iArr6[i77] = Math.min(i77 + 2, i15) * width;
                } else {
                    i10 = i75;
                }
                int i84 = i67 + iArr6[i77];
                int i85 = iArr3[i84];
                iArr14[0] = i85;
                int i86 = iArr4[i84];
                iArr14[1] = i86;
                int i87 = iArr12[i84];
                iArr14[2] = i87;
                int i88 = i64 + i85;
                int i89 = i63 + i86;
                int i90 = i62 + i87;
                i74 = i78 + i88;
                i66 = i79 + i89;
                i58 = i80 + i90;
                i75 = (i10 + 1) % 3;
                int[] iArr15 = iArr8[i75];
                int i91 = iArr15[0];
                i61 = i81 + i91;
                int i92 = iArr15[1];
                i60 = i82 + i92;
                int i93 = iArr15[2];
                i59 = i83 + i93;
                i64 = i88 - i91;
                i63 = i89 - i92;
                i62 = i90 - i93;
                i76 += width;
            }
            i57 = i67 + 1;
            i = 0;
            i56 = 1;
        }
        bitmapCopy.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }
}
