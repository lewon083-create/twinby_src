package ob;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements ServiceConnection, pa.b, pa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f29985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p0 f29986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f29987d;

    public c3(d3 d3Var) {
        this.f29987d = d3Var;
    }

    @Override // pa.c
    public final void c0(ma.b bVar) {
        d3 d3Var = this.f29987d;
        i1 i1Var = ((l1) d3Var.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.H();
        s0 s0Var = ((l1) d3Var.f15951b).f30265g;
        if (s0Var == null || !s0Var.f30419c) {
            s0Var = null;
        }
        if (s0Var != null) {
            s0Var.f30418o.g(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f29985b = false;
            this.f29986c = null;
        }
        i1 i1Var2 = ((l1) this.f29987d.f15951b).f30266h;
        l1.k(i1Var2);
        i1Var2.L(new b3(0, this, bVar));
    }

    @Override // pa.b
    public final void l0(int i) {
        l1 l1Var = (l1) this.f29987d.f15951b;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.H();
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30417n.f("Service connection suspended");
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        i1Var2.L(new ac.g(26, this));
    }

    @Override // pa.b
    public final void n0() {
        i1 i1Var = ((l1) this.f29987d.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.H();
        synchronized (this) {
            try {
                pa.c0.i(this.f29986c);
                g0 g0Var = (g0) this.f29986c.n();
                i1 i1Var2 = ((l1) this.f29987d.f15951b).f30266h;
                l1.k(i1Var2);
                i1Var2.L(new k0.i(26, this, g0Var, false));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f29986c = null;
                this.f29985b = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i1 i1Var = ((l1) this.f29987d.f15951b).f30266h;
        l1.k(i1Var);
        i1Var.H();
        synchronized (this) {
            if (iBinder == null) {
                this.f29985b = false;
                s0 s0Var = ((l1) this.f29987d.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30411g.f("Service connected with null binder");
                return;
            }
            Object e0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    e0Var = iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
                    s0 s0Var2 = ((l1) this.f29987d.f15951b).f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30418o.f("Bound to IMeasurementService interface");
                } else {
                    s0 s0Var3 = ((l1) this.f29987d.f15951b).f30265g;
                    l1.k(s0Var3);
                    s0Var3.f30411g.g(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                s0 s0Var4 = ((l1) this.f29987d.f15951b).f30265g;
                l1.k(s0Var4);
                s0Var4.f30411g.f("Service connect failed to get IMeasurementService");
            }
            if (e0Var == null) {
                this.f29985b = false;
                try {
                    ta.a aVarB = ta.a.b();
                    d3 d3Var = this.f29987d;
                    aVarB.c(((l1) d3Var.f15951b).f30260b, d3Var.f30066d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                i1 i1Var2 = ((l1) this.f29987d.f15951b).f30266h;
                l1.k(i1Var2);
                i1Var2.L(new ed.c(29, this, e0Var, false));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l1 l1Var = (l1) this.f29987d.f15951b;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.H();
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30417n.f("Service disconnected");
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        i1Var2.L(new k0.i(25, this, componentName, false));
    }
}
