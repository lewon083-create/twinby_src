package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pn1 implements d2 {
    public static final jo0 A;
    public static final jo0 B;
    public static final zd1 D = new zd1(24, (Object) new l91(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 4), (Object) new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (boolean) (0 == true ? 1 : 0));
    public static final /* synthetic */ int F = 0;
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ih f9122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ih f9123q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9133b = 27;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9110c = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9111d = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f9112e = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9113f = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f9114g = {5, 8, 10, 12};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f9115h = {6, 9, 12, 15};
    public static final int[] i = {2, 4, 6, 8};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f9116j = {9, 11, 13, 16};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9117k = {5, 8, 10, 12};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f9118l = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f9119m = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ya f9120n = new ya("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ih f9121o = new ih(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q90 f9124r = new q90(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q90 f9125s = new q90(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q90 f9126t = new q90(13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q90 f9127u = new q90(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q90 f9128v = new q90(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q90 f9129w = new q90(25);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final jo0 f9130x = new jo0(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final jo0 f9131y = new jo0(7);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final jo0 f9132z = new jo0(11);
    public static final hc1 C = new hc1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] E = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    static {
        int i10 = 14;
        f9122p = new ih(i10);
        int i11 = 18;
        f9123q = new ih(i11);
        A = new jo0(i10);
        B = new jo0(i11);
    }

    public static void A(ik0 ik0Var) {
        ik0Var.f(3);
        ik0Var.f(8);
        boolean zG = ik0Var.g();
        boolean zG2 = ik0Var.g();
        if (zG) {
            ik0Var.f(5);
        }
        if (zG2) {
            ik0Var.f(6);
        }
    }

    public static /* synthetic */ boolean B(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        rs.x(jArr2);
        byte[] bArrM = rs.M(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrM[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    public static int C(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static int D(ik0 ik0Var, int i10, int i11, int i12) {
        ix.o(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Math.addExact(Math.addExact(i13, i14), 1 << i12);
        if (ik0Var.b() >= i10) {
            int iH = ik0Var.h(i10);
            if (iH == i13) {
                if (ik0Var.b() >= i11) {
                    int iH2 = ik0Var.h(i11);
                    iH += iH2;
                    if (iH2 == i14) {
                        if (ik0Var.b() >= i12) {
                            return ik0Var.h(i12) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }

    public static Charset E(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static long F(byte b2, byte b10) {
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

    public static String G(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static void H(zd1 zd1Var, ut utVar, hc1 hc1Var) {
        l91 l91Var = (l91) utVar.f11061c;
        l91 l91Var2 = (l91) zd1Var.f12971c;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) l91Var2.f7465c;
        long[] jArr3 = (long[]) l91Var.f7466d;
        long[] jArr4 = (long[]) l91Var.f7465c;
        rs.j(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) l91Var2.f7466d;
        rs.o(jArr5, jArr3, jArr4);
        rs.D(jArr5, jArr5, hc1Var.f6098b);
        long[] jArr6 = hc1Var.f6097a;
        long[] jArr7 = (long[]) l91Var2.f7467e;
        rs.D(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) zd1Var.f12972d;
        rs.D(jArr8, (long[]) utVar.f11062d, hc1Var.f6099c);
        hc1Var.a(jArr2, (long[]) l91Var.f7467e);
        rs.j(jArr, jArr2, jArr2);
        rs.o(jArr2, jArr7, jArr5);
        rs.j(jArr5, jArr7, jArr5);
        rs.j(jArr7, jArr, jArr8);
        rs.o(jArr8, jArr, jArr8);
    }

    public static int I(ik0 ik0Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && ik0Var.g(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return ik0Var.h(iArr[i10]) + i12;
    }

    public static int J(byte[] bArr, int i10, int i11) {
        int iL = L(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iL;
        }
        while (true) {
            int length = bArr.length;
            if (iL >= length - 1) {
                return length;
            }
            int i12 = iL + 1;
            if ((iL - i10) % 2 == 0 && bArr[i12] == 0) {
                return iL;
            }
            iL = L(i12, bArr);
        }
    }

    public static void K(zd1 zd1Var, ut utVar, hc1 hc1Var) {
        l91 l91Var = (l91) utVar.f11061c;
        l91 l91Var2 = (l91) zd1Var.f12971c;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) l91Var2.f7465c;
        long[] jArr3 = (long[]) l91Var.f7466d;
        long[] jArr4 = (long[]) l91Var.f7465c;
        rs.j(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) l91Var2.f7466d;
        rs.o(jArr5, jArr3, jArr4);
        rs.D(jArr5, jArr5, hc1Var.f6097a);
        long[] jArr6 = hc1Var.f6098b;
        long[] jArr7 = (long[]) l91Var2.f7467e;
        rs.D(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) zd1Var.f12972d;
        rs.D(jArr8, (long[]) utVar.f11062d, hc1Var.f6099c);
        hc1Var.a(jArr2, (long[]) l91Var.f7467e);
        rs.j(jArr, jArr2, jArr2);
        rs.o(jArr2, jArr7, jArr5);
        rs.j(jArr5, jArr7, jArr5);
        rs.o(jArr7, jArr, jArr8);
        rs.j(jArr8, jArr, jArr8);
    }

    public static int L(int i10, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static ik0 M(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ik0(bArr.length, bArr);
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
        int length = bArrCopyOf.length;
        ik0 ik0Var = new ik0(length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ik0 ik0Var2 = new ik0(length, bArrCopyOf);
            while (ik0Var2.b() >= 16) {
                ik0Var2.f(2);
                int iH = ik0Var2.h(14);
                int iMin = Math.min(8 - ik0Var.f6520c, 14);
                int i12 = ik0Var.f6520c;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = ik0Var.f6518a;
                int i14 = ik0Var.f6519b;
                byte b12 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b12;
                int i15 = 14 - iMin;
                int i16 = iH & 16383;
                bArr2[i14] = (byte) (b12 | ((i16 >>> i15) << i13));
                int i17 = i14 + 1;
                while (i15 > 8) {
                    i15 -= 8;
                    ik0Var.f6518a[i17] = (byte) (i16 >>> i15);
                    i17++;
                }
                byte[] bArr3 = ik0Var.f6518a;
                byte b13 = (byte) (bArr3[i17] & ((1 << r7) - 1));
                bArr3[i17] = b13;
                bArr3[i17] = (byte) (((i16 & ((1 << i15) - 1)) << (8 - i15)) | b13);
                ik0Var.f(14);
                ik0Var.m();
            }
        }
        int length2 = bArrCopyOf.length;
        ik0Var.f6518a = bArrCopyOf;
        ik0Var.f6519b = 0;
        ik0Var.f6520c = 0;
        ik0Var.f6521d = length2;
        return ik0Var;
    }

    public static void N(l91 l91Var, zd1 zd1Var) {
        l91 l91Var2 = (l91) zd1Var.f12971c;
        long[] jArr = (long[]) l91Var2.f7465c;
        long[] jArr2 = (long[]) l91Var.f7465c;
        long[] jArr3 = new long[10];
        rs.I(jArr, jArr2);
        long[] jArr4 = (long[]) l91Var2.f7467e;
        long[] jArr5 = (long[]) l91Var.f7466d;
        rs.I(jArr4, jArr5);
        long[] jArr6 = (long[]) zd1Var.f12972d;
        rs.I(jArr6, (long[]) l91Var.f7467e);
        rs.j(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) l91Var2.f7466d;
        rs.j(jArr7, jArr2, jArr5);
        rs.I(jArr3, jArr7);
        rs.j(jArr7, jArr4, jArr);
        rs.o(jArr4, jArr4, jArr);
        rs.o(jArr, jArr3, jArr7);
        rs.o(jArr6, jArr6, jArr4);
    }

    public static int O(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static int P(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 + i14)) >> 7;
    }

    public static void Q(hc1 hc1Var, int i10, byte b2) {
        hc1[][] hc1VarArr = jc1.f6822d;
        int i11 = (b2 & 255) >> 7;
        int i12 = (-i11) & b2;
        int i13 = b2 - (i12 + i12);
        hc1Var.b(hc1VarArr[i10][0], P(i13, 1));
        hc1Var.b(hc1VarArr[i10][1], P(i13, 2));
        hc1Var.b(hc1VarArr[i10][2], P(i13, 3));
        hc1Var.b(hc1VarArr[i10][3], P(i13, 4));
        hc1Var.b(hc1VarArr[i10][4], P(i13, 5));
        hc1Var.b(hc1VarArr[i10][5], P(i13, 6));
        hc1Var.b(hc1VarArr[i10][6], P(i13, 7));
        hc1Var.b(hc1VarArr[i10][7], P(i13, 8));
        long[] jArr = hc1Var.f6099c;
        long[] jArr2 = hc1Var.f6097a;
        long[] jArr3 = hc1Var.f6098b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i14 = 0; i14 < jArrCopyOf3.length; i14++) {
            jArrCopyOf3[i14] = -jArrCopyOf3[i14];
        }
        ix.p(jArr2, jArrCopyOf, i11);
        ix.p(jArr3, jArrCopyOf2, i11);
        ix.p(jArr, jArrCopyOf3, i11);
    }

    public static String R(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static byte[] S(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b2 = bArr2[i10];
                    if (b2 != 0) {
                        byte b10 = bArr2[i12];
                        int i14 = b2 << i13;
                        int i15 = b10 + i14;
                        if (i15 <= 15) {
                            bArr2[i12] = (byte) i15;
                            bArr2[i10] = 0;
                        } else {
                            int i16 = b10 - i14;
                            if (i16 >= -15) {
                                bArr2[i12] = (byte) i16;
                                while (true) {
                                    if (i10 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i10] == 0) {
                                        bArr2[i10] = 1;
                                        break;
                                    }
                                    bArr2[i10] = 0;
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long T(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    public static long U(int i10, byte[] bArr) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | T(i10, bArr);
    }

    public static int a(int i10) {
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

    public static long c(String str) {
        String str2 = cq0.f4293a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str3 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j10 = (j10 * 60) + Long.parseLong(str3);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static ga d(oa oaVar) {
        long j10;
        boolean z5;
        long j11;
        long j12;
        long j13;
        long jL;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = oaVar.f8646c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jL2 = str != null ? l(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            z5 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z5 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z5 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jL3 = str3 != null ? l(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j13 = jCurrentTimeMillis;
            jL = l(str4);
        } else {
            j13 = jCurrentTimeMillis;
            jL = j10;
        }
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j16 = (j12 * 1000) + j13;
            j15 = z5 ? j16 : (j11 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (jL2 <= j10 || jL3 < jL2) ? j10 : (jL3 - jL2) + j13;
            j15 = j14;
        }
        ga gaVar = new ga();
        gaVar.f5719a = oaVar.f8645b;
        gaVar.f5720b = str5;
        gaVar.f5724f = j14;
        gaVar.f5723e = j15;
        gaVar.f5721c = jL2;
        gaVar.f5722d = jL;
        gaVar.f5725g = map;
        gaVar.f5726h = oaVar.f8647d;
        return gaVar;
    }

    public static ArrayList e(byte[] bArr) {
        long j10 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j10 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void g(long j10, tk0 tk0Var, w2[] w2VarArr) {
        int i10;
        int iB;
        while (true) {
            if (tk0Var.B() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (tk0Var.B() == 0) {
                    i10 = -1;
                    break;
                }
                int iK = tk0Var.K();
                i11 += iK;
                if (iK != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (tk0Var.B() == 0) {
                    i12 = -1;
                    break;
                }
                int iK2 = tk0Var.K();
                i12 += iK2;
                if (iK2 != 255) {
                    break;
                }
            }
            int i13 = tk0Var.f10642b + i12;
            if (i12 == -1 || i12 > tk0Var.B()) {
                rs.r("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = tk0Var.f10643c;
            } else if (i10 == 4 && i12 >= 8) {
                int iK3 = tk0Var.K();
                int iL = tk0Var.L();
                if (iL == 49) {
                    iB = tk0Var.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = tk0Var.K();
                if (iL == 47) {
                    tk0Var.G(1);
                    iL = 47;
                }
                boolean z5 = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z5 &= iB == 1195456820;
                }
                if (z5) {
                    o(j10, tk0Var, w2VarArr);
                }
            }
            tk0Var.E(i13);
        }
    }

    public static boolean i(a2 a2Var) {
        tk0 tk0Var = new tk0(8);
        int i10 = o.c(a2Var, tk0Var).f8527a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        a2Var.E(tk0Var.f10641a, 0, 4);
        tk0Var.E(0);
        int iB = tk0Var.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iB);
        rs.C("WavHeaderReader", sb2.toString());
        return false;
    }

    public static byte[] j(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 + i11;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) ((bArr[i11] & 255) >> 4);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b2 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b2;
            int i15 = (b2 + 8) >> 4;
            bArr2[i13] = (byte) (b2 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        zd1 zd1Var = new zd1(24);
        ut utVar = new ut(23);
        for (i10 = 1; i10 < 64; i10 += 2) {
            hc1 hc1Var = new hc1();
            Q(hc1Var, i10 / 2, bArr2[i10]);
            ut.n(utVar, zd1Var);
            H(zd1Var, utVar, hc1Var);
        }
        l91 l91Var = new l91(4);
        l91.e(l91Var, zd1Var);
        N(l91Var, zd1Var);
        l91.e(l91Var, zd1Var);
        N(l91Var, zd1Var);
        l91.e(l91Var, zd1Var);
        N(l91Var, zd1Var);
        l91.e(l91Var, zd1Var);
        N(l91Var, zd1Var);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            hc1 hc1Var2 = new hc1();
            Q(hc1Var2, i16 / 2, bArr2[i16]);
            ut.n(utVar, zd1Var);
            H(zd1Var, utVar, hc1Var2);
        }
        l91 l91Var2 = new l91(zd1Var);
        long[] jArr = new long[10];
        rs.I(jArr, (long[]) l91Var2.f7465c);
        long[] jArr2 = new long[10];
        rs.I(jArr2, (long[]) l91Var2.f7466d);
        long[] jArr3 = new long[10];
        rs.I(jArr3, (long[]) l91Var2.f7467e);
        long[] jArr4 = new long[10];
        rs.I(jArr4, jArr3);
        long[] jArr5 = new long[10];
        rs.o(jArr5, jArr2, jArr);
        rs.D(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        rs.D(jArr6, jArr, jArr2);
        rs.D(jArr6, jArr6, jc1.f6819a);
        rs.j(jArr6, jArr6, jArr4);
        rs.t(jArr6, jArr6);
        if (MessageDigest.isEqual(rs.M(jArr5), rs.M(jArr6))) {
            return l91Var2.l();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static float k(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long l(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e3) {
            if (CommonUrlParts.Values.FALSE_INTEGER.equals(str) || "-1".equals(str)) {
                xa.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", xa.d("Unable to parse dateStr: %s, falling back to 0", str), e3);
            return 0L;
        }
    }

    public static kn1 m() {
        ClassLoader classLoader = pn1.class.getClassLoader();
        if (kn1.class.equals(kn1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new pn1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e7) {
                    Logger.getLogger(hn1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(kn1.class.getSimpleName()), (Throwable) e7);
                }
            }
            if (arrayList.size() == 1) {
                return (kn1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (kn1) kn1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static HashMap n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("pn1", "decode object failure");
            return null;
        }
    }

    public static void o(long j10, tk0 tk0Var, w2[] w2VarArr) {
        int iK = tk0Var.K();
        if ((iK & 64) != 0) {
            int i10 = iK & 31;
            tk0Var.G(1);
            int i11 = tk0Var.f10642b;
            for (w2 w2Var : w2VarArr) {
                int i12 = i10 * 3;
                tk0Var.E(i11);
                w2Var.a(i12, tk0Var);
                ix.k0(j10 != -9223372036854775807L);
                w2Var.c(j10, 1, i12, 0, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean p(com.google.android.gms.internal.ads.tk0 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f10642b
        L6:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.P()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.L()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.O()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.O()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.E(r2)
            return r4
        La9:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn1.p(com.google.android.gms.internal.ads.tk0, int, int, boolean):boolean");
    }

    public static byte[] q(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) il1.f6537e.f6540a.b("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i10 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i10;
        bArrDigest[31] = (byte) (i10 | 64);
        return bArrDigest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
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
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn1.r(byte[]):int");
    }

    public static final ResolveInfo s(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i10++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th2) {
            p9.k.C.f31302h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th2);
            return resolveInfo;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.l4 t(int r33, com.google.android.gms.internal.ads.tk0 r34, boolean r35, com.google.android.gms.internal.ads.c6 r36) {
        /*
            Method dump skipped, instruction units count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pn1.t(int, com.google.android.gms.internal.ads.tk0, boolean, com.google.android.gms.internal.ads.c6):com.google.android.gms.internal.ads.l4");
    }

    public static void u(ik0 ik0Var) {
        int iH;
        int iH2 = ik0Var.h(2);
        if (iH2 == 0) {
            ik0Var.f(6);
            return;
        }
        int iD = D(ik0Var, 5, 8, 16) + 1;
        if (iH2 == 1) {
            ik0Var.f(iD * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = ik0Var.g();
            int i10 = true != zG ? 5 : 1;
            int i11 = true == zG ? 7 : 5;
            int i12 = true == zG ? 8 : 6;
            int i13 = 0;
            while (i13 < iD) {
                if (ik0Var.g()) {
                    ik0Var.f(7);
                    iH = 0;
                } else {
                    if (ik0Var.h(2) == 3 && ik0Var.h(i11) * i10 != 0) {
                        ik0Var.e();
                    }
                    iH = ik0Var.h(i12) * i10;
                    if (iH != 0 && iH != 180) {
                        ik0Var.e();
                    }
                    ik0Var.e();
                }
                if (iH != 0 && iH != 180 && ik0Var.g()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    public static final Intent v(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static o w(int i10, a2 a2Var, tk0 tk0Var) throws eb {
        o oVarC = o.c(a2Var, tk0Var);
        while (true) {
            int i11 = oVarC.f8527a;
            if (i11 == i10) {
                return oVarC;
            }
            a0.u.t(new StringBuilder(String.valueOf(i11).length() + 28), "Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j10 = oVarC.f8528b;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw eb.b(sb2.toString());
            }
            a2Var.t((int) j11);
            oVarC = o.c(a2Var, tk0Var);
        }
    }

    public static r51 x(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return x41.q("");
        }
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iJ = J(bArr, i11, i10);
        int i12 = 0;
        while (i11 < iJ) {
            String str = new String(bArr, i11, iJ - i11, E(i10));
            int length = objArrCopyOf.length;
            int i13 = i12 + 1;
            int iD = s41.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = str;
            i11 = O(i10) + iJ;
            iJ = J(bArr, i11, i10);
            i12 = i13;
        }
        r51 r51VarX = x41.x(i12, objArrCopyOf);
        return r51VarX.isEmpty() ? x41.q("") : r51VarX;
    }

    public static int y(int i10, tk0 tk0Var) {
        byte[] bArr = tk0Var.f10641a;
        int i11 = tk0Var.f10642b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static void z(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public abstract HashMap f();

    public String toString() {
        switch (this.f9133b) {
            case 27:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(f());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
