package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends ug implements ms {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f10950b;

    public uj0(ni0 ni0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
        this.f10950b = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.ms
    public final void a(q9.x1 x1Var) {
        ((wi0) this.f10950b.f4218c).i1(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        ci0 ci0Var = this.f10950b;
        if (i == 2) {
            ((wi0) ci0Var.f4218c).d();
        } else if (i == 3) {
            String string = parcel.readString();
            vg.f(parcel);
            ((wi0) ci0Var.f4218c).c4(0, string);
        } else {
            if (i != 4) {
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
