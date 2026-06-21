package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.kt;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends cb.a implements x0 {
    @Override // q9.x0
    public final s0 A0(xa.a aVar, ir irVar, int i) {
        s0 r0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 18);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            r0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            r0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder);
        }
        parcelP1.recycle();
        return r0Var;
    }

    @Override // q9.x0
    public final h0 B1(xa.a aVar, String str, ir irVar, int i) {
        h0 f0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeString(str);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 3);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            f0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(strongBinder);
        }
        parcelP1.recycle();
        return f0Var;
    }

    @Override // q9.x0
    public final l0 D3(xa.a aVar, g3 g3Var, String str, ir irVar, int i) {
        l0 j0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 1);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelP1.recycle();
        return j0Var;
    }

    @Override // q9.x0
    public final pw E1(xa.a aVar, ir irVar, int i) {
        pw nwVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 14);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i10 = ow.f8821b;
        if (strongBinder == null) {
            nwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            nwVar = iInterfaceQueryLocalInterface instanceof pw ? (pw) iInterfaceQueryLocalInterface : new nw(strongBinder);
        }
        parcelP1.recycle();
        return nwVar;
    }

    @Override // q9.x0
    public final l0 F2(xa.a aVar, g3 g3Var, String str, int i) {
        l0 j0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        parcelD0.writeString(str);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 10);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelP1.recycle();
        return j0Var;
    }

    @Override // q9.x0
    public final lt H(xa.a aVar) {
        lt jtVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        Parcel parcelP1 = p1(parcelD0, 8);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i = kt.f7292b;
        if (strongBinder == null) {
            jtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            jtVar = iInterfaceQueryLocalInterface instanceof lt ? (lt) iInterfaceQueryLocalInterface : new jt(strongBinder);
        }
        parcelP1.recycle();
        return jtVar;
    }

    @Override // q9.x0
    public final l0 N2(xa.a aVar, g3 g3Var, String str, ir irVar, int i) {
        l0 j0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 13);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelP1.recycle();
        return j0Var;
    }

    @Override // q9.x0
    public final u1 O0(xa.a aVar, ir irVar, int i) {
        u1 t1Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 17);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            t1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            t1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new t1(strongBinder);
        }
        parcelP1.recycle();
        return t1Var;
    }

    @Override // q9.x0
    public final et O1(xa.a aVar, ir irVar, int i) {
        et dtVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 15);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i10 = ph0.i;
        if (strongBinder == null) {
            dtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            dtVar = iInterfaceQueryLocalInterface instanceof et ? (et) iInterfaceQueryLocalInterface : new dt(strongBinder);
        }
        parcelP1.recycle();
        return dtVar;
    }

    @Override // q9.x0
    public final in W0(xa.a aVar, xa.a aVar2) {
        in gnVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, aVar2);
        Parcel parcelP1 = p1(parcelD0, 5);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i = hn.f6194b;
        if (strongBinder == null) {
            gnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            gnVar = iInterfaceQueryLocalInterface instanceof in ? (in) iInterfaceQueryLocalInterface : new gn(strongBinder);
        }
        parcelP1.recycle();
        return gnVar;
    }

    @Override // q9.x0
    public final ev m2(xa.a aVar, String str, ir irVar, int i) {
        ev cvVar;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeString(str);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 12);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i10 = dv.f4678b;
        if (strongBinder == null) {
            cvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            cvVar = iInterfaceQueryLocalInterface instanceof ev ? (ev) iInterfaceQueryLocalInterface : new cv(strongBinder);
        }
        parcelP1.recycle();
        return cvVar;
    }

    @Override // q9.x0
    public final h1 y3(xa.a aVar, int i) {
        h1 e1Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 9);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            e1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            e1Var = iInterfaceQueryLocalInterface instanceof h1 ? (h1) iInterfaceQueryLocalInterface : new e1(strongBinder);
        }
        parcelP1.recycle();
        return e1Var;
    }

    @Override // q9.x0
    public final l0 z3(xa.a aVar, g3 g3Var, String str, ir irVar, int i) {
        l0 j0Var;
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, irVar);
        parcelD0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelP1 = p1(parcelD0, 2);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelP1.recycle();
        return j0Var;
    }
}
