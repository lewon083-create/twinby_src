package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz1 f11536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz1 f11537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f11538c = new y1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f11539d = new AtomicReference(uy1.f11132b);

    public vy1(fz1 fz1Var) {
        this.f11536a = fz1Var;
        this.f11537b = fz1Var;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(int i, tk0 tk0Var) {
        g().a(i, tk0Var);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b(tk0 tk0Var, int i, int i10) {
        g().b(tk0Var, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c(long j10, int i, int i10, int i11, v2 v2Var) {
        g().c(j10, i, i10, i11, v2Var);
        AtomicReference atomicReference = this.f11539d;
        if (atomicReference.get() == uy1.f11133c) {
            this.f11537b.k(false);
            atomicReference.set(uy1.f11134d);
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int d(ct1 ct1Var, int i, boolean z5) {
        return g().d(ct1Var, i, z5);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(jx1 jx1Var) {
        this.f11536a.e(jx1Var);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int f(ct1 ct1Var, int i, boolean z5) {
        return g().f(ct1Var, i, z5);
    }

    public final w2 g() {
        return this.f11539d.get() == uy1.f11134d ? this.f11538c : this.f11537b;
    }
}
