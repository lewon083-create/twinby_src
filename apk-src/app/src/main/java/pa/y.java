package pa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f31453b;

    public y(IBinder iBinder) {
        this.f31453b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31453b;
    }

    public final void c0(g0 g0Var, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(g0Var);
            parcelObtain.writeInt(1);
            l0.a(hVar, parcelObtain, 0);
            this.f31453b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
