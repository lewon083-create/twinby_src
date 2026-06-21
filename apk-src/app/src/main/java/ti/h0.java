package ti;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.cq;
import java.lang.ref.WeakReference;
import q9.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends ea.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f33826e;

    public h0(i0 i0Var) {
        this.f33826e = new WeakReference(i0Var);
    }

    @Override // k9.v
    public final void d(k9.m mVar) {
        WeakReference weakReference = this.f33826e;
        if (weakReference.get() != null) {
            i0 i0Var = (i0) weakReference.get();
            i0Var.f33832b.K(i0Var.f33834a, new g(mVar));
        }
    }

    @Override // k9.v
    public final void i(Object obj) {
        v9.a aVar = (v9.a) obj;
        WeakReference weakReference = this.f33826e;
        if (weakReference.get() != null) {
            i0 i0Var = (i0) weakReference.get();
            cq cqVar = (cq) aVar;
            i0Var.f33833c = cqVar;
            ka.k kVar = i0Var.f33832b;
            r3.b bVar = new r3.b(12, kVar, i0Var);
            cqVar.getClass();
            try {
                q9.l0 l0Var = cqVar.f4290c;
                if (l0Var != null) {
                    l0Var.B2(new w2(bVar));
                }
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
            kVar.L(i0Var.f33834a, aVar.a());
        }
    }
}
