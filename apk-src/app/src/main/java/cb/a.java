package cb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f2256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2257d;

    public /* synthetic */ a(IBinder iBinder, String str, int i) {
        this.f2255b = i;
        this.f2256c = iBinder;
        this.f2257d = str;
    }

    public void A2(Parcel parcel, int i) {
        try {
            this.f2256c.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel D0() {
        switch (this.f2255b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f2257d);
                return parcelObtain;
            case 3:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f2257d);
                return parcelObtain2;
            case 6:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f2257d);
                return parcelObtain3;
            default:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f2257d);
                return parcelObtain4;
        }
    }

    public Parcel E0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2256c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void L1(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2256c.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void T0(Parcel parcel, int i) {
        Parcel parcelObtain;
        switch (this.f2255b) {
            case 2:
                parcelObtain = Parcel.obtain();
                try {
                    this.f2256c.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 3:
                parcelObtain = Parcel.obtain();
                try {
                    this.f2256c.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                parcelObtain = Parcel.obtain();
                try {
                    this.f2256c.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void X1(Parcel parcel, int i) {
        try {
            this.f2256c.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f2255b) {
        }
        return this.f2256c;
    }

    public void c0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f2256c.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel e2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2257d);
        return parcelObtain;
    }

    public Parcel i2(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2256c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel l0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2256c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel n0(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2256c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel p1(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2256c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void w1(Parcel parcel) {
        try {
            this.f2256c.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
