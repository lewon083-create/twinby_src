package cb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import oa.p;
import pa.i;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public final ia.b A;

    public e(Context context, Looper looper, o oVar, ia.b bVar, p pVar, p pVar2) {
        super(context, looper, 68, oVar, pVar, pVar2, 0);
        bVar = bVar == null ? ia.b.f21225d : bVar;
        h3.e eVar = new h3.e(12);
        eVar.f20375c = Boolean.FALSE;
        ia.b bVar2 = ia.b.f21225d;
        bVar.getClass();
        eVar.f20375c = Boolean.valueOf(bVar.f21226b);
        eVar.f20376d = bVar.f21227c;
        byte[] bArr = new byte[16];
        b.f2258a.nextBytes(bArr);
        eVar.f20376d = Base64.encodeToString(bArr, 11);
        this.A = new ia.b(eVar);
    }

    @Override // pa.e, na.c
    public final int b() {
        return 12800000;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // pa.e
    public final Bundle k() {
        ia.b bVar = this.A;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f21226b);
        bundle.putString("log_session_id", bVar.f21227c);
        return bundle;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
