package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f7749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f7751d = new e2();

    public m3(g2 g2Var, int i) {
        this.f7749b = g2Var;
        this.f7750c = i;
    }

    public final long a(a2 a2Var) {
        e2 e2Var;
        g2 g2Var;
        int iK;
        while (true) {
            long jP = a2Var.p();
            long jR = a2Var.r() - 6;
            e2Var = this.f7751d;
            g2Var = this.f7749b;
            if (jP >= jR) {
                break;
            }
            long jP2 = a2Var.p();
            tk0 tk0Var = new tk0(17);
            int i = 0;
            a2Var.E(tk0Var.f10641a, 0, 2);
            char cR = tk0Var.r(0, ByteOrder.BIG_ENDIAN);
            int i10 = this.f7750c;
            if (cR != i10) {
                a2Var.e();
                a2Var.v((int) (jP2 - a2Var.q()));
            } else {
                byte[] bArr = tk0Var.f10641a;
                while (i < 15 && (iK = a2Var.K(bArr, 2 + i, 15 - i)) != -1) {
                    i += iK;
                }
                tk0Var.C(i + 2);
                a2Var.e();
                a2Var.v((int) (jP2 - a2Var.q()));
                if (nz.i(tk0Var, g2Var, i10, e2Var)) {
                    break;
                }
            }
            a2Var.v(1);
        }
        if (a2Var.p() < a2Var.r() - 6) {
            return e2Var.f4793b;
        }
        a2Var.v((int) (a2Var.r() - a2Var.p()));
        return g2Var.f5612j;
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final r1 c(a2 a2Var, long j10) {
        long jQ = a2Var.q();
        long jA = a(a2Var);
        long jP = a2Var.p();
        a2Var.v(Math.max(6, this.f7749b.f5606c));
        long jA2 = a(a2Var);
        return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? new r1(-2, jA2, a2Var.p()) : new r1(-1, jA, jQ) : new r1(0, -9223372036854775807L, jP);
    }
}
