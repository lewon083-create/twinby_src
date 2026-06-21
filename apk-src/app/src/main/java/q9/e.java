package q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr f31826c;

    public e(o oVar, Context context, fr frVar) {
        this.f31825b = context;
        this.f31826c = frVar;
        Objects.requireNonNull(oVar);
    }

    @Override // q9.q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q9.q
    public final Object b() {
        sw qwVar;
        Context context = this.f31825b;
        xa.b bVar = new xa.b(context);
        try {
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = rw.f10074b;
                if (iBinderB == null) {
                    qwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    qwVar = iInterfaceQueryLocalInterface instanceof sw ? (sw) iInterfaceQueryLocalInterface : new qw(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 1);
                }
                return ((qw) qwVar).d3(bVar, this.f31826c);
            } catch (Exception e3) {
                throw new u9.j(e3);
            }
        } catch (RemoteException | NullPointerException | u9.j unused) {
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.E1(new xa.b(this.f31825b), this.f31826c, ModuleDescriptor.MODULE_VERSION);
    }
}
