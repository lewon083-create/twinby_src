package oa;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.i f29906b;

    public z(int i, ka.i iVar) {
        super(i);
        this.f29906b = iVar;
    }

    @Override // oa.c0
    public final void a(Status status) {
        try {
            this.f29906b.K(status);
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // oa.c0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f29906b.K(new Status(10, t.z.g(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e3) {
            Log.w("ApiCallRunner", "Exception reporting failure", e3);
        }
    }

    @Override // oa.c0
    public final void c(l6.i iVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) iVar.f27978c;
        ka.i iVar2 = this.f29906b;
        map.put(iVar2, boolValueOf);
        iVar2.C(new f0(iVar, iVar2));
    }

    @Override // oa.c0
    public final void d(p pVar) throws DeadObjectException {
        try {
            ka.i iVar = this.f29906b;
            na.c cVar = pVar.f29871c;
            iVar.getClass();
            try {
                iVar.J(cVar);
            } catch (DeadObjectException e3) {
                iVar.K(new Status(8, e3.getLocalizedMessage(), null, null));
                throw e3;
            } catch (RemoteException e7) {
                iVar.K(new Status(8, e7.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e10) {
            b(e10);
        }
    }
}
