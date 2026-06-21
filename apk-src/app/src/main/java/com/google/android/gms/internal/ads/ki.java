package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ki extends p9.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f7233z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki(Context context, Looper looper, int i, pa.b bVar, pa.c cVar) {
        super(context, looper, i, bVar, cVar);
        this.f7233z = 1;
    }

    @Override // pa.e, na.c
    public int b() {
        switch (this.f7233z) {
            case 2:
                return 250934000;
            default:
                return super.b();
        }
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        switch (this.f7233z) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof mi ? (mi) iInterfaceQueryLocalInterface : new mi(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 1);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof kp ? (kp) iInterfaceQueryLocalInterface2 : new kp(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 1);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof eu ? (eu) iInterfaceQueryLocalInterface3 : new du(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 1);
        }
    }

    @Override // pa.e
    public ma.d[] h() {
        switch (this.f7233z) {
            case 0:
                return k9.v.f27294d;
            default:
                return super.h();
        }
    }

    @Override // pa.e
    public final String o() {
        switch (this.f7233z) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // pa.e
    public final String p() {
        switch (this.f7233z) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    public boolean x() {
        ma.d[] dVarArrI = i();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue()) {
            int length = dVarArrI != null ? dVarArrI.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!pa.c0.m(dVarArrI[i], k9.v.f27293c)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ki(Context context, Looper looper, pa.b bVar, pa.c cVar, int i) {
        this.f7233z = i;
        switch (i) {
            case 2:
                int i10 = su.f10391a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, bVar, cVar);
                break;
            default:
                int i11 = su.f10391a;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, bVar, cVar);
                break;
        }
    }
}
