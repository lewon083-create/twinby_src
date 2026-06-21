package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 extends t6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g2 f8205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m6 f8206o;

    @Override // com.google.android.gms.internal.ads.t6
    public final void e(boolean z5) {
        super.e(z5);
        if (z5) {
            this.f8205n = null;
            this.f8206o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final long f(tk0 tk0Var) {
        byte[] bArr = tk0Var.f10641a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6) {
            tk0Var.G(4);
            tk0Var.o();
        } else if (i == 7) {
            i = 7;
            tk0Var.G(4);
            tk0Var.o();
        }
        int iN = nz.n(i, tk0Var);
        tk0Var.E(0);
        return iN;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean g(tk0 tk0Var, long j10, zd1 zd1Var) {
        byte[] bArr = tk0Var.f10641a;
        g2 g2Var = this.f8205n;
        if (g2Var == null) {
            g2 g2Var2 = new g2(bArr, 17, 0);
            this.f8205n = g2Var2;
            ow1 ow1Var = new ow1(g2Var2.f(Arrays.copyOfRange(bArr, 9, tk0Var.f10643c), null));
            ow1Var.d("audio/ogg");
            zd1Var.f12971c = new jx1(ow1Var);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & 127) != 3) {
            if (b2 != -1) {
                return true;
            }
            m6 m6Var = this.f8206o;
            if (m6Var != null) {
                m6Var.f7788b = j10;
                zd1Var.f12972d = m6Var;
            }
            ((jx1) zd1Var.f12971c).getClass();
            return false;
        }
        ut utVarN = c80.n(tk0Var);
        g2 g2Var3 = new g2(g2Var.f5604a, g2Var.f5605b, g2Var.f5606c, g2Var.f5607d, g2Var.f5608e, g2Var.f5610g, g2Var.f5611h, g2Var.f5612j, utVarN, (f9) g2Var.f5614l);
        this.f8205n = g2Var3;
        m6 m6Var2 = new m6();
        m6Var2.f7790d = g2Var3;
        m6Var2.f7791e = utVarN;
        m6Var2.f7788b = -1L;
        m6Var2.f7789c = -1L;
        this.f8206o = m6Var2;
        return true;
    }
}
