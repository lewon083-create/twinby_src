package q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.yt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr f31933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f31934d;

    public l(o oVar, Context context, fr frVar) {
        this.f31932b = context;
        this.f31933c = frVar;
        Objects.requireNonNull(oVar);
        this.f31934d = oVar;
    }

    @Override // q9.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.r(this.f31932b, "ads_preloader");
        return null;
    }

    @Override // q9.q
    public final Object b() {
        t0 t0Var;
        s0 r0Var;
        Context context = this.f31932b;
        xa.b bVar = new xa.b(context);
        al.a(context);
        boolean zBooleanValue = ((Boolean) s.f31967e.f31970c.a(al.Tb)).booleanValue();
        o oVar = this.f31934d;
        fr frVar = this.f31933c;
        if (!zBooleanValue) {
            go goVar = (go) oVar.f31951f;
            try {
                xa.b bVar2 = new xa.b(context);
                t0 t0Var2 = (t0) goVar.b(context);
                Parcel parcelD0 = t0Var2.D0();
                vg.e(parcelD0, bVar2);
                vg.e(parcelD0, frVar);
                parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP1 = t0Var2.p1(parcelD0, 1);
                IBinder strongBinder = parcelP1.readStrongBinder();
                parcelP1.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder);
            } catch (RemoteException e3) {
                e = e3;
                u9.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e7) {
                e = e7;
                u9.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (xa.c e10) {
                e = e10;
                u9.i.i("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    t0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    t0Var = iInterfaceQueryLocalInterface2 instanceof t0 ? (t0) iInterfaceQueryLocalInterface2 : new t0(iBinderB);
                }
                Parcel parcelD02 = t0Var.D0();
                vg.e(parcelD02, bVar);
                vg.e(parcelD02, frVar);
                parcelD02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP12 = t0Var.p1(parcelD02, 1);
                IBinder strongBinder2 = parcelP12.readStrongBinder();
                parcelP12.recycle();
                if (strongBinder2 == null) {
                    r0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    r0Var = iInterfaceQueryLocalInterface3 instanceof s0 ? (s0) iInterfaceQueryLocalInterface3 : new r0(strongBinder2);
                }
                r0Var.x2(frVar);
                return r0Var;
            } catch (Exception e11) {
                throw new u9.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            yt ytVarA = xt.a(context);
            oVar.getClass();
            ytVarA.c("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            yt ytVarA2 = xt.a(context);
            oVar.getClass();
            ytVarA2.c("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (u9.j e14) {
            e = e14;
            yt ytVarA22 = xt.a(context);
            oVar.getClass();
            ytVarA22.c("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.A0(new xa.b(this.f31932b), this.f31933c, ModuleDescriptor.MODULE_VERSION);
    }
}
