package wk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f35316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f35317b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f35316a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f35317b = bArr;
    }

    public static final void a(StringBuilder sb2, String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            String[] strArr = f35316a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i, i10);
                sb2.append(strArr[cCharAt]);
                i = i10 + 1;
            }
        }
        if (i != 0) {
            sb2.append((CharSequence) value, i, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    public static final char b(int i) {
        int i10 = i & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
