package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f30554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f30555d;

    public y2(d3 d3Var, g4 g4Var, int i) {
        this.f30553b = i;
        switch (i) {
            case 1:
                this.f30554c = g4Var;
                Objects.requireNonNull(d3Var);
                this.f30555d = d3Var;
                break;
            default:
                this.f30554c = g4Var;
                this.f30555d = d3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f30553b) {
            case 0:
                d3 d3Var = this.f30555d;
                g0 g0Var = d3Var.f30067e;
                l1 l1Var = (l1) d3Var.f15951b;
                if (g0Var == null) {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30411g.f("Discarding data. Failed to send app launch");
                } else {
                    try {
                        g4 g4Var = this.f30554c;
                        g gVar = l1Var.f30263e;
                        c0 c0Var = d0.f30001b1;
                        if (gVar.M(null, c0Var)) {
                            d3Var.U(g0Var, null, g4Var);
                        }
                        g0Var.Q2(g4Var);
                        l1Var.m().H();
                        l1Var.f30263e.M(null, c0Var);
                        d3Var.U(g0Var, null, g4Var);
                        d3Var.P();
                    } catch (RemoteException e3) {
                        s0 s0Var2 = l1Var.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.g(e3, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                d3 d3Var2 = this.f30555d;
                g0 g0Var2 = d3Var2.f30067e;
                l1 l1Var2 = (l1) d3Var2.f15951b;
                if (g0Var2 == null) {
                    s0 s0Var3 = l1Var2.f30265g;
                    l1.k(s0Var3);
                    s0Var3.f30411g.f("Failed to send consent settings to service");
                } else {
                    try {
                        g0Var2.K1(this.f30554c);
                        d3Var2.P();
                    } catch (RemoteException e7) {
                        s0 s0Var4 = l1Var2.f30265g;
                        l1.k(s0Var4);
                        s0Var4.f30411g.g(e7, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
