package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i61 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g61 f6399d = new g61("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g61 f6400e = new g61("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f61 f6401f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e61 f6402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f6403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile i61 f6404c;

    static {
        new i61("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new i61("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f6401f = new f61(new e61("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public i61(e61 e61Var, Character ch2) {
        this.f6402a = e61Var;
        boolean z5 = true;
        if (ch2 != null) {
            byte[] bArr = e61Var.f4859g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z5 = false;
            }
        }
        ix.e0(z5, "Padding character %s was already in alphabet", ch2);
        this.f6403b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        ix.p0(0, i, bArr.length);
        while (i10 < i) {
            int i11 = this.f6402a.f4858f;
            d(sb2, bArr, i10, Math.min(i11, i - i10));
            i10 += i11;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws h61 {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        e61 e61Var = this.f6402a;
        boolean z5 = e61Var.f4860h[length % e61Var.f4857e];
        int i10 = e61Var.f4856d;
        if (!z5) {
            int length2 = charSequenceE.length();
            throw new h61(l7.o.j(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceE.length()) {
            long jA = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i = e61Var.f4857e;
                if (i13 >= i) {
                    break;
                }
                jA <<= i10;
                if (i11 + i13 < charSequenceE.length()) {
                    jA |= (long) e61Var.a(charSequenceE.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = e61Var.f4858f;
            int i16 = i14 * i10;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jA >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i;
        }
        return i12;
    }

    public i61 c(e61 e61Var, Character ch2) {
        return new i61(e61Var, ch2);
    }

    public final void d(StringBuilder sb2, byte[] bArr, int i, int i10) {
        ix.p0(i, i + i10, bArr.length);
        e61 e61Var = this.f6402a;
        int i11 = e61Var.f4858f;
        int i12 = 0;
        ix.o(i10 <= i11);
        long j10 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j10 = (j10 | ((long) (bArr[i + i13] & 255))) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = e61Var.f4856d;
        while (i12 < i10 * 8) {
            sb2.append(e61Var.f4854b[e61Var.f4855c & ((int) (j10 >>> ((i14 - i15) - i12)))]);
            i12 += i15;
        }
        if (this.f6403b != null) {
            while (i12 < i11 * 8) {
                sb2.append('=');
                i12 += i15;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f6403b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i61) {
            i61 i61Var = (i61) obj;
            if (this.f6402a.equals(i61Var.f6402a) && Objects.equals(this.f6403b, i61Var.f6403b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final i61 f() {
        e61 e61Var;
        boolean z5;
        i61 i61VarC = this.f6404c;
        if (i61VarC == null) {
            e61 e61Var2 = this.f6402a;
            int i = 0;
            while (true) {
                char[] cArr = e61Var2.f4854b;
                int length = cArr.length;
                if (i >= length) {
                    e61Var = e61Var2;
                    break;
                }
                if (ix.U(cArr[i])) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z5 = false;
                            break;
                        }
                        char c8 = cArr[i10];
                        if (c8 >= 'a' && c8 <= 'z') {
                            z5 = true;
                            break;
                        }
                        i10++;
                    }
                    ix.l0("Cannot call lowerCase() on a mixed-case alphabet", !z5);
                    char[] cArr2 = new char[cArr.length];
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c9 = cArr[i11];
                        if (ix.U(c9)) {
                            c9 ^= 32;
                        }
                        cArr2[i11] = (char) c9;
                    }
                    e61Var = new e61(e61Var2.f4853a.concat(".lowerCase()"), cArr2);
                    if (e61Var2.i && !e61Var.i) {
                        byte[] bArr = e61Var.f4859g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i12 = 65; i12 <= 90; i12++) {
                            int i13 = i12 | 32;
                            byte b2 = bArr[i12];
                            byte b10 = bArr[i13];
                            if (b2 == -1) {
                                bArrCopyOf[i12] = b10;
                            } else {
                                char c10 = (char) i12;
                                char c11 = (char) i13;
                                if (b10 != -1) {
                                    throw new IllegalStateException(gr.P("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                                }
                                bArrCopyOf[i13] = b2;
                            }
                        }
                        e61Var = new e61(e61Var.f4853a.concat(".ignoreCase()"), e61Var.f4854b, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            i61VarC = e61Var == e61Var2 ? this : c(e61Var, this.f6403b);
            this.f6404c = i61VarC;
        }
        return i61VarC;
    }

    public final String g(int i, byte[] bArr) {
        ix.p0(0, i, bArr.length);
        e61 e61Var = this.f6402a;
        int i10 = e61Var.f4858f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(e61Var.f4857e * vv.s(i, i10));
        try {
            a(sb2, bArr, i);
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final byte[] h(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int length = (int) (((((long) this.f6402a.f4856d) * ((long) charSequenceE.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceE);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (h61 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final int hashCode() {
        return this.f6402a.hashCode() ^ Objects.hashCode(this.f6403b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        e61 e61Var = this.f6402a;
        sb2.append(e61Var);
        if (8 % e61Var.f4856d != 0) {
            Character ch2 = this.f6403b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public i61(String str, String str2) {
        this(new e61(str, str2.toCharArray()), (Character) '=');
    }
}
