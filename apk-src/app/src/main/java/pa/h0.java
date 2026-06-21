package pa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f31378c;

    public h0(e eVar, int i) {
        this.f31378c = eVar;
        this.f31377b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i10;
        e eVar = this.f31378c;
        if (iBinder == null) {
            synchronized (eVar.f31333g) {
                i = eVar.f31339n;
            }
            if (i == 3) {
                eVar.f31347v = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            f0 f0Var = eVar.f31332f;
            f0Var.sendMessage(f0Var.obtainMessage(i10, eVar.f31349x.get(), 16));
            return;
        }
        synchronized (eVar.f31334h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new y(iBinder) : (y) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar2 = this.f31378c;
        int i11 = this.f31377b;
        eVar2.getClass();
        j0 j0Var = new j0(eVar2, 0, null);
        f0 f0Var2 = eVar2.f31332f;
        f0Var2.sendMessage(f0Var2.obtainMessage(7, i11, -1, j0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f31378c;
        synchronized (eVar.f31334h) {
            eVar.i = null;
        }
        e eVar2 = this.f31378c;
        int i = this.f31377b;
        f0 f0Var = eVar2.f31332f;
        f0Var.sendMessage(f0Var.obtainMessage(6, i, 1));
    }
}
