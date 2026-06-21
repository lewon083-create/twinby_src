package gb;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends pa.i {
    public final h1.i A;
    public final h1.i B;
    public final h1.i C;

    public h(Context context, Looper looper, q9.o oVar, oa.p pVar, oa.p pVar2) {
        super(context, looper, 23, oVar, pVar, pVar2, 0);
        this.A = new h1.i(0);
        this.B = new h1.i(0);
        this.C = new h1.i(0);
    }

    @Override // pa.e, na.c
    public final int b() {
        return 11717000;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new w(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 7);
    }

    @Override // pa.e
    public final ma.d[] h() {
        return kb.l.f27352a;
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // pa.e
    public final void t() {
        System.currentTimeMillis();
        synchronized (this.A) {
            this.A.clear();
        }
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
    }

    @Override // pa.e
    public final boolean u() {
        return true;
    }
}
