package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class op implements pa.c, k81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jx f8751b;

    public op(qb0 qb0Var, jx jxVar) {
        this.f8751b = jxVar;
        Objects.requireNonNull(qb0Var);
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
        this.f8751b.d(new RuntimeException("Connection failed."));
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        sz szVar = (sz) obj;
        jx jxVar = this.f8751b;
        if (szVar == null) {
            jxVar.d(new rj0(1, "Missing webview from video view future."));
            return;
        }
        szVar.u0("/video", new ko(7, new ox0(20, jxVar)));
        szVar.t0();
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        u9.i.e("Failed to load media data due to video view load failure.");
        this.f8751b.d(th2);
    }

    public op(ma.k kVar, jx jxVar) {
        this.f8751b = jxVar;
    }
}
