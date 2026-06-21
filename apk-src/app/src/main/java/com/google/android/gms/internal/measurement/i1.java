package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1 f13779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, boolean z5) {
        super(m1Var, true);
        this.f13778f = z5;
        this.f13779g = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        j0 j0Var = this.f13779g.f13882e;
        pa.c0.i(j0Var);
        j0Var.setDataCollectionEnabled(this.f13778f);
    }
}
