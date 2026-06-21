package bb;

import android.os.IBinder;
import android.os.IInterface;
import pa.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    @Override // pa.e, na.c
    public final int b() {
        return 212800000;
    }

    @Override // pa.e
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // pa.e
    public final ma.d[] h() {
        return ga.d.f20064b;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // pa.e
    public final boolean q() {
        return true;
    }
}
