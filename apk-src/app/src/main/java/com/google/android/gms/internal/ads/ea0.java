package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4892a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4893b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f4894c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z5, int i10, int i11, int[] iArr, int i12) {
        int i13;
        Object[] objArr = {f4893b[i], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(true != z5 ? 'L' : 'H'), Integer.valueOf(i12)};
        String str = cq0.f4293a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (true) {
            if (i14 <= 0) {
                break;
            }
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (i13 = 0; i13 < i14; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x03fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.jx1 r27) {
        /*
            Method dump skipped, instruction units count: 2066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ea0.b(com.google.android.gms.internal.ads.jx1):android.util.Pair");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair c(String str, String[] strArr, rm1 rm1Var) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            a0.u.r(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f4894c.matcher(strArr[1]);
        if (!matcher.matches()) {
            a0.u.r(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(strGroup)) {
                i = (rm1Var == null || rm1Var.f9995c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                a0.u.r(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    num = !str2.equals("H30") ? null : 2;
                    break;
                case 70914:
                    num = !str2.equals("H60") ? null : 8;
                    break;
                case 70917:
                    num = !str2.equals("H63") ? null : 32;
                    break;
                case 71007:
                    num = !str2.equals("H90") ? null : 128;
                    break;
                case 71010:
                    num = !str2.equals("H93") ? null : 512;
                    break;
                case 74665:
                    num = !str2.equals("L30") ? null : 1;
                    break;
                case 74758:
                    num = !str2.equals("L60") ? null : 4;
                    break;
                case 74761:
                    num = !str2.equals("L63") ? null : 16;
                    break;
                case 74851:
                    num = !str2.equals("L90") ? null : 64;
                    break;
                case 74854:
                    num = !str2.equals("L93") ? null : 256;
                    break;
                case 2193639:
                    num = !str2.equals("H120") ? null : 2048;
                    break;
                case 2193642:
                    num = !str2.equals("H123") ? null : 8192;
                    break;
                case 2193732:
                    num = !str2.equals("H150") ? null : 32768;
                    break;
                case 2193735:
                    num = !str2.equals("H153") ? null : 131072;
                    break;
                case 2193738:
                    num = !str2.equals("H156") ? null : 524288;
                    break;
                case 2193825:
                    num = !str2.equals("H180") ? null : 2097152;
                    break;
                case 2193828:
                    num = !str2.equals("H183") ? null : 8388608;
                    break;
                case 2193831:
                    num = !str2.equals("H186") ? null : 33554432;
                    break;
                case 2312803:
                    num = !str2.equals("L120") ? null : 1024;
                    break;
                case 2312806:
                    num = !str2.equals("L123") ? null : 4096;
                    break;
                case 2312896:
                    num = !str2.equals("L150") ? null : 16384;
                    break;
                case 2312899:
                    num = !str2.equals("L153") ? null : 65536;
                    break;
                case 2312902:
                    num = !str2.equals("L156") ? null : 262144;
                    break;
                case 2312989:
                    num = !str2.equals("L180") ? null : 1048576;
                    break;
                case 2312992:
                    num = !str2.equals("L183") ? null : 4194304;
                    break;
                case 2312995:
                    num = !str2.equals("L186") ? null : 16777216;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        a0.u.r(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }
}
