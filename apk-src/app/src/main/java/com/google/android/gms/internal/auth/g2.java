package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends pa.i {
    @Override // pa.e, na.c
    public final void a(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.a(str);
    }

    @Override // pa.e, na.c
    public final int b() {
        return 17895000;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof h2 ? (h2) iInterfaceQueryLocalInterface : new h2(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService", 2);
    }

    @Override // pa.e
    public final ma.d[] h() {
        return new ma.d[]{ha.c.f20472c, ha.c.f20471b, ha.c.f20470a};
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // pa.e
    public final boolean q() {
        return true;
    }

    @Override // pa.e
    public final boolean u() {
        return true;
    }
}
