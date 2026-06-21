package qb;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import na.g;
import na.h;
import pa.i;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements na.c {
    public final boolean A;
    public final o B;
    public final Bundle C;
    public final Integer D;

    public a(Context context, Looper looper, o oVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, oVar, gVar, hVar, 0);
        this.A = true;
        this.B = oVar;
        this.C = bundle;
        this.D = (Integer) oVar.f31951f;
    }

    @Override // pa.e, na.c
    public final int b() {
        return 12451000;
    }

    @Override // pa.e, na.c
    public final boolean c() {
        return this.A;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 5);
    }

    @Override // pa.e
    public final Bundle k() {
        o oVar = this.B;
        boolean zEquals = this.f31329c.getPackageName().equals((String) oVar.f31948c);
        Bundle bundle = this.C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oVar.f31948c);
        }
        return bundle;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.signin.service.START";
    }
}
