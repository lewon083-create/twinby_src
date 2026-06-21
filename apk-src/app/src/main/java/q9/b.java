package q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.iv;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr f31790d;

    public b(o oVar, Context context, String str, fr frVar) {
        this.f31788b = context;
        this.f31789c = str;
        this.f31790d = frVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31788b, "rewarded");
        return new u2();
    }

    @Override // q9.q
    public final Object b() {
        iv ivVar;
        String str = this.f31789c;
        fr frVar = this.f31790d;
        Context context = this.f31788b;
        xa.b bVar = new xa.b(context);
        try {
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    ivVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    ivVar = iInterfaceQueryLocalInterface instanceof iv ? (iv) iInterfaceQueryLocalInterface : new iv(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 1);
                }
                IBinder iBinderD3 = ivVar.d3(bVar, str, frVar);
                if (iBinderD3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderD3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof ev ? (ev) iInterfaceQueryLocalInterface2 : new cv(iBinderD3);
            } catch (Exception e3) {
                throw new u9.j(e3);
            }
        } catch (RemoteException e7) {
            e = e7;
            u9.i.k("#007 Could not call remote method.", e);
            return null;
        } catch (u9.j e10) {
            e = e10;
            u9.i.k("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.m2(new xa.b(this.f31788b), this.f31789c, this.f31790d, ModuleDescriptor.MODULE_VERSION);
    }
}
