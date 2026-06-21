package q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.gt;
import com.google.android.gms.internal.ads.ht;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr f31841c;

    public f(o oVar, Context context, fr frVar) {
        this.f31840b = context;
        this.f31841c = frVar;
    }

    @Override // q9.q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q9.q
    public final Object b() {
        IInterface ftVar;
        Context context = this.f31840b;
        xa.b bVar = new xa.b(context);
        try {
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = gt.f5901b;
                if (iBinderB == null) {
                    ftVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    ftVar = iInterfaceQueryLocalInterface instanceof ht ? (ht) iInterfaceQueryLocalInterface : new ft(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 1);
                }
                return ((ft) ftVar).d3(bVar, this.f31841c);
            } catch (Exception e3) {
                throw new u9.j(e3);
            }
        } catch (RemoteException | NullPointerException | u9.j unused) {
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.O1(new xa.b(this.f31840b), this.f31841c, ModuleDescriptor.MODULE_VERSION);
    }
}
