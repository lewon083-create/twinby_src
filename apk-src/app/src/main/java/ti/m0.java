package ti;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.nv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import q9.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends ea.b implements ea.a, k9.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f33854e;

    public m0(o0 o0Var) {
        this.f33854e = new WeakReference(o0Var);
    }

    @Override // k9.p
    public final void b(cf cfVar) {
        bv bvVar = (bv) cfVar.f4193c;
        WeakReference weakReference = this.f33854e;
        if (weakReference.get() != null) {
            o0 o0Var = (o0) weakReference.get();
            ka.k kVar = o0Var.f33861b;
            int i = o0Var.f33834a;
            int iC = 0;
            if (bvVar != null) {
                try {
                    iC = bvVar.c();
                } catch (RemoteException e3) {
                    u9.i.i("Could not forward getAmount to RewardItem", e3);
                }
            }
            Integer numValueOf = Integer.valueOf(iC);
            String strI = null;
            if (bvVar != null) {
                try {
                    strI = bvVar.i();
                } catch (RemoteException e7) {
                    u9.i.i("Could not forward getType to RewardItem", e7);
                }
            }
            kVar.N(i, new n0(numValueOf, strI));
        }
    }

    @Override // k9.v
    public final void d(k9.m mVar) {
        WeakReference weakReference = this.f33854e;
        if (weakReference.get() != null) {
            o0 o0Var = (o0) weakReference.get();
            o0Var.f33861b.K(o0Var.f33834a, new g(mVar));
        }
    }

    @Override // ea.a
    public final void g() {
        WeakReference weakReference = this.f33854e;
        if (weakReference.get() != null) {
            o0 o0Var = (o0) weakReference.get();
            ka.k kVar = o0Var.f33861b;
            int i = o0Var.f33834a;
            kVar.getClass();
            HashMap map = new HashMap();
            map.put("adId", Integer.valueOf(i));
            map.put("eventName", "onAdMetadataChanged");
            kVar.I(map);
        }
    }

    @Override // k9.v
    public final void i(Object obj) {
        nv nvVar = (nv) obj;
        WeakReference weakReference = this.f33854e;
        if (weakReference.get() != null) {
            o0 o0Var = (o0) weakReference.get();
            o0Var.f33866g = nvVar;
            ka.k kVar = o0Var.f33861b;
            r3.b bVar = new r3.b(12, kVar, o0Var);
            nvVar.getClass();
            try {
                ev evVar = nvVar.f8458b;
                if (evVar != null) {
                    evVar.c2(new w2(bVar));
                }
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
            kVar.L(o0Var.f33834a, nvVar.a());
        }
    }
}
