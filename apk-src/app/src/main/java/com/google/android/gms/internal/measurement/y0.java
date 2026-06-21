package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14091f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f14092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f14093h;
    public final /* synthetic */ m1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14094j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(m1 m1Var, v0 v0Var, String str, String str2) {
        super(m1Var, true);
        this.f14094j = v0Var;
        this.f14092g = str;
        this.f14093h = str2;
        Objects.requireNonNull(m1Var);
        this.i = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f14091f) {
            case 0:
                j0 j0Var = this.i.f13882e;
                pa.c0.i(j0Var);
                j0Var.clearConditionalUserProperty(this.f14092g, this.f14093h, (Bundle) this.f14094j);
                break;
            case 1:
                j0 j0Var2 = this.i.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.getConditionalUserProperties(this.f14092g, this.f14093h, (g0) this.f14094j);
                break;
            default:
                j0 j0Var3 = this.i.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.setCurrentScreenByScionActivityInfo((v0) this.f14094j, this.f14092g, this.f14093h, this.f13834b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public void b() {
        switch (this.f14091f) {
            case 1:
                ((g0) this.f14094j).W2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(m1 m1Var, String str, String str2, Bundle bundle) {
        super(m1Var, true);
        this.f14092g = str;
        this.f14093h = str2;
        this.f14094j = bundle;
        Objects.requireNonNull(m1Var);
        this.i = m1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(m1 m1Var, String str, String str2, g0 g0Var) {
        super(m1Var, true);
        this.f14092g = str;
        this.f14093h = str2;
        this.f14094j = g0Var;
        Objects.requireNonNull(m1Var);
        this.i = m1Var;
    }
}
