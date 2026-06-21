package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ve2 implements p73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os2 f44008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox0 f44009b = new ox0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ys1 f44010c = new ys1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44011d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ we2 f44012e;

    public ve2(we2 we2Var, qe qeVar) {
        this.f44012e = we2Var;
        this.f44008a = os2.a(qeVar);
    }

    @Override // yads.p73
    public final void a(nx0 nx0Var) {
        this.f44008a.a(nx0Var);
    }

    @Override // yads.p73
    public final int a(l30 l30Var, int i, boolean z5) {
        return this.f44008a.b(l30Var, i, z5);
    }

    @Override // yads.p73
    public final void a(int i, lb2 lb2Var) {
        this.f44008a.b(i, lb2Var);
    }

    @Override // yads.p73
    public final void a(long j10, int i, int i10, int i11, o73 o73Var) {
        long jA;
        ys1 ys1Var;
        long jF;
        this.f44008a.a(j10, i, i10, i11, o73Var);
        while (this.f44008a.a(false)) {
            this.f44010c.b();
            if (this.f44008a.a(this.f44009b, (sa0) this.f44010c, 0, false) == -4) {
                this.f44010c.c();
                ys1Var = this.f44010c;
            } else {
                ys1Var = null;
            }
            if (ys1Var != null) {
                long j11 = ys1Var.f42866f;
                vs1 vs1VarA = this.f44012e.f44360d.a(ys1Var);
                if (vs1VarA != null) {
                    xm0 xm0Var = (xm0) vs1VarA.f44117b[0];
                    String str = xm0Var.f44762b;
                    String str2 = xm0Var.f44763c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jF = lb3.f(lb3.a(xm0Var.f44766f));
                        } catch (qb2 unused) {
                            jF = -9223372036854775807L;
                        }
                        if (jF != -9223372036854775807L) {
                            te2 te2Var = new te2(j11, jF);
                            Handler handler = this.f44012e.f44361e;
                            handler.sendMessage(handler.obtainMessage(1, te2Var));
                        }
                    }
                }
            }
        }
        os2 os2Var = this.f44008a;
        ks2 ks2Var = os2Var.f41694a;
        synchronized (os2Var) {
            int i12 = os2Var.f41711s;
            jA = i12 == 0 ? -1L : os2Var.a(i12);
        }
        ks2Var.a(jA);
    }
}
