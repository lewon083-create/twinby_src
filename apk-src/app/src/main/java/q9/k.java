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
public final class k extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr f31919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f31920e;

    public k(o oVar, Context context, String str, fr frVar) {
        this.f31917b = context;
        this.f31918c = str;
        this.f31919d = frVar;
        Objects.requireNonNull(oVar);
        this.f31920e = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31917b, "native_ad");
        return new q2();
    }

    @Override // q9.q
    public final Object b() {
        i0 i0Var;
        Context context = this.f31917b;
        al.a(context);
        boolean zBooleanValue = ((Boolean) s.f31967e.f31970c.a(al.Tb)).booleanValue();
        o oVar = this.f31920e;
        fr frVar = this.f31919d;
        String str = this.f31918c;
        if (!zBooleanValue) {
            go goVar = (go) oVar.f31947b;
            try {
                xa.b bVar = new xa.b(context);
                i0 i0Var2 = (i0) goVar.b(context);
                Parcel parcelD0 = i0Var2.D0();
                vg.e(parcelD0, bVar);
                parcelD0.writeString(str);
                vg.e(parcelD0, frVar);
                parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP1 = i0Var2.p1(parcelD0, 1);
                IBinder strongBinder = parcelP1.readStrongBinder();
                parcelP1.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(strongBinder);
            } catch (RemoteException e3) {
                e = e3;
                u9.i.i("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (xa.c e7) {
                e = e7;
                u9.i.i("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            xa.b bVar2 = new xa.b(context);
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    i0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    i0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new i0(iBinderB);
                }
                Parcel parcelD02 = i0Var.D0();
                vg.e(parcelD02, bVar2);
                parcelD02.writeString(str);
                vg.e(parcelD02, frVar);
                parcelD02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP12 = i0Var.p1(parcelD02, 1);
                IBinder strongBinder2 = parcelP12.readStrongBinder();
                parcelP12.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof h0 ? (h0) iInterfaceQueryLocalInterface3 : new f0(strongBinder2);
            } catch (Exception e10) {
                throw new u9.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            yt ytVarA = xt.a(context);
            oVar.getClass();
            ytVarA.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            yt ytVarA2 = xt.a(context);
            oVar.getClass();
            ytVarA2.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (u9.j e13) {
            e = e13;
            yt ytVarA22 = xt.a(context);
            oVar.getClass();
            ytVarA22.c("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.B1(new xa.b(this.f31917b), this.f31918c, this.f31919d, ModuleDescriptor.MODULE_VERSION);
    }
}
