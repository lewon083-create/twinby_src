package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends ug implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31938c;

    public m2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f31937b = str;
        this.f31938c = str2;
    }

    public static l1 l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof l1 ? (l1) iInterfaceQueryLocalInterface : new k1(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 1);
    }

    @Override // q9.l1
    public final String c() {
        return this.f31938c;
    }

    @Override // q9.l1
    public final String i() {
        return this.f31937b;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f31937b);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f31938c);
        return true;
    }
}
