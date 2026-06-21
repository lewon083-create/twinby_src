package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a0 extends StringsKt__StringNumberConversionsKt {
    public static String g(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static boolean h(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean i(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean j(int i, int i10, int i11, String str, String other, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z5 ? str.regionMatches(i, other, i10, i11) : str.regionMatches(z5, i, other, i10, i11);
    }

    public static String k(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i10 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i11 = 0; i11 < i; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.b(string);
        return string;
    }

    public static String l(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iO = StringsKt__StringsKt.o(0, str, oldValue, false);
        if (iO < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iO);
            sb2.append(newValue);
            i10 = iO + length;
            if (iO >= str.length()) {
                break;
            }
            iO = StringsKt__StringsKt.o(iO + i, str, oldValue, false);
        } while (iO > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static boolean m(int i, String str, String prefix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix, i) : j(i, 0, prefix.length(), str, prefix, z5);
    }

    public static boolean n(String str, String prefix, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z5 ? str.startsWith(prefix) : j(0, 0, prefix.length(), str, prefix, z5);
    }
}
