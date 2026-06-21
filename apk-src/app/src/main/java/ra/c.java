package ra;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ma.d;
import pa.i;
import pa.p;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public final p A;

    public c(Context context, Looper looper, o oVar, p pVar, oa.p pVar2, oa.p pVar3) {
        super(context, looper, 270, oVar, pVar2, pVar3, 0);
        this.A = pVar;
    }

    @Override // pa.e, na.c
    public final int b() {
        return 203400000;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 5);
    }

    @Override // pa.e
    public final d[] h() {
        return db.b.f15736b;
    }

    @Override // pa.e
    public final Bundle k() {
        p pVar = this.A;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.f31419b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // pa.e
    public final boolean q() {
        return true;
    }
}
