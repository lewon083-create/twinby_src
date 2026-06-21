package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 implements fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk0 f7870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tp0 f7871c;

    public me0(long j10, Context context, gk0 gk0Var, n10 n10Var, String str) {
        this.f7869a = j10;
        this.f7870b = gk0Var;
        this.f7871c = (tp0) ((ls1) new ut(n10Var.f8104b, context, str).f11062d).j();
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void a(q9.d3 d3Var) {
        try {
            this.f7871c.R0(d3Var, new ke0(this));
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void j() {
        try {
            tp0 tp0Var = this.f7871c;
            tp0Var.X2(new le0(this));
            tp0Var.c1(new xa.b(null));
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.fe0
    public final void l() {
    }
}
