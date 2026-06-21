package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.ot;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.yt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f31794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f31795c;

    public c(o oVar, AdActivity adActivity) {
        this.f31794b = adActivity;
        Objects.requireNonNull(oVar);
        this.f31795c = oVar;
    }

    @Override // q9.q
    public final /* bridge */ /* synthetic */ Object a() {
        o.r(this.f31794b, "ad_overlay");
        return null;
    }

    @Override // q9.q
    public final Object b() {
        ot mtVar;
        AdActivity adActivity = this.f31794b;
        al.a(adActivity);
        boolean zBooleanValue = ((Boolean) s.f31967e.f31970c.a(al.Tb)).booleanValue();
        o oVar = this.f31795c;
        if (!zBooleanValue) {
            go goVar = (go) oVar.f31950e;
            try {
                xa.b bVar = new xa.b(adActivity);
                mt mtVar2 = (mt) ((ot) goVar.b(adActivity));
                Parcel parcelD0 = mtVar2.D0();
                vg.e(parcelD0, bVar);
                Parcel parcelP1 = mtVar2.p1(parcelD0, 1);
                IBinder strongBinder = parcelP1.readStrongBinder();
                parcelP1.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface instanceof lt ? (lt) iInterfaceQueryLocalInterface : new jt(strongBinder);
            } catch (RemoteException e3) {
                u9.i.i("Could not create remote AdOverlay.", e3);
                return null;
            } catch (xa.c e7) {
                u9.i.i("Could not create remote AdOverlay.", e7);
                return null;
            }
        }
        try {
            xa.b bVar2 = new xa.b(adActivity);
            try {
                IBinder iBinderB = u9.i.b(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = nt.f8434b;
                if (iBinderB == null) {
                    mtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    mtVar = iInterfaceQueryLocalInterface2 instanceof ot ? (ot) iInterfaceQueryLocalInterface2 : new mt(iBinderB);
                }
                mt mtVar3 = (mt) mtVar;
                Parcel parcelD02 = mtVar3.D0();
                vg.e(parcelD02, bVar2);
                Parcel parcelP12 = mtVar3.p1(parcelD02, 1);
                IBinder strongBinder2 = parcelP12.readStrongBinder();
                parcelP12.recycle();
                int i10 = kt.f7292b;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return iInterfaceQueryLocalInterface3 instanceof lt ? (lt) iInterfaceQueryLocalInterface3 : new jt(strongBinder2);
            } catch (Exception e10) {
                throw new u9.j(e10);
            }
        } catch (RemoteException | NullPointerException | u9.j e11) {
            yt ytVarA = xt.a(adActivity.getApplicationContext());
            oVar.getClass();
            ytVarA.c("ClientApiBroker.createAdOverlay", e11);
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.H(new xa.b(this.f31794b));
    }
}
