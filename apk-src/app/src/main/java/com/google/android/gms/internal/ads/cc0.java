package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends ug implements on {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa0 f4159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja0 f4160d;

    public cc0(String str, fa0 fa0Var, ja0 ja0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f4158b = str;
        this.f4159c = fa0Var;
        this.f4160d = ja0Var;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        en enVar;
        xa.a aVar;
        switch (i) {
            case 2:
                xa.b bVar = new xa.b(this.f4159c);
                parcel2.writeNoException();
                vg.e(parcel2, bVar);
                return true;
            case 3:
                String strA = this.f4160d.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 4:
                ja0 ja0Var = this.f4160d;
                synchronized (ja0Var) {
                    list = ja0Var.f6770e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strC = this.f4160d.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 6:
                ja0 ja0Var2 = this.f4160d;
                synchronized (ja0Var2) {
                    enVar = ja0Var2.f6784t;
                }
                parcel2.writeNoException();
                vg.e(parcel2, enVar);
                return true;
            case 7:
                String strE = this.f4160d.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 8:
                String strF = this.f4160d.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 9:
                Bundle bundleD = this.f4160d.d();
                parcel2.writeNoException();
                vg.d(parcel2, bundleD);
                return true;
            case 10:
                this.f4159c.n();
                parcel2.writeNoException();
                return true;
            case 11:
                q9.b2 b2VarR = this.f4160d.r();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarR);
                return true;
            case 12:
                Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                fa0 fa0Var = this.f4159c;
                synchronized (fa0Var) {
                    fa0Var.f5281n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                boolean zO = this.f4159c.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                fa0 fa0Var2 = this.f4159c;
                synchronized (fa0Var2) {
                    fa0Var2.f5281n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                zm zmVarS = this.f4160d.s();
                parcel2.writeNoException();
                vg.e(parcel2, zmVarS);
                return true;
            case 16:
                ja0 ja0Var3 = this.f4160d;
                synchronized (ja0Var3) {
                    aVar = ja0Var3.f6781q;
                }
                parcel2.writeNoException();
                vg.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f4158b;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
