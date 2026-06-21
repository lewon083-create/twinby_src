package io.sentry.vendor;

import java.io.UnsupportedEncodingException;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i10, boolean z5);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // io.sentry.vendor.Base64.Coder
        public int maxOutputSize(int i) {
            return ((i * 3) / 4) + 10;
        }

        @Override // io.sentry.vendor.Base64.Coder
        public boolean process(byte[] bArr, int i, int i10, boolean z5) {
            int i11 = this.state;
            if (i11 == 6) {
                return false;
            }
            int i12 = i10 + i;
            int i13 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i14 = 0;
            int i15 = i13;
            int i16 = i11;
            int i17 = i;
            while (i17 < i12) {
                if (i16 == 0) {
                    while (true) {
                        int i18 = i17 + 4;
                        if (i18 > i12 || (i15 = (iArr[bArr[i17] & 255] << 18) | (iArr[bArr[i17 + 1] & 255] << 12) | (iArr[bArr[i17 + 2] & 255] << 6) | iArr[bArr[i17 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i14 + 2] = (byte) i15;
                        bArr2[i14 + 1] = (byte) (i15 >> 8);
                        bArr2[i14] = (byte) (i15 >> 16);
                        i14 += 3;
                        i17 = i18;
                    }
                    if (i17 >= i12) {
                        break;
                    }
                }
                int i19 = i17 + 1;
                int i20 = iArr[bArr[i17] & 255];
                if (i16 != 0) {
                    if (i16 == 1) {
                        if (i20 < 0) {
                            if (i20 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i20 |= i15 << 6;
                    } else if (i16 == 2) {
                        if (i20 < 0) {
                            if (i20 == -2) {
                                bArr2[i14] = (byte) (i15 >> 4);
                                i14++;
                                i16 = 4;
                            } else if (i20 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        i20 |= i15 << 6;
                    } else if (i16 != 3) {
                        if (i16 != 4) {
                            if (i16 == 5 && i20 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i20 == -2) {
                            i16++;
                        } else if (i20 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i20 >= 0) {
                        int i21 = i20 | (i15 << 6);
                        bArr2[i14 + 2] = (byte) i21;
                        bArr2[i14 + 1] = (byte) (i21 >> 8);
                        bArr2[i14] = (byte) (i21 >> 16);
                        i14 += 3;
                        i15 = i21;
                        i16 = 0;
                    } else if (i20 == -2) {
                        bArr2[i14 + 1] = (byte) (i15 >> 2);
                        bArr2[i14] = (byte) (i15 >> 10);
                        i14 += 2;
                        i16 = 5;
                    } else if (i20 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i16++;
                    i15 = i20;
                } else if (i20 >= 0) {
                    i16++;
                    i15 = i20;
                } else if (i20 != -1) {
                    this.state = 6;
                    return false;
                }
                i17 = i19;
            }
            if (!z5) {
                this.state = i16;
                this.value = i15;
                this.op = i14;
                return true;
            }
            if (i16 == 1) {
                this.state = 6;
                return false;
            }
            if (i16 == 2) {
                bArr2[i14] = (byte) (i15 >> 4);
                i14++;
            } else if (i16 == 3) {
                int i22 = i14 + 1;
                bArr2[i14] = (byte) (i15 >> 10);
                i14 += 2;
                bArr2[i22] = (byte) (i15 >> 2);
            } else if (i16 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i16;
            this.op = i14;
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i & 1) == 0;
            boolean z5 = (i & 2) == 0;
            this.do_newline = z5;
            this.do_cr = (i & 4) != 0;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z5 ? 19 : -1;
        }

        @Override // io.sentry.vendor.Base64.Coder
        public int maxOutputSize(int i) {
            return ((i * 8) / 5) + 10;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        @Override // io.sentry.vendor.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 490
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i10, int i11) {
        Encoder encoder = new Encoder(i11, null);
        int iC = (i10 / 3) * 4;
        if (!encoder.do_padding) {
            int i12 = i10 % 3;
            if (i12 == 1) {
                iC += 2;
            } else if (i12 == 2) {
                iC += 3;
            }
        } else if (i10 % 3 > 0) {
            iC += 4;
        }
        if (encoder.do_newline && i10 > 0) {
            iC += o.c(i10, 1, 57, 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[iC];
        encoder.process(bArr, i, i10, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i, int i10, int i11) {
        Decoder decoder = new Decoder(i11, new byte[(i10 * 3) / 4]);
        if (decoder.process(bArr, i, i10, true)) {
            int i12 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (i12 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int i, int i10, int i11) {
        try {
            return new String(encode(bArr, i, i10, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }
}
