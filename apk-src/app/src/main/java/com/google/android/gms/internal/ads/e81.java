package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 extends u71 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d81 f4874q;

    @Override // com.google.android.gms.internal.ads.h71
    public final void l() {
        d81 d81Var = this.f4874q;
        if (d81Var != null) {
            d81Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void s(int i) {
        this.f10865m = null;
        if (i == 1) {
            this.f4874q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void y() {
        d81 d81Var = this.f4874q;
        if (d81Var != null) {
            try {
                d81Var.f4495d.execute(d81Var);
            } catch (RejectedExecutionException e3) {
                d81Var.f4496e.f(e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void x(int i, Object obj) {
    }
}
