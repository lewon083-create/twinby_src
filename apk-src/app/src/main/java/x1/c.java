package x1;

import android.graphics.Path;
import android.util.Log;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f35693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f35694b;

    public c(char c8, float[] fArr) {
        this.f35693a = c8;
        this.f35694b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z5, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = f14;
        double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d16 = f15;
        double d17 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d16;
        double d18 = f13;
        double d19 = ((d18 * dSin) + (((double) f12) * dCos)) / d14;
        double d20 = ((d18 * dCos) + (((double) (-f12)) * dSin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < ConfigValue.DOUBLE_DEFAULT_VALUE) {
            Log.w("PathParser", "Points are too far apart " + d25);
            float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z5, z10);
            return;
        }
        double dSqrt = Math.sqrt(d26);
        double d27 = dSqrt * d21;
        double d28 = dSqrt * d22;
        if (z5 == z10) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
        double dAtan22 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
        if (z10 != (dAtan22 >= ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            dAtan22 = dAtan22 > ConfigValue.DOUBLE_DEFAULT_VALUE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * dCos) - (d30 * dSin);
        double d32 = (d30 * dCos) + (d29 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d33 = -d14;
        double d34 = d33 * dCos2;
        double d35 = d16 * dSin2;
        double d36 = (d34 * dSin3) - (d35 * dCos3);
        double d37 = d33 * dSin2;
        double d38 = d16 * dCos2;
        double d39 = dAtan22 / ((double) iCeil);
        double d40 = (dCos3 * d38) + (dSin3 * d37);
        double d41 = d12;
        double d42 = d13;
        int i = 0;
        double d43 = dAtan2;
        while (i < iCeil) {
            double d44 = d43 + d39;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            int i10 = iCeil;
            double d45 = (((d14 * dCos2) * dCos4) + d31) - (d35 * dSin4);
            double d46 = (d38 * dSin4) + (d14 * dSin2 * dCos4) + d32;
            double d47 = (d34 * dSin4) - (d35 * dCos4);
            double d48 = (dCos4 * d38) + (dSin4 * d37);
            double d49 = d44 - d43;
            double dTan = Math.tan(d49 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * dSqrt2) + d41), (float) ((d40 * dSqrt2) + d42), (float) (d45 - (dSqrt2 * d47)), (float) (d46 - (dSqrt2 * d48)), (float) d45, (float) d46);
            i++;
            d42 = d46;
            dCos2 = dCos2;
            d37 = d37;
            d43 = d44;
            d40 = d48;
            d41 = d45;
            iCeil = i10;
            d36 = d47;
            d39 = d39;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(c[] cVarArr, Path path) {
        int i;
        float[] fArr;
        int i10;
        c cVar;
        int i11;
        char c8;
        float f10;
        float f11;
        c cVar2;
        boolean z5;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        c[] cVarArr2 = cVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = cVarArr2.length;
        int i12 = 0;
        int i13 = 0;
        char c9 = 'm';
        while (i13 < length) {
            c cVar3 = cVarArr2[i13];
            char c10 = cVar3.f35693a;
            float[] fArr3 = cVar3.f35694b;
            float f20 = fArr2[i12];
            float f21 = fArr2[1];
            float f22 = fArr2[2];
            float f23 = fArr2[3];
            float f24 = fArr2[4];
            int i14 = i12;
            float f25 = fArr2[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                default:
                    i = 2;
                    break;
            }
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i15 = i14;
            while (i15 < fArr3.length) {
                if (c10 == 'A') {
                    fArr = fArr3;
                    i10 = i15;
                    cVar = cVar3;
                    float f30 = f28;
                    float f31 = f29;
                    i11 = i13;
                    c8 = c10;
                    int i16 = i10 + 5;
                    int i17 = i10 + 6;
                    a(path, f30, f31, fArr[i16], fArr[i17], fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3] != 0.0f ? 1 : i14, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f22 = fArr[i16];
                    f10 = fArr[i17];
                    f23 = f10;
                    f11 = f22;
                } else if (c10 == 'C') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    cVar = cVar3;
                    c8 = c10;
                    int i18 = i10 + 2;
                    int i19 = i10 + 3;
                    int i20 = i10 + 4;
                    int i21 = i10 + 5;
                    path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                    float f32 = fArr[i20];
                    float f33 = fArr[i21];
                    f22 = fArr[i18];
                    f23 = fArr[i19];
                    f10 = f33;
                    f11 = f32;
                } else if (c10 == 'H') {
                    fArr = fArr3;
                    i10 = i15;
                    cVar = cVar3;
                    c8 = c10;
                    f10 = f29;
                    i11 = i13;
                    path2.lineTo(fArr[i10], f10);
                    f11 = fArr[i10];
                } else if (c10 == 'Q') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    cVar = cVar3;
                    c8 = c10;
                    int i22 = i10 + 1;
                    int i23 = i10 + 2;
                    int i24 = i10 + 3;
                    path2.quadTo(fArr[i10], fArr[i22], fArr[i23], fArr[i24]);
                    float f34 = fArr[i10];
                    float f35 = fArr[i22];
                    float f36 = fArr[i23];
                    float f37 = fArr[i24];
                    f22 = f34;
                    f23 = f35;
                    f11 = f36;
                    f10 = f37;
                } else if (c10 == 'V') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    cVar = cVar3;
                    f11 = f28;
                    c8 = c10;
                    path2.lineTo(f11, fArr[i10]);
                    f10 = fArr[i10];
                } else if (c10 != 'a') {
                    if (c10 == 'c') {
                        fArr = fArr3;
                        i10 = i15;
                        int i25 = i10 + 2;
                        int i26 = i10 + 3;
                        int i27 = i10 + 4;
                        int i28 = i10 + 5;
                        path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i25], fArr[i26], fArr[i27], fArr[i28]);
                        float f38 = fArr[i25] + f28;
                        float f39 = fArr[i26] + f29;
                        f28 += fArr[i27];
                        f29 += fArr[i28];
                        f22 = f38;
                        f23 = f39;
                    } else if (c10 != 'h') {
                        if (c10 != 'q') {
                            if (c10 != 'v') {
                                if (c10 == 'L') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    int i29 = i10 + 1;
                                    path2.lineTo(fArr[i10], fArr[i29]);
                                    f11 = fArr[i10];
                                    f10 = fArr[i29];
                                } else if (c10 == 'M') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    f11 = fArr[i10];
                                    f10 = fArr[i10 + 1];
                                    if (i10 > 0) {
                                        path2.lineTo(f11, f10);
                                    } else {
                                        path2.moveTo(f11, f10);
                                        f26 = f11;
                                        f27 = f10;
                                    }
                                } else if (c10 != 'S') {
                                    if (c10 == 'T') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                            f28 = (f28 * 2.0f) - f22;
                                            f29 = (f29 * 2.0f) - f23;
                                        }
                                        int i30 = i10 + 1;
                                        path2.quadTo(f28, f29, fArr[i10], fArr[i30]);
                                        f11 = fArr[i10];
                                        f10 = fArr[i30];
                                        cVar = cVar3;
                                        f22 = f28;
                                        f23 = f29;
                                    } else if (c10 == 'l') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        int i31 = i10 + 1;
                                        path2.rLineTo(fArr[i10], fArr[i31]);
                                        f28 += fArr[i10];
                                        f15 = fArr[i31];
                                    } else if (c10 == 'm') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        float f40 = fArr[i10];
                                        f28 += f40;
                                        float f41 = fArr[i10 + 1];
                                        f29 += f41;
                                        if (i10 > 0) {
                                            path2.rLineTo(f40, f41);
                                        } else {
                                            path2.rMoveTo(f40, f41);
                                            cVar = cVar3;
                                            f11 = f28;
                                            f26 = f11;
                                            f10 = f29;
                                            f27 = f10;
                                        }
                                    } else if (c10 != 's') {
                                        if (c10 != 't') {
                                            fArr = fArr3;
                                            i10 = i15;
                                            cVar = cVar3;
                                            f11 = f28;
                                        } else {
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f18 = f28 - f22;
                                                f19 = f29 - f23;
                                            } else {
                                                f19 = 0.0f;
                                                f18 = 0.0f;
                                            }
                                            int i32 = i15 + 1;
                                            path2.rQuadTo(f18, f19, fArr3[i15], fArr3[i32]);
                                            float f42 = f18 + f28;
                                            float f43 = f19 + f29;
                                            float f44 = f28 + fArr3[i15];
                                            f29 += fArr3[i32];
                                            f23 = f43;
                                            fArr = fArr3;
                                            i10 = i15;
                                            cVar = cVar3;
                                            f11 = f44;
                                            f22 = f42;
                                        }
                                        f10 = f29;
                                    } else {
                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                            f16 = f29 - f23;
                                            f17 = f28 - f22;
                                        } else {
                                            f17 = 0.0f;
                                            f16 = 0.0f;
                                        }
                                        int i33 = i15;
                                        int i34 = i33 + 1;
                                        int i35 = i33 + 2;
                                        int i36 = i33 + 3;
                                        fArr = fArr3;
                                        i10 = i33;
                                        path2.rCubicTo(f17, f16, fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                        f12 = fArr[i10] + f28;
                                        f13 = fArr[i34] + f29;
                                        f28 += fArr[i35];
                                        f14 = fArr[i36];
                                    }
                                    i11 = i13;
                                    c8 = c10;
                                } else {
                                    fArr = fArr3;
                                    i10 = i15;
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    float f45 = f28;
                                    float f46 = f29;
                                    int i37 = i10 + 1;
                                    int i38 = i10 + 2;
                                    int i39 = i10 + 3;
                                    path2.cubicTo(f45, f46, fArr[i10], fArr[i37], fArr[i38], fArr[i39]);
                                    f22 = fArr[i10];
                                    f23 = fArr[i37];
                                    f11 = fArr[i38];
                                    f10 = fArr[i39];
                                }
                                i11 = i13;
                                cVar = cVar3;
                                c8 = c10;
                            } else {
                                fArr = fArr3;
                                i10 = i15;
                                path2.rLineTo(0.0f, fArr[i10]);
                                f15 = fArr[i10];
                            }
                            f29 += f15;
                        } else {
                            fArr = fArr3;
                            i10 = i15;
                            int i40 = i10 + 1;
                            int i41 = i10 + 2;
                            int i42 = i10 + 3;
                            path2.rQuadTo(fArr[i10], fArr[i40], fArr[i41], fArr[i42]);
                            f12 = fArr[i10] + f28;
                            f13 = fArr[i40] + f29;
                            f28 += fArr[i41];
                            f14 = fArr[i42];
                        }
                        f29 += f14;
                        f22 = f12;
                        f23 = f13;
                    } else {
                        fArr = fArr3;
                        i10 = i15;
                        path2.rLineTo(fArr[i10], 0.0f);
                        f28 += fArr[i10];
                    }
                    cVar = cVar3;
                    f11 = f28;
                    f10 = f29;
                    i11 = i13;
                    c8 = c10;
                } else {
                    fArr = fArr3;
                    i10 = i15;
                    int i43 = i10 + 5;
                    float f47 = fArr[i43] + f28;
                    int i44 = i10 + 6;
                    float f48 = fArr[i44] + f29;
                    float f49 = fArr[i10];
                    float f50 = fArr[i10 + 1];
                    float f51 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != 0.0f) {
                        cVar2 = cVar3;
                        z5 = 1;
                    } else {
                        cVar2 = cVar3;
                        z5 = i14;
                    }
                    cVar = cVar2;
                    float f52 = f28;
                    c8 = c10;
                    float f53 = f29;
                    i11 = i13;
                    a(path, f52, f53, f47, f48, f49, f50, f51, z5, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f11 = f52 + fArr[i43];
                    f10 = f53 + fArr[i44];
                    f22 = f11;
                    f23 = f10;
                }
                i15 = i10 + i;
                path2 = path;
                cVar3 = cVar;
                c10 = c8;
                i13 = i11;
                f28 = f11;
                f29 = f10;
                c9 = c10;
                fArr3 = fArr;
            }
            fArr2[i14] = f28;
            fArr2[1] = f29;
            fArr2[2] = f22;
            fArr2[3] = f23;
            fArr2[4] = f26;
            fArr2[5] = f27;
            c9 = cVar3.f35693a;
            i13++;
            cVarArr2 = cVarArr;
            path2 = path;
            i12 = i14;
        }
    }
}
