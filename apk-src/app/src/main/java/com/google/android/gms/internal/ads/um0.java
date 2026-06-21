package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qs1 f10988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f10989b;

    public um0(d10 d10Var, ls1 ls1Var) {
        this.f10988a = d10Var;
        this.f10989b = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tl0 j() {
        return new tl0(3, ((d10) this.f10988a).a(), (Intent) this.f10989b.j());
    }
}
