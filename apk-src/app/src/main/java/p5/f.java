package p5;

import ad.b1;
import ad.h0;
import ad.j0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.e7;
import com.google.android.gms.internal.ads.j7;
import com.google.android.gms.internal.ads.y2;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import m3.g;
import m3.p;
import m3.z;
import n5.l;
import n5.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {
    public static final byte[] i = {0, 7, 8, 15};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f31237j = {0, 119, -120, -1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f31238k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f31239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f31240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Canvas f31241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e7 f31242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f31243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j7 f31244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bitmap f31245h;

    public f(List list) {
        p pVar = new p((byte[]) list.get(0));
        int iG = pVar.G();
        int iG2 = pVar.G();
        Paint paint = new Paint();
        this.f31239b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f31240c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f31241d = new Canvas();
        this.f31242e = new e7(719, 575, 0, 719, 0, 575);
        this.f31243f = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f31244g = new j7(iG, iG2, 1);
    }

    public static byte[] a(int i10, int i11, y2 y2Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) y2Var.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
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
                iArr[i10] = d(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.f.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(y2 y2Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = y2Var.i(8);
        y2Var.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i21 = y2Var.i(i16);
            int i22 = y2Var.i(i16);
            int[] iArr2 = (i22 & 128) != 0 ? iArr : (i22 & 64) != 0 ? iArrB : iArrC;
            if ((i22 & 1) != 0) {
                i14 = y2Var.i(i16);
                i15 = y2Var.i(i16);
                i11 = y2Var.i(i16);
                i13 = y2Var.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = y2Var.i(6) << i18;
                int i24 = y2Var.i(4) << 4;
                i11 = y2Var.i(4) << 4;
                i12 = i19 - 4;
                i13 = y2Var.i(i18) << 6;
                i14 = i23;
                i15 = i24;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d10 = i14;
            double d11 = i15 - 128;
            double d12 = i11 - 128;
            iArr2[i21] = d((byte) (255 - (i13 & KotlinVersion.MAX_COMPONENT_VALUE)), z.j((int) ((1.402d * d11) + d10), 0, KotlinVersion.MAX_COMPONENT_VALUE), z.j((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), z.j((int) ((d12 * 1.772d) + d10), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr, iArrB, iArrC);
    }

    public static b g(y2 y2Var) {
        byte[] bArr;
        int i10 = y2Var.i(16);
        y2Var.t(4);
        int i11 = y2Var.i(2);
        boolean zH = y2Var.h();
        y2Var.t(1);
        byte[] bArr2 = z.f28609b;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = y2Var.i(16);
                int i13 = y2Var.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    y2Var.l(i12, bArr2);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    y2Var.l(i13, bArr);
                }
            }
            return new b(i10, zH, bArr2, bArr);
        }
        y2Var.t(y2Var.i(8) * 16);
        bArr = bArr2;
        return new b(i10, zH, bArr2, bArr);
    }

    @Override // n5.m
    public final void p(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        j7 j7Var;
        boolean z5;
        n5.a aVar;
        char c8;
        char c9;
        char c10;
        int i12;
        ArrayList arrayList;
        int i13;
        e7 e7Var;
        j7 j7Var2;
        d dVar;
        int i14;
        int i15;
        int i16;
        int i17;
        d dVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        y2 y2Var = new y2(i10 + i11, bArr);
        y2Var.q(i10);
        while (true) {
            int iB = y2Var.b();
            j7Var = this.f31244g;
            z5 = true;
            if (iB >= 48 && y2Var.i(8) == 15) {
                int i22 = y2Var.i(8);
                int i23 = y2Var.i(16);
                int i24 = y2Var.i(16);
                int iF = y2Var.f() + i24;
                if (i24 * 8 > y2Var.b()) {
                    m3.b.s("DvbParser", "Data field length exceeds limit");
                    y2Var.t(y2Var.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == j7Var.f6737a) {
                                b8.a aVar2 = (b8.a) j7Var.i;
                                y2Var.i(8);
                                int i25 = y2Var.i(4);
                                int i26 = y2Var.i(2);
                                y2Var.t(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = y2Var.i(8);
                                    y2Var.t(8);
                                    i27 -= 6;
                                    sparseArray.put(i28, new c(y2Var.i(16), y2Var.i(16)));
                                }
                                b8.a aVar3 = new b8.a(i25, i26, sparseArray);
                                if (i26 != 0) {
                                    j7Var.i = aVar3;
                                    j7Var.f6739c.clear();
                                    j7Var.f6740d.clear();
                                    j7Var.f6741e.clear();
                                } else if (aVar2 != null && aVar2.f1987b != i25) {
                                    j7Var.i = aVar3;
                                }
                            }
                            break;
                        case 17:
                            b8.a aVar4 = (b8.a) j7Var.i;
                            SparseArray sparseArray2 = j7Var.f6739c;
                            if (i23 == j7Var.f6737a && aVar4 != null) {
                                int i29 = y2Var.i(8);
                                y2Var.t(4);
                                boolean zH = y2Var.h();
                                y2Var.t(3);
                                int i30 = y2Var.i(16);
                                int i31 = y2Var.i(16);
                                y2Var.i(3);
                                int i32 = y2Var.i(3);
                                y2Var.t(2);
                                int i33 = y2Var.i(8);
                                int i34 = y2Var.i(8);
                                int i35 = y2Var.i(4);
                                int i36 = y2Var.i(2);
                                y2Var.t(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = y2Var.i(16);
                                    int i39 = y2Var.i(2);
                                    y2Var.i(2);
                                    int i40 = y2Var.i(12);
                                    y2Var.t(4);
                                    int i41 = y2Var.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 == 1 || i39 == 2) {
                                        y2Var.i(8);
                                        y2Var.i(8);
                                        i37 -= 8;
                                    } else {
                                        i37 = i42;
                                    }
                                    sparseArray3.put(i38, new e(i40, i41));
                                }
                                d dVar3 = new d(i29, zH, i30, i31, i32, i33, i34, i35, i36, sparseArray3);
                                if (aVar4.f1988c == 0 && (dVar2 = (d) sparseArray2.get(i29)) != null) {
                                    SparseArray sparseArray4 = dVar2.f31234j;
                                    for (int i43 = 0; i43 < sparseArray4.size(); i43++) {
                                        dVar3.f31234j.put(sparseArray4.keyAt(i43), (e) sparseArray4.valueAt(i43));
                                    }
                                }
                                sparseArray2.put(dVar3.f31226a, dVar3);
                            }
                            break;
                        case 18:
                            if (i23 == j7Var.f6737a) {
                                a aVarF = f(y2Var, i24);
                                j7Var.f6740d.put(aVarF.f31216a, aVarF);
                            } else if (i23 == j7Var.f6738b) {
                                a aVarF2 = f(y2Var, i24);
                                j7Var.f6742f.put(aVarF2.f31216a, aVarF2);
                            }
                            break;
                        case 19:
                            if (i23 == j7Var.f6737a) {
                                b bVarG = g(y2Var);
                                j7Var.f6741e.put(bVarG.f31220a, bVarG);
                            } else if (i23 == j7Var.f6738b) {
                                b bVarG2 = g(y2Var);
                                j7Var.f6743g.put(bVarG2.f31220a, bVarG2);
                            }
                            break;
                        case 20:
                            if (i23 == j7Var.f6737a) {
                                y2Var.t(4);
                                boolean zH2 = y2Var.h();
                                y2Var.t(3);
                                int i44 = y2Var.i(16);
                                int i45 = y2Var.i(16);
                                if (zH2) {
                                    int i46 = y2Var.i(16);
                                    i18 = y2Var.i(16);
                                    i21 = y2Var.i(16);
                                    i19 = y2Var.i(16);
                                    i20 = i46;
                                } else {
                                    i18 = i44;
                                    i19 = i45;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                j7Var.f6744h = new e7(i44, i45, i20, i18, i21, i19);
                            }
                            break;
                    }
                    y2Var.u(iF - y2Var.f());
                }
            }
        }
        b8.a aVar5 = (b8.a) j7Var.i;
        if (aVar5 == null) {
            h0 h0Var = j0.f818c;
            aVar = new n5.a(-9223372036854775807L, -9223372036854775807L, b1.f768f);
        } else {
            e7 e7Var2 = (e7) j7Var.f6744h;
            if (e7Var2 == null) {
                e7Var2 = this.f31242e;
            }
            Bitmap bitmap = this.f31245h;
            Canvas canvas = this.f31241d;
            if (bitmap == null || e7Var2.f4861a + 1 != bitmap.getWidth() || e7Var2.f4862b + 1 != this.f31245h.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(e7Var2.f4861a + 1, e7Var2.f4862b + 1, Bitmap.Config.ARGB_8888);
                this.f31245h = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) aVar5.f1989d;
            int i47 = 0;
            while (i47 < sparseArray5.size()) {
                canvas.save();
                c cVar = (c) sparseArray5.valueAt(i47);
                d dVar4 = (d) j7Var.f6739c.get(sparseArray5.keyAt(i47));
                int i48 = cVar.f31224a + e7Var2.f4863c;
                int i49 = cVar.f31225b + e7Var2.f4865e;
                int i50 = dVar4.f31228c;
                int i51 = dVar4.f31231f;
                int i52 = dVar4.f31229d;
                boolean z10 = z5;
                int i53 = i48 + i50;
                int i54 = i49 + i52;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i48, i49, Math.min(i53, e7Var2.f4864d), Math.min(i54, e7Var2.f4866f));
                a aVar6 = (a) j7Var.f6740d.get(i51);
                if (aVar6 == null && (aVar6 = (a) j7Var.f6742f.get(i51)) == null) {
                    aVar6 = this.f31243f;
                }
                SparseArray sparseArray7 = dVar4.f31234j;
                int i55 = i47;
                int i56 = 0;
                while (i56 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i56);
                    SparseArray sparseArray8 = sparseArray7;
                    e eVar = (e) sparseArray7.valueAt(i56);
                    int i57 = i49;
                    b bVar = (b) j7Var.f6741e.get(iKeyAt);
                    if (bVar == null) {
                        bVar = (b) j7Var.f6743g.get(iKeyAt);
                    }
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        Paint paint = bVar2.f31221b ? null : this.f31239b;
                        int i58 = i48;
                        int i59 = dVar4.f31230e;
                        j7Var2 = j7Var;
                        int i60 = i58 + eVar.f31235a;
                        int i61 = i57 + eVar.f31236b;
                        int i62 = i52;
                        Paint paint2 = paint;
                        e7Var = e7Var2;
                        i15 = i50;
                        i14 = i58;
                        arrayList = arrayList2;
                        i13 = i57;
                        d dVar5 = dVar4;
                        int[] iArr = i59 == 3 ? aVar6.f31219d : i59 == 2 ? aVar6.f31218c : aVar6.f31217b;
                        dVar = dVar5;
                        i16 = i56;
                        i17 = i62;
                        e(bVar2.f31222c, iArr, i59, i60, i61, paint2, canvas);
                        e(bVar2.f31223d, iArr, i59, i60, i61 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i57;
                        e7Var = e7Var2;
                        j7Var2 = j7Var;
                        dVar = dVar4;
                        i14 = i48;
                        i15 = i50;
                        i16 = i56;
                        i17 = i52;
                    }
                    i56 = i16 + 1;
                    i50 = i15;
                    i49 = i13;
                    dVar4 = dVar;
                    i48 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    e7Var2 = e7Var;
                    j7Var = j7Var2;
                    i52 = i17;
                }
                e7 e7Var3 = e7Var2;
                ArrayList arrayList3 = arrayList2;
                j7 j7Var3 = j7Var;
                int i63 = i49;
                d dVar6 = dVar4;
                int i64 = i48;
                int i65 = i50;
                int i66 = i52;
                if (dVar6.f31227b) {
                    int i67 = dVar6.f31230e;
                    if (i67 == 3) {
                        i12 = aVar6.f31219d[dVar6.f31232g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i67 == 2 ? aVar6.f31218c[dVar6.f31233h] : aVar6.f31217b[dVar6.i];
                    }
                    Paint paint3 = this.f31240c;
                    paint3.setColor(i12);
                    c8 = c10;
                    c9 = 3;
                    canvas.drawRect(i64, i63, i53, i54, paint3);
                } else {
                    c8 = 2;
                    c9 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f31245h, i64, i63, i65, i66);
                float f10 = e7Var3.f4861a;
                float f11 = e7Var3.f4862b;
                arrayList3.add(new l3.b(null, null, null, bitmapCreateBitmap2, i63 / f11, 0, 0, i64 / f10, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, i65 / f10, i66 / f11, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i47 = i55 + 1;
                z5 = z10;
                e7Var2 = e7Var3;
                arrayList2 = arrayList3;
                j7Var = j7Var3;
                sparseArray5 = sparseArray6;
            }
            aVar = new n5.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        gVar.accept(aVar);
    }

    @Override // n5.m
    public final void reset() {
        j7 j7Var = this.f31244g;
        j7Var.f6739c.clear();
        j7Var.f6740d.clear();
        j7Var.f6741e.clear();
        j7Var.f6742f.clear();
        j7Var.f6743g.clear();
        j7Var.f6744h = null;
        j7Var.i = null;
    }

    @Override // n5.m
    public final int s() {
        return 2;
    }
}
