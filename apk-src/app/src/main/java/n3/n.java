package n3;

import com.google.android.gms.internal.ads.j0;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.h5;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f29087a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f29088b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29089c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f29090d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i10, boolean[] zArr) {
        int i11 = i10 - i;
        h5.r(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b2 = bArr[i13];
            if ((b2 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static String c(j3.o oVar) {
        String str = oVar.f26335n;
        String str2 = oVar.f26332k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return oVar.f26335n;
    }

    public static boolean d(byte[] bArr, int i, j3.o oVar) {
        int i10;
        if (Objects.equals(oVar.f26335n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i10 = b2 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(oVar.f26335n, "video/hevc")) {
            j0 j0VarF = f(new y2(4, i + 4, 3, bArr));
            int i11 = j0VarF.f6666a;
            if (i11 == 35) {
                return false;
            }
            if (i11 <= 14 && i11 % 2 == 0 && j0VarF.f6668c == oVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(j3.o oVar) {
        String strC = c(oVar);
        if (Objects.equals(strC, "video/avc")) {
            return 1;
        }
        return Objects.equals(strC, "video/hevc") ? 2 : 0;
    }

    public static j0 f(y2 y2Var) {
        y2Var.s();
        return new j0(y2Var.i(6), y2Var.i(6), y2Var.i(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n3.h g(com.google.android.gms.internal.ads.y2 r19, boolean r20, int r21, n3.h r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f29051a
            boolean r8 = r2.f29052b
            int r9 = r2.f29053c
            int r11 = r2.f29054d
            int[] r4 = r2.f29055e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.i(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.t(r6)
        L7b:
            n3.h r12 = new n3.h
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.g(com.google.android.gms.internal.ads.y2, boolean, int, n3.h):n3.h");
    }

    public static l7.n h(byte[] bArr, int i, int i10) {
        byte b2;
        int i11 = i + 2;
        do {
            i10--;
            b2 = bArr[i10];
            if (b2 != 0) {
                break;
            }
        } while (i10 > i11);
        if (b2 == 0 || i10 <= i11) {
            return null;
        }
        y2 y2Var = new y2(i11, i10 + 1, 3, bArr);
        while (y2Var.d(16)) {
            int i12 = y2Var.i(8);
            int i13 = 0;
            while (i12 == 255) {
                i13 += KotlinVersion.MAX_COMPONENT_VALUE;
                i12 = y2Var.i(8);
            }
            int i14 = i13 + i12;
            int i15 = y2Var.i(8);
            int i16 = 0;
            while (i15 == 255) {
                i16 += KotlinVersion.MAX_COMPONENT_VALUE;
                i15 = y2Var.i(8);
            }
            int i17 = i16 + i15;
            if (i17 == 0 || !y2Var.d(i17)) {
                return null;
            }
            if (i14 == 176) {
                int iM = y2Var.m();
                boolean zH = y2Var.h();
                int iM2 = zH ? y2Var.m() : 0;
                int iM3 = y2Var.m();
                int iM4 = -1;
                for (int i18 = 0; i18 <= iM3; i18++) {
                    iM4 = y2Var.m();
                    y2Var.m();
                    int i19 = y2Var.i(6);
                    if (i19 == 63) {
                        return null;
                    }
                    y2Var.i(i19 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i19 + iM) - 31));
                    if (zH) {
                        int i20 = y2Var.i(6);
                        if (i20 == 63) {
                            return null;
                        }
                        y2Var.i(i20 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i20 + iM2) - 31));
                    }
                    if (y2Var.h()) {
                        y2Var.t(10);
                    }
                }
                return new l7.n(iM4, 10);
            }
            y2Var.t(i17 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.xz0 i(byte[] r32, int r33, int r34, s7.g r35) {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.i(byte[], int, int, s7.g):com.google.android.gms.internal.ads.xz0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s7.g j(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.j(byte[], int, int):s7.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n3.m k(byte[] r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.n.k(byte[], int, int):n3.m");
    }

    public static void l(y2 y2Var) {
        int iM = y2Var.m() + 1;
        y2Var.t(8);
        for (int i = 0; i < iM; i++) {
            y2Var.m();
            y2Var.m();
            y2Var.s();
        }
        y2Var.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i10 = 0; i10 < 8; i10++) {
                        byte b10 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b10 & 127) << (i10 * 7);
                        if ((b10 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new p(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static int n(int i, byte[] bArr) {
        int i10;
        synchronized (f29089c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    if (i11 >= i - 2) {
                        i11 = i;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i11 < i) {
                    int[] iArr = f29090d;
                    if (iArr.length <= i12) {
                        f29090d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f29090d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f29090d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
