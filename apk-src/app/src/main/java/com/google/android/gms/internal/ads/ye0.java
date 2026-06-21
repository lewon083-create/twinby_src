package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 extends ug implements tp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f12605b = i;
        this.f12606c = obj;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void k3(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f12605b) {
            case 0:
                ((bf0) this.f12606c).b(list);
                return;
            default:
                q9.k2 k2Var = (q9.k2) this.f12606c;
                synchronized (k2Var.f31925d) {
                    k2Var.f31927f = false;
                    k2Var.f31928g = true;
                    arrayList = new ArrayList(k2Var.f31926e);
                    k2Var.f31926e.clear();
                    break;
                }
                gk0 gk0VarA = q9.k2.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((ti.u0) arrayList.get(i)).a(gk0VarA);
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(pp.CREATOR);
        vg.f(parcel);
        k3(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
