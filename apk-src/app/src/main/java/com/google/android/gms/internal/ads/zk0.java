package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk0 implements l60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uk0 f13015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aq f13016c;

    public /* synthetic */ zk0(uk0 uk0Var, aq aqVar) {
        this.f13015b = uk0Var;
        this.f13016c = aqVar;
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        this.f13015b.K(x1Var);
        aq aqVar = this.f13016c;
        if (aqVar != null) {
            try {
                Parcel parcelD0 = aqVar.D0();
                vg.c(parcelD0, x1Var);
                aqVar.L1(parcelD0, 3);
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
        if (aqVar != null) {
            try {
                int i = x1Var.f31976b;
                Parcel parcelD02 = aqVar.D0();
                parcelD02.writeInt(i);
                aqVar.L1(parcelD02, 2);
            } catch (RemoteException e7) {
                u9.i.k("#007 Could not call remote method.", e7);
            }
        }
    }
}
