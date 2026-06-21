package com.appsflyer.internal;

import com.google.android.gms.internal.ads.om1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.n;
import kotlin.text.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1xSDK {
    public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strX = "";
        for (byte b2 : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            strX = om1.x(strX, str3);
        }
        return strX;
    }

    public static final int getMediationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        o oVarA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str);
        if (oVarA == null) {
            return -1;
        }
        n nVar = oVarA.f27572c;
        MatchGroup matchGroupC = nVar.c(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupC == null || (str4 = matchGroupC.f27534a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupC2 = nVar.c(2);
        int iIntValue3 = (((matchGroupC2 == null || (str3 = matchGroupC2.f27534a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupC3 = nVar.c(3);
        if (matchGroupC3 != null && (str2 = matchGroupC3.f27534a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
