package e5;

import ad.b1;
import ad.g0;
import ad.j0;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.j4;
import j3.b0;
import j3.c0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f16250g = new g(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f16251f;

    public i(h hVar) {
        super(18);
        this.f16251f = hVar;
    }

    public static a a0(m3.p pVar, int i, int i10) {
        int iS0;
        String strConcat;
        int iZ = pVar.z();
        Charset charsetP0 = p0(iZ);
        int i11 = i - 1;
        byte[] bArr = new byte[i11];
        pVar.k(bArr, 0, i11);
        if (i10 == 2) {
            strConcat = "image/" + j4.x(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iS0 = 2;
        } else {
            iS0 = s0(0, bArr);
            String strX = j4.x(new String(bArr, 0, iS0, StandardCharsets.ISO_8859_1));
            strConcat = strX.indexOf(47) == -1 ? "image/".concat(strX) : strX;
        }
        int i12 = bArr[iS0 + 1] & 255;
        int i13 = iS0 + 2;
        int iR0 = r0(bArr, i13, iZ);
        String str = new String(bArr, i13, iR0 - i13, charsetP0);
        int iO0 = o0(iZ) + iR0;
        return new a(strConcat, str, i12, i11 <= iO0 ? z.f28609b : Arrays.copyOfRange(bArr, iO0, i11));
    }

    public static c b0(m3.p pVar, int i, int i10, boolean z5, int i11, h hVar) throws Throwable {
        int i12 = pVar.f28590b;
        int iS0 = s0(i12, pVar.f28589a);
        String str = new String(pVar.f28589a, i12, iS0 - i12, StandardCharsets.ISO_8859_1);
        pVar.M(iS0 + 1);
        int iM = pVar.m();
        int iM2 = pVar.m();
        long jB = pVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = pVar.B();
        long j10 = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i;
        while (pVar.f28590b < i13) {
            j jVarE0 = e0(i10, pVar, z5, i11, hVar);
            if (jVarE0 != null) {
                arrayList.add(jVarE0);
            }
        }
        return new c(str, iM, iM2, jB, j10, (j[]) arrayList.toArray(new j[0]));
    }

    public static d c0(m3.p pVar, int i, int i10, boolean z5, int i11, h hVar) throws Throwable {
        int i12 = pVar.f28590b;
        int iS0 = s0(i12, pVar.f28589a);
        String str = new String(pVar.f28589a, i12, iS0 - i12, StandardCharsets.ISO_8859_1);
        pVar.M(iS0 + 1);
        int iZ = pVar.z();
        boolean z10 = (iZ & 2) != 0;
        boolean z11 = (iZ & 1) != 0;
        int iZ2 = pVar.z();
        String[] strArr = new String[iZ2];
        for (int i13 = 0; i13 < iZ2; i13++) {
            int i14 = pVar.f28590b;
            int iS02 = s0(i14, pVar.f28589a);
            strArr[i13] = new String(pVar.f28589a, i14, iS02 - i14, StandardCharsets.ISO_8859_1);
            pVar.M(iS02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i;
        while (pVar.f28590b < i15) {
            j jVarE0 = e0(i10, pVar, z5, i11, hVar);
            if (jVarE0 != null) {
                arrayList.add(jVarE0);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e d0(int i, m3.p pVar) {
        if (i < 4) {
            return null;
        }
        int iZ = pVar.z();
        Charset charsetP0 = p0(iZ);
        byte[] bArr = new byte[3];
        pVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i - 4;
        byte[] bArr2 = new byte[i10];
        pVar.k(bArr2, 0, i10);
        int iR0 = r0(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iR0, charsetP0);
        int iO0 = o0(iZ) + iR0;
        return new e(str, str2, i0(bArr2, iO0, r0(bArr2, iO0, iZ), charsetP0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [e5.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [m3.p] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [m3.p] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [m3.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e5.j e0(int r19, m3.p r20, boolean r21, int r22, e5.h r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.i.e0(int, m3.p, boolean, int, e5.h):e5.j");
    }

    public static f f0(int i, m3.p pVar) {
        int iZ = pVar.z();
        Charset charsetP0 = p0(iZ);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        pVar.k(bArr, 0, i10);
        int iS0 = s0(0, bArr);
        String strN = c0.n(new String(bArr, 0, iS0, StandardCharsets.ISO_8859_1));
        int i11 = iS0 + 1;
        int iR0 = r0(bArr, i11, iZ);
        String strI0 = i0(bArr, i11, iR0, charsetP0);
        int iO0 = o0(iZ) + iR0;
        int iR02 = r0(bArr, iO0, iZ);
        String strI02 = i0(bArr, iO0, iR02, charsetP0);
        int iO02 = o0(iZ) + iR02;
        return new f(strN, strI0, strI02, i10 <= iO02 ? z.f28609b : Arrays.copyOfRange(bArr, iO02, i10));
    }

    public static m g0(int i, m3.p pVar) {
        int iG = pVar.G();
        int iC = pVar.C();
        int iC2 = pVar.C();
        int iZ = pVar.z();
        int iZ2 = pVar.z();
        y2 y2Var = new y2();
        y2Var.p(pVar);
        int i10 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = y2Var.i(iZ);
            int i13 = y2Var.i(iZ2);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new m(iG, iC, iC2, iArr, iArr2);
    }

    public static n h0(int i, m3.p pVar) {
        byte[] bArr = new byte[i];
        pVar.k(bArr, 0, i);
        int iS0 = s0(0, bArr);
        String str = new String(bArr, 0, iS0, StandardCharsets.ISO_8859_1);
        int i10 = iS0 + 1;
        return new n(str, i <= i10 ? z.f28609b : Arrays.copyOfRange(bArr, i10, i));
    }

    public static String i0(byte[] bArr, int i, int i10, Charset charset) {
        return (i10 <= i || i10 > bArr.length) ? "" : new String(bArr, i, i10 - i, charset);
    }

    public static o j0(int i, String str, m3.p pVar) {
        if (i < 1) {
            return null;
        }
        int iZ = pVar.z();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        pVar.k(bArr, 0, i10);
        return new o(str, null, k0(bArr, iZ, 0));
    }

    public static b1 k0(byte[] bArr, int i, int i10) {
        if (i10 >= bArr.length) {
            return j0.w("");
        }
        g0 g0VarQ = j0.q();
        int iR0 = r0(bArr, i10, i);
        while (i10 < iR0) {
            g0VarQ.b(new String(bArr, i10, iR0 - i10, p0(i)));
            i10 = o0(i) + iR0;
            iR0 = r0(bArr, i10, i);
        }
        b1 b1VarG = g0VarQ.g();
        return b1VarG.isEmpty() ? j0.w("") : b1VarG;
    }

    public static o l0(int i, m3.p pVar) {
        if (i < 1) {
            return null;
        }
        int iZ = pVar.z();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        pVar.k(bArr, 0, i10);
        int iR0 = r0(bArr, 0, iZ);
        return new o("TXXX", new String(bArr, 0, iR0, p0(iZ)), k0(bArr, iZ, o0(iZ) + iR0));
    }

    public static p m0(int i, String str, m3.p pVar) {
        byte[] bArr = new byte[i];
        pVar.k(bArr, 0, i);
        return new p(str, null, new String(bArr, 0, s0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p n0(int i, m3.p pVar) {
        if (i < 1) {
            return null;
        }
        int iZ = pVar.z();
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        pVar.k(bArr, 0, i10);
        int iR0 = r0(bArr, 0, iZ);
        String str = new String(bArr, 0, iR0, p0(iZ));
        int iO0 = o0(iZ) + iR0;
        return new p("WXXX", str, i0(bArr, iO0, s0(iO0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int o0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset p0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String q0(int i, int i10, int i11, int i12, int i13) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int r0(byte[] bArr, int i, int i10) {
        int iS0 = s0(i, bArr);
        if (i10 == 0 || i10 == 3) {
            return iS0;
        }
        while (iS0 < bArr.length - 1) {
            if ((iS0 - i) % 2 == 0 && bArr[iS0 + 1] == 0) {
                return iS0;
            }
            iS0 = s0(iS0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int s0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int t0(int i, m3.p pVar) {
        byte[] bArr = pVar.f28589a;
        int i10 = pVar.f28590b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i) {
                return i;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i - (i11 - i10)) - 2);
                i--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean u0(m3.p r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f28590b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.m()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.B()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.G()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.C()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.C()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.M(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.M(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.M(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.M(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.N(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.M(r2)
            return r4
        Lb0:
            r1.M(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.i.u0(m3.p, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j3.b0 Z(int r13, byte[] r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.i.Z(int, byte[]):j3.b0");
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final b0 m(z4.a aVar, ByteBuffer byteBuffer) {
        return Z(byteBuffer.limit(), byteBuffer.array());
    }
}
