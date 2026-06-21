package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 extends ug implements ks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f4976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti0 f4977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(ti0 ti0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f4977c = ti0Var;
        this.f4976b = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final void a(q9.x1 x1Var) {
        ((wi0) this.f4976b.f4218c).i1(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        sr rrVar;
        ci0 ci0Var = this.f4976b;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                rrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                rrVar = iInterfaceQueryLocalInterface instanceof sr ? (sr) iInterfaceQueryLocalInterface : new rr(strongBinder);
            }
            vg.f(parcel);
            this.f4977c.f10624d = rrVar;
            ((wi0) ci0Var.f4218c).d();
        } else if (i == 2) {
            String string = parcel.readString();
            vg.f(parcel);
            ((wi0) ci0Var.f4218c).c4(0, string);
        } else {
            if (i != 3) {
                return false;
            }
            q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
            vg.f(parcel);
            a(x1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
