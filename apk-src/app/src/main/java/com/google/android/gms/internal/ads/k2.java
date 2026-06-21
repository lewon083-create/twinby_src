package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7090h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f7093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f7096o;

    public /* synthetic */ k2(List list, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, String str, Object obj) {
        this.f7083a = list;
        this.f7084b = i;
        this.f7085c = i10;
        this.f7086d = i11;
        this.f7087e = i12;
        this.f7088f = i13;
        this.f7089g = i14;
        this.f7090h = i15;
        this.i = i16;
        this.f7091j = i17;
        this.f7092k = i18;
        this.f7093l = f10;
        this.f7094m = i19;
        this.f7095n = str;
        this.f7096o = obj;
    }

    public static k2 a(m3.p pVar, boolean z5, s7.g gVar) {
        boolean z10;
        l7.n nVarH;
        int i;
        int i10 = 4;
        try {
            if (z5) {
                pVar.N(4);
            } else {
                pVar.N(21);
            }
            int iZ = pVar.z() & 3;
            int iZ2 = pVar.z();
            int i11 = pVar.f28590b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z10 = true;
                if (i13 >= iZ2) {
                    break;
                }
                pVar.N(1);
                int iG = pVar.G();
                for (int i15 = 0; i15 < iG; i15++) {
                    int iG2 = pVar.G();
                    i14 += iG2 + 4;
                    pVar.N(iG2);
                }
                i13++;
            }
            pVar.M(i11);
            byte[] bArr = new byte[i14];
            s7.g gVar2 = gVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String strB = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < iZ2) {
                int iZ3 = pVar.z() & 63;
                int iG3 = pVar.G();
                int i28 = i12;
                s7.g gVarJ = gVar2;
                while (i28 < iG3) {
                    boolean z11 = z10;
                    int iG4 = pVar.G();
                    int i29 = iZ;
                    System.arraycopy(n3.n.f29087a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(pVar.f28589a, pVar.f28590b, bArr, i30, iG4);
                    if (iZ3 == 32 && i28 == 0) {
                        gVarJ = n3.n.j(bArr, i30, i30 + iG4);
                    } else {
                        if (iZ3 == 33 && i28 == 0) {
                            xz0 xz0VarI = n3.n.i(bArr, i30, i30 + iG4, gVarJ);
                            i16 = xz0VarI.f12410a + 1;
                            i17 = xz0VarI.f12415f;
                            int i31 = xz0VarI.f12416g;
                            i19 = xz0VarI.f12411b + 8;
                            i20 = xz0VarI.f12412c + 8;
                            int i32 = xz0VarI.f12418j;
                            i18 = i31;
                            int i33 = xz0VarI.f12419k;
                            int i34 = xz0VarI.f12420l;
                            float f11 = xz0VarI.f12417h;
                            int i35 = xz0VarI.i;
                            n3.h hVar = (n3.h) xz0VarI.f12421m;
                            if (hVar != null) {
                                i = i35;
                                strB = m3.d.b(hVar.f29051a, hVar.f29052b, hVar.f29053c, hVar.f29054d, hVar.f29055e, hVar.f29056f);
                            } else {
                                i = i35;
                            }
                            i25 = i;
                            f10 = f11;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (iZ3 == 39 && i28 == 0 && (nVarH = n3.n.h(bArr, i30, i30 + iG4)) != null && gVarJ != null) {
                            i12 = 0;
                            i24 = nVarH.f28052c == ((n3.g) ((ad.j0) gVarJ.f32795b).get(0)).f29050b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i27 = i30 + iG4;
                    pVar.N(iG4);
                    i28++;
                    z10 = z11;
                    iZ = i29;
                    i10 = 4;
                }
                i26++;
                gVar2 = gVarJ;
                i10 = 4;
            }
            return new k2(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, strB, gVar2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw j3.d0.a(e3, "Error parsing".concat(z5 ? "L-HEVC config" : "HEVC config"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.k2 b(com.google.android.gms.internal.ads.tk0 r39, boolean r40, com.google.android.gms.internal.ads.cw r41) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k2.b(com.google.android.gms.internal.ads.tk0, boolean, com.google.android.gms.internal.ads.cw):com.google.android.gms.internal.ads.k2");
    }
}
