package j9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c, IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f26579b;

    public a(IBinder iBinder) {
        this.f26579b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26579b;
    }

    public final Bundle c0(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = t8.a.f33537a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain = Parcel.obtain();
        try {
            this.f26579b.transact(1, parcelObtain, parcelObtain, 0);
            parcelObtain.readException();
            parcelObtain.recycle();
            return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
        } catch (RuntimeException e3) {
            throw e3;
        } finally {
            parcelObtain.recycle();
        }
    }
}
