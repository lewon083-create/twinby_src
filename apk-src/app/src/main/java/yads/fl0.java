package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fl0 extends iz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ol0 f38475m;

    public fl0(List list) {
        lb2 lb2Var = new lb2((byte[]) list.get(0));
        this.f38475m = new ol0(lb2Var.r(), lb2Var.r());
    }

    @Override // yads.iz2
    public final u43 a(byte[] bArr, int i, boolean z5) {
        boolean z10;
        List listUnmodifiableList;
        char c8;
        ll0 ll0Var;
        int iA;
        int iA2;
        int i10;
        int iA3;
        if (z5) {
            nl0 nl0Var = this.f38475m.f41623f;
            nl0Var.f41279c.clear();
            nl0Var.f41280d.clear();
            nl0Var.f41281e.clear();
            nl0Var.f41282f.clear();
            nl0Var.f41283g.clear();
            nl0Var.f41284h = null;
            nl0Var.i = null;
        }
        ol0 ol0Var = this.f38475m;
        ol0Var.getClass();
        kb2 kb2Var = new kb2(i, bArr);
        while (true) {
            z10 = true;
            if (kb2Var.b() >= 48 && kb2Var.a(8) == 15) {
                nl0 nl0Var2 = ol0Var.f41623f;
                int iA4 = kb2Var.a(8);
                int i11 = 16;
                int iA5 = kb2Var.a(16);
                int iA6 = kb2Var.a(16);
                int iC = kb2Var.c() + iA6;
                if (iA6 * 8 > kb2Var.b()) {
                    kh1.d("DvbParser", "Data field length exceeds limit");
                    kb2Var.c(kb2Var.b());
                } else {
                    switch (iA4) {
                        case 16:
                            if (iA5 == nl0Var2.f41277a) {
                                jl0 jl0Var = nl0Var2.i;
                                kb2Var.a(8);
                                int iA7 = kb2Var.a(4);
                                int iA8 = kb2Var.a(2);
                                kb2Var.c(2);
                                int i12 = iA6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i12 > 0) {
                                    int iA9 = kb2Var.a(8);
                                    kb2Var.c(8);
                                    i12 -= 6;
                                    sparseArray.put(iA9, new kl0(kb2Var.a(16), kb2Var.a(16)));
                                }
                                jl0 jl0Var2 = new jl0(iA7, iA8, sparseArray);
                                if (iA8 != 0) {
                                    nl0Var2.i = jl0Var2;
                                    nl0Var2.f41279c.clear();
                                    nl0Var2.f41280d.clear();
                                    nl0Var2.f41281e.clear();
                                } else if (jl0Var != null && jl0Var.f39898a != iA7) {
                                    nl0Var2.i = jl0Var2;
                                }
                            }
                            break;
                        case 17:
                            jl0 jl0Var3 = nl0Var2.i;
                            if (iA5 == nl0Var2.f41277a && jl0Var3 != null) {
                                int iA10 = kb2Var.a(8);
                                kb2Var.c(4);
                                boolean zE = kb2Var.e();
                                kb2Var.c(3);
                                int iA11 = kb2Var.a(16);
                                int iA12 = kb2Var.a(16);
                                kb2Var.a(3);
                                int iA13 = kb2Var.a(3);
                                kb2Var.c(2);
                                int iA14 = kb2Var.a(8);
                                int iA15 = kb2Var.a(8);
                                int iA16 = kb2Var.a(4);
                                int iA17 = kb2Var.a(2);
                                kb2Var.c(2);
                                int i13 = iA6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i13 > 0) {
                                    int iA18 = kb2Var.a(i11);
                                    int iA19 = kb2Var.a(2);
                                    kb2Var.a(2);
                                    int iA20 = kb2Var.a(12);
                                    kb2Var.c(4);
                                    int iA21 = kb2Var.a(12);
                                    int i14 = i13 - 6;
                                    if (iA19 == 1 || iA19 == 2) {
                                        kb2Var.a(8);
                                        kb2Var.a(8);
                                        i13 -= 8;
                                    } else {
                                        i13 = i14;
                                    }
                                    sparseArray2.put(iA18, new ml0(iA20, iA21));
                                    i11 = 16;
                                }
                                ll0 ll0Var2 = new ll0(iA10, zE, iA11, iA12, iA13, iA14, iA15, iA16, iA17, sparseArray2);
                                if (jl0Var3.f39899b == 0 && (ll0Var = (ll0) nl0Var2.f41279c.get(iA10)) != null) {
                                    SparseArray sparseArray3 = ll0Var.f40582j;
                                    for (int i15 = 0; i15 < sparseArray3.size(); i15++) {
                                        ll0Var2.f40582j.put(sparseArray3.keyAt(i15), (ml0) sparseArray3.valueAt(i15));
                                    }
                                }
                                nl0Var2.f41279c.put(ll0Var2.f40574a, ll0Var2);
                            }
                            break;
                        case 18:
                            if (iA5 == nl0Var2.f41277a) {
                                gl0 gl0VarA = ol0.a(kb2Var, iA6);
                                nl0Var2.f41280d.put(gl0VarA.f38817a, gl0VarA);
                            } else if (iA5 == nl0Var2.f41278b) {
                                gl0 gl0VarA2 = ol0.a(kb2Var, iA6);
                                nl0Var2.f41282f.put(gl0VarA2.f38817a, gl0VarA2);
                            }
                            break;
                        case 19:
                            if (iA5 == nl0Var2.f41277a) {
                                il0 il0VarA = ol0.a(kb2Var);
                                nl0Var2.f41281e.put(il0VarA.f39577a, il0VarA);
                            } else if (iA5 == nl0Var2.f41278b) {
                                il0 il0VarA2 = ol0.a(kb2Var);
                                nl0Var2.f41283g.put(il0VarA2.f39577a, il0VarA2);
                            }
                            break;
                        case 20:
                            if (iA5 == nl0Var2.f41277a) {
                                kb2Var.c(4);
                                boolean zE2 = kb2Var.e();
                                kb2Var.c(3);
                                int iA22 = kb2Var.a(16);
                                int iA23 = kb2Var.a(16);
                                if (zE2) {
                                    int iA24 = kb2Var.a(16);
                                    iA = kb2Var.a(16);
                                    iA3 = kb2Var.a(16);
                                    i10 = iA24;
                                    iA2 = kb2Var.a(16);
                                } else {
                                    iA = iA22;
                                    iA2 = iA23;
                                    i10 = 0;
                                    iA3 = 0;
                                }
                                nl0Var2.f41284h = new hl0(iA22, iA23, i10, iA, iA3, iA2);
                            }
                            break;
                    }
                    kb2Var.d(iC - kb2Var.c());
                }
            }
        }
        nl0 nl0Var3 = ol0Var.f41623f;
        jl0 jl0Var4 = nl0Var3.i;
        if (jl0Var4 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            hl0 hl0Var = nl0Var3.f41284h;
            if (hl0Var == null) {
                hl0Var = ol0Var.f41621d;
            }
            Bitmap bitmap = ol0Var.f41624g;
            if (bitmap == null || hl0Var.f39229a + 1 != bitmap.getWidth() || hl0Var.f39230b + 1 != ol0Var.f41624g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(hl0Var.f39229a + 1, hl0Var.f39230b + 1, Bitmap.Config.ARGB_8888);
                ol0Var.f41624g = bitmapCreateBitmap;
                ol0Var.f41620c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = jl0Var4.f39900c;
            int i16 = 0;
            while (i16 < sparseArray4.size()) {
                ol0Var.f41620c.save();
                kl0 kl0Var = (kl0) sparseArray4.valueAt(i16);
                ll0 ll0Var3 = (ll0) ol0Var.f41623f.f41279c.get(sparseArray4.keyAt(i16));
                int i17 = kl0Var.f40241a + hl0Var.f39231c;
                int i18 = kl0Var.f40242b + hl0Var.f39233e;
                ol0Var.f41620c.clipRect(i17, i18, Math.min(ll0Var3.f40576c + i17, hl0Var.f39232d), Math.min(ll0Var3.f40577d + i18, hl0Var.f39234f));
                gl0 gl0Var = (gl0) ol0Var.f41623f.f41280d.get(ll0Var3.f40579f);
                if (gl0Var == null && (gl0Var = (gl0) ol0Var.f41623f.f41282f.get(ll0Var3.f40579f)) == null) {
                    gl0Var = ol0Var.f41622e;
                }
                SparseArray sparseArray5 = ll0Var3.f40582j;
                boolean z11 = z10;
                for (int i19 = 0; i19 < sparseArray5.size(); i19++) {
                    int iKeyAt = sparseArray5.keyAt(i19);
                    ml0 ml0Var = (ml0) sparseArray5.valueAt(i19);
                    il0 il0Var = (il0) ol0Var.f41623f.f41281e.get(iKeyAt);
                    if (il0Var == null) {
                        il0Var = (il0) ol0Var.f41623f.f41283g.get(iKeyAt);
                    }
                    if (il0Var != null) {
                        Paint paint = il0Var.f39578b ? null : ol0Var.f41618a;
                        int i20 = ll0Var3.f40578e;
                        int i21 = i17 + ml0Var.f40942a;
                        int i22 = i18 + ml0Var.f40943b;
                        Canvas canvas = ol0Var.f41620c;
                        int[] iArr = i20 == 3 ? gl0Var.f38820d : i20 == 2 ? gl0Var.f38819c : gl0Var.f38818b;
                        ol0.a(il0Var.f39579c, iArr, i20, i21, i22, paint, canvas);
                        ol0.a(il0Var.f39580d, iArr, i20, i21, i22 + 1, paint, canvas);
                    }
                }
                if (ll0Var3.f40575b) {
                    int i23 = ll0Var3.f40578e;
                    c8 = 3;
                    ol0Var.f41619b.setColor(i23 == 3 ? gl0Var.f38820d[ll0Var3.f40580g] : i23 == 2 ? gl0Var.f38819c[ll0Var3.f40581h] : gl0Var.f38818b[ll0Var3.i]);
                    ol0Var.f41620c.drawRect(i17, i18, ll0Var3.f40576c + i17, ll0Var3.f40577d + i18, ol0Var.f41619b);
                } else {
                    c8 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(ol0Var.f41624g, i17, i18, ll0Var3.f40576c, ll0Var3.f40577d);
                float f10 = hl0Var.f39229a;
                float f11 = i18;
                float f12 = hl0Var.f39230b;
                arrayList.add(new o20(null, null, null, bitmapCreateBitmap2, f11 / f12, 0, 0, i17 / f10, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, ll0Var3.f40576c / f10, ll0Var3.f40577d / f12, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f));
                ol0Var.f41620c.drawColor(0, PorterDuff.Mode.CLEAR);
                ol0Var.f41620c.restore();
                i16++;
                z10 = z11;
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return new pl0(listUnmodifiableList);
    }
}
