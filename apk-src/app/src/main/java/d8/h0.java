package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.u4;
import java.util.Objects;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15632c;

    public /* synthetic */ h0(int i, Object obj) {
        this.f15631b = i;
        this.f15632c = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.h fVar;
        switch (this.f15631b) {
            case 0:
                o1.f("BillingClientTesting", "Billing Override Service connected.");
                i0 i0Var = (i0) this.f15632c;
                int i = com.google.android.gms.internal.play_billing.g.f14190c;
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    fVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.h ? (com.google.android.gms.internal.play_billing.h) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 4);
                }
                i0Var.H = fVar;
                ((i0) this.f15632c).G = 2;
                i0 i0Var2 = (i0) this.f15632c;
                u4 u4VarD = l0.d(26);
                Objects.requireNonNull(u4VarD, "ApiSuccess should not be null");
                i0Var2.f15600g.Y(u4VarD);
                break;
            case 1:
                if (iBinder instanceof e8.b) {
                    e8.c cVar = (e8.c) this.f15632c;
                    GeolocatorLocationService geolocatorLocationService = ((e8.b) iBinder).f16279b;
                    cVar.f16283e = geolocatorLocationService;
                    geolocatorLocationService.f2489g = cVar.f16281c;
                    geolocatorLocationService.f2486d++;
                    Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f2486d);
                    h3 h3Var = cVar.f16285g;
                    if (h3Var != null) {
                        h3Var.f28254f = geolocatorLocationService;
                    }
                }
                break;
            case 2:
                vc.i iVar = (vc.i) this.f15632c;
                iVar.f34845b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                iVar.a().post(new uc.e(this, iBinder));
                break;
            default:
                xc.c cVar2 = (xc.c) this.f15632c;
                cVar2.f36061b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar2.a().post(new xc.a(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f15631b) {
            case 0:
                o1.g("BillingClientTesting", "Billing Override Service disconnected.");
                ((i0) this.f15632c).H = null;
                ((i0) this.f15632c).G = 0;
                break;
            case 1:
                e8.c cVar = (e8.c) this.f15632c;
                GeolocatorLocationService geolocatorLocationService = cVar.f16283e;
                if (geolocatorLocationService != null) {
                    geolocatorLocationService.f2488f = null;
                    cVar.f16283e = null;
                }
                break;
            case 2:
                vc.i iVar = (vc.i) this.f15632c;
                iVar.f34845b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                iVar.a().post(new vc.h(1, this));
                break;
            default:
                xc.c cVar2 = (xc.c) this.f15632c;
                cVar2.f36061b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar2.a().post(new xc.b(0, this));
                break;
        }
    }
}
