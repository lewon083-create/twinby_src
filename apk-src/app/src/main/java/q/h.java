package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f31545b;

    public abstract void a(g gVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        if (this.f31545b == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = b.c.f1798b;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.d.f1799u1);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.d)) {
                b.b bVar = new b.b();
                bVar.f1797b = iBinder;
                dVar = bVar;
            } else {
                dVar = (b.d) iInterfaceQueryLocalInterface;
            }
        }
        a(new g(dVar, componentName));
    }
}
