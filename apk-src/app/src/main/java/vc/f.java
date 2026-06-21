package vc;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import xc.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34837b;

    public /* synthetic */ f(int i, Object obj) {
        this.f34836a = i;
        this.f34837b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f34836a) {
            case 0:
                i iVar = (i) this.f34837b;
                iVar.f34845b.c("reportBinderDeath", new Object[0]);
                if (iVar.i.get() != null) {
                    throw new ClassCastException();
                }
                iVar.f34845b.c("%s : Binder has died.", iVar.f34846c);
                for (e eVar : iVar.f34847d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(iVar.f34846c).concat(" : Binder has died."));
                    sb.g gVar = eVar.f34835b;
                    if (gVar != null) {
                        gVar.c(remoteException);
                    }
                }
                iVar.f34847d.clear();
                synchronized (iVar.f34849f) {
                    iVar.c();
                    break;
                }
                return;
            default:
                xc.c cVar = (xc.c) this.f34837b;
                cVar.f36061b.a("reportBinderDeath", new Object[0]);
                if (cVar.f36068j.get() != null) {
                    throw new ClassCastException();
                }
                cVar.f36061b.a("%s : Binder has died.", cVar.f36062c);
                Iterator it = cVar.f36063d.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(new RemoteException(String.valueOf(cVar.f36062c).concat(" : Binder has died.")));
                }
                cVar.f36063d.clear();
                synchronized (cVar.f36065f) {
                    cVar.c();
                    break;
                }
                return;
        }
    }
}
