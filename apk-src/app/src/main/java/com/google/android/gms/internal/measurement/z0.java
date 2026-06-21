package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f14111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1 f14112h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(m1 m1Var, String str, int i) {
        super(m1Var, true);
        this.f14110f = i;
        this.f14111g = str;
        this.f14112h = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f14110f) {
            case 0:
                j0 j0Var = this.f14112h.f13882e;
                pa.c0.i(j0Var);
                j0Var.setUserId(this.f14111g, this.f13834b);
                break;
            case 1:
                j0 j0Var2 = this.f14112h.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.beginAdUnitExposure(this.f14111g, this.f13835c);
                break;
            default:
                j0 j0Var3 = this.f14112h.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.endAdUnitExposure(this.f14111g, this.f13835c);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(m1 m1Var, String str) {
        super(m1Var, true);
        this.f14110f = 0;
        this.f14111g = str;
        Objects.requireNonNull(m1Var);
        this.f14112h = m1Var;
    }
}
