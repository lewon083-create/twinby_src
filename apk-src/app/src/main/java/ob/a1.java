package ob;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f29932c;

    public a1(b1 b1Var, String str) {
        Objects.requireNonNull(b1Var);
        this.f29932c = b1Var;
        this.f29931b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b1 b1Var = this.f29932c;
        if (iBinder == null) {
            s0 s0Var = b1Var.f29954b.f30265g;
            l1.k(s0Var);
            s0Var.f30413j.f("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = com.google.android.gms.internal.measurement.a0.f13645b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.b0 zVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.b0 ? (com.google.android.gms.internal.measurement.b0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.z(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 3);
            l1 l1Var = b1Var.f29954b;
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30418o.f("Install Referrer Service connected");
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.L(new k0.i(this, zVar, this));
        } catch (RuntimeException e3) {
            s0 s0Var3 = b1Var.f29954b.f30265g;
            l1.k(s0Var3);
            s0Var3.f30413j.g(e3, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s0 s0Var = this.f29932c.f29954b.f30265g;
        l1.k(s0Var);
        s0Var.f30418o.f("Install Referrer Service disconnected");
    }
}
