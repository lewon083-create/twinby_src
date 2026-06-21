package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class StringsKt extends e0 {
    private StringsKt() {
    }

    public static int A(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int B(CharSequence charSequence, char c8, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.q(charSequence, new char[]{c8}, i, false) : ((String) charSequence).indexOf(c8, i);
    }

    public static /* synthetic */ int C(CharSequence charSequence, String str, int i, boolean z5, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z5 = false;
        }
        return StringsKt__StringsKt.o(i, charSequence, str, z5);
    }

    public static boolean D(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int E(int i, String str, String string) {
        int iA = (i & 2) != 0 ? A(str) : 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return str == null ? StringsKt__StringsKt.p(str, string, iA, 0, false, true) : str.lastIndexOf(string, iA);
    }

    public static int F(String str, char c8, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = A(str);
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str != null) {
            return str.lastIndexOf(c8, i);
        }
        char[] chars = {c8};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (str != null) {
            return str.lastIndexOf(kotlin.collections.p.s(chars), i);
        }
        int iA = A(str);
        if (i > iA) {
            i = iA;
        }
        while (-1 < i) {
            if (a.a(chars[0], str.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static String G(int i, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(a0.u.k(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String H(String str, String prefix) {
        String str2;
        String str3;
        boolean zR;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (str != null) {
            zR = a0.n(str, prefix, false);
            str2 = str;
            str3 = prefix;
        } else {
            str2 = str;
            str3 = prefix;
            zR = StringsKt__StringsKt.r(str2, 0, str3, 0, prefix.length(), false);
        }
        if (!zR) {
            return str2;
        }
        String strSubstring = str2.substring(str3.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String I(String str, String suffix) {
        String str2;
        String str3;
        boolean zR;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str != null) {
            zR = a0.h(str, suffix);
            str2 = str;
            str3 = suffix;
        } else {
            str2 = str;
            str3 = suffix;
            zR = StringsKt__StringsKt.r(str2, str.length() - suffix.length(), str3, 0, suffix.length(), false);
        }
        if (!zR) {
            return str2;
        }
        String strSubstring = str2.substring(0, str2.length() - str3.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List J(CharSequence charSequence, final char[] delimiters) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.t(0, charSequence, String.valueOf(delimiters[0]), false);
        }
        StringsKt__StringsKt.s(0);
        c cVar = new c(charSequence, 0, new Function2() { // from class: kotlin.text.b0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iQ = StringsKt__StringsKt.q(DelimitedRangesSequence, delimiters, iIntValue, false);
                if (iQ < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iQ), 1);
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ek.s sVar = new ek.s(0, cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(sVar, 10));
        Iterator it = sVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f27526b, range.f27527c + 1).toString());
        }
    }

    public static String L(char c8, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iB = B(str, c8, 0, 6);
        if (iB == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String M(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iC = C(str, delimiter, 0, false, 6);
        if (iC == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iC, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N(String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iF = F(str, '.', 0, 6);
        if (iF == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Long O(String str) {
        boolean z5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (Intrinsics.d(cCharAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z5 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j10 / ((long) 10);
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * ((long) 10);
            long j14 = iDigit;
            if (j13 < j10 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i++;
        }
        return z5 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    public static CharSequence P(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z5 = false;
        while (i <= length) {
            boolean zB = CharsKt.b(charSequence.charAt(!z5 ? i : length));
            if (z5) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean y(CharSequence charSequence, CharSequence other, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (C(charSequence, (String) other, 0, z5, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.p(charSequence, other, 0, charSequence.length(), z5, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean z(CharSequence charSequence, char c8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return B(charSequence, c8, 0, 2) >= 0;
    }
}
