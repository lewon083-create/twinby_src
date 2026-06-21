package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8098h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f8100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8101l;

    public /* synthetic */ n1(ArrayList arrayList, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.f8091a = arrayList;
        this.f8092b = i;
        this.f8093c = i10;
        this.f8094d = i11;
        this.f8095e = i12;
        this.f8096f = i13;
        this.f8097g = i14;
        this.f8098h = i15;
        this.i = i16;
        this.f8099j = i17;
        this.f8100k = f10;
        this.f8101l = str;
    }

    public static n1 a(m3.p pVar) throws j3.d0 {
        String strA;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            pVar.N(4);
            int iZ = (pVar.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = pVar.z() & 31;
            for (int i17 = 0; i17 < iZ2; i17++) {
                int iG = pVar.G();
                int i18 = pVar.f28590b;
                pVar.N(iG);
                byte[] bArr = pVar.f28589a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(m3.d.f28554a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i18, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = pVar.z();
            for (int i19 = 0; i19 < iZ3; i19++) {
                int iG2 = pVar.G();
                int i20 = pVar.f28590b;
                pVar.N(iG2);
                byte[] bArr3 = pVar.f28589a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(m3.d.f28554a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i20, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                n3.m mVarK = n3.n.k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i21 = mVarK.f29073e;
                int i22 = mVarK.f29074f;
                int i23 = mVarK.f29076h + 8;
                int i24 = mVarK.i + 8;
                int i25 = mVarK.f29083p;
                int i26 = mVarK.f29084q;
                int i27 = mVarK.f29085r;
                int i28 = mVarK.f29086s;
                float f11 = mVarK.f29075g;
                strA = m3.d.a(mVarK.f29069a, mVarK.f29070b, mVarK.f29071c);
                i12 = i26;
                i13 = i27;
                i14 = i28;
                f10 = f11;
                i10 = i22;
                i11 = i23;
                i15 = i24;
                i16 = i25;
                i = i21;
            } else {
                strA = null;
                i = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new n1(arrayList, iZ, i, i10, i11, i15, i16, i12, i13, i14, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw j3.d0.a(e3, "Error parsing AVC config");
        }
    }

    public static n1 b(tk0 tk0Var) throws eb {
        String str;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            tk0Var.G(4);
            int iK = (tk0Var.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = tk0Var.K() & 31;
            for (int i17 = 0; i17 < iK2; i17++) {
                int iL = tk0Var.L();
                int i18 = tk0Var.f10642b;
                tk0Var.G(iL);
                byte[] bArr = tk0Var.f10641a;
                byte[] bArr2 = ea0.f4892a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(ea0.f4892a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i18, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = tk0Var.K();
            for (int i19 = 0; i19 < iK3; i19++) {
                int iL2 = tk0Var.L();
                int i20 = tk0Var.f10642b;
                tk0Var.G(iL2);
                byte[] bArr4 = tk0Var.f10641a;
                byte[] bArr5 = ea0.f4892a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(ea0.f4892a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i20, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                o11 o11VarB = rs.B((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i21 = o11VarB.f8572e;
                int i22 = o11VarB.f8573f;
                int i23 = o11VarB.f8575h + 8;
                int i24 = o11VarB.i + 8;
                int i25 = o11VarB.f8576j;
                int i26 = o11VarB.f8577k;
                int i27 = o11VarB.f8578l;
                int i28 = o11VarB.f8579m;
                float f11 = o11VarB.f8574g;
                int i29 = o11VarB.f8568a;
                int i30 = o11VarB.f8569b;
                int i31 = o11VarB.f8570c;
                byte[] bArr7 = ea0.f4892a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i29), Integer.valueOf(i30), Integer.valueOf(i31));
                i12 = i26;
                i13 = i27;
                i14 = i28;
                f10 = f11;
                i10 = i22;
                i11 = i23;
                i15 = i24;
                i16 = i25;
                i = i21;
            } else {
                str = null;
                i = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new n1(arrayList, iK, i, i10, i11, i15, i16, i12, i13, i14, f10, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw eb.a(e3, "Error parsing AVC config");
        }
    }
}
