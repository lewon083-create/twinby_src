package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 implements q70, z80, z60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd0 f11373c;

    public vf0(Context context, sd0 sd0Var) {
        this.f11372b = context;
        this.f11373c = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3194s5)).booleanValue()) {
            b(this.f11372b);
        }
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void a(aa.t tVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3209t5)).booleanValue()) {
            b(this.f11372b);
        }
    }

    public final void b(Context context) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.q5)).booleanValue()) {
            hx.f6279a.execute(new l81(28, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.u5)).booleanValue()) {
            b(this.f11372b);
        }
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void D(String str) {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
    }
}
