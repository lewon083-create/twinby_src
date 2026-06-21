package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13646f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1 f13647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(m1 m1Var, Boolean bool) {
        super(m1Var, true);
        this.f13648h = bool;
        Objects.requireNonNull(m1Var);
        this.f13647g = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f13646f) {
            case 0:
                j0 j0Var = this.f13647g.f13882e;
                pa.c0.i(j0Var);
                j0Var.setMeasurementEnabled(((Boolean) this.f13648h).booleanValue(), this.f13834b);
                break;
            default:
                j0 j0Var2 = this.f13647g.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.retrieveAndUploadBatches(new e1(this, (ob.b3) this.f13648h));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(m1 m1Var, ob.b3 b3Var) {
        super(m1Var, true);
        this.f13648h = b3Var;
        this.f13647g = m1Var;
    }
}
