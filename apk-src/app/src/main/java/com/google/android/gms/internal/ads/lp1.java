package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jl1 f7589a;

    static {
        if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") == null) {
            if (jp1.f6925e && jp1.f6924d) {
                int i = tm1.f10663a;
            }
        }
        f7589a = new jl1(6, (byte) 0);
    }

    public static boolean a(byte[] bArr, int i, int i10) {
        int iE;
        f7589a.getClass();
        while (i < i10 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i10) {
            iE = 0;
        } else {
            while (i < i10) {
                int i11 = i + 1;
                iE = bArr[i];
                if (iE < 0) {
                    if (iE >= -32) {
                        if (iE >= -16) {
                            if (i11 < i10 - 2) {
                                int i12 = i + 2;
                                byte b2 = bArr[i11];
                                if (b2 <= -65) {
                                    if ((((b2 + 112) + (iE << 28)) >> 30) == 0) {
                                        int i13 = i + 3;
                                        if (bArr[i12] <= -65) {
                                            i += 4;
                                            if (bArr[i13] > -65) {
                                            }
                                        }
                                    }
                                }
                                iE = -1;
                                break;
                            }
                            iE = e(bArr, i11, i10);
                            break;
                        }
                        if (i11 < i10 - 1) {
                            int i14 = i + 2;
                            byte b10 = bArr[i11];
                            if (b10 <= -65 && ((iE != -32 || b10 >= -96) && (iE != -19 || b10 < -96))) {
                                i += 3;
                                if (bArr[i14] > -65) {
                                }
                            }
                            iE = -1;
                            break;
                        }
                        iE = e(bArr, i11, i10);
                        break;
                    }
                    if (i11 >= i10) {
                        break;
                    }
                    if (iE >= -62) {
                        i += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    iE = -1;
                    break;
                }
                i = i11;
            }
            iE = 0;
        }
        return iE == 0;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(length2).length());
                                    sb2.append("Unpaired surrogate at index ");
                                    sb2.append(i10);
                                    sb2.append(" of ");
                                    sb2.append(length2);
                                    throw new kp1(sb2.toString());
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i;
                } catch (kp1 unused) {
                    return str.getBytes(ao1.f3341a).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j10 = ((long) i11) + 4294967296L;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(j10);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int c(int i, int i10, String str, byte[] bArr) {
        int i11;
        int i12;
        int length;
        int i13;
        char cCharAt;
        int length2 = str.length();
        int i14 = 0;
        while (true) {
            i11 = i + i10;
            if (i14 >= length2 || (i13 = i14 + i) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length2) {
            return i + length2;
        }
        int i15 = i + i14;
        while (i14 < length2) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | VKApiCodes.CODE_CALL_REQUIRES_AUTH);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 <= i11 - 4) {
                        i14++;
                        if (i14 != str.length()) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i16 = i15 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(ao1.f3341a);
                        length = bytes.length;
                        if (length - i > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(ao1.f3341a);
                        length = bytes2.length;
                        if (length - i > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, length);
                    }
                    return i + length;
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static String d(byte[] bArr, int i, int i10) {
        int length = bArr.length;
        if ((((length - i) - i10) | i | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i10)));
        }
        int i11 = i + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i < i11) {
            byte b2 = bArr[i];
            if (b2 < 0) {
                break;
            }
            i++;
            cArr[i12] = (char) b2;
            i12++;
        }
        while (i < i11) {
            int i13 = i + 1;
            byte b10 = bArr[i];
            if (b10 >= 0) {
                cArr[i12] = (char) b10;
                i12++;
                i = i13;
                while (i < i11) {
                    byte b11 = bArr[i];
                    if (b11 >= 0) {
                        i++;
                        cArr[i12] = (char) b11;
                        i12++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i13 >= i11 - 2) {
                            throw new co1("Protocol message had invalid UTF-8.");
                        }
                        byte b12 = bArr[i13];
                        int i14 = i + 3;
                        byte b13 = bArr[i + 2];
                        i += 4;
                        byte b14 = bArr[i14];
                        if (!gr.U(b12)) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && !gr.U(b13) && !gr.U(b14)) {
                                int i15 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                cArr[i12] = (char) ((i15 >>> 10) + 55232);
                                cArr[i12 + 1] = (char) ((i15 & 1023) + 56320);
                                i12 += 2;
                            }
                        }
                        throw new co1("Protocol message had invalid UTF-8.");
                    }
                    if (i13 >= i11 - 1) {
                        throw new co1("Protocol message had invalid UTF-8.");
                    }
                    int i16 = i12 + 1;
                    int i17 = i + 2;
                    byte b15 = bArr[i13];
                    i += 3;
                    byte b16 = bArr[i17];
                    if (!gr.U(b15)) {
                        if (b10 == -32) {
                            if (b15 >= -96) {
                                b10 = -32;
                            }
                        }
                        if (b10 == -19) {
                            if (b15 < -96) {
                                b10 = -19;
                            }
                        }
                        if (!gr.U(b16)) {
                            cArr[i12] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                            i12 = i16;
                        }
                    }
                    throw new co1("Protocol message had invalid UTF-8.");
                }
                if (i13 >= i11) {
                    throw new co1("Protocol message had invalid UTF-8.");
                }
                int i18 = i12 + 1;
                i += 2;
                byte b17 = bArr[i13];
                if (b10 < -62 || gr.U(b17)) {
                    throw new co1("Protocol message had invalid UTF-8.");
                }
                cArr[i12] = (char) ((b17 & 63) | ((b10 & 31) << 6));
                i12 = i18;
            }
        }
        return new String(cArr, 0, i12);
    }

    public static /* synthetic */ int e(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        byte b2 = bArr[i - 1];
        if (i11 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
        }
        if (i11 == 1) {
            byte b10 = bArr[i];
            if (b2 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b2;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i];
        byte b12 = bArr[i + 1];
        if (b2 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b2);
    }
}
