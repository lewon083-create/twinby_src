package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hl extends q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il f6173a;

    public hl(il ilVar) {
        this.f6173a = ilVar;
    }

    @Override // q.a
    public final void e(int i, Bundle bundle) {
        il ilVar = this.f6173a;
        ilVar.getClass();
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3150p5)).booleanValue() || ilVar.f6528e == null) {
            return;
        }
        hx.f6279a.execute(new pf(ilVar, i, 1));
    }
}
