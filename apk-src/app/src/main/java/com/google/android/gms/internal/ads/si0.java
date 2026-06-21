package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class si0 extends ug implements gs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f10299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ti0 f10300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, ci0 ci0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f10300c = ti0Var;
        this.f10299b = ci0Var;
    }

    @Override // com.google.android.gms.internal.ads.gs
    public final void a(q9.x1 x1Var) {
        ((wi0) this.f10299b.f4218c).i1(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        or orVar;
        ti0 ti0Var = this.f10300c;
        ci0 ci0Var = this.f10299b;
        if (i == 1) {
            xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            ti0Var.f10624d = (View) xa.b.X1(aVarL1);
            ((wi0) ci0Var.f4218c).d();
        } else if (i == 2) {
            String string = parcel.readString();
            vg.f(parcel);
            ((wi0) ci0Var.f4218c).c4(0, string);
        } else if (i == 3) {
            q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
            vg.f(parcel);
            a(x1Var);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                orVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                orVar = iInterfaceQueryLocalInterface instanceof or ? (or) iInterfaceQueryLocalInterface : new or(strongBinder);
            }
            vg.f(parcel);
            ti0Var.f10625e = orVar;
            ((wi0) ci0Var.f4218c).d();
        }
        parcel2.writeNoException();
        return true;
    }
}
