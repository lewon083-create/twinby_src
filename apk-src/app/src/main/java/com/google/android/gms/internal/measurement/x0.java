package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f14080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1 f14081h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(m1 m1Var, Bundle bundle, int i) {
        super(m1Var, true);
        this.f14079f = i;
        switch (i) {
            case 1:
                this.f14080g = bundle;
                Objects.requireNonNull(m1Var);
                this.f14081h = m1Var;
                super(m1Var, true);
                break;
            case 2:
                this.f14080g = bundle;
                Objects.requireNonNull(m1Var);
                this.f14081h = m1Var;
                super(m1Var, true);
                break;
            default:
                this.f14080g = bundle;
                Objects.requireNonNull(m1Var);
                this.f14081h = m1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f14079f) {
            case 0:
                j0 j0Var = this.f14081h.f13882e;
                pa.c0.i(j0Var);
                j0Var.setConditionalUserProperty(this.f14080g, this.f13834b);
                break;
            case 1:
                j0 j0Var2 = this.f14081h.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.setConsentThirdParty(this.f14080g, this.f13834b);
                break;
            default:
                j0 j0Var3 = this.f14081h.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.setDefaultEventParameters(this.f14080g);
                break;
        }
    }
}
