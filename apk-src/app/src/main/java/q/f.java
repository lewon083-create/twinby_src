package q;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f31541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f31542c;

    public f(a aVar) {
        this.f31542c = aVar;
        attachInterface(this, b.a.f1796t1);
        this.f31541b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.a.f1796t1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f31541b;
        a aVar = this.f31542c;
        switch (i) {
            case 2:
                int i11 = parcel.readInt();
                Bundle bundle = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new ac.a(this, i11, bundle, 4));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b3(2, this, bundle3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i12 = parcel.readInt();
                Uri uri = (Uri) a0.e.a(parcel, Uri.CREATOR);
                boolean z5 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, i12, uri, z5, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle bundleB = aVar == null ? null : aVar.b((Bundle) a0.e.a(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Bundle bundle6 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i13, i14, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                Bundle bundle8 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, i15, i16, i17, i18, i19, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) a0.e.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i10);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
