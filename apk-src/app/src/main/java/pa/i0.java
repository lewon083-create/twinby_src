package pa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f31380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f31381h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.f31381h = eVar;
        this.f31380g = iBinder;
    }

    @Override // pa.x
    public final boolean a() {
        IBinder iBinder = this.f31380g;
        try {
            c0.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.f31381h;
            if (!eVar.o().equals(interfaceDescriptor)) {
                String strO = eVar.o();
                Log.w("GmsClient", om1.n(new StringBuilder(strO.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strO, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceE = eVar.e(iBinder);
            if (iInterfaceE == null || !(eVar.v(2, 4, iInterfaceE) || eVar.v(3, 4, iInterfaceE))) {
                return false;
            }
            eVar.f31346u = null;
            b bVar = eVar.f31340o;
            if (bVar == null) {
                return true;
            }
            bVar.n0();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // pa.x
    public final void b(ma.b bVar) {
        c cVar = this.f31381h.f31341p;
        if (cVar != null) {
            cVar.c0(bVar);
        }
        System.currentTimeMillis();
    }
}
