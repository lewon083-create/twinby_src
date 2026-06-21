package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.SentryLockReason;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 implements a7 {
    public static final byte[] i = {0, 7, 8, 15};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f7128j = {0, 119, -120, -1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f7129k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f7136h;

    public k7(Context context, yq yqVar, u9.a aVar, Executor executor) {
        this.f7130b = new Object();
        this.f7135g = new AtomicBoolean(false);
        this.f7131c = context.getApplicationContext();
        this.f7134f = aVar;
        this.f7133e = yqVar;
        this.f7136h = executor;
    }

    public static d7 d(ik0 ik0Var, int i10) {
        int iH;
        int iH2;
        int iH3;
        int iH4;
        int i11 = 8;
        int iH5 = ik0Var.h(8);
        ik0Var.f(8);
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrG = g();
        int[] iArrJ = j();
        int i13 = i10 - 2;
        while (i13 > 0) {
            int iH6 = ik0Var.h(i11);
            int iH7 = ik0Var.h(i11);
            int[] iArr2 = (iH7 & 128) != 0 ? iArr : (iH7 & 64) != 0 ? iArrG : iArrJ;
            if ((iH7 & 1) != 0) {
                iH3 = ik0Var.h(i11);
                iH4 = ik0Var.h(i11);
                iH = ik0Var.h(i11);
                iH2 = ik0Var.h(i11);
                i13 -= 6;
            } else {
                int iH8 = ik0Var.h(6) << 2;
                int iH9 = ik0Var.h(4) << 4;
                i13 -= 4;
                iH = ik0Var.h(4) << 4;
                iH2 = ik0Var.h(2) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
            }
            if (iH3 == 0) {
                iH = i12;
            }
            if (iH3 == 0) {
                iH4 = i12;
            }
            int i14 = 255 - (iH2 & KotlinVersion.MAX_COMPONENT_VALUE);
            double d10 = iH3;
            String str = cq0.f4293a;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr2[iH6] = k((byte) i14, Math.max(0, Math.min((int) ((1.402d * d11) + d10), KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), KotlinVersion.MAX_COMPONENT_VALUE)));
            i12 = 0;
            iH5 = iH5;
            iArrJ = iArrJ;
            i11 = 8;
        }
        return new d7(iH5, iArr, iArrG, iArrJ);
    }

    public static f7 e(ik0 ik0Var) {
        byte[] bArr;
        int iH = ik0Var.h(16);
        ik0Var.f(4);
        int iH2 = ik0Var.h(2);
        boolean zG = ik0Var.g();
        ik0Var.f(1);
        byte[] bArr2 = cq0.f4294b;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = ik0Var.h(16);
                int iH4 = ik0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    ix.k0(ik0Var.f6520c == 0);
                    System.arraycopy(ik0Var.f6518a, ik0Var.f6519b, bArr2, 0, iH3);
                    ik0Var.f6519b += iH3;
                    ik0Var.m();
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    ix.k0(ik0Var.f6520c == 0);
                    System.arraycopy(ik0Var.f6518a, ik0Var.f6519b, bArr, 0, iH4);
                    ik0Var.f6519b += iH4;
                    ik0Var.m();
                }
            }
            return new f7(iH, zG, bArr2, bArr);
        }
        ik0Var.f(ik0Var.h(8) * 16);
        bArr = bArr2;
        return new f7(iH, zG, bArr2, bArr);
    }

    public static JSONObject f(Context context, u9.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) bm.f3822f.r()).booleanValue()) {
                jSONObject.put(SentryLockReason.JsonKeys.PACKAGE_NAME, context.getPackageName());
            }
            jSONObject.put("js", aVar.f34365b);
            jSONObject.put("mf", bm.f3823g.r());
            jSONObject.put("cl", "839961582");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", ya.d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = k(KotlinVersion.MAX_COMPONENT_VALUE, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = k(KotlinVersion.MAX_COMPONENT_VALUE, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 < 8) {
                int i12 = i10 & 2;
                int i13 = i10 & 4;
                int i14 = 1 != (i10 & 1) ? 0 : 255;
                int i15 = i12 != 0 ? 255 : 0;
                if (i13 == 0) {
                    i11 = 0;
                }
                iArr[i10] = k(63, i14, i15, i11);
            } else {
                int i16 = i10 & 136;
                if (i16 == 0) {
                    iArr[i10] = k(KotlinVersion.MAX_COMPONENT_VALUE, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 8) {
                    iArr[i10] = k(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i16 == 128) {
                    iArr[i10] = k(KotlinVersion.MAX_COMPONENT_VALUE, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i16 == 136) {
                    iArr[i10] = k(KotlinVersion.MAX_COMPONENT_VALUE, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int k(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k7.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] m(int i10, int i11, ik0 ik0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ik0Var.h(i11);
        }
        return bArr;
    }

    public ed.d a() {
        synchronized (this.f7130b) {
            try {
                if (((SharedPreferences) this.f7132d) == null) {
                    this.f7132d = ((Context) this.f7131c).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f7132d;
        long j10 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        p9.k.C.f31304k.getClass();
        if (System.currentTimeMillis() - j10 < ((Long) bm.f3824h.r()).longValue()) {
            return n81.f8237c;
        }
        return vv.K(((yq) this.f7133e).b(f((Context) this.f7131c, (u9.a) this.f7134f)), new ju(0, this), ((Boolean) bm.f3828m.r()).booleanValue() ? (Executor) this.f7136h : hx.f6285g);
    }

    public void b() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            q9.g3 g3VarE = q9.g3.e();
            q9.o oVar = q9.r.f31959g.f31961b;
            Context context = (Context) this.f7131c;
            String str = (String) this.f7132d;
            fr frVar = (fr) this.f7135g;
            oVar.getClass();
            q9.l0 l0Var = (q9.l0) new q9.h(oVar, context, g3VarE, str, frVar).d(context, false);
            this.f7130b = l0Var;
            if (l0Var != null) {
                q9.f2 f2Var = (q9.f2) this.f7133e;
                f2Var.f31854m = jCurrentTimeMillis;
                l0Var.J1(new vh((ea.b) this.f7134f, str));
                q9.l0 l0Var2 = (q9.l0) this.f7130b;
                ((q9.f3) this.f7136h).getClass();
                l0Var2.X(q9.f3.a(context, f2Var));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.a7
    public void c(int i10, int i11, a4.g gVar, byte[] bArr) {
        boolean z5;
        v6 v6Var;
        char c8;
        char c9;
        char c10;
        int i12;
        int i13;
        int i14;
        j7 j7Var;
        h7 h7Var;
        SparseArray sparseArray;
        e7 e7Var;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int i18;
        h7 h7Var2;
        int iH;
        int iH2;
        int i19;
        int iH3;
        Canvas canvas = (Canvas) this.f7132d;
        j7 j7Var2 = (j7) this.f7135g;
        ik0 ik0Var = new ik0(i10 + i11, bArr);
        ik0Var.d(i10);
        while (true) {
            z5 = true;
            if (ik0Var.b() >= 48 && ik0Var.h(8) == 15) {
                int iH4 = ik0Var.h(8);
                int i20 = 16;
                int iH5 = ik0Var.h(16);
                int iH6 = ik0Var.h(16);
                int iC = ik0Var.c() + iH6;
                if (iH6 * 8 > ik0Var.b()) {
                    rs.r("DvbParser", "Data field length exceeds limit");
                    ik0Var.f(ik0Var.b());
                } else {
                    switch (iH4) {
                        case 16:
                            if (iH5 == j7Var2.f6737a) {
                                c5 c5Var = (c5) j7Var2.i;
                                ik0Var.h(8);
                                int iH7 = ik0Var.h(4);
                                int iH8 = ik0Var.h(2);
                                ik0Var.f(2);
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i21 = iH6 - 2; i21 > 0; i21 -= 6) {
                                    int iH9 = ik0Var.h(8);
                                    ik0Var.f(8);
                                    sparseArray2.put(iH9, new g7(ik0Var.h(16), ik0Var.h(16)));
                                }
                                c5 c5Var2 = new c5();
                                c5Var2.f4027b = iH7;
                                c5Var2.f4028c = iH8;
                                c5Var2.f4029d = sparseArray2;
                                if (iH8 != 0) {
                                    j7Var2.i = c5Var2;
                                    j7Var2.f6739c.clear();
                                    j7Var2.f6740d.clear();
                                    j7Var2.f6741e.clear();
                                } else if (c5Var != null && c5Var.f4027b != iH7) {
                                    j7Var2.i = c5Var2;
                                }
                            }
                            break;
                        case 17:
                            c5 c5Var3 = (c5) j7Var2.i;
                            SparseArray sparseArray3 = j7Var2.f6739c;
                            if (iH5 == j7Var2.f6737a && c5Var3 != null) {
                                int iH10 = ik0Var.h(8);
                                ik0Var.f(4);
                                boolean zG = ik0Var.g();
                                ik0Var.f(3);
                                int iH11 = ik0Var.h(16);
                                int iH12 = ik0Var.h(16);
                                ik0Var.h(3);
                                int iH13 = ik0Var.h(3);
                                ik0Var.f(2);
                                int iH14 = ik0Var.h(8);
                                int iH15 = ik0Var.h(8);
                                int iH16 = ik0Var.h(4);
                                int iH17 = ik0Var.h(2);
                                ik0Var.f(2);
                                int i22 = iH6 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i22 > 0) {
                                    int iH18 = ik0Var.h(i20);
                                    int iH19 = ik0Var.h(2);
                                    ik0Var.h(2);
                                    int iH20 = ik0Var.h(12);
                                    ik0Var.f(4);
                                    int iH21 = ik0Var.h(12);
                                    int i23 = i22 - 6;
                                    if (iH19 == 1 || iH19 == 2) {
                                        ik0Var.h(8);
                                        ik0Var.h(8);
                                        i22 -= 8;
                                    } else {
                                        i22 = i23;
                                    }
                                    sparseArray4.put(iH18, new i7(iH20, iH21));
                                    i20 = 16;
                                }
                                h7 h7Var3 = new h7(iH10, zG, iH11, iH12, iH13, iH14, iH15, iH16, iH17, sparseArray4);
                                if (c5Var3.f4028c == 0 && (h7Var2 = (h7) sparseArray3.get(iH10)) != null) {
                                    int i24 = 0;
                                    while (true) {
                                        SparseArray sparseArray5 = h7Var2.f6048j;
                                        if (i24 < sparseArray5.size()) {
                                            h7Var3.f6048j.put(sparseArray5.keyAt(i24), (i7) sparseArray5.valueAt(i24));
                                            i24++;
                                        }
                                    }
                                }
                                sparseArray3.put(h7Var3.f6040a, h7Var3);
                            }
                            break;
                        case 18:
                            if (iH5 == j7Var2.f6737a) {
                                d7 d7VarD = d(ik0Var, iH6);
                                j7Var2.f6740d.put(d7VarD.f4474a, d7VarD);
                            } else if (iH5 == j7Var2.f6738b) {
                                d7 d7VarD2 = d(ik0Var, iH6);
                                j7Var2.f6742f.put(d7VarD2.f4474a, d7VarD2);
                            }
                            break;
                        case 19:
                            if (iH5 == j7Var2.f6737a) {
                                f7 f7VarE = e(ik0Var);
                                j7Var2.f6741e.put(f7VarE.f5252a, f7VarE);
                            } else if (iH5 == j7Var2.f6738b) {
                                f7 f7VarE2 = e(ik0Var);
                                j7Var2.f6743g.put(f7VarE2.f5252a, f7VarE2);
                            }
                            break;
                        case 20:
                            if (iH5 == j7Var2.f6737a) {
                                ik0Var.f(4);
                                boolean zG2 = ik0Var.g();
                                ik0Var.f(3);
                                int iH22 = ik0Var.h(16);
                                int iH23 = ik0Var.h(16);
                                if (zG2) {
                                    int iH24 = ik0Var.h(16);
                                    iH = ik0Var.h(16);
                                    iH3 = ik0Var.h(16);
                                    iH2 = ik0Var.h(16);
                                    i19 = iH24;
                                } else {
                                    iH = iH22;
                                    iH2 = iH23;
                                    i19 = 0;
                                    iH3 = 0;
                                }
                                j7Var2.f6744h = new e7(iH22, iH23, i19, iH, iH3, iH2);
                            }
                            break;
                    }
                    ik0Var.l(iC - ik0Var.c());
                }
            }
        }
        c5 c5Var4 = (c5) j7Var2.i;
        if (c5Var4 == null) {
            v41 v41Var = x41.f12018c;
            v6Var = new v6(-9223372036854775807L, -9223372036854775807L, r51.f9713f);
        } else {
            e7 e7Var2 = (e7) j7Var2.f6744h;
            if (e7Var2 == null) {
                e7Var2 = (e7) this.f7133e;
            }
            e7 e7Var3 = e7Var2;
            Bitmap bitmap = (Bitmap) this.f7136h;
            if (bitmap == null || e7Var3.f4861a + 1 != bitmap.getWidth() || e7Var3.f4862b + 1 != ((Bitmap) this.f7136h).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(e7Var3.f4861a + 1, e7Var3.f4862b + 1, Bitmap.Config.ARGB_8888);
                this.f7136h = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray6 = (SparseArray) c5Var4.f4029d;
            int i25 = 0;
            while (i25 < sparseArray6.size()) {
                canvas.save();
                g7 g7Var = (g7) sparseArray6.valueAt(i25);
                h7 h7Var4 = (h7) j7Var2.f6739c.get(sparseArray6.keyAt(i25));
                int i26 = g7Var.f5675a + e7Var3.f4863c;
                int i27 = g7Var.f5676b + e7Var3.f4865e;
                int i28 = h7Var4.f6042c;
                int i29 = i26 + i28;
                int iMin = Math.min(i29, e7Var3.f4864d);
                boolean z10 = z5;
                int i30 = h7Var4.f6043d;
                int i31 = i27 + i30;
                canvas.clipRect(i26, i27, iMin, Math.min(i31, e7Var3.f4866f));
                int i32 = h7Var4.f6045f;
                d7 d7Var = (d7) j7Var2.f6740d.get(i32);
                if (d7Var == null && (d7Var = (d7) j7Var2.f6742f.get(i32)) == null) {
                    d7Var = (d7) this.f7134f;
                }
                SparseArray sparseArray7 = h7Var4.f6048j;
                SparseArray sparseArray8 = sparseArray6;
                int i33 = i27;
                int i34 = 0;
                while (i34 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i34);
                    int i35 = i34;
                    i7 i7Var = (i7) sparseArray7.valueAt(i34);
                    int i36 = i26;
                    f7 f7Var = (f7) j7Var2.f6741e.get(iKeyAt);
                    if (f7Var == null) {
                        f7Var = (f7) j7Var2.f6743g.get(iKeyAt);
                    }
                    f7 f7Var2 = f7Var;
                    if (f7Var2 != null) {
                        Paint paint = f7Var2.f5253b ? null : (Paint) this.f7130b;
                        j7Var = j7Var2;
                        int i37 = h7Var4.f6044e;
                        h7 h7Var5 = h7Var4;
                        int i38 = i36 + i7Var.f6405a;
                        int i39 = i33 + i7Var.f6406b;
                        int[] iArr = i37 == 3 ? d7Var.f4477d : i37 == 2 ? d7Var.f4476c : d7Var.f4475b;
                        h7Var = h7Var5;
                        e7Var = e7Var3;
                        i17 = i29;
                        sparseArray = sparseArray7;
                        Paint paint2 = paint;
                        i16 = i36;
                        arrayList = arrayList2;
                        i18 = i28;
                        i15 = i30;
                        int i40 = i33;
                        i13 = i25;
                        i14 = i40;
                        l(f7Var2.f5254c, iArr, i37, i38, i39, paint2, canvas);
                        l(f7Var2.f5255d, iArr, i37, i38, i39 + 1, paint2, canvas);
                    } else {
                        int i41 = i33;
                        i13 = i25;
                        i14 = i41;
                        j7Var = j7Var2;
                        h7Var = h7Var4;
                        sparseArray = sparseArray7;
                        e7Var = e7Var3;
                        i15 = i30;
                        i16 = i36;
                        i17 = i29;
                        arrayList = arrayList2;
                        i18 = i28;
                    }
                    int i42 = i13;
                    i33 = i14;
                    i25 = i42;
                    h7Var4 = h7Var;
                    i26 = i16;
                    i34 = i35 + 1;
                    i29 = i17;
                    i28 = i18;
                    arrayList2 = arrayList;
                    j7Var2 = j7Var;
                    e7Var3 = e7Var;
                    sparseArray7 = sparseArray;
                    i30 = i15;
                }
                int i43 = i33;
                int i44 = i25;
                j7 j7Var3 = j7Var2;
                h7 h7Var6 = h7Var4;
                int i45 = i26;
                e7 e7Var4 = e7Var3;
                int i46 = i30;
                ArrayList arrayList3 = arrayList2;
                int i47 = i28;
                int i48 = i29;
                float f10 = i43;
                float f11 = i45;
                if (h7Var6.f6041b) {
                    int i49 = h7Var6.f6044e;
                    c9 = 3;
                    if (i49 == 3) {
                        i12 = d7Var.f4477d[h7Var6.f6046g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i12 = i49 == 2 ? d7Var.f4476c[h7Var6.f6047h] : d7Var.f4475b[h7Var6.i];
                    }
                    Paint paint3 = (Paint) this.f7131c;
                    paint3.setColor(i12);
                    c8 = c10;
                    canvas.drawRect(f11, f10, i48, i31, paint3);
                } else {
                    c8 = 2;
                    c9 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.f7136h, i45, i43, i47, i46);
                float f12 = e7Var4.f4861a;
                float f13 = f11 / f12;
                float f14 = e7Var4.f4862b;
                arrayList3.add(new z40(null, null, null, bitmapCreateBitmap2, f10 / f14, 0, 0, f13, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, i47 / f12, i46 / f14, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i25 = i44 + 1;
                arrayList2 = arrayList3;
                e7Var3 = e7Var4;
                sparseArray6 = sparseArray8;
                j7Var2 = j7Var3;
                z5 = z10;
            }
            v6Var = new v6(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        gVar.mo0a(v6Var);
    }

    public ak1 h() throws GeneralSecurityException {
        in0 in0Var;
        in0 in0Var2;
        bk1 bk1Var = (bk1) this.f7130b;
        if (bk1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        in0 in0Var3 = (in0) this.f7132d;
        if (in0Var3 == null || (in0Var = (in0) this.f7133e) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        in0 in0Var4 = (in0) this.f7131c;
        if (in0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        in0 in0Var5 = (in0) this.f7134f;
        if (in0Var5 == null || (in0Var2 = (in0) this.f7135g) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        in0 in0Var6 = (in0) this.f7136h;
        if (in0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = bk1Var.f3804d.f12637b;
        BigInteger bigInteger2 = bk1Var.f3805e;
        BigInteger bigInteger3 = (BigInteger) in0Var3.f6553c;
        BigInteger bigInteger4 = (BigInteger) in0Var.f6553c;
        BigInteger bigInteger5 = (BigInteger) in0Var4.f6553c;
        BigInteger bigInteger6 = (BigInteger) in0Var5.f6553c;
        BigInteger bigInteger7 = (BigInteger) in0Var2.f6553c;
        BigInteger bigInteger8 = (BigInteger) in0Var6.f6553c;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new ak1((bk1) this.f7130b, (in0) this.f7132d, (in0) this.f7133e, (in0) this.f7131c, (in0) this.f7134f, (in0) this.f7135g, (in0) this.f7136h);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public hk1 i() throws GeneralSecurityException {
        in0 in0Var;
        in0 in0Var2;
        ik1 ik1Var = (ik1) this.f7130b;
        if (ik1Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        in0 in0Var3 = (in0) this.f7132d;
        if (in0Var3 == null || (in0Var = (in0) this.f7133e) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        in0 in0Var4 = (in0) this.f7131c;
        if (in0Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        in0 in0Var5 = (in0) this.f7134f;
        if (in0Var5 == null || (in0Var2 = (in0) this.f7135g) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        in0 in0Var6 = (in0) this.f7136h;
        if (in0Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = ik1Var.f6522d.f5840b;
        BigInteger bigInteger2 = ik1Var.f6523e;
        BigInteger bigInteger3 = (BigInteger) in0Var3.f6553c;
        BigInteger bigInteger4 = (BigInteger) in0Var.f6553c;
        BigInteger bigInteger5 = (BigInteger) in0Var4.f6553c;
        BigInteger bigInteger6 = (BigInteger) in0Var5.f6553c;
        BigInteger bigInteger7 = (BigInteger) in0Var2.f6553c;
        BigInteger bigInteger8 = (BigInteger) in0Var6.f6553c;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new hk1((ik1) this.f7130b, (in0) this.f7132d, (in0) this.f7133e, (in0) this.f7131c, (in0) this.f7134f, (in0) this.f7135g, (in0) this.f7136h);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ k7(boolean z5) {
        this.f7130b = null;
        this.f7131c = null;
        this.f7132d = null;
        this.f7133e = null;
        this.f7134f = null;
        this.f7135g = null;
        this.f7136h = null;
    }

    public k7() {
        this.f7135g = new h1.i(0);
        this.f7136h = new h1.i(0);
    }

    public k7(Context context, String str, q9.f2 f2Var, ea.b bVar) {
        this.f7135g = new fr();
        this.f7131c = context;
        this.f7132d = str;
        this.f7133e = f2Var;
        this.f7134f = bVar;
        this.f7136h = q9.f3.f31855a;
    }

    public k7(dl dlVar, WebView webView, String str, String str2, tt0 tt0Var) {
        this.f7132d = new ArrayList();
        this.f7133e = new HashMap();
        this.f7130b = dlVar;
        this.f7131c = webView;
        this.f7136h = tt0Var;
        this.f7135g = str;
        this.f7134f = str2;
    }
}
