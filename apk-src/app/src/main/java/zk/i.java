package zk;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f46407b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f46408c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f46409d = new i();

    public static final f a(i iVar, String str) {
        f fVar = new f(str);
        f.f46362d.put(str, fVar);
        return fVar;
    }

    public static String b(int i, int i10, int i11, String str, String encodeSet) throws EOFException {
        int i12 = (i11 & 1) != 0 ? 0 : i;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z5 = (i11 & 8) == 0;
        boolean z10 = (i11 & 16) == 0;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i12;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i13 = 128;
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || StringsKt.z(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z10 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z11)))) {
                nl.g gVar = new nl.g();
                gVar.Q(i12, iCharCount, str);
                nl.g gVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z11) {
                            gVar.R(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i13 && !z12) || StringsKt.z(encodeSet, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z10 && !d(iCharCount, length, str)))))) {
                            if (gVar2 == null) {
                                gVar2 = new nl.g();
                            }
                            gVar2.S(iCodePointAt2);
                            while (!gVar2.h()) {
                                byte b2 = gVar2.readByte();
                                gVar.L(37);
                                char[] cArr = m.f46423j;
                                gVar.L(cArr[((b2 & 255) >> 4) & 15]);
                                gVar.L(cArr[b2 & 15]);
                            }
                        } else {
                            gVar.S(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i13 = 128;
                    i14 = 32;
                }
                return gVar.m();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i12, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i, int i10, String str) {
        int i11 = i + 2;
        return i11 < i10 && str.charAt(i) == '%' && al.b.p(str.charAt(i + 1)) != -1 && al.b.p(str.charAt(i11)) != -1;
    }

    public static String e(String str, int i, int i10, int i11) {
        int i12;
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z5 = (i11 & 4) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i10) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z5)) {
                nl.g gVar = new nl.g();
                gVar.Q(i, iCharCount, str);
                while (iCharCount < i10) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                        int iP = al.b.p(str.charAt(iCharCount + 1));
                        int iP2 = al.b.p(str.charAt(i12));
                        if (iP == -1 || iP2 == -1) {
                            gVar.S(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            gVar.L((iP << 4) + iP2);
                            iCharCount = Character.charCount(iCodePointAt) + i12;
                        }
                    } else if (iCodePointAt == 43 && z5) {
                        gVar.L(32);
                        iCharCount++;
                    } else {
                        gVar.S(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return gVar.m();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String f(String str) {
        if (kotlin.text.a0.n(str, "TLS_", false)) {
            StringBuilder sb2 = new StringBuilder("SSL_");
            String strSubstring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
        if (!kotlin.text.a0.n(str, "SSL_", false)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder("TLS_");
        String strSubstring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb3.append(strSubstring2);
        return sb3.toString();
    }

    public static ArrayList g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iB = StringsKt.B(str, '&', i, 4);
            if (iB == -1) {
                iB = str.length();
            }
            int iB2 = StringsKt.B(str, '=', i, 4);
            if (iB2 == -1 || iB2 > iB) {
                String strSubstring = str.substring(i, iB);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iB2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iB2 + 1, iB);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iB + 1;
        }
        return arrayList;
    }

    public synchronized f c(String javaName) {
        f fVar;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = f.f46362d;
            fVar = (f) linkedHashMap.get(javaName);
            if (fVar == null) {
                fVar = (f) linkedHashMap.get(f(javaName));
                if (fVar == null) {
                    fVar = new f(javaName);
                }
                linkedHashMap.put(javaName, fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fVar;
    }
}
