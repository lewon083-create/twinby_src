package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y90 extends ug implements cn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja0 f12551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xa.a f12552c;

    public y90(ja0 ja0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f12551b = ja0Var;
    }

    public static float l4(xa.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) xa.b.X1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.cn
    public final xa.a k() {
        xa.a aVar = this.f12552c;
        if (aVar != null) {
            return aVar;
        }
        en enVarB = this.f12551b.b();
        if (enVarB == null) {
            return null;
        }
        return enVarB.j();
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        float f10;
        j0 j0VarM0;
        int i10;
        int i11;
        int i12;
        yn ynVar;
        sz szVar;
        switch (i) {
            case 2:
                ja0 ja0Var = this.f12551b;
                synchronized (ja0Var) {
                    f10 = ja0Var.f6788x;
                }
                if (f10 != 0.0f) {
                    synchronized (ja0Var) {
                        fP = ja0Var.f6788x;
                    }
                } else if (ja0Var.r() != null) {
                    try {
                        fP = ja0Var.r().p();
                    } catch (RemoteException e3) {
                        u9.i.f("Remote exception getting video controller aspect ratio.", e3);
                    }
                    break;
                } else {
                    xa.a aVar = this.f12552c;
                    if (aVar != null) {
                        fP = l4(aVar);
                    } else if (!((Boolean) q9.s.f31967e.f31970c.a(al.Cd)).booleanValue() || ja0Var.i() == null || (j0VarM0 = ja0Var.i().m0()) == null || (i10 = j0VarM0.f6668c) < 0 || (i11 = j0VarM0.f6667b) <= 0) {
                        en enVarB = ja0Var.b();
                        if (enVarB != null) {
                            float fI = (enVarB.i() == -1 || enVarB.c() == -1) ? 0.0f : enVarB.i() / enVarB.c();
                            fP = fI == 0.0f ? l4(enVarB.j()) : fI;
                        }
                    } else {
                        fP = i10 / i11;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(fP);
                return true;
            case 3:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                this.f12552c = aVarL1;
                parcel2.writeNoException();
                return true;
            case 4:
                xa.a aVarK = k();
                parcel2.writeNoException();
                vg.e(parcel2, aVarK);
                return true;
            case 5:
                ja0 ja0Var2 = this.f12551b;
                fP = ja0Var2.r() != null ? ja0Var2.r().d() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fP);
                return true;
            case 6:
                ja0 ja0Var3 = this.f12551b;
                fP = ja0Var3.r() != null ? ja0Var3.r().n() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(fP);
                return true;
            case 7:
                q9.b2 b2VarR = this.f12551b.r();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarR);
                return true;
            case 8:
                i12 = this.f12551b.r() != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(i12);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ynVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    ynVar = iInterfaceQueryLocalInterface instanceof yn ? (yn) iInterfaceQueryLocalInterface : new yn(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 1);
                }
                vg.f(parcel);
                ja0 ja0Var4 = this.f12551b;
                if (ja0Var4.r() instanceof i00) {
                    i00 i00Var = (i00) ja0Var4.r();
                    synchronized (i00Var.f6319c) {
                        i00Var.f6330o = ynVar;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                ja0 ja0Var5 = this.f12551b;
                synchronized (ja0Var5) {
                    szVar = ja0Var5.f6774j;
                }
                i12 = szVar != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeInt(i12);
                return true;
            default:
                return false;
        }
    }
}
