package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v30 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ls1 f11222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f11223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f11224c;

    public v30(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f11222a = ls1Var;
        this.f11223b = ls1Var2;
        this.f11224c = ls1Var3;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n70 j() {
        return new n70((ScheduledExecutorService) this.f11222a.j(), (ua.a) this.f11223b.j(), (sd0) this.f11224c.j());
    }
}
