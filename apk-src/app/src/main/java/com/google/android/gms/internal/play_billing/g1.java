package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14195g;

    public g1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f14191c = atomicReferenceFieldUpdater;
        this.f14192d = atomicReferenceFieldUpdater2;
        this.f14193e = atomicReferenceFieldUpdater3;
        this.f14194f = atomicReferenceFieldUpdater4;
        this.f14195g = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(n1 n1Var, f1 f1Var, f1 f1Var2) {
        return d3.l(this.f14194f, n1Var, f1Var, f1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(n1 n1Var, Object obj, Object obj2) {
        return d3.l(this.f14195g, n1Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(n1 n1Var, m1 m1Var, m1 m1Var2) {
        return d3.l(this.f14193e, n1Var, m1Var, m1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final f1 e(n1 n1Var) {
        return (f1) this.f14194f.getAndSet(n1Var, f1.f14178d);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final m1 p(n1 n1Var) {
        return (m1) this.f14193e.getAndSet(n1Var, m1.f14241c);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(m1 m1Var, m1 m1Var2) {
        this.f14192d.lazySet(m1Var, m1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(m1 m1Var, Thread thread) {
        this.f14191c.lazySet(m1Var, thread);
    }
}
