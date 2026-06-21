package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 extends ug implements nn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa0 f2840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja0 f2841d;

    public ac0(String str, fa0 fa0Var, ja0 ja0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f2839b = str;
        this.f2840c = fa0Var;
        this.f2841d = ja0Var;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        en enVar;
        double d10;
        String strP;
        String strP2;
        xa.a aVar;
        fa0 fa0Var = this.f2840c;
        ja0 ja0Var = this.f2841d;
        switch (i) {
            case 2:
                xa.b bVar = new xa.b(fa0Var);
                parcel2.writeNoException();
                vg.e(parcel2, bVar);
                return true;
            case 3:
                String strA = ja0Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                synchronized (ja0Var) {
                    list = ja0Var.f6770e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = ja0Var.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                synchronized (ja0Var) {
                    enVar = ja0Var.f6783s;
                }
                parcel2.writeNoException();
                vg.e(parcel2, enVar);
                return true;
            case 7:
                String strE = ja0Var.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                synchronized (ja0Var) {
                    d10 = ja0Var.f6782r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case 9:
                synchronized (ja0Var) {
                    strP = ja0Var.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                synchronized (ja0Var) {
                    strP2 = ja0Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                Bundle bundleD = ja0Var.d();
                parcel2.writeNoException();
                vg.d(parcel2, bundleD);
                return true;
            case 12:
                fa0Var.n();
                parcel2.writeNoException();
                return true;
            case 13:
                q9.b2 b2VarR = ja0Var.r();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarR);
                return true;
            case 14:
                Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                synchronized (fa0Var) {
                    fa0Var.f5281n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                boolean zO = fa0Var.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                synchronized (fa0Var) {
                    fa0Var.f5281n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                zm zmVarS = ja0Var.s();
                parcel2.writeNoException();
                vg.e(parcel2, zmVarS);
                return true;
            case 18:
                synchronized (ja0Var) {
                    aVar = ja0Var.f6781q;
                }
                parcel2.writeNoException();
                vg.e(parcel2, aVar);
                return true;
            case 19:
                String str = this.f2839b;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
