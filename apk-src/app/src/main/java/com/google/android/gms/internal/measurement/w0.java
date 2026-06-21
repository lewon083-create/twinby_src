package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14070f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f14071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f14072h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f14073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f14074k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m1 m1Var, String str, String str2, Bundle bundle, boolean z5) {
        super(m1Var, true);
        this.f14071g = str;
        this.f14072h = str2;
        this.f14074k = bundle;
        this.i = z5;
        this.f14073j = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f14070f) {
            case 0:
                j0 j0Var = this.f14073j.f13882e;
                pa.c0.i(j0Var);
                j0Var.setUserProperty(this.f14071g, this.f14072h, new xa.b(this.f14074k), this.i, this.f13834b);
                break;
            case 1:
                j0 j0Var2 = this.f14073j.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.getUserProperties(this.f14071g, this.f14072h, this.i, (g0) this.f14074k);
                break;
            default:
                long j10 = this.f13834b;
                j0 j0Var3 = this.f14073j.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.logEvent(this.f14071g, this.f14072h, (Bundle) this.f14074k, this.i, true, j10);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public void b() {
        switch (this.f14070f) {
            case 1:
                ((g0) this.f14074k).W2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m1 m1Var, String str, String str2, Object obj, boolean z5) {
        super(m1Var, true);
        this.f14071g = str;
        this.f14072h = str2;
        this.f14074k = obj;
        this.i = z5;
        Objects.requireNonNull(m1Var);
        this.f14073j = m1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(m1 m1Var, String str, String str2, boolean z5, g0 g0Var) {
        super(m1Var, true);
        this.f14071g = str;
        this.f14072h = str2;
        this.i = z5;
        this.f14074k = g0Var;
        Objects.requireNonNull(m1Var);
        this.f14073j = m1Var;
    }
}
