package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.xt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f31798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr f31799c;

    public d(o oVar, OutOfContextTestingActivity outOfContextTestingActivity, fr frVar) {
        this.f31798b = outOfContextTestingActivity;
        this.f31799c = frVar;
        Objects.requireNonNull(oVar);
    }

    @Override // q9.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.r(this.f31798b, "out_of_context_tester");
        return null;
    }

    @Override // q9.q
    public final Object b() {
        v1 v1Var;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f31798b;
        xa.b bVar = new xa.b(outOfContextTestingActivity);
        al.a(outOfContextTestingActivity);
        if (((Boolean) s.f31967e.f31970c.a(al.Ea)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = u9.i.b(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        v1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        v1Var = iInterfaceQueryLocalInterface instanceof v1 ? (v1) iInterfaceQueryLocalInterface : new v1(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 1);
                    }
                    return v1Var.d3(bVar, this.f31799c);
                } catch (Exception e3) {
                    throw new u9.j(e3);
                }
            } catch (RemoteException e7) {
                e = e7;
                xt.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                xt.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (u9.j e11) {
                e = e11;
                xt.a(outOfContextTestingActivity).c("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f31798b;
        xa.b bVar = new xa.b(outOfContextTestingActivity);
        al.a(outOfContextTestingActivity);
        if (((Boolean) s.f31967e.f31970c.a(al.Ea)).booleanValue()) {
            return x0Var.O0(bVar, this.f31799c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
