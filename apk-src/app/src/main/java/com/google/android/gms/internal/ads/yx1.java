package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yx1 implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g91 f12790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wy1 f12792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12794f;

    public yx1(g91 g91Var, int i, wy1 wy1Var) {
        ix.o(i > 0);
        this.f12790b = g91Var;
        this.f12791c = i;
        this.f12792d = wy1Var;
        this.f12793e = new byte[1];
        this.f12794f = i;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        int i11 = this.f12794f;
        g91 g91Var = this.f12790b;
        if (i11 == 0) {
            byte[] bArr2 = this.f12793e;
            int i12 = 0;
            if (g91Var.C(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iC = g91Var.C(bArr3, i12, i14);
                        if (iC != -1) {
                            i12 += iC;
                            i14 -= iC;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr3[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        tk0 tk0Var = new tk0(i13, bArr3);
                        wy1 wy1Var = this.f12792d;
                        long jMax = !wy1Var.f11935l ? wy1Var.i : Math.max(wy1Var.f11936m.x(true), wy1Var.i);
                        int iB = tk0Var.B();
                        w2 w2Var = wy1Var.f11934k;
                        w2Var.getClass();
                        w2Var.a(iB, tk0Var);
                        w2Var.c(jMax, 1, iB, 0, null);
                        wy1Var.f11935l = true;
                    }
                }
                i11 = this.f12791c;
                this.f12794f = i11;
            }
            return -1;
        }
        int iC2 = g91Var.C(bArr, i, Math.min(i11, i10));
        if (iC2 != -1) {
            this.f12794f -= iC2;
        }
        return iC2;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
        em1Var.getClass();
        this.f12790b.H(em1Var);
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        return this.f12790b.d();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f12790b.l();
    }
}
