package q4;

import android.util.Base64;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.m1;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import j3.b0;
import j3.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k6.t0;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f31696a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f31697b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f31698c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f31699d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f31700e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f31701f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f31702g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f31703h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, VKApiCodes.CODE_ANONYM_TOKEN_EXPIRED, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, VKApiCodes.CODE_CALL_REQUIRES_AUTH, VKApiCodes.CODE_VIDEO_ALREADY_ADDED, VKApiCodes.CODE_VIDEO_ALREADY_ADDED, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f31704j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f31705k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f31706l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f31707m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f31708n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f31709o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f31710p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f31711q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f31712r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f31713s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f31714t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f31715u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f31716v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f31717w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f31718x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f31719y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static void A(y2 y2Var) throws d0 {
        int i10 = y2Var.i(6);
        if (i10 < 2 || i10 > 42) {
            throw d0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
        }
        y2Var.t(i10 * 8);
    }

    public static boolean B(int i10, m3.p pVar, boolean z5) throws d0 {
        if (pVar.a() < 7) {
            if (z5) {
                return false;
            }
            throw d0.a(null, "too short header: " + pVar.a());
        }
        if (pVar.z() != i10) {
            if (z5) {
                return false;
            }
            throw d0.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (pVar.z() == 118 && pVar.z() == 111 && pVar.z() == 114 && pVar.z() == 98 && pVar.z() == 105 && pVar.z() == 115) {
            return true;
        }
        if (z5) {
            return false;
        }
        throw d0.a(null, "expected characters 'vorbis'");
    }

    public static byte[] a(int i10, int i11) {
        int i12 = -1;
        for (int i13 = 0; i13 < 13; i13++) {
            if (i10 == f31696a[i13]) {
                i12 = i13;
            }
        }
        int i14 = -1;
        for (int i15 = 0; i15 < 16; i15++) {
            if (i11 == f31697b[i15]) {
                i14 = i15;
            }
        }
        if (i10 == -1 || i14 == -1) {
            throw new IllegalArgumentException(a0.u.j(i10, i11, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i12, i14);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean d(m3.p pVar, g2 g2Var, int i10, e2 e2Var) {
        long jB = pVar.B();
        long j10 = jB >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z5 = (j10 & 1) == 1;
        int i11 = (int) ((jB >> 12) & 15);
        int i12 = (int) ((jB >> 8) & 15);
        int i13 = (int) ((jB >> 4) & 15);
        int i14 = (int) ((jB >> 1) & 7);
        boolean z10 = (jB & 1) == 1;
        if (i13 <= 7) {
            if (i13 != g2Var.f5610g - 1) {
                return false;
            }
        } else if (i13 > 10 || g2Var.f5610g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == g2Var.i) || z10) {
            return false;
        }
        try {
            long jH = pVar.H();
            if (!z5) {
                jH *= (long) g2Var.f5605b;
            }
            long j11 = g2Var.f5612j;
            if (j11 != 0 && jH > j11) {
                return false;
            }
            e2Var.f4793b = jH;
            int iX = x(i11, pVar);
            long j12 = g2Var.f5612j;
            boolean z11 = j12 == 0 || jH + ((long) iX) >= j12;
            if (iX == -1) {
                return false;
            }
            if ((!z11 && iX < g2Var.f5604a) || iX > g2Var.f5605b) {
                return false;
            }
            int i15 = g2Var.f5608e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != g2Var.f5609f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int iG = pVar.G();
                    if (i12 == 14) {
                        iG *= 10;
                    }
                    if (iG != i15) {
                        return false;
                    }
                } else if (pVar.z() * 1000 != i15) {
                    return false;
                }
            }
            int iZ = pVar.z();
            int i16 = pVar.f28590b;
            byte[] bArr = pVar.f28589a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = pVar.f28590b; i19 < i17; i19++) {
                i18 = m3.z.f28619m[i18 ^ (bArr[i19] & 255)];
            }
            String str = m3.z.f28608a;
            if (iZ != i18) {
                return false;
            }
            if (pVar.a() != 0) {
                int iJ = pVar.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i20 = (iJ & 126) >> 1;
                if ((i20 >= 2 && i20 <= 7) || (i20 >= 13 && i20 <= 31)) {
                    m3.b.j("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i20);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void e(String str, boolean z5) throws d0 {
        if (!z5) {
            throw d0.a(null, str);
        }
    }

    public static void f(long j10, m3.p pVar, a0[] a0VarArr) {
        int i10;
        while (true) {
            if (pVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (pVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iZ = pVar.z();
                i11 += iZ;
                if (iZ != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (pVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iZ2 = pVar.z();
                i12 += iZ2;
                if (iZ2 != 255) {
                    break;
                }
            }
            int i13 = pVar.f28590b + i12;
            if (i12 == -1 || i12 > pVar.a()) {
                m3.b.s("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = pVar.f28591c;
            } else if (i10 == 4 && i12 >= 8) {
                int iZ3 = pVar.z();
                int iG = pVar.G();
                int iM = iG == 49 ? pVar.m() : 0;
                int iZ4 = pVar.z();
                if (iG == 47) {
                    pVar.N(1);
                }
                boolean z5 = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z5 &= iM == 1195456820;
                }
                if (z5) {
                    g(j10, pVar, a0VarArr);
                }
            }
            pVar.M(i13);
        }
    }

    public static void g(long j10, m3.p pVar, a0[] a0VarArr) {
        int iZ = pVar.z();
        if ((iZ & 64) != 0) {
            pVar.N(1);
            int i10 = (iZ & 31) * 3;
            int i11 = pVar.f28590b;
            for (a0 a0Var : a0VarArr) {
                pVar.M(i11);
                a0Var.d(i10, pVar);
                h5.r(j10 != -9223372036854775807L);
                a0Var.f(j10, 1, i10, 0, null);
            }
        }
    }

    public static int h(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f31699d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f31703h[i12]) * 2;
        }
        int i14 = f31702g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void i(int i10, m3.p pVar) {
        pVar.J(7);
        byte[] bArr = pVar.f28589a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int j(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.j(byte[]):int");
    }

    public static int k(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f31714t[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f31715u[i13 - 1] : f31716v[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f31717w[i13 - 1] : f31718x[i13 - 1] : f31719y[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int l(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static int m(int i10) {
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

    public static y2 n(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new y2(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        y2 y2Var = new y2(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            y2 y2Var2 = new y2(bArrCopyOf.length, bArrCopyOf);
            while (y2Var2.b() >= 16) {
                y2Var2.t(2);
                int i12 = y2Var2.i(14) & 16383;
                int iMin = Math.min(8 - y2Var.f12464d, 14);
                int i13 = y2Var.f12464d;
                int i14 = (8 - i13) - iMin;
                byte[] bArr2 = y2Var.f12462b;
                int i15 = y2Var.f12463c;
                byte b12 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                bArr2[i15] = b12;
                int i16 = 14 - iMin;
                bArr2[i15] = (byte) (b12 | ((i12 >>> i16) << i14));
                int i17 = i15 + 1;
                while (i16 > 8) {
                    y2Var.f12462b[i17] = (byte) (i12 >>> (i16 - 8));
                    i16 -= 8;
                    i17++;
                }
                int i18 = 8 - i16;
                byte[] bArr3 = y2Var.f12462b;
                byte b13 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                bArr3[i17] = b13;
                bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b13);
                y2Var.t(14);
                y2Var.a();
            }
        }
        y2Var.o(bArrCopyOf.length, bArrCopyOf);
        return y2Var;
    }

    public static long o(byte b2, byte b10) {
        int i10;
        int i11 = b2 & 255;
        int i12 = b2 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b10 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        return ((long) i10) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? 60000 : 10000 << i14));
    }

    public static int p(y2 y2Var) throws d0 {
        int i10 = y2Var.i(4);
        if (i10 == 15) {
            if (y2Var.b() >= 24) {
                return y2Var.i(24);
            }
            throw d0.a(null, "AAC header insufficient data");
        }
        if (i10 < 13) {
            return f31696a[i10];
        }
        throw d0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.vq0 q(com.google.android.gms.internal.ads.y2 r21) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.q(com.google.android.gms.internal.ads.y2):com.google.android.gms.internal.ads.vq0");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.j0 r(com.google.android.gms.internal.ads.y2 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = q4.b.i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            com.google.android.gms.internal.ads.j0 r1 = new com.google.android.gms.internal.ads.j0
            r2 = 0
            r1.<init>(r5, r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.r(com.google.android.gms.internal.ads.y2):com.google.android.gms.internal.ads.j0");
    }

    public static a s(y2 y2Var, boolean z5) throws d0 {
        int i10 = y2Var.i(5);
        if (i10 == 31) {
            i10 = y2Var.i(6) + 32;
        }
        int iP = p(y2Var);
        int i11 = y2Var.i(4);
        String strI = l7.o.i(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            iP = p(y2Var);
            int i12 = y2Var.i(5);
            if (i12 == 31) {
                i12 = y2Var.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = y2Var.i(4);
            }
        }
        if (z5) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw d0.c("Unsupported audio object type: " + i10);
                }
            }
            if (y2Var.h()) {
                m3.b.s("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (y2Var.h()) {
                y2Var.t(14);
            }
            boolean zH = y2Var.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                y2Var.t(3);
            }
            if (zH) {
                if (i10 == 22) {
                    y2Var.t(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    y2Var.t(3);
                }
                y2Var.t(1);
            }
            switch (i10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i13 = y2Var.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw d0.c("Unsupported epConfig: " + i13);
                    }
                    break;
            }
        }
        int i14 = f31697b[i11];
        if (i14 != -1) {
            return new a(iP, i14, strI);
        }
        throw d0.a(null, null);
    }

    public static void t(y2 y2Var, m1 m1Var) throws d0 {
        int i10 = y2Var.i(5);
        y2Var.t(2);
        if (y2Var.h()) {
            y2Var.t(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            y2Var.s();
        }
        if (y2Var.h()) {
            int i11 = y2Var.i(3);
            if (m1Var.f7712b == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                m1Var.f7712b = i10;
            }
            if (y2Var.h()) {
                A(y2Var);
            }
        }
    }

    public static void u(y2 y2Var, m1 m1Var) throws d0 {
        y2Var.t(2);
        boolean zH = y2Var.h();
        int i10 = y2Var.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            y2Var.t(2);
            if (y2Var.h()) {
                y2Var.t(5);
            }
            if (zH) {
                y2Var.t(24);
            } else {
                if (y2Var.h()) {
                    if (!y2Var.h()) {
                        y2Var.t(4);
                    }
                    m1Var.f7713c = y2Var.i(6) + 1;
                }
                y2Var.t(4);
            }
        }
        if (y2Var.h()) {
            y2Var.t(3);
            if (y2Var.h()) {
                A(y2Var);
            }
        }
    }

    public static int v(y2 y2Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && y2Var.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return y2Var.i(iArr[i10]) + i12;
    }

    public static b0 w(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = m3.z.f28608a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                m3.b.s("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(c5.a.d(new m3.p(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e3) {
                    m3.b.t("VorbisUtil", "Failed to parse vorbis picture", e3);
                }
            } else {
                arrayList.add(new h5.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b0(arrayList);
    }

    public static int x(int i10, m3.p pVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return pVar.z() + 1;
            case 7:
                return pVar.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static l6.i y(m3.p pVar) {
        pVar.N(1);
        int iC = pVar.C();
        long j10 = ((long) pVar.f28590b) + ((long) iC);
        int i10 = iC / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jT = pVar.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jT;
            jArrCopyOf2[i11] = pVar.t();
            pVar.N(2);
            i11++;
        }
        pVar.N((int) (j10 - ((long) pVar.f28590b)));
        return new l6.i(27, jArrCopyOf, jArrCopyOf2);
    }

    public static t0 z(m3.p pVar, boolean z5, boolean z10) throws d0 {
        if (z5) {
            B(3, pVar, false);
        }
        pVar.x((int) pVar.q(), StandardCharsets.UTF_8);
        long jQ = pVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i10 = 0; i10 < jQ; i10++) {
            strArr[i10] = pVar.x((int) pVar.q(), StandardCharsets.UTF_8);
        }
        if (z10 && (pVar.z() & 1) == 0) {
            throw d0.a(null, "framing bit expected to be set");
        }
        return new t0(10, strArr);
    }
}
