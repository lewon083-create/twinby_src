package kotlin.text;

import com.google.android.gms.internal.ads.om1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f27550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f27551b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f27550a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i20;
            i++;
            i20++;
        }
        f27551b = jArr;
    }

    public static final void a(int i, int i10, String str) {
        int i11 = i10 - i;
        if (i11 < 1) {
            String strSubstring = str.substring(i, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            StringBuilder sbI = pe.a.i(i, "Expected at least 1 hexadecimal digits at index ", ", but was \"", strSubstring, "\" of length ");
            sbI.append(i11);
            throw new NumberFormatException(sbI.toString());
        }
        if (i11 > 16) {
            int i12 = (i11 + i) - 16;
            while (i < i12) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbM = l7.o.m(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM.append(str.charAt(i));
                    sbM.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM.toString());
                }
                i++;
            }
        }
    }

    public static long b(int i, int i10, String str) {
        j.f27557d.getClass();
        j format = j.f27558e;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.c cVar = kotlin.collections.f.Companion;
        int length = str.length();
        cVar.getClass();
        kotlin.collections.c.a(i, i10, length);
        if (format.f27561c.f27556a) {
            a(i, i10, str);
            return c(i, i10, str);
        }
        if (i10 - i > 0) {
            a(i, i10, str);
            return c(i, i10, str);
        }
        String strSubstring = str.substring(i, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException(om1.k("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", strSubstring));
    }

    public static final long c(int i, int i10, String str) {
        long j10 = 0;
        while (i < i10) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f27551b[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i++;
                }
            }
            StringBuilder sbM = l7.o.m(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbM.append(str.charAt(i));
            throw new NumberFormatException(sbM.toString());
        }
        return j10;
    }
}
