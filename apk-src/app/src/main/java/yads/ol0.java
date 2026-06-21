package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ol0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f41616h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f41617j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f41618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f41619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f41620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hl0 f41621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gl0 f41622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nl0 f41623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f41624g;

    public ol0(int i10, int i11) {
        Paint paint = new Paint();
        this.f41618a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f41619b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f41620c = new Canvas();
        this.f41621d = new hl0(719, 575, 0, 719, 0, 575);
        this.f41622e = new gl0(0, a(), b(), c());
        this.f41623f = new nl0(i10, i11);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = a(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0225 A[LOOP:3: B:96:0x0184->B:132:0x0225, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ol0.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static gl0 a(kb2 kb2Var, int i10) {
        int iA;
        int i11;
        int iA2;
        int iA3;
        int iA4;
        int i12 = 8;
        int iA5 = kb2Var.a(8);
        kb2Var.c(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iA6 = kb2Var.a(i12);
            int iA7 = kb2Var.a(i12);
            int[] iArr = (iA7 & 128) != 0 ? iArrA : (iA7 & 64) != 0 ? iArrB : iArrC;
            if ((iA7 & 1) != 0) {
                iA3 = kb2Var.a(i12);
                iA4 = kb2Var.a(i12);
                iA = kb2Var.a(i12);
                iA2 = kb2Var.a(i12);
                i11 = i14 - 6;
            } else {
                int iA8 = kb2Var.a(6) << i13;
                int iA9 = kb2Var.a(4) << 4;
                iA = kb2Var.a(4) << 4;
                i11 = i14 - 4;
                iA2 = kb2Var.a(i13) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            byte b2 = (byte) (255 - (iA2 & KotlinVersion.MAX_COMPONENT_VALUE));
            double d10 = iA3;
            int i15 = iA5;
            double d11 = iA4 - 128;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iA - 128;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = lb3.f40466a;
            iArr[iA6] = a(b2, Math.max(0, Math.min(i16, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i17, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i18, KotlinVersion.MAX_COMPONENT_VALUE)));
            i14 = i11;
            iA5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new gl0(iA5, iArrA, iArrB, iArrC);
    }

    public static il0 a(kb2 kb2Var) {
        byte[] bArr;
        int iA = kb2Var.a(16);
        kb2Var.c(4);
        int iA2 = kb2Var.a(2);
        boolean zE = kb2Var.e();
        kb2Var.c(1);
        byte[] bArr2 = lb3.f40471f;
        if (iA2 == 1) {
            kb2Var.c(kb2Var.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = kb2Var.a(16);
                int iA4 = kb2Var.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    if (kb2Var.f40146c == 0) {
                        System.arraycopy(kb2Var.f40144a, kb2Var.f40145b, bArr2, 0, iA3);
                        kb2Var.f40145b += iA3;
                        kb2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    if (kb2Var.f40146c == 0) {
                        System.arraycopy(kb2Var.f40144a, kb2Var.f40145b, bArr, 0, iA4);
                        kb2Var.f40145b += iA4;
                        kb2Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return new il0(iA, zE, bArr2, bArr);
        }
        bArr = bArr2;
        return new il0(iA, zE, bArr2, bArr);
    }
}
