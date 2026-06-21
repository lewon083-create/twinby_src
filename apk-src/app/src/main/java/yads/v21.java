package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v21 extends gz2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t21 f43856b = new zl.g0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t21 f43857a;

    public v21(t21 t21Var) {
        this.f43857a = t21Var;
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i, int i10, int i11, int i12, int i13) {
        return false;
    }

    public static mt1 c(int i, lb2 lb2Var) {
        int iR = lb2Var.r();
        int iO = lb2Var.o();
        int iO2 = lb2Var.o();
        int iM = lb2Var.m();
        int iM2 = lb2Var.m();
        kb2 kb2Var = new kb2();
        kb2Var.a(lb2Var.f40465c, lb2Var.f40463a);
        kb2Var.b(lb2Var.f40464b * 8);
        int i10 = ((i - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iA = kb2Var.a(iM);
            int iA2 = kb2Var.a(iM2);
            iArr[i11] = iA;
            iArr2[i11] = iA2;
        }
        return new mt1(iR, iO, iO2, iArr, iArr2);
    }

    public static xi2 d(int i, lb2 lb2Var) {
        byte[] bArr = new byte[i];
        lb2Var.a(bArr, 0, i);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i10 = iB + 1;
        return new xi2(str, i <= i10 ? lb3.f40471f : Arrays.copyOfRange(bArr, i10, i));
    }

    public static b63 e(int i, lb2 lb2Var) {
        if (i < 1) {
            return null;
        }
        int iM = lb2Var.m();
        String strB = b(iM);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        lb2Var.a(bArr, 0, i10);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new b63("TXXX", str, a(iA2, a(bArr, iA2, iM), strB, bArr));
    }

    public static xa3 f(int i, lb2 lb2Var) {
        if (i < 1) {
            return null;
        }
        int iM = lb2Var.m();
        String strB = b(iM);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        lb2Var.a(bArr, 0, i10);
        int iA = a(bArr, 0, iM);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new xa3("WXXX", str, a(iA2, b(iA2, bArr), "ISO-8859-1", bArr));
    }

    public static int g(int i, lb2 lb2Var) {
        byte[] bArr = lb2Var.f40463a;
        int i10 = lb2Var.f40464b;
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

    public static wt b(lb2 lb2Var, int i, int i10, boolean z5, int i11, t21 t21Var) throws Throwable {
        int i12 = lb2Var.f40464b;
        int iB = b(i12, lb2Var.f40463a);
        String str = new String(lb2Var.f40463a, i12, iB - i12, "ISO-8859-1");
        lb2Var.e(iB + 1);
        int iM = lb2Var.m();
        boolean z10 = (iM & 2) != 0;
        boolean z11 = (iM & 1) != 0;
        int iM2 = lb2Var.m();
        String[] strArr = new String[iM2];
        for (int i13 = 0; i13 < iM2; i13++) {
            int i14 = lb2Var.f40464b;
            int iB2 = b(i14, lb2Var.f40463a);
            strArr[i13] = new String(lb2Var.f40463a, i14, iB2 - i14, "ISO-8859-1");
            lb2Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i;
        while (lb2Var.f40464b < i15) {
            w21 w21VarA = a(i10, lb2Var, z5, i11, t21Var);
            if (w21VarA != null) {
                arrayList.add(w21VarA);
            }
        }
        return new wt(str, z10, z11, strArr, (w21[]) arrayList.toArray(new w21[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.vs1 a(int r14, byte[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.v21.a(int, byte[]):yads.vs1");
    }

    public static cz0 b(int i, lb2 lb2Var) {
        byte[] bArrCopyOfRange;
        int iM = lb2Var.m();
        String strB = b(iM);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        lb2Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        int iA = a(bArr, i11, iM);
        String strA = a(i11, iA, strB, bArr);
        int iA2 = a(iM) + iA;
        int iA3 = a(bArr, iA2, iM);
        String strA2 = a(iA2, iA3, strB, bArr);
        int iA4 = a(iM) + iA3;
        if (i10 <= iA4) {
            bArrCopyOfRange = lb3.f40471f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA4, i10);
        }
        return new cz0(str, strA, strA2, bArrCopyOfRange);
    }

    @Override // yads.gz2
    public final vs1 a(ys1 ys1Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    public static ag a(int i, int i10, lb2 lb2Var) {
        int iB;
        String strA;
        byte[] bArrCopyOfRange;
        int iM = lb2Var.m();
        String strB = b(iM);
        int i11 = i - 1;
        byte[] bArr = new byte[i11];
        lb2Var.a(bArr, 0, i11);
        if (i10 == 2) {
            String str = "image/" + ki.a(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strA = str;
            iB = 2;
        } else {
            iB = b(0, bArr);
            strA = ki.a(new String(bArr, 0, iB, "ISO-8859-1"));
            if (strA.indexOf(47) == -1) {
                strA = "image/".concat(strA);
            }
        }
        int i12 = bArr[iB + 1] & 255;
        int i13 = iB + 2;
        int iA = a(bArr, i13, iM);
        String str2 = new String(bArr, i13, iA - i13, strB);
        int iA2 = a(iM) + iA;
        if (i11 <= iA2) {
            bArrCopyOfRange = lb3.f40471f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA2, i11);
        }
        return new ag(strA, str2, i12, bArrCopyOfRange);
    }

    public static xa3 b(int i, lb2 lb2Var, String str) {
        byte[] bArr = new byte[i];
        lb2Var.a(bArr, 0, i);
        return new xa3(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static String b(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }

    public static int b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static ut a(lb2 lb2Var, int i, int i10, boolean z5, int i11, t21 t21Var) throws Throwable {
        int i12 = lb2Var.f40464b;
        int iB = b(i12, lb2Var.f40463a);
        String str = new String(lb2Var.f40463a, i12, iB - i12, "ISO-8859-1");
        lb2Var.e(iB + 1);
        int iB2 = lb2Var.b();
        int iB3 = lb2Var.b();
        long jN = lb2Var.n();
        if (jN == 4294967295L) {
            jN = -1;
        }
        long jN2 = lb2Var.n();
        long j10 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i;
        while (lb2Var.f40464b < i13) {
            w21 w21VarA = a(i10, lb2Var, z5, i11, t21Var);
            if (w21VarA != null) {
                arrayList.add(w21VarA);
            }
        }
        return new ut(str, iB2, iB3, jN, j10, (w21[]) arrayList.toArray(new w21[0]));
    }

    public static px a(int i, lb2 lb2Var) {
        if (i < 4) {
            return null;
        }
        int iM = lb2Var.m();
        String strB = b(iM);
        byte[] bArr = new byte[3];
        lb2Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i - 4;
        byte[] bArr2 = new byte[i10];
        lb2Var.a(bArr2, 0, i10);
        int iA = a(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iM) + iA;
        return new px(str, str2, a(iA2, a(bArr2, iA2, iM), strB, bArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0225 A[Catch: all -> 0x020e, UnsupportedEncodingException -> 0x0256, TryCatch #2 {UnsupportedEncodingException -> 0x0256, blocks: (B:175:0x0237, B:162:0x0209, B:172:0x0220, B:173:0x0225), top: B:188:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237 A[Catch: all -> 0x020e, UnsupportedEncodingException -> 0x0256, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0256, blocks: (B:175:0x0237, B:162:0x0209, B:172:0x0220, B:173:0x0225), top: B:188:0x011c }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [yads.w21] */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [yads.lb2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [yads.lb2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [yads.lb2] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.w21 a(int r19, yads.lb2 r20, boolean r21, int r22, yads.t21 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.v21.a(int, yads.lb2, boolean, int, yads.t21):yads.w21");
    }

    public static String a(int i, int i10, String str, byte[] bArr) {
        if (i10 > i && i10 <= bArr.length) {
            return new String(bArr, i, i10 - i, str);
        }
        return "";
    }

    public static b63 a(int i, lb2 lb2Var, String str) {
        if (i < 1) {
            return null;
        }
        int iM = lb2Var.m();
        String strB = b(iM);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        lb2Var.a(bArr, 0, i10);
        return new b63(str, null, new String(bArr, 0, a(bArr, 0, iM), strB));
    }

    public static String a(int i, int i10, int i11, int i12, int i13) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int a(byte[] bArr, int i, int i10) {
        int iB = b(i, bArr);
        if (i10 == 0 || i10 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[PHI: r3
      0x0089: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:41:0x0086, B:33:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(yads.lb2 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f40464b
        L6:
            int r3 = r1.f40465c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f40464b     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Laf
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L24
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L21
            long r8 = r1.n()     // Catch: java.lang.Throwable -> L21
            int r10 = r1.r()     // Catch: java.lang.Throwable -> L21
            goto L2e
        L21:
            r0 = move-exception
            goto Lb3
        L24:
            int r7 = r1.o()     // Catch: java.lang.Throwable -> L21
            int r8 = r1.o()     // Catch: java.lang.Throwable -> L21
            long r8 = (long) r8
            r10 = r6
        L2e:
            r11 = 0
            if (r7 != 0) goto L3c
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3c
            if (r10 != 0) goto L3c
            r1.e(r2)
            return r4
        L3c:
            r7 = 4
            if (r0 != r7) goto L6d
            if (r21 != 0) goto L6d
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4d
            r1.e(r2)
            return r6
        L4d:
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
        L6d:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L75
            r3 = r4
            goto L76
        L75:
            r3 = r6
        L76:
            r7 = r10 & 1
            if (r7 == 0) goto L89
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9a
            r1.e(r2)
            return r6
        L9a:
            int r3 = r1.f40465c     // Catch: java.lang.Throwable -> L21
            int r4 = r1.f40464b     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r4
            long r10 = (long) r3
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.e(r2)
            return r6
        La8:
            int r3 = (int) r8
            int r4 = r4 + r3
            r1.e(r4)     // Catch: java.lang.Throwable -> L21
            goto L6
        Laf:
            r1.e(r2)
            return r4
        Lb3:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.v21.a(yads.lb2, int, int, boolean):boolean");
    }
}
