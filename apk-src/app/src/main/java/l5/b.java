package l5;

import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.m6;
import com.google.android.gms.internal.ads.t6;
import j3.b0;
import j3.c0;
import j3.n;
import j3.o;
import java.util.Arrays;
import l6.i;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends t6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g2 f27925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m6 f27926o;

    @Override // com.google.android.gms.internal.ads.t6
    public final long b(p pVar) {
        byte[] bArr = pVar.f28589a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            pVar.N(4);
            pVar.H();
        }
        int iX = q4.b.x(i, pVar);
        pVar.M(0);
        return iX;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean c(p pVar, long j10, h3.e eVar) {
        byte[] bArr = pVar.f28589a;
        g2 g2Var = this.f27925n;
        if (g2Var == null) {
            g2 g2Var2 = new g2(bArr, 17, 1);
            this.f27925n = g2Var2;
            n nVarA = g2Var2.c(Arrays.copyOfRange(bArr, 9, pVar.f28591c), null).a();
            nVarA.f26291l = c0.n("audio/ogg");
            eVar.f20375c = new o(nVarA);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & 127) != 3) {
            if (b2 != -1) {
                return true;
            }
            m6 m6Var = this.f27926o;
            if (m6Var != null) {
                m6Var.f7788b = j10;
                eVar.f20376d = m6Var;
            }
            ((o) eVar.f20375c).getClass();
            return false;
        }
        i iVarY = q4.b.y(pVar);
        g2 g2Var3 = new g2(g2Var.f5604a, g2Var.f5605b, g2Var.f5606c, g2Var.f5607d, g2Var.f5608e, g2Var.f5610g, g2Var.f5611h, g2Var.f5612j, iVarY, (b0) g2Var.f5614l);
        this.f27925n = g2Var3;
        m6 m6Var2 = new m6();
        m6Var2.f7790d = g2Var3;
        m6Var2.f7791e = iVarY;
        m6Var2.f7788b = -1L;
        m6Var2.f7789c = -1L;
        this.f27926o = m6Var2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f27925n = null;
            this.f27926o = null;
        }
    }
}
