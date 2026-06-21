package bb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2023b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2024c;

    public g(sb.g gVar) {
        this.f2024c = gVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f2023b;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        l6.b bVar = null;
        l6.b bVar2 = null;
        int i11 = 0;
        switch (this.f2023b) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i12 = a.f2014a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                ga.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : ga.c.CREATOR.createFromParcel(parcel);
                a.a.o(statusCreateFromParcel, cVarCreateFromParcel != null ? new ga.b(cVarCreateFromParcel.f20061b, cVarCreateFromParcel.f20062c) : null, (sb.g) this.f2024c);
                return true;
            default:
                if (i == 1) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l6.b)) {
                            bVar2 = new l6.b();
                            bVar2.f27946b = strongBinder;
                        } else {
                            bVar2 = (l6.b) iInterfaceQueryLocalInterface;
                        }
                    }
                    String string = parcel.readString();
                    if (string != null) {
                        synchronized (((MultiInstanceInvalidationService) this.f2024c).f1740d) {
                            try {
                                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f2024c;
                                int i13 = multiInstanceInvalidationService.f1738b + 1;
                                multiInstanceInvalidationService.f1738b = i13;
                                if (multiInstanceInvalidationService.f1740d.register(bVar2, Integer.valueOf(i13))) {
                                    ((MultiInstanceInvalidationService) this.f2024c).f1739c.put(Integer.valueOf(i13), string);
                                    i11 = i13;
                                } else {
                                    ((MultiInstanceInvalidationService) this.f2024c).f1738b--;
                                }
                            } finally {
                            }
                        }
                        break;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i11);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof l6.b)) {
                            bVar = new l6.b();
                            bVar.f27946b = strongBinder2;
                        } else {
                            bVar = (l6.b) iInterfaceQueryLocalInterface2;
                        }
                    }
                    int i14 = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.f2024c).f1740d) {
                        ((MultiInstanceInvalidationService) this.f2024c).f1740d.unregister(bVar);
                        ((MultiInstanceInvalidationService) this.f2024c).f1739c.remove(Integer.valueOf(i14));
                        break;
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i10);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int i15 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                synchronized (((MultiInstanceInvalidationService) this.f2024c).f1740d) {
                    try {
                        String str = (String) ((MultiInstanceInvalidationService) this.f2024c).f1739c.get(Integer.valueOf(i15));
                        if (str == null) {
                            Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = ((MultiInstanceInvalidationService) this.f2024c).f1740d.beginBroadcast();
                        while (i11 < iBeginBroadcast) {
                            try {
                                Integer num = (Integer) ((MultiInstanceInvalidationService) this.f2024c).f1740d.getBroadcastCookie(i11);
                                int iIntValue = num.intValue();
                                String str2 = (String) ((MultiInstanceInvalidationService) this.f2024c).f1739c.get(num);
                                if (i15 != iIntValue && str.equals(str2)) {
                                    try {
                                        ((l6.b) ((MultiInstanceInvalidationService) this.f2024c).f1740d.getBroadcastItem(i11)).c0(strArrCreateStringArray);
                                    } catch (RemoteException e3) {
                                        Log.w("ROOM", "Error invoking a remote callback", e3);
                                    }
                                }
                                i11++;
                            } finally {
                                ((MultiInstanceInvalidationService) this.f2024c).f1740d.finishBroadcast();
                            }
                        }
                        return true;
                    } finally {
                    }
                }
        }
    }

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2024c = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
