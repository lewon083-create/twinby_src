package ob;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends pa.e {
    @Override // pa.e, na.c
    public final int b() {
        return 12451000;
    }

    @Override // pa.e
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.measurement.START";
    }
}
