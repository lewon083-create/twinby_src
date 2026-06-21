package ti;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.wh;
import java.lang.ref.WeakReference;
import q9.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends ea.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f33799e;

    public b0(c0 c0Var) {
        this.f33799e = new WeakReference(c0Var);
    }

    @Override // k9.v
    public final void d(k9.m mVar) {
        WeakReference weakReference = this.f33799e;
        if (weakReference.get() != null) {
            c0 c0Var = (c0) weakReference.get();
            c0Var.f33802b.K(c0Var.f33834a, new g(mVar));
        }
    }

    @Override // k9.v
    public final void i(Object obj) {
        wh whVar = (wh) obj;
        WeakReference weakReference = this.f33799e;
        if (weakReference.get() != null) {
            c0 c0Var = (c0) weakReference.get();
            c0Var.f33803c = whVar;
            ka.k kVar = c0Var.f33802b;
            r3.b bVar = new r3.b(12, kVar, c0Var);
            whVar.getClass();
            try {
                whVar.f11808a.m3(new w2(bVar));
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
            kVar.L(c0Var.f33834a, whVar.a());
        }
    }
}
