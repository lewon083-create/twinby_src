package androidx.datastore.preferences.protobuf;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1468c;

    public /* synthetic */ q1(int i) {
        this.f1468c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(byte[] r11, int r12, int r13) throws androidx.datastore.preferences.protobuf.e0 {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q1.d(byte[], int, int):java.lang.String");
    }

    @Override // a.a
    public final int f(int i, int i10, String str, byte[] bArr) {
        int i11;
        int i12;
        char cCharAt;
        long j10;
        char c8;
        long j11;
        String str2;
        int i13;
        char c9;
        int i14;
        char cCharAt2;
        String str3 = str;
        switch (this.f1468c) {
            case 0:
                int length = str3.length();
                int i15 = i10 + i;
                int i16 = 0;
                while (i16 < length && (i12 = i16 + i) < i15 && (cCharAt = str3.charAt(i16)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i + length;
                }
                int i17 = i + i16;
                while (i16 < length) {
                    char cCharAt3 = str3.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | VKApiCodes.CODE_CALL_REQUIRES_AUTH);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i16 + 1) == str3.length() || !Character.isSurrogatePair(cCharAt3, str3.charAt(i11)))) {
                                    throw new r1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str3.length()) {
                                char cCharAt4 = str3.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new r1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i;
                long j13 = ((long) i10) + j12;
                int length2 = str3.length();
                if (length2 > i10 || bArr.length - i10 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str3.charAt(length2 - 1) + " at index " + (i + i10));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    c8 = 128;
                    if (i22 < length2 && (cCharAt2 = str3.charAt(i22)) < 128) {
                        p1.j(bArr, j12, (byte) cCharAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str3.charAt(i22);
                        if (cCharAt5 < c8 && j12 < j13) {
                            p1.j(bArr, j12, (byte) cCharAt5);
                            i13 = i22;
                            c9 = c8;
                            j11 = j10;
                            j12 += j10;
                        } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                            j11 = j10;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                                if (j12 > j13 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new r1(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j12);
                                }
                                i13 = i22 + 1;
                                if (i13 != length2) {
                                    str2 = str;
                                    char cCharAt6 = str2.charAt(i13);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        p1.j(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                        int i23 = (codePoint2 >>> 12) & 63;
                                        c9 = 128;
                                        p1.j(bArr, j12 + j11, (byte) (i23 | 128));
                                        long j14 = j12 + 3;
                                        p1.j(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j12 += 4;
                                        p1.j(bArr, j14, (byte) ((codePoint2 & 63) | 128));
                                    } else {
                                        i22 = i13;
                                    }
                                }
                                throw new r1(i22 - 1, length2);
                            }
                            p1.j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j15 = j12 + 2;
                            p1.j(bArr, j12 + j11, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j12 += 3;
                            p1.j(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
                            str2 = str;
                            i13 = i22;
                            c9 = 128;
                            c8 = c9;
                            i22 = i13 + 1;
                            str3 = str2;
                            j10 = j11;
                        } else {
                            j11 = j10;
                            long j16 = j12 + j11;
                            p1.j(bArr, j12, (byte) ((cCharAt5 >>> 6) | VKApiCodes.CODE_CALL_REQUIRES_AUTH));
                            j12 += 2;
                            p1.j(bArr, j16, (byte) ((cCharAt5 & '?') | c8));
                            i13 = i22;
                            c9 = c8;
                        }
                        str2 = str3;
                        c8 = c9;
                        i22 = i13 + 1;
                        str3 = str2;
                        j10 = j11;
                    }
                }
                return (int) j12;
        }
    }
}
