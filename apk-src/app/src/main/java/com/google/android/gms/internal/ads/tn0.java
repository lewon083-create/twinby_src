package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10665b;

    public tn0(int i, int i10) {
        this.f10664a = i;
        this.f10665b = i10;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        int i;
        Bundle bundle = ((w50) obj).f11646a;
        int i10 = this.f10664a;
        if (i10 == -1 || (i = this.f10665b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i10);
        bundle.putInt("crashes_without_flags", i);
        q9.r rVar = q9.r.f31959g;
        if (q9.s.f31967e.f31970c.f12648j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
