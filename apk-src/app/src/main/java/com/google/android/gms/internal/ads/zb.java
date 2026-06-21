package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12939a;

    static {
        int i = (((((~349517445) & 1770783991) | 1585637523) + ((349517445 & 828130404) | 441534467)) - 1774508070) ^ (1876855542 % 1069755936);
        int i10 = (((((~396473730) & 280003019) | 1560841089) + ((396473730 & 581959754) | 705178672)) - (-2122415827)) ^ (1447267605 % 1369321801);
        int i11 = (((((~990892921) & 1764437056) | 26530608) + ((990892921 & 2050981056) | 378852004)) - 524777631) ^ (168002245 % 150122846);
        int i12 = (((((~783368690) & 1480833986) | 1027924228) + ((783368690 & 1108040386) | 324812860)) - (-2032723989)) ^ (1189641421 % 1025202362);
        int i13 = (((((~1662981776) & 570576705) | 1321849157) + ((1662981776 & (-264073600)) | (-599138066))) - 1910740440) ^ (882160379 % 11614769);
        int[] iArr = new int[i12];
        iArr[0] = i11;
        iArr[1] = i10;
        iArr[i] = i13;
        iArr[(((((~12260289) & 18423941) | 1391147552) + ((12260289 & 286296197) | 2093276674)) - (-1077194409)) ^ (1503885238 % 1219407971)] = (((((~1204275569) & 228665354) | 424906800) + ((1204275569 & (-1801127910)) | (-1190276491))) - 1826404452) ^ (2069110699 % 712633417);
        f12939a = iArr;
    }

    public static String a(String str) {
        int i;
        int i10 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[8];
        int i11 = 0;
        while (i11 < bArrDecode.length) {
            int i12 = i11 % 8;
            if (i12 == 0) {
                int i13 = i11 >>> 3;
                int i14 = i10;
                int i15 = i14;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                i = i30;
                int i31 = 1821351989;
                while (true) {
                    if (i31 == 91464932) {
                        int i32 = 751433995 + i31;
                        i31 += 1234789214;
                        if (i14 >= i15) {
                            i31 = i32;
                        }
                    } else if (i31 == 1326254146) {
                        int i33 = i17 >>> i19;
                        int[] iArr = f12939a;
                        i16 += ((i17 << i18) ^ (i33 + i17)) ^ (i20 + iArr[i20 & i21]);
                        i20 += i22;
                        i17 += ((i16 << i18) ^ (i33 + i16)) ^ (i20 + iArr[(i20 >> i23) & i21]);
                        i14++;
                        i31 -= 1234789214;
                    } else {
                        if (i31 != 1821351989) {
                            break;
                        }
                        i31 -= 1729887057;
                        i21 = 3;
                        i19 = 5;
                        i24 = KotlinVersion.MAX_COMPONENT_VALUE;
                        i27 = 2;
                        i23 = 11;
                        i22 = 1340169305;
                        i18 = 4;
                        i15 = 64;
                        i16 = -236335227;
                        i28 = 16;
                        i29 = 6;
                        i30 = 7;
                        i26 = 8;
                        i25 = 24;
                        i17 = i13;
                        i14 = i;
                        i20 = i14;
                    }
                }
                bArr[i] = (byte) (((i16 & i24) << i25) >> i25);
                bArr[1] = (byte) ((((i16 >> i26) & i24) << i25) >> i25);
                bArr[i27] = (byte) ((((i16 >> i28) & i24) << i25) >> i25);
                bArr[i21] = (byte) (i16 >> i25);
                bArr[i18] = (byte) (((i17 & i24) << i25) >> i25);
                bArr[i19] = (byte) ((((i17 >> i26) & i24) << i25) >> i25);
                bArr[i29] = (byte) ((((i17 >> i28) & i24) << i25) >> i25);
                bArr[i30] = (byte) (i17 >> i25);
                i12 = i;
            } else {
                i = i10;
            }
            bArrDecode[i11] = (byte) (((bArrDecode[i11] ^ bArr[i12]) << 24) >> 24);
            i11++;
            i10 = i;
        }
        return new String(bArrDecode, Charset.defaultCharset());
    }
}
