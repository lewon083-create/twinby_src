package cb;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.auth.i2;
import l7.o;
import sb.g;
import vc.h;
import vc.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2259b;

    public /* synthetic */ c(int i) {
        this.f2259b = i;
    }

    public abstract boolean D0(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean E0(int i, Parcel parcel, Parcel parcel2);

    public boolean T0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f2259b;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = 0;
        int i12 = 1;
        switch (this.f2259b) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i10)) {
                    return true;
                }
                return E0(i, parcel, parcel2);
            case 1:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                i2 i2Var = (i2) this;
                if (i != 2) {
                    return false;
                }
                Status status = (Status) com.google.android.gms.internal.auth.d.a(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) com.google.android.gms.internal.auth.d.a(parcel, Bundle.CREATOR);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(o.i(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                com.google.android.gms.internal.auth.a.f(status, bundle, i2Var.f13236c);
                return true;
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i10)) {
                    return true;
                }
                return w1(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i10)) {
                    return true;
                }
                return D0(i, parcel, parcel2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i10)) {
                    return true;
                }
                return T0(i, parcel, parcel2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i10)) {
                    return true;
                }
                return p1(parcel, i);
            case 6:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                uc.f fVar = (uc.f) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i13 = vc.a.f34832a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(o.i(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                i iVar = fVar.f34451e.f34453a;
                if (iVar != null) {
                    g gVar = fVar.f34450d;
                    synchronized (iVar.f34849f) {
                        iVar.f34848e.remove(gVar);
                        break;
                    }
                    iVar.a().post(new h(i11, iVar));
                }
                fVar.f34449c.c("onGetLaunchReviewFlowInfo", new Object[0]);
                fVar.f34450d.d(new uc.c((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
            default:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                sc.e eVar = (sc.e) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i14 = xc.i.f36077a;
                Bundle bundle3 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator2.createFromParcel(parcel));
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(o.i(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                xc.c cVar = eVar.f32893e.f32897d;
                g gVar2 = eVar.f32892d;
                synchronized (cVar.f36065f) {
                    cVar.f36064e.remove(gVar2);
                    break;
                }
                cVar.a().post(new xc.b(i12, cVar));
                eVar.f32891c.a("onRequestIntegrityToken", new Object[0]);
                eVar.f32893e.f32896c.getClass();
                int i15 = bundle3.getInt("error");
                sc.a aVar = i15 == 0 ? null : new sc.a(i15, null);
                if (aVar != null) {
                    eVar.f32892d.c(aVar);
                } else {
                    String string = bundle3.getString("token");
                    if (string == null) {
                        eVar.f32892d.c(new sc.a(-100, null));
                    } else {
                        bundle3.getLong("request.token.sid");
                        String str = eVar.f32893e.f32895b;
                        om1.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("IntegrityDialogWrapper");
                        eVar.f32892d.d(new sc.i(string));
                    }
                }
                return true;
        }
    }

    public abstract boolean p1(Parcel parcel, int i);

    public abstract boolean w1(int i, Parcel parcel, Parcel parcel2);

    public c(String str, int i) {
        this.f2259b = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
