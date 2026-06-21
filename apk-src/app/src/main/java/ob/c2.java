package ob;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.m6;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f29984d;

    public c2(k2 k2Var, long j10, int i) {
        this.f29982b = i;
        switch (i) {
            case 1:
                this.f29983c = j10;
                Objects.requireNonNull(k2Var);
                this.f29984d = k2Var;
                break;
            default:
                this.f29983c = j10;
                Objects.requireNonNull(k2Var);
                this.f29984d = k2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29982b) {
            case 0:
                l1 l1Var = (l1) this.f29984d.f15951b;
                z0 z0Var = l1Var.f30264f;
                l1.h(z0Var);
                y0 y0Var = z0Var.f30586l;
                long j10 = this.f29983c;
                y0Var.g(j10);
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30417n.g(Long.valueOf(j10), "Session timeout duration set");
                break;
            default:
                k2 k2Var = this.f29984d;
                k2Var.C();
                k2Var.D();
                l1 l1Var2 = (l1) k2Var.f15951b;
                s0 s0Var2 = l1Var2.f30265g;
                l1.k(s0Var2);
                s0Var2.f30417n.f("Resetting analytics data (FE)");
                k3 k3Var = l1Var2.i;
                l1.i(k3Var);
                k3Var.C();
                m6 m6Var = k3Var.f30241g;
                ((j3) m6Var.f7790d).c();
                ((l1) ((k3) m6Var.f7791e).f15951b).f30269l.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m6Var.f7788b = jElapsedRealtime;
                m6Var.f7789c = jElapsedRealtime;
                l1Var2.q().H();
                boolean z5 = !l1Var2.a();
                z0 z0Var2 = l1Var2.f30264f;
                l1.h(z0Var2);
                z0Var2.f30582g.g(this.f29983c);
                l1 l1Var3 = (l1) z0Var2.f15951b;
                z0 z0Var3 = l1Var3.f30264f;
                l1.h(z0Var3);
                if (!TextUtils.isEmpty(z0Var3.f30597w.d())) {
                    z0Var2.f30597w.e(null);
                }
                z0Var2.f30591q.g(0L);
                z0Var2.f30592r.g(0L);
                if (!l1Var3.f30263e.P()) {
                    z0Var2.L(z5);
                }
                z0Var2.f30598x.e(null);
                z0Var2.f30599y.g(0L);
                z0Var2.f30600z.P(null);
                d3 d3VarN = l1Var2.n();
                d3VarN.C();
                d3VarN.D();
                g4 g4VarS = d3VarN.S(false);
                d3VarN.O();
                ((l1) d3VarN.f15951b).m().G();
                d3VarN.Q(new x2(d3VarN, g4VarS, 0));
                l1.i(k3Var);
                k3Var.f30240f.q();
                k2Var.f30233t = z5;
                l1Var2.n().G(new AtomicReference());
                break;
        }
    }
}
