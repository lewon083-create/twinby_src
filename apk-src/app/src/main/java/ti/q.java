package ti;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.jh;
import java.lang.ref.WeakReference;
import q9.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends k9.v implements l9.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f33874e;

    public q(r rVar) {
        this.f33874e = new WeakReference(rVar);
    }

    @Override // k9.v
    public final void d(k9.m mVar) {
        WeakReference weakReference = this.f33874e;
        if (weakReference.get() != null) {
            r rVar = (r) weakReference.get();
            rVar.f33881b.K(rVar.f33834a, new g(mVar));
        }
    }

    @Override // l9.d
    public final void h(String str, String str2) {
        WeakReference weakReference = this.f33874e;
        if (weakReference.get() != null) {
            r rVar = (r) weakReference.get();
            rVar.f33881b.M(rVar.f33834a, str, str2);
        }
    }

    @Override // k9.v
    public final void i(Object obj) {
        cq cqVar = (cq) obj;
        WeakReference weakReference = this.f33874e;
        if (weakReference.get() != null) {
            r rVar = (r) weakReference.get();
            ka.k kVar = rVar.f33881b;
            rVar.f33882c = cqVar;
            q qVar = new q(rVar);
            cqVar.getClass();
            q9.l0 l0Var = cqVar.f4290c;
            if (l0Var != null) {
                try {
                    l0Var.v1(new jh(qVar));
                } catch (RemoteException e3) {
                    u9.i.k("#007 Could not call remote method.", e3);
                }
            }
            r3.b bVar = new r3.b(12, kVar, rVar);
            if (l0Var != null) {
                try {
                    l0Var.B2(new w2(bVar));
                } catch (RemoteException e7) {
                    u9.i.k("#007 Could not call remote method.", e7);
                }
            }
            kVar.L(rVar.f33834a, cqVar.a());
        }
    }
}
