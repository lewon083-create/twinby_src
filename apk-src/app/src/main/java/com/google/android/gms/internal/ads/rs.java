package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rs implements d2 {
    public static final /* synthetic */ int H = 0;
    public static final /* synthetic */ int I = 0;
    public static final /* synthetic */ int J = 0;
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10033b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10034c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f10035d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10036e = {44100, 48000, 32000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f10037f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f10038g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f10039h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f10040j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ih f10041k = new ih(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ya f10042l = new ya("gads:pan:experiment_id", "", 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ih f10043m = new ih(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ih f10044n = new ih(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ih f10045o = new ih(27);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q90 f10046p = new q90(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q90 f10047q = new q90(9);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q90 f10048r = new q90(14);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q90 f10049s = new q90(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f10050t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q90 f10051u = new q90(27);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final jo0 f10052v = new jo0(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final jo0 f10053w = new jo0(8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final jo0 f10054x = new jo0(12);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final jo0 f10055y = new jo0(15);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f10056z = {0, 0, 0, 1};
    public static final float[] A = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object B = new Object();
    public static int[] C = new int[10];
    public static final int[] D = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] E = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] F = {67108863, 33554431};
    public static final int[] G = {26, 25};

    public static double A(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.o11 B(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.B(byte[], int, int):com.google.android.gms.internal.ads.o11");
    }

    public static void C(String str, String str2) {
        synchronized (f10050t) {
            Log.e(str, K(str2, null));
        }
    }

    public static void D(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr2[0];
        long j11 = jArr3[0];
        long j12 = j10 * j11;
        long j13 = jArr3[1];
        long j14 = jArr2[1];
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        long j18 = ((j14 + j14) * j13) + (j10 * j16) + (j17 * j11);
        long j19 = jArr3[3];
        long j20 = jArr2[3];
        long j21 = (j14 * j16) + (j17 * j13) + (j10 * j19) + (j20 * j11);
        long j22 = jArr3[4];
        long j23 = jArr2[4];
        long j24 = (j14 * j19) + (j20 * j13);
        long j25 = j24 + j24 + (j17 * j16) + (j10 * j22) + (j23 * j11);
        long j26 = jArr3[5];
        long j27 = jArr2[5];
        long j28 = (j17 * j19) + (j20 * j16) + (j14 * j22) + (j23 * j13) + (j10 * j26) + (j27 * j11);
        long j29 = jArr3[6];
        long j30 = jArr2[6];
        long j31 = (j20 * j19) + (j14 * j26) + (j27 * j13);
        long j32 = j31 + j31 + (j17 * j22) + (j23 * j16) + (j10 * j29) + (j30 * j11);
        long j33 = jArr3[7];
        long j34 = jArr2[7];
        long j35 = (j20 * j22) + (j23 * j19) + (j17 * j26) + (j27 * j16) + (j14 * j29) + (j30 * j13) + (j10 * j33) + (j34 * j11);
        long j36 = jArr3[8];
        long j37 = jArr2[8];
        long j38 = (j20 * j26) + (j27 * j19) + (j14 * j33) + (j34 * j13);
        long j39 = j38 + j38 + (j23 * j22) + (j17 * j29) + (j30 * j16) + (j10 * j36) + (j37 * j11);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = (j23 * j26) + (j27 * j22) + (j20 * j29) + (j30 * j19) + (j17 * j33) + (j34 * j16) + (j14 * j36) + (j37 * j13) + (j10 * j40) + (j11 * j41);
        long j43 = (j27 * j26) + (j20 * j33) + (j34 * j19) + (j14 * j40) + (j13 * j41);
        long j44 = (j27 * j33) + (j34 * j26) + (j20 * j40) + (j19 * j41);
        long j45 = (j34 * j33) + (j27 * j40) + (j26 * j41);
        long j46 = (j34 * j36) + (j37 * j33) + (j30 * j40) + (j29 * j41);
        long j47 = (j33 * j41) + (j34 * j40);
        t(new long[]{j12, j15, j18, j21, j25, j28, j32, j35, j39, j42, j43 + j43 + (j23 * j29) + (j30 * j22) + (j17 * j36) + (j37 * j16), (j27 * j29) + (j30 * j26) + (j23 * j33) + (j34 * j22) + (j20 * j36) + (j37 * j19) + (j17 * j40) + (j16 * j41), j44 + j44 + (j30 * j29) + (j23 * j36) + (j37 * j22), (j30 * j33) + (j34 * j29) + (j27 * j36) + (j37 * j26) + (j23 * j40) + (j22 * j41), j45 + j45 + (j30 * j36) + (j37 * j29), j46, j47 + j47 + (j37 * j36), (j36 * j41) + (j37 * j40), (j41 + j41) * j40}, jArr);
    }

    public static double E(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static int F(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.cw G(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.G(byte[], int, int):com.google.android.gms.internal.ads.cw");
    }

    public static void H(String str, String str2, Throwable th2) {
        synchronized (f10050t) {
            Log.e(str, K(str2, th2));
        }
    }

    public static void I(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * j10;
        long j12 = jArr2[1];
        long j13 = (j10 + j10) * j12;
        long j14 = jArr2[2];
        long j15 = (j10 * j14) + (j12 * j12);
        long j16 = jArr2[3];
        long j17 = (j10 * j16) + (j12 * j14);
        long j18 = jArr2[4];
        long j19 = (j14 * j14) + (j12 * 4 * j16) + ((j10 + j10) * j18);
        long j20 = jArr2[5];
        long j21 = (j14 * j16) + (j12 * j18) + (j10 * j20);
        long j22 = jArr2[6];
        long j23 = (j16 * j16) + (j14 * j18) + (j10 * j22) + ((j12 + j12) * j20);
        long j24 = jArr2[7];
        long j25 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24);
        long j26 = jArr2[8];
        long j27 = (j16 * j20) + (j12 * j24);
        long j28 = j27 + j27 + (j14 * j22) + (j10 * j26);
        long j29 = j28 + j28 + (j18 * j18);
        long j30 = jArr2[9];
        long j31 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j26) + (j10 * j30);
        long j32 = (j12 * j30) + (j16 * j24);
        long j33 = j32 + j32 + (j20 * j20) + (j18 * j22) + (j14 * j26);
        long j34 = (j20 * j22) + (j18 * j24) + (j16 * j26) + (j14 * j30);
        long j35 = (j16 * j30) + (j20 * j24);
        long j36 = j35 + j35 + (j18 * j26);
        long j37 = j36 + j36 + (j22 * j22);
        long j38 = (j22 * j24) + (j20 * j26) + (j18 * j30);
        long j39 = (j24 * j24) + (j22 * j26) + ((j20 + j20) * j30);
        long j40 = (j22 * j30) + (j24 * j26);
        t(new long[]{j11, j13, j15 + j15, j17 + j17, j19, j21 + j21, j23 + j23, j25 + j25, j29, j31 + j31, j33 + j33, j34 + j34, j37, j38 + j38, j39 + j39, j40 + j40, (j24 * 4 * j30) + (j26 * j26), (j26 + j26) * j30, (j30 + j30) * j30}, jArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.xz0 J(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.cw r35) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.J(byte[], int, int, com.google.android.gms.internal.ads.cw):com.google.android.gms.internal.ads.xz0");
    }

    public static String K(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f10050t) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return om1.n(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static long[] L(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = D[i10];
            int i12 = bArr[i11] & 255;
            int i13 = bArr[i11 + 1] & 255;
            long j10 = ((long) i12) | (((long) i13) << 8);
            jArr[i10] = (((j10 | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> E[i10]) & ((long) F[i10 & 1]);
        }
        return jArr;
    }

    public static byte[] M(long[] jArr) {
        long j10;
        int[] iArr;
        int i10;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j10 = 19;
            iArr = G;
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j11 = jArrCopyOf[i13];
                int i14 = iArr[i13 & 1];
                int i15 = -((int) (((j11 >> 31) & j11) >> i14));
                jArrCopyOf[i13] = j11 + ((long) (i15 << i14));
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) i15);
            }
            long j12 = jArrCopyOf[9];
            int i16 = -((int) (((j12 >> 31) & j12) >> 25));
            jArrCopyOf[9] = j12 + ((long) (i16 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i16) * 19);
            i12++;
        }
        long j13 = jArrCopyOf[0];
        int i17 = -((int) (((j13 >> 31) & j13) >> 26));
        jArrCopyOf[0] = j13 + ((long) (i17 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i17);
        int i18 = 0;
        while (true) {
            iArr2 = F;
            if (i18 >= 2) {
                break;
            }
            int i19 = i11;
            while (i19 < 9) {
                long j14 = jArrCopyOf[i19];
                int i20 = i19 & 1;
                int i21 = i11;
                long j15 = j14 >> iArr[i20];
                jArrCopyOf[i19] = ((long) iArr2[i20]) & j14;
                i19++;
                jArrCopyOf[i19] = jArrCopyOf[i19] + ((long) ((int) j15));
                i11 = i21;
                i18 = i18;
                j10 = j10;
            }
            i18++;
        }
        int i22 = i11;
        long j16 = jArrCopyOf[9];
        jArrCopyOf[9] = j16 & 33554431;
        jArrCopyOf[i22] = (((long) ((int) (j16 >> 25))) * j10) + jArrCopyOf[i22];
        int i23 = ~((((int) r4) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) jArrCopyOf[i24]) ^ iArr2[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 + i29)) >> 31;
        }
        jArrCopyOf[i22] = jArrCopyOf[i22] - ((long) (67108845 & i23));
        long j17 = 33554431 & i23;
        jArrCopyOf[1] = jArrCopyOf[1] - j17;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) (67108863 & i23));
            int i30 = i10 + 1;
            jArrCopyOf[i30] = jArrCopyOf[i30] - j17;
        }
        for (int i31 = i22; i31 < 10; i31++) {
            jArrCopyOf[i31] = jArrCopyOf[i31] << E[i31];
        }
        byte[] bArr = new byte[32];
        for (int i32 = i22; i32 < 10; i32++) {
            int i33 = D[i32];
            long j18 = bArr[i33];
            long j19 = jArrCopyOf[i32];
            bArr[i33] = (byte) (j18 | (j19 & 255));
            bArr[i33 + 1] = (byte) (((long) bArr[r5]) | ((j19 >> 8) & 255));
            bArr[i33 + 2] = (byte) (((long) bArr[r5]) | ((j19 >> 16) & 255));
            bArr[i33 + 3] = (byte) (((long) bArr[r4]) | ((j19 >> 24) & 255));
        }
        return bArr;
    }

    public static int N(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        ix.k0(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            O(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            O(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            O(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b2 = bArr[i14];
            if ((b2 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b2 == 1) {
                    O(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void O(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String P(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                v41 v41Var = x41.f12018c;
                fs1.y(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int iN = N(bArr, i11, length2, zArr);
                    if (iN != length2) {
                        Integer numValueOf = Integer.valueOf(iN);
                        int length3 = objArrCopyOf.length;
                        int i13 = i12 + 1;
                        int iD = s41.d(length3, i13);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i12] = numValueOf;
                        i12 = i13;
                    }
                    i11 = iN + 3;
                }
                r51 r51VarX = x41.x(i12, objArrCopyOf);
                for (int i14 = 0; i14 < r51VarX.f9715e; i14++) {
                    if (((Integer) r51VarX.get(i14)).intValue() + 3 < length) {
                        y2 y2Var = new y2(((Integer) r51VarX.get(i14)).intValue() + 3, length, 1, bArr);
                        j0 j0VarQ = Q(y2Var);
                        if (j0VarQ.f6666a == 33 && j0VarQ.f6667b == 0) {
                            y2Var.y(4);
                            int iC = y2Var.C(3);
                            y2Var.v();
                            sx0 sx0VarR = R(y2Var, true, iC, null);
                            return ea0.a(sx0VarR.f10426a, sx0VarR.f10427b, sx0VarR.f10428c, sx0VarR.f10429d, sx0VarR.f10430e, sx0VarR.f10431f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static j0 Q(y2 y2Var) {
        y2Var.v();
        return new j0(y2Var.C(6), y2Var.C(6), y2Var.C(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.sx0 R(com.google.android.gms.internal.ads.y2 r18, boolean r19, int r20, com.google.android.gms.internal.ads.sx0 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.C(r2)
            boolean r7 = r0.B()
            r8 = 5
            int r8 = r0.C(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.B()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.C(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f10426a
            boolean r7 = r2.f10427b
            int r8 = r2.f10428c
            int r10 = r2.f10429d
            int[] r4 = r2.f10430e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.C(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.B()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.B()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.y(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.y(r5)
        L79:
            com.google.android.gms.internal.ads.sx0 r11 = new com.google.android.gms.internal.ads.sx0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.R(com.google.android.gms.internal.ads.y2, boolean, int, com.google.android.gms.internal.ads.sx0):com.google.android.gms.internal.ads.sx0");
    }

    public static void S(y2 y2Var) {
        int iE = y2Var.E() + 1;
        y2Var.y(8);
        for (int i10 = 0; i10 < iE; i10++) {
            y2Var.E();
            y2Var.E();
            y2Var.v();
        }
        y2Var.y(20);
    }

    public static String T(jx1 jx1Var) {
        String str;
        String str2 = jx1Var.f6975m;
        if (Objects.equals(str2, "video/dolby-vision") && (str = jx1Var.f6972j) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = i13 - 1;
        int i16 = f10036e[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f10037f[i15] : f10038g[i15]) * 12) / i16) + i17) * 4;
        }
        int i18 = i11 == 3 ? i12 == 2 ? f10039h[i15] : i[i15] : f10040j[i15];
        if (i11 == 3) {
            return ((i18 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i18) / i16) + i17;
    }

    public static int c(int i10, byte[] bArr) {
        int i11;
        synchronized (B) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = C;
                    int length = iArr.length;
                    if (length <= i13) {
                        C = Arrays.copyOf(iArr, length + length);
                    }
                    C[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = C[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static long d(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static String e(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        y81 y81Var = new y81();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new ie(1, y81Var));
        return (String) y81Var.get();
    }

    public static void f(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void g(String str, String str2) {
        synchronized (f10050t) {
            Log.d(str, K(str2, null));
        }
    }

    public static void i(String str, boolean z5) throws eb {
        if (!z5) {
            throw eb.a(null, str);
        }
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.l1 k(com.google.android.gms.internal.ads.ik0 r11, boolean r12) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs.k(com.google.android.gms.internal.ads.ik0, boolean):com.google.android.gms.internal.ads.l1");
    }

    public static kx0 l(tk0 tk0Var, boolean z5, boolean z10) throws eb {
        if (z5) {
            y(3, tk0Var, false);
        }
        tk0Var.k((int) tk0Var.a(), StandardCharsets.UTF_8);
        long jA = tk0Var.a();
        String[] strArr = new String[(int) jA];
        for (int i10 = 0; i10 < jA; i10++) {
            strArr[i10] = tk0Var.k((int) tk0Var.a(), StandardCharsets.UTF_8);
        }
        if (z10 && (tk0Var.K() & 1) == 0) {
            throw eb.a(null, "framing bit expected to be set");
        }
        return new kx0(2, strArr);
    }

    public static void m(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void n(String str, String str2) {
        synchronized (f10050t) {
            Log.i(str, K(str2, null));
        }
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static int p(jx1 jx1Var) {
        String strT = T(jx1Var);
        if (Objects.equals(strT, "video/avc")) {
            return 1;
        }
        return Objects.equals(strT, "video/hevc") ? 2 : 0;
    }

    public static f9 q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = cq0.f4293a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                r("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(c4.b(new tk0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e3) {
                    w("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new v4(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f9(arrayList);
    }

    public static void r(String str, String str2) {
        synchronized (f10050t) {
            Log.w(str, K(str2, null));
        }
    }

    public static void s(ArrayList arrayList, ya yaVar) {
        String str = (String) yaVar.r();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void t(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
        x(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static int u(ik0 ik0Var) throws eb {
        int iH = ik0Var.h(4);
        if (iH == 15) {
            if (ik0Var.b() >= 24) {
                return ik0Var.h(24);
            }
            throw eb.a(null, "AAC header insufficient data");
        }
        if (iH < 13) {
            return f10033b[iH];
        }
        throw eb.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static long v(ByteBuffer byteBuffer) {
        long jD = d(byteBuffer) << 32;
        if (jD >= 0) {
            return d(byteBuffer) + jD;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void w(String str, String str2, Throwable th2) {
        synchronized (f10050t) {
            Log.w(str, K(str2, th2));
        }
    }

    public static void x(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static boolean y(int i10, tk0 tk0Var, boolean z5) throws eb {
        if (tk0Var.B() < 7) {
            if (z5) {
                return false;
            }
            int iB = tk0Var.B();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iB);
            throw eb.a(null, sb2.toString());
        }
        if (tk0Var.K() != i10) {
            if (z5) {
                return false;
            }
            throw eb.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i10))));
        }
        if (tk0Var.K() == 118 && tk0Var.K() == 111 && tk0Var.K() == 114 && tk0Var.K() == 98 && tk0Var.K() == 105 && tk0Var.K() == 115) {
            return true;
        }
        if (z5) {
            return false;
        }
        throw eb.a(null, "expected characters 'vorbis'");
    }

    public static boolean z(byte[] bArr, int i10, jx1 jx1Var) {
        int i11;
        String str = jx1Var.f6975m;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i11 = b2 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            j0 j0VarQ = Q(new y2(4, i10 + 4, 1, bArr));
            int i12 = j0VarQ.f6666a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && j0VarQ.f6668c == jx1Var.D - 1) {
                return false;
            }
        }
        return true;
    }
}
