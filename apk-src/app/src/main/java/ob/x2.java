package ob;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f30513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f30514d;

    public /* synthetic */ x2(d3 d3Var, g4 g4Var, int i) {
        this.f30512b = i;
        this.f30513c = g4Var;
        this.f30514d = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30512b) {
            case 0:
                d3 d3Var = this.f30514d;
                g0 g0Var = d3Var.f30067e;
                l1 l1Var = (l1) d3Var.f15951b;
                if (g0Var != null) {
                    try {
                        g0Var.Q0(this.f30513c);
                    } catch (RemoteException e3) {
                        s0 s0Var = l1Var.f30265g;
                        l1.k(s0Var);
                        s0Var.f30411g.g(e3, "Failed to reset data on the service: remote exception");
                    }
                    d3Var.P();
                } else {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30411g.f("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                d3 d3Var2 = this.f30514d;
                g0 g0Var2 = d3Var2.f30067e;
                l1 l1Var2 = (l1) d3Var2.f15951b;
                if (g0Var2 == null) {
                    s0 s0Var3 = l1Var2.f30265g;
                    l1.k(s0Var3);
                    s0Var3.f30413j.f("Failed to send app backgrounded");
                } else {
                    try {
                        g0Var2.J0(this.f30513c);
                        d3Var2.P();
                    } catch (RemoteException e7) {
                        s0 s0Var4 = l1Var2.f30265g;
                        l1.k(s0Var4);
                        s0Var4.f30411g.g(e7, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                d3 d3Var3 = this.f30514d;
                g0 g0Var3 = d3Var3.f30067e;
                l1 l1Var3 = (l1) d3Var3.f15951b;
                if (g0Var3 == null) {
                    s0 s0Var5 = l1Var3.f30265g;
                    l1.k(s0Var5);
                    s0Var5.f30411g.f("Failed to send measurementEnabled to service");
                } else {
                    try {
                        g0Var3.J3(this.f30513c);
                        d3Var3.P();
                    } catch (RemoteException e10) {
                        s0 s0Var6 = l1Var3.f30265g;
                        l1.k(s0Var6);
                        s0Var6.f30411g.g(e10, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
