package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ao;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.tn;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.un;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wm;
import com.google.android.gms.internal.ads.wn;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.zn;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends ug implements h0 {
    public g0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        wn vnVar;
        y wVar = null;
        aq aqVar = null;
        bo aoVar = null;
        zn znVar = null;
        y0 y0Var = null;
        un tnVar = null;
        sn snVar = null;
        rn rnVar = null;
        switch (i) {
            case 1:
                e0 e0VarI = i();
                parcel2.writeNoException();
                vg.e(parcel2, e0VarI);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    wVar = iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new w(strongBinder);
                }
                vg.f(parcel);
                x3(wVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    rnVar = iInterfaceQueryLocalInterface2 instanceof rn ? (rn) iInterfaceQueryLocalInterface2 : new rn(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 1);
                }
                vg.f(parcel);
                o2(rnVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    snVar = iInterfaceQueryLocalInterface3 instanceof sn ? (sn) iInterfaceQueryLocalInterface3 : new sn(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 1);
                }
                vg.f(parcel);
                N3(snVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    vnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    vnVar = iInterfaceQueryLocalInterface4 instanceof wn ? (wn) iInterfaceQueryLocalInterface4 : new vn(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 1);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    tnVar = iInterfaceQueryLocalInterface5 instanceof un ? (un) iInterfaceQueryLocalInterface5 : new tn(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 1);
                }
                vg.f(parcel);
                R2(string, vnVar, tnVar);
                parcel2.writeNoException();
                return true;
            case 6:
                wm wmVar = (wm) vg.b(parcel, wm.CREATOR);
                vg.f(parcel);
                H2(wmVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y0Var = iInterfaceQueryLocalInterface6 instanceof y0 ? (y0) iInterfaceQueryLocalInterface6 : new y0(strongBinder6);
                }
                vg.f(parcel);
                U3(y0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    znVar = iInterfaceQueryLocalInterface7 instanceof zn ? (zn) iInterfaceQueryLocalInterface7 : new zn(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 1);
                }
                g3 g3Var = (g3) vg.b(parcel, g3.CREATOR);
                vg.f(parcel);
                f2(znVar, g3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                n9.d dVar = (n9.d) vg.b(parcel, n9.d.CREATOR);
                vg.f(parcel);
                u1(dVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    aoVar = iInterfaceQueryLocalInterface8 instanceof bo ? (bo) iInterfaceQueryLocalInterface8 : new ao(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 1);
                }
                vg.f(parcel);
                P0(aoVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                wp wpVar = (wp) vg.b(parcel, wp.CREATOR);
                vg.f(parcel);
                O3(wpVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    aqVar = iInterfaceQueryLocalInterface9 instanceof aq ? (aq) iInterfaceQueryLocalInterface9 : new aq(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 1);
                }
                vg.f(parcel);
                U0(aqVar);
                parcel2.writeNoException();
                return true;
            case 15:
                n9.a aVar = (n9.a) vg.b(parcel, n9.a.CREATOR);
                vg.f(parcel);
                I1(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
