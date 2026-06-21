package nl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f29539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29540c;

    @Override // nl.i
    public final String A() {
        return q(Long.MAX_VALUE);
    }

    @Override // nl.x
    public final long D(g sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount < 0: ").toString());
        }
        long j11 = this.f29540c;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.write(this, j10);
        return j10;
    }

    @Override // nl.i
    public final void E(long j10) throws EOFException {
        if (this.f29540c < j10) {
            throw new EOFException();
        }
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h F(long j10) {
        M(j10);
        return this;
    }

    @Override // nl.h
    public final OutputStream G() {
        return new f(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[EDGE_INSN: B:44:0x00a7->B:38:0x00a7 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // nl.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long H() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f29540c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lae
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            nl.s r7 = r15.f29539b
            kotlin.jvm.internal.Intrinsics.b(r7)
            byte[] r8 = r7.f29565a
            int r9 = r7.f29566b
            int r10 = r7.f29567c
        L17:
            if (r9 >= r10) goto L93
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            nl.g r0 = new nl.g
            r0.<init>()
            r0.N(r4)
            r0.L(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.m()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L93
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = ol.b.f30750a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L93:
            if (r9 != r10) goto L9f
            nl.s r8 = r7.a()
            r15.f29539b = r8
            nl.t.a(r7)
            goto La1
        L9f:
            r7.f29566b = r9
        La1:
            if (r6 != 0) goto La7
            nl.s r7 = r15.f29539b
            if (r7 != 0) goto Lc
        La7:
            long r2 = r15.f29540c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f29540c = r2
            return r4
        Lae:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.g.H():long");
    }

    public final j I(int i) {
        if (i == 0) {
            return j.f29541e;
        }
        hl.d.h(this.f29540c, 0L, i);
        s sVar = this.f29539b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            Intrinsics.b(sVar);
            int i13 = sVar.f29567c;
            int i14 = sVar.f29566b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            sVar = sVar.f29570f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        s sVar2 = this.f29539b;
        int i15 = 0;
        while (i10 < i) {
            Intrinsics.b(sVar2);
            bArr[i15] = sVar2.f29565a;
            i10 += sVar2.f29567c - sVar2.f29566b;
            iArr[i15] = Math.min(i10, i);
            iArr[i15 + i12] = sVar2.f29566b;
            sVar2.f29568d = true;
            i15++;
            sVar2 = sVar2.f29570f;
        }
        return new u(bArr, iArr);
    }

    public final s J(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        s sVar = this.f29539b;
        if (sVar == null) {
            s sVarB = t.b();
            this.f29539b = sVarB;
            sVarB.f29571g = sVarB;
            sVarB.f29570f = sVarB;
            return sVarB;
        }
        s sVar2 = sVar.f29571g;
        Intrinsics.b(sVar2);
        if (sVar2.f29567c + i <= 8192 && sVar2.f29569e) {
            return sVar2;
        }
        s sVarB2 = t.b();
        sVar2.b(sVarB2);
        return sVarB2;
    }

    public final void K(j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.i(this, byteString.a());
    }

    public final void L(int i) {
        s sVarJ = J(1);
        byte[] bArr = sVarJ.f29565a;
        int i10 = sVarJ.f29567c;
        sVarJ.f29567c = i10 + 1;
        bArr[i10] = (byte) i;
        this.f29540c++;
    }

    public final void M(long j10) {
        boolean z5;
        if (j10 == 0) {
            L(48);
            return;
        }
        int i = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                R("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (j10 >= 100000000) {
            i = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i = 2;
        }
        if (z5) {
            i++;
        }
        s sVarJ = J(i);
        byte[] bArr = sVarJ.f29565a;
        int i10 = sVarJ.f29567c + i;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = ol.a.f30749a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z5) {
            bArr[i10 - 1] = 45;
        }
        sVarJ.f29567c += i;
        this.f29540c += (long) i;
    }

    public final void N(long j10) {
        if (j10 == 0) {
            L(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        s sVarJ = J(i);
        byte[] bArr = sVarJ.f29565a;
        int i10 = sVarJ.f29567c;
        for (int i11 = (i10 + i) - 1; i11 >= i10; i11--) {
            bArr[i11] = ol.a.f30749a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        sVarJ.f29567c += i;
        this.f29540c += (long) i;
    }

    public final void O(int i) {
        s sVarJ = J(4);
        byte[] bArr = sVarJ.f29565a;
        int i10 = sVarJ.f29567c;
        bArr[i10] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        sVarJ.f29567c = i10 + 4;
        this.f29540c += 4;
    }

    public final void P(int i) {
        s sVarJ = J(2);
        byte[] bArr = sVarJ.f29565a;
        int i10 = sVarJ.f29567c;
        bArr[i10] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        sVarJ.f29567c = i10 + 2;
        this.f29540c += 2;
    }

    public final void Q(int i, int i10, String string) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(l7.o.i(i, "beginIndex < 0: ").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(a0.u.j(i10, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbM = l7.o.m(i10, "endIndex > string.length: ", " > ");
            sbM.append(string.length());
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        while (i < i10) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                s sVarJ = J(1);
                byte[] bArr = sVarJ.f29565a;
                int i11 = sVarJ.f29567c - i;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i + 1;
                bArr[i + i11] = (byte) cCharAt2;
                while (true) {
                    i = i12;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i12 = i + 1;
                    bArr[i + i11] = (byte) cCharAt;
                }
                int i13 = sVarJ.f29567c;
                int i14 = (i11 + i) - i13;
                sVarJ.f29567c = i13 + i14;
                this.f29540c += (long) i14;
            } else {
                if (cCharAt2 < 2048) {
                    s sVarJ2 = J(2);
                    byte[] bArr2 = sVarJ2.f29565a;
                    int i15 = sVarJ2.f29567c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    sVarJ2.f29567c = i15 + 2;
                    this.f29540c += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    s sVarJ3 = J(3);
                    byte[] bArr3 = sVarJ3.f29565a;
                    int i16 = sVarJ3.f29567c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    sVarJ3.f29567c = i16 + 3;
                    this.f29540c += 3;
                } else {
                    int i17 = i + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        L(63);
                        i = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        s sVarJ4 = J(4);
                        byte[] bArr4 = sVarJ4.f29565a;
                        int i19 = sVarJ4.f29567c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        sVarJ4.f29567c = i19 + 4;
                        this.f29540c += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void R(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Q(0, string.length(), string);
    }

    public final void S(int i) {
        String str;
        if (i < 128) {
            L(i);
            return;
        }
        if (i < 2048) {
            s sVarJ = J(2);
            byte[] bArr = sVarJ.f29565a;
            int i10 = sVarJ.f29567c;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i & 63) | 128);
            sVarJ.f29567c = i10 + 2;
            this.f29540c += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            L(63);
            return;
        }
        if (i < 65536) {
            s sVarJ2 = J(3);
            byte[] bArr2 = sVarJ2.f29565a;
            int i11 = sVarJ2.f29567c;
            bArr2[i11] = (byte) ((i >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i & 63) | 128);
            sVarJ2.f29567c = i11 + 3;
            this.f29540c += 3;
            return;
        }
        if (i <= 1114111) {
            s sVarJ3 = J(4);
            byte[] bArr3 = sVarJ3.f29565a;
            int i12 = sVarJ3.f29567c;
            bArr3[i12] = (byte) ((i >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i & 63) | 128);
            sVarJ3.f29567c = i12 + 4;
            this.f29540c += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = ol.b.f30750a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i13 = 0;
            while (i13 < 8 && cArr2[i13] == '0') {
                i13++;
            }
            Intrinsics.checkNotNullParameter(cArr2, "<this>");
            kotlin.collections.c cVar = kotlin.collections.f.Companion;
            int length = cArr2.length;
            cVar.getClass();
            kotlin.collections.c.a(i13, 8, length);
            str = new String(cArr2, i13, 8 - i13);
        } else {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void a() throws EOFException {
        skip(this.f29540c);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        g gVar = new g();
        if (this.f29540c == 0) {
            return gVar;
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        s sVarC = sVar.c();
        gVar.f29539b = sVarC;
        sVarC.f29571g = sVarC;
        sVarC.f29570f = sVarC;
        for (s sVar2 = sVar.f29570f; sVar2 != sVar; sVar2 = sVar2.f29570f) {
            s sVar3 = sVarC.f29571g;
            Intrinsics.b(sVar3);
            Intrinsics.b(sVar2);
            sVar3.b(sVar2.c());
        }
        gVar.f29540c = this.f29540c;
        return gVar;
    }

    @Override // nl.i
    public final j c(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount: ").toString());
        }
        if (this.f29540c < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new j(k(j10));
        }
        j jVarI = I((int) j10);
        skip(j10);
        return jVarI;
    }

    public final void d(g out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        hl.d.h(this.f29540c, j12, j11);
        if (j11 == 0) {
            return;
        }
        out.f29540c += j11;
        s sVar = this.f29539b;
        while (true) {
            Intrinsics.b(sVar);
            long j13 = sVar.f29567c - sVar.f29566b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            sVar = sVar.f29570f;
        }
        s sVar2 = sVar;
        long j14 = j11;
        while (j14 > 0) {
            Intrinsics.b(sVar2);
            s sVarC = sVar2.c();
            int i = sVarC.f29566b + ((int) j12);
            sVarC.f29566b = i;
            sVarC.f29567c = Math.min(i + ((int) j14), sVarC.f29567c);
            s sVar3 = out.f29539b;
            if (sVar3 == null) {
                sVarC.f29571g = sVarC;
                sVarC.f29570f = sVarC;
                out.f29539b = sVarC;
            } else {
                s sVar4 = sVar3.f29571g;
                Intrinsics.b(sVar4);
                sVar4.b(sVarC);
            }
            j14 -= (long) (sVarC.f29567c - sVarC.f29566b);
            sVar2 = sVar2.f29570f;
            j12 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        long j10 = this.f29540c;
        g gVar = (g) obj;
        if (j10 != gVar.f29540c) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        s sVar2 = gVar.f29539b;
        Intrinsics.b(sVar2);
        int i = sVar.f29566b;
        int i10 = sVar2.f29566b;
        long j11 = 0;
        while (j11 < this.f29540c) {
            long jMin = Math.min(sVar.f29567c - i, sVar2.f29567c - i10);
            long j12 = 0;
            while (j12 < jMin) {
                int i11 = i + 1;
                int i12 = i10 + 1;
                if (sVar.f29565a[i] != sVar2.f29565a[i10]) {
                    return false;
                }
                j12++;
                i = i11;
                i10 = i12;
            }
            if (i == sVar.f29567c) {
                sVar = sVar.f29570f;
                Intrinsics.b(sVar);
                i = sVar.f29566b;
            }
            if (i10 == sVar2.f29567c) {
                sVar2 = sVar2.f29570f;
                Intrinsics.b(sVar2);
                i10 = sVar2.f29566b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // nl.i
    public final int g(p options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iB = ol.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        skip(options.f29557b[iB].a());
        return iB;
    }

    public final boolean h() {
        return this.f29540c == 0;
    }

    public final int hashCode() {
        s sVar = this.f29539b;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i10 = sVar.f29567c;
            for (int i11 = sVar.f29566b; i11 < i10; i11++) {
                i = (i * 31) + sVar.f29565a[i11];
            }
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
        } while (sVar != this.f29539b);
        return i;
    }

    public final byte i(long j10) {
        hl.d.h(this.f29540c, j10, 1L);
        s sVar = this.f29539b;
        if (sVar == null) {
            Intrinsics.b(null);
            throw null;
        }
        long j11 = this.f29540c;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                sVar = sVar.f29571g;
                Intrinsics.b(sVar);
                j11 -= (long) (sVar.f29567c - sVar.f29566b);
            }
            return sVar.f29565a[(int) ((((long) sVar.f29566b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i = sVar.f29567c;
            int i10 = sVar.f29566b;
            long j13 = ((long) (i - i10)) + j12;
            if (j13 > j10) {
                return sVar.f29565a[(int) ((((long) i10) + j10) - j12)];
            }
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
            j12 = j13;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(byte b2, long j10, long j11) {
        s sVar;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f29540c);
            pe.a.s(sb2, " fromIndex=", j10, " toIndex=");
            sb2.append(j11);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j13 = this.f29540c;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (sVar = this.f29539b) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                sVar = sVar.f29571g;
                Intrinsics.b(sVar);
                j13 -= (long) (sVar.f29567c - sVar.f29566b);
            }
            while (j13 < j11) {
                byte[] bArr = sVar.f29565a;
                int iMin = (int) Math.min(sVar.f29567c, (((long) sVar.f29566b) + j11) - j13);
                for (int i = (int) ((((long) sVar.f29566b) + j10) - j13); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - sVar.f29566b)) + j13;
                    }
                }
                j13 += (long) (sVar.f29567c - sVar.f29566b);
                sVar = sVar.f29570f;
                Intrinsics.b(sVar);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (sVar.f29567c - sVar.f29566b)) + j12;
            if (j14 > j10) {
                break;
            }
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
            j12 = j14;
        }
        while (j12 < j11) {
            byte[] bArr2 = sVar.f29565a;
            int iMin2 = (int) Math.min(sVar.f29567c, (((long) sVar.f29566b) + j11) - j12);
            for (int i10 = (int) ((((long) sVar.f29566b) + j10) - j12); i10 < iMin2; i10++) {
                if (bArr2[i10] == b2) {
                    return ((long) (i10 - sVar.f29566b)) + j12;
                }
            }
            j12 += (long) (sVar.f29567c - sVar.f29566b);
            sVar = sVar.f29570f;
            Intrinsics.b(sVar);
            j10 = j12;
        }
        return -1L;
    }

    public final byte[] k(long j10) throws EOFException {
        int iMin;
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount: ").toString());
        }
        if (this.f29540c < j10) {
            throw new EOFException();
        }
        int i = (int) j10;
        byte[] sink = new byte[i];
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < i) {
            int i11 = i - i10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            hl.d.h(i, i10, i11);
            s sVar = this.f29539b;
            if (sVar == null) {
                iMin = -1;
            } else {
                iMin = Math.min(i11, sVar.f29567c - sVar.f29566b);
                byte[] bArr = sVar.f29565a;
                int i12 = sVar.f29566b;
                kotlin.collections.o.d(i10, i12, i12 + iMin, bArr, sink);
                int i13 = sVar.f29566b + iMin;
                sVar.f29566b = i13;
                this.f29540c -= (long) iMin;
                if (i13 == sVar.f29567c) {
                    this.f29539b = sVar.a();
                    t.a(sVar);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i10 += iMin;
        }
        return sink;
    }

    public final String l(long j10, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(pe.a.d(j10, "byteCount: ").toString());
        }
        if (this.f29540c < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        int i = sVar.f29566b;
        if (((long) i) + j10 > sVar.f29567c) {
            return new String(k(j10), charset);
        }
        int i10 = (int) j10;
        String str = new String(sVar.f29565a, i, i10, charset);
        int i11 = sVar.f29566b + i10;
        sVar.f29566b = i11;
        this.f29540c -= j10;
        if (i11 == sVar.f29567c) {
            this.f29539b = sVar.a();
            t.a(sVar);
        }
        return str;
    }

    public final String m() {
        return l(this.f29540c, Charsets.UTF_8);
    }

    @Override // nl.i
    public final byte[] n() {
        return k(this.f29540c);
    }

    @Override // nl.h
    public final long o(x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jD = source.D(this, 8192L);
            if (jD == -1) {
                return j10;
            }
            j10 += jD;
        }
    }

    @Override // nl.i
    public final String q(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(pe.a.d(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long j12 = j((byte) 10, 0L, j11);
        if (j12 != -1) {
            return ol.a.a(this, j12);
        }
        if (j11 < this.f29540c && i(j11 - 1) == 13 && i(j11) == 10) {
            return ol.a.a(this, j11);
        }
        g gVar = new g();
        d(gVar, 0L, Math.min(32, this.f29540c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f29540c, j10) + " content=" + gVar.c(gVar.f29540c).b() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        s sVar = this.f29539b;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), sVar.f29567c - sVar.f29566b);
        sink.put(sVar.f29565a, sVar.f29566b, iMin);
        int i = sVar.f29566b + iMin;
        sVar.f29566b = i;
        this.f29540c -= (long) iMin;
        if (i == sVar.f29567c) {
            this.f29539b = sVar.a();
            t.a(sVar);
        }
        return iMin;
    }

    @Override // nl.i
    public final byte readByte() throws EOFException {
        if (this.f29540c == 0) {
            throw new EOFException();
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        int i = sVar.f29566b;
        int i10 = sVar.f29567c;
        int i11 = i + 1;
        byte b2 = sVar.f29565a[i];
        this.f29540c--;
        if (i11 != i10) {
            sVar.f29566b = i11;
            return b2;
        }
        this.f29539b = sVar.a();
        t.a(sVar);
        return b2;
    }

    @Override // nl.i
    public final int readInt() throws EOFException {
        if (this.f29540c < 4) {
            throw new EOFException();
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        int i = sVar.f29566b;
        int i10 = sVar.f29567c;
        if (i10 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = sVar.f29565a;
        int i11 = i + 3;
        int i12 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i13 = i + 4;
        int i14 = (bArr[i11] & 255) | i12;
        this.f29540c -= 4;
        if (i13 != i10) {
            sVar.f29566b = i13;
            return i14;
        }
        this.f29539b = sVar.a();
        t.a(sVar);
        return i14;
    }

    @Override // nl.i
    public final short readShort() throws EOFException {
        if (this.f29540c < 2) {
            throw new EOFException();
        }
        s sVar = this.f29539b;
        Intrinsics.b(sVar);
        int i = sVar.f29566b;
        int i10 = sVar.f29567c;
        if (i10 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = sVar.f29565a;
        int i11 = i + 1;
        int i12 = (bArr[i] & 255) << 8;
        int i13 = i + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f29540c -= 2;
        if (i13 == i10) {
            this.f29539b = sVar.a();
            t.a(sVar);
        } else {
            sVar.f29566b = i13;
        }
        return (short) i14;
    }

    public final int s() {
        int i;
        int i10;
        int i11;
        if (this.f29540c == 0) {
            throw new EOFException();
        }
        byte bI = i(0L);
        if ((bI & 128) == 0) {
            i = bI & 127;
            i11 = 0;
            i10 = 1;
        } else if ((bI & 224) == 192) {
            i = bI & 31;
            i10 = 2;
            i11 = 128;
        } else if ((bI & 240) == 224) {
            i = bI & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((bI & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bI & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j10 = i10;
        if (this.f29540c < j10) {
            StringBuilder sbM = l7.o.m(i10, "size < ", ": ");
            sbM.append(this.f29540c);
            sbM.append(" (to read code point prefixed 0x");
            char[] cArr = ol.b.f30750a;
            char[] cArr2 = {cArr[(bI >> 4) & 15], cArr[bI & 15]};
            Intrinsics.checkNotNullParameter(cArr2, "<this>");
            sbM.append(new String(cArr2));
            sbM.append(')');
            throw new EOFException(sbM.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j11 = i12;
            byte bI2 = i(j11);
            if ((bI2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i = (i << 6) | (bI2 & 63);
        }
        skip(j10);
        if (i <= 1114111 && ((55296 > i || i >= 57344) && i >= i11)) {
            return i;
        }
        return 65533;
    }

    @Override // nl.i
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            s sVar = this.f29539b;
            if (sVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, sVar.f29567c - sVar.f29566b);
            long j11 = iMin;
            this.f29540c -= j11;
            j10 -= j11;
            int i = sVar.f29566b + iMin;
            sVar.f29566b = i;
            if (i == sVar.f29567c) {
                this.f29539b = sVar.a();
                t.a(sVar);
            }
        }
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h t(String str) {
        R(str);
        return this;
    }

    @Override // nl.x
    public final z timeout() {
        return z.f29578d;
    }

    public final String toString() {
        long j10 = this.f29540c;
        if (j10 <= 2147483647L) {
            return I((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f29540c).toString());
    }

    @Override // nl.i
    public final String u(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return l(this.f29540c, charset);
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h v(j jVar) {
        K(jVar);
        return this;
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h w(long j10) {
        N(j10);
        return this;
    }

    @Override // nl.h
    public final h write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        m623write(source, 0, source.length);
        return this;
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h writeByte(int i) {
        L(i);
        return this;
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h writeInt(int i) {
        O(i);
        return this;
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h writeShort(int i) {
        P(i);
        return this;
    }

    @Override // nl.i
    public final boolean z(long j10) {
        return this.f29540c >= Long.MAX_VALUE;
    }

    @Override // nl.h
    public final /* bridge */ /* synthetic */ h write(byte[] bArr, int i, int i10) {
        m623write(bArr, i, i10);
        return this;
    }

    @Override // nl.v
    public final void write(g source, long j10) {
        s sVarB;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            hl.d.h(source.f29540c, 0L, j10);
            while (j10 > 0) {
                s sVar = source.f29539b;
                Intrinsics.b(sVar);
                int i = sVar.f29567c;
                s sVar2 = source.f29539b;
                Intrinsics.b(sVar2);
                long j11 = i - sVar2.f29566b;
                int i10 = 0;
                if (j10 < j11) {
                    s sVar3 = this.f29539b;
                    s sVar4 = sVar3 != null ? sVar3.f29571g : null;
                    if (sVar4 != null && sVar4.f29569e) {
                        if ((((long) sVar4.f29567c) + j10) - ((long) (sVar4.f29568d ? 0 : sVar4.f29566b)) <= 8192) {
                            s sVar5 = source.f29539b;
                            Intrinsics.b(sVar5);
                            sVar5.d(sVar4, (int) j10);
                            source.f29540c -= j10;
                            this.f29540c += j10;
                            return;
                        }
                    }
                    s sVar6 = source.f29539b;
                    Intrinsics.b(sVar6);
                    int i11 = (int) j10;
                    if (i11 > 0 && i11 <= sVar6.f29567c - sVar6.f29566b) {
                        if (i11 >= 1024) {
                            sVarB = sVar6.c();
                        } else {
                            sVarB = t.b();
                            byte[] bArr = sVar6.f29565a;
                            byte[] bArr2 = sVarB.f29565a;
                            int i12 = sVar6.f29566b;
                            kotlin.collections.o.d(0, i12, i12 + i11, bArr, bArr2);
                        }
                        sVarB.f29567c = sVarB.f29566b + i11;
                        sVar6.f29566b += i11;
                        s sVar7 = sVar6.f29571g;
                        Intrinsics.b(sVar7);
                        sVar7.b(sVarB);
                        source.f29539b = sVarB;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                s sVar8 = source.f29539b;
                Intrinsics.b(sVar8);
                long j12 = sVar8.f29567c - sVar8.f29566b;
                source.f29539b = sVar8.a();
                s sVar9 = this.f29539b;
                if (sVar9 == null) {
                    this.f29539b = sVar8;
                    sVar8.f29571g = sVar8;
                    sVar8.f29570f = sVar8;
                } else {
                    s sVar10 = sVar9.f29571g;
                    Intrinsics.b(sVar10);
                    sVar10.b(sVar8);
                    s sVar11 = sVar8.f29571g;
                    if (sVar11 != sVar8) {
                        Intrinsics.b(sVar11);
                        if (sVar11.f29569e) {
                            int i13 = sVar8.f29567c - sVar8.f29566b;
                            s sVar12 = sVar8.f29571g;
                            Intrinsics.b(sVar12);
                            int i14 = 8192 - sVar12.f29567c;
                            s sVar13 = sVar8.f29571g;
                            Intrinsics.b(sVar13);
                            if (!sVar13.f29568d) {
                                s sVar14 = sVar8.f29571g;
                                Intrinsics.b(sVar14);
                                i10 = sVar14.f29566b;
                            }
                            if (i13 <= i14 + i10) {
                                s sVar15 = sVar8.f29571g;
                                Intrinsics.b(sVar15);
                                sVar8.d(sVar15, i13);
                                sVar8.a();
                                t.a(sVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f29540c -= j12;
                this.f29540c += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, nl.v
    public final void close() {
    }

    @Override // nl.i
    public final g e() {
        return this;
    }

    @Override // nl.h, nl.v, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            s sVarJ = J(1);
            int iMin = Math.min(i, 8192 - sVarJ.f29567c);
            source.get(sVarJ.f29565a, sVarJ.f29567c, iMin);
            i -= iMin;
            sVarJ.f29567c += iMin;
        }
        this.f29540c += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m623write(byte[] source, int i, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i10;
        hl.d.h(source.length, i, j10);
        int i11 = i10 + i;
        while (i < i11) {
            s sVarJ = J(1);
            int iMin = Math.min(i11 - i, 8192 - sVarJ.f29567c);
            int i12 = i + iMin;
            kotlin.collections.o.d(sVarJ.f29567c, i, i12, source, sVarJ.f29565a);
            sVarJ.f29567c += iMin;
            i = i12;
        }
        this.f29540c += j10;
    }
}
