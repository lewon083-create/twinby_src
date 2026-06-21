package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fr extends ug implements ir {
    public fr() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ir l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof ir ? (ir) iInterfaceQueryLocalInterface : new hr(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 1);
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final os D(String str) {
        return new ss((RtbAdapter) Class.forName(str, false, rs.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final boolean F(String str) {
        try {
            return w9.a.class.isAssignableFrom(Class.forName(str, false, fr.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            u9.i.h(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final boolean Q(String str) {
        try {
            return x9.a.class.isAssignableFrom(Class.forName(str, false, fr.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            u9.i.h(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            vg.f(parcel);
            kr krVarW = w(string);
            parcel2.writeNoException();
            vg.e(parcel2, krVarW);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            vg.f(parcel);
            boolean zQ = Q(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zQ ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            vg.f(parcel);
            os osVarD = D(string3);
            parcel2.writeNoException();
            vg.e(parcel2, osVarD);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        vg.f(parcel);
        boolean zF = F(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zF ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final kr w(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, fr.class.getClassLoader());
                if (w9.e.class.isAssignableFrom(cls)) {
                    return new yr((w9.e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (w9.a.class.isAssignableFrom(cls)) {
                    return new yr((w9.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                u9.i.h(sb2.toString());
                throw new RemoteException();
            } catch (Throwable th2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Could not instantiate mediation adapter: ");
                sb3.append(str);
                sb3.append(". ");
                u9.i.i(sb3.toString(), th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            u9.i.c("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new yr(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new yr(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }
}
