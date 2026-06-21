package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 extends p9.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10073z;

    public rv0(Context context, Looper looper, pa.b bVar, pa.c cVar, int i) {
        super(context, looper, 116, bVar, cVar);
        this.f10073z = i;
    }

    @Override // pa.e, na.c
    public final int b() {
        return this.f10073z;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof uv0 ? (uv0) iInterfaceQueryLocalInterface : new uv0(iBinder, "com.google.android.gms.gass.internal.IGassService", 1);
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.gass.START";
    }
}
