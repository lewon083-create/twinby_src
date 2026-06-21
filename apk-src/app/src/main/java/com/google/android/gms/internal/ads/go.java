package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class go extends ca.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(String str, int i) {
        super(str);
        this.f5883d = i;
    }

    @Override // ca.a
    public final /* synthetic */ Object a(IBinder iBinder) {
        switch (this.f5883d) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface instanceof ln ? (ln) iInterfaceQueryLocalInterface : new jn(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface2 instanceof ot ? (ot) iInterfaceQueryLocalInterface2 : new mt(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface3 instanceof q9.i1 ? (q9.i1) iInterfaceQueryLocalInterface3 : new q9.i1(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface4 instanceof q9.i0 ? (q9.i0) iInterfaceQueryLocalInterface4 : new q9.i0(iBinder);
            case 4:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return iInterfaceQueryLocalInterface5 instanceof q9.m0 ? (q9.m0) iInterfaceQueryLocalInterface5 : new q9.m0(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface6 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface6 instanceof q9.t0 ? (q9.t0) iInterfaceQueryLocalInterface6 : new q9.t0(iBinder);
        }
    }

    public q9.l0 h(Context context, q9.g3 g3Var, String str, ir irVar, int i) {
        q9.m0 m0Var;
        q9.g3 g3Var2;
        String str2;
        ir irVar2;
        int i10;
        al.a(context);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Tb)).booleanValue()) {
            try {
                xa.b bVar = new xa.b(context);
                try {
                    IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        g3Var2 = g3Var;
                        str2 = str;
                        irVar2 = irVar;
                        i10 = i;
                        m0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        m0Var = iInterfaceQueryLocalInterface instanceof q9.m0 ? (q9.m0) iInterfaceQueryLocalInterface : new q9.m0(iBinderB);
                        g3Var2 = g3Var;
                        str2 = str;
                        irVar2 = irVar;
                        i10 = i;
                    }
                    IBinder iBinderD3 = m0Var.d3(bVar, g3Var2, str2, irVar2, i10);
                    if (iBinderD3 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderD3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof q9.l0 ? (q9.l0) iInterfaceQueryLocalInterface2 : new q9.j0(iBinderD3);
                    }
                } catch (Exception e3) {
                    throw new u9.j(e3);
                }
            } catch (RemoteException e7) {
                e = e7;
                Exception exc = e;
                xt.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                u9.i.k("#007 Could not call remote method.", exc);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                Exception exc2 = e;
                xt.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                u9.i.k("#007 Could not call remote method.", exc2);
                return null;
            } catch (u9.j e11) {
                e = e11;
                Exception exc22 = e;
                xt.a(context).c("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                u9.i.k("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderD32 = ((q9.m0) b(context)).d3(new xa.b(context), g3Var, str, irVar, i);
                if (iBinderD32 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderD32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof q9.l0 ? (q9.l0) iInterfaceQueryLocalInterface3 : new q9.j0(iBinderD32);
                }
            } catch (RemoteException e12) {
                e = e12;
                u9.i.d("Could not create remote AdManager.", e);
                return null;
            } catch (xa.c e13) {
                e = e13;
                u9.i.d("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
