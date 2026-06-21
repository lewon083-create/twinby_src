package q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.go;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.xt;
import com.google.android.gms.internal.ads.yt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f31939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f31940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f31941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f31942e;

    public n(o oVar, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f31939b = nativeAdView;
        this.f31940c = frameLayout;
        this.f31941d = context;
        Objects.requireNonNull(oVar);
        this.f31942e = oVar;
    }

    @Override // q9.q
    public final Object a() {
        o.r(this.f31941d, "native_ad_view_delegate");
        return new t2();
    }

    @Override // q9.q
    public final Object b() {
        IInterface jnVar;
        Context context = this.f31941d;
        al.a(context);
        boolean zBooleanValue = ((Boolean) s.f31967e.f31970c.a(al.Tb)).booleanValue();
        o oVar = this.f31942e;
        FrameLayout frameLayout = this.f31940c;
        NativeAdView nativeAdView = this.f31939b;
        if (!zBooleanValue) {
            go goVar = (go) oVar.f31949d;
            try {
                xa.b bVar = new xa.b(context);
                xa.b bVar2 = new xa.b(nativeAdView);
                xa.b bVar3 = new xa.b(frameLayout);
                jn jnVar2 = (jn) ((ln) goVar.b(context));
                Parcel parcelD0 = jnVar2.D0();
                vg.e(parcelD0, bVar);
                vg.e(parcelD0, bVar2);
                vg.e(parcelD0, bVar3);
                parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP1 = jnVar2.p1(parcelD0, 1);
                IBinder strongBinder = parcelP1.readStrongBinder();
                parcelP1.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface instanceof in ? (in) iInterfaceQueryLocalInterface : new gn(strongBinder);
            } catch (RemoteException e3) {
                e = e3;
                u9.i.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (xa.c e7) {
                e = e7;
                u9.i.i("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            xa.b bVar4 = new xa.b(context);
            xa.b bVar5 = new xa.b(nativeAdView);
            xa.b bVar6 = new xa.b(frameLayout);
            try {
                IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = kn.f7265b;
                if (iBinderB == null) {
                    jnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    jnVar = iInterfaceQueryLocalInterface2 instanceof ln ? (ln) iInterfaceQueryLocalInterface2 : new jn(iBinderB);
                }
                jn jnVar3 = (jn) jnVar;
                Parcel parcelD02 = jnVar3.D0();
                vg.e(parcelD02, bVar4);
                vg.e(parcelD02, bVar5);
                vg.e(parcelD02, bVar6);
                parcelD02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel parcelP12 = jnVar3.p1(parcelD02, 1);
                IBinder strongBinder2 = parcelP12.readStrongBinder();
                parcelP12.recycle();
                int i10 = hn.f6194b;
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return iInterfaceQueryLocalInterface3 instanceof in ? (in) iInterfaceQueryLocalInterface3 : new gn(strongBinder2);
            } catch (Exception e10) {
                throw new u9.j(e10);
            }
        } catch (RemoteException | NullPointerException | u9.j e11) {
            yt ytVarA = xt.a(context);
            oVar.getClass();
            ytVarA.c("ClientApiBroker.createNativeAdViewDelegate", e11);
            return null;
        }
    }

    @Override // q9.q
    public final Object c(x0 x0Var) {
        return x0Var.W0(new xa.b(this.f31939b), new xa.b(this.f31940c));
    }
}
