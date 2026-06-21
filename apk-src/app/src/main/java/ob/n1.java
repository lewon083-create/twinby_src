package ob;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f30312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f30313d;

    public /* synthetic */ n1(r1 r1Var, g4 g4Var, int i) {
        this.f30311b = i;
        this.f30312c = g4Var;
        this.f30313d = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f30311b) {
            case 0:
                r1 r1Var = this.f30313d;
                r1Var.f30382b.B();
                z3 z3Var = r1Var.f30382b;
                z3Var.e().C();
                z3Var.k0();
                g4 g4Var = this.f30312c;
                pa.c0.i(g4Var);
                String str = g4Var.f30131b;
                pa.c0.f(str);
                int i = 0;
                if (z3Var.d0().M(null, d0.f30055z0)) {
                    z3Var.o().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iK = z3Var.d0().K(null, d0.f30019i0);
                    z3Var.d0();
                    long jLongValue = jCurrentTimeMillis - ((Long) d0.f30008e.a(null)).longValue();
                    while (i < iK && z3Var.I(jLongValue, null)) {
                        i++;
                    }
                } else {
                    z3Var.d0();
                    long jIntValue = ((Integer) d0.f30027l.a(null)).intValue();
                    while (i < jIntValue && z3Var.I(0L, str)) {
                        i++;
                    }
                }
                if (z3Var.d0().M(null, d0.A0)) {
                    z3Var.e().C();
                    z3Var.H();
                }
                w3 w3Var = z3Var.f30613k;
                int iC = om1.c(g4Var.F);
                w3Var.C();
                if (iC == 2 && !w3.F(str)) {
                    e1 e1Var = w3Var.f30373c.f30605b;
                    z3.T(e1Var);
                    com.google.android.gms.internal.measurement.h2 h2VarO = e1Var.O(str);
                    if (h2VarO != null && h2VarO.D() && !h2VarO.E().q().isEmpty()) {
                        z3Var.b().f30418o.g(str, "[sgtm] Going background, trigger client side upload. appId");
                        z3Var.o().getClass();
                        z3Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                r1 r1Var2 = this.f30313d;
                r1Var2.f30382b.B();
                z3 z3Var2 = r1Var2.f30382b;
                z3Var2.e().C();
                z3Var2.k0();
                g4 g4Var2 = this.f30312c;
                pa.c0.f(g4Var2.f30131b);
                z3Var2.b0(g4Var2);
                break;
            case 2:
                r1 r1Var3 = this.f30313d;
                r1Var3.f30382b.B();
                z3 z3Var3 = r1Var3.f30382b;
                z3Var3.e().C();
                z3Var3.k0();
                g4 g4Var3 = this.f30312c;
                pa.c0.f(g4Var3.f30131b);
                z3Var3.l0(g4Var3);
                z3Var3.m0(g4Var3);
                break;
            default:
                z3 z3Var4 = this.f30313d.f30382b;
                z3Var4.B();
                z3Var4.l0(this.f30312c);
                break;
        }
    }
}
