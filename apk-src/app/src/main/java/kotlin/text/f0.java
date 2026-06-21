package kotlin.text;

import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {
    public static final boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.d(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte b(java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            ij.w r0 = d(r4)
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r0.f21360b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 <= 0) goto L21
            goto L28
        L21:
            byte r0 = (byte) r0
            ij.s r2 = new ij.s
            r2.<init>(r0)
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 == 0) goto L2e
            byte r4 = r2.f21354b
            return r4
        L2e:
            kotlin.text.StringsKt__StringNumberConversionsKt.f(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.b(java.lang.String):byte");
    }

    public static final int c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        ij.w wVarD = d(str);
        if (wVarD != null) {
            return wVarD.f21360b;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final ij.w d(String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.d(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        ij.v vVar = ij.w.f21359c;
        int i11 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = i10 ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            if (Integer.compare(i12, i11 ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i12, i11 ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = iDigit + i13;
            if (Integer.compare(i14 ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, i13 ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) < 0) {
                return null;
            }
            i++;
            i10 = i14;
        }
        return new ij.w(i10);
    }

    public static final long e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ij.z zVarF = f(str);
        if (zVarF != null) {
            return zVarF.f21363b;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final ij.z f(String str) {
        int i;
        long j10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i11 = 1;
        if (Intrinsics.d(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j11 = 10;
        ij.y yVar = ij.z.f21362c;
        long j12 = 0;
        long j13 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = length;
            long j14 = j12 ^ Long.MIN_VALUE;
            int i13 = i;
            if (Long.compare(j14, j13 ^ Long.MIN_VALUE) <= 0) {
                j10 = j11;
            } else {
                if (j13 != 512409557603043100L) {
                    return null;
                }
                if (j11 >= 0) {
                    long j15 = (Long.MAX_VALUE / j11) << i11;
                    j10 = j11;
                    j13 = j15 + ((long) ((((-1) - (j15 * j11)) ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE) ? i11 : 0));
                } else if (Long.MAX_VALUE < (j11 ^ Long.MIN_VALUE)) {
                    j10 = j11;
                    j13 = 0;
                } else {
                    j13 = 1;
                    j10 = j11;
                }
                if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j16 = j12 * j10;
            ij.v vVar = ij.w.f21359c;
            long j17 = (((long) iDigit) & 4294967295L) + j16;
            if (Long.compare(j17 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i13 + 1;
            j12 = j17;
            length = i12;
            j11 = j10;
            i10 = 10;
            i11 = 1;
        }
        return new ij.z(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final short g(java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            ij.w r0 = d(r4)
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r0.f21360b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 <= 0) goto L21
            goto L28
        L21:
            short r0 = (short) r0
            ij.d0 r2 = new ij.d0
            r2.<init>(r0)
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 == 0) goto L2e
            short r4 = r2.f21333b
            return r4
        L2e:
            kotlin.text.StringsKt__StringNumberConversionsKt.f(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.f0.g(java.lang.String):short");
    }
}
