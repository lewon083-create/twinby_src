package jb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import pa.c0;
import tb.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Binder implements h, IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.g f26594c;

    public b(int i, sb.g gVar) {
        this.f26593b = i;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.f26594c = gVar;
    }

    @Override // jb.h
    public void G0(int i, boolean z5) {
        switch (this.f26593b) {
            case 0:
                a.a.o(new Status(i, null, null, null), Boolean.valueOf(z5), this.f26594c);
                break;
        }
    }

    @Override // jb.h
    public void P3(Status status, boolean z5) {
        switch (this.f26593b) {
            case 0:
                a.a.o(status, Boolean.valueOf(z5), this.f26594c);
                break;
        }
    }

    @Override // jb.h
    public void b2(Status status, j jVar) {
        switch (this.f26593b) {
            case 1:
                int i = tb.c.f33675c;
                boolean zC = status.c();
                sb.g gVar = this.f26594c;
                if (!zC) {
                    gVar.a(c0.n(status));
                } else {
                    gVar.b(jVar);
                }
                break;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        boolean zOnTransact;
        boolean z5;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i10);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        switch (i) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int i11 = parcel.readInt();
                int i12 = c.f26595a;
                z5 = parcel.readInt() != 0;
                G0(i11, z5);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i13 = c.f26595a;
                parcel.readInt();
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                z5 = parcel.readInt() != 0;
                P3(status, z5);
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                j jVar = (j) c.a(parcel, j.CREATOR);
                b2(status2, jVar);
                return true;
            case 15:
                return true;
            case 16:
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void c0(int i, boolean z5) {
    }

    public final void l0(Status status, j jVar) {
    }

    public final void n0(Status status, boolean z5) {
    }
}
