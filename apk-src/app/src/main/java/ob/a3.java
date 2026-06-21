package ob;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f29936c;

    public /* synthetic */ a3(d3 d3Var, int i) {
        this.f29935b = i;
        this.f29936c = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29935b) {
            case 0:
                this.f29936c.I();
                break;
            case 1:
                d3 d3Var = this.f29936c;
                l1 l1Var = (l1) d3Var.f15951b;
                g0 g0Var = d3Var.f30067e;
                if (g0Var == null) {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30411g.f("Failed to send Dma consent settings to service");
                } else {
                    try {
                        g0Var.L3(d3Var.S(false));
                        d3Var.P();
                    } catch (RemoteException e3) {
                        s0 s0Var2 = l1Var.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.g(e3, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                d3 d3Var2 = this.f29936c;
                l1 l1Var2 = (l1) d3Var2.f15951b;
                g0 g0Var2 = d3Var2.f30067e;
                if (g0Var2 == null) {
                    s0 s0Var3 = l1Var2.f30265g;
                    l1.k(s0Var3);
                    s0Var3.f30411g.f("Failed to send storage consent settings to service");
                } else {
                    try {
                        g0Var2.n3(d3Var2.S(false));
                        d3Var2.P();
                    } catch (RemoteException e7) {
                        s0 s0Var4 = l1Var2.f30265g;
                        l1.k(s0Var4);
                        s0Var4.f30411g.g(e7, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
