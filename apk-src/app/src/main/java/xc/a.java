package xc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import d8.h0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f36055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f36056d;

    public a(h0 h0Var, IBinder iBinder) {
        this.f36056d = h0Var;
        this.f36055c = iBinder;
    }

    @Override // xc.o
    public final void b() {
        m kVar;
        c cVar = (c) this.f36056d.f15632c;
        cVar.i.getClass();
        int i = l.f36080c;
        IBinder iBinder = this.f36055c;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            kVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new k(iBinder);
        }
        cVar.f36072n = kVar;
        n nVar = cVar.f36061b;
        nVar.a("linkToDeath", new Object[0]);
        try {
            ((k) cVar.f36072n).f36079b.linkToDeath(cVar.f36069k, 0);
        } catch (RemoteException e3) {
            Object[] objArr = new Object[0];
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f36081a, "linkToDeath failed", objArr), e3);
            }
        }
        cVar.f36066g = false;
        Iterator it = cVar.f36063d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        cVar.f36063d.clear();
    }
}
