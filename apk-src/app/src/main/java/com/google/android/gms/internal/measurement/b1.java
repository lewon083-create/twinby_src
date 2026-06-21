package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1 f13668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(m1 m1Var) {
        super(m1Var, true);
        Objects.requireNonNull(m1Var);
        this.f13668f = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        j0 j0Var = this.f13668f.f13882e;
        pa.c0.i(j0Var);
        j0Var.resetAnalyticsData(this.f13834b);
    }
}
