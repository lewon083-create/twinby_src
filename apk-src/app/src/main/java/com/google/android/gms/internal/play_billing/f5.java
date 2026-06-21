package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 extends d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f14189g;

    public f5(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f14185c = atomicReferenceFieldUpdater;
        this.f14186d = atomicReferenceFieldUpdater2;
        this.f14187e = atomicReferenceFieldUpdater3;
        this.f14188f = atomicReferenceFieldUpdater4;
        this.f14189g = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean B(t5 t5Var, s5 s5Var, s5 s5Var2) {
        return d3.m(this.f14187e, t5Var, s5Var, s5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void j(s5 s5Var, s5 s5Var2) {
        this.f14186d.lazySet(s5Var, s5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void s(s5 s5Var, Thread thread) {
        this.f14185c.lazySet(s5Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean u(t5 t5Var, h4 h4Var, h4 h4Var2) {
        return d3.m(this.f14188f, t5Var, h4Var, h4Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean w(t5 t5Var, Object obj, Object obj2) {
        return d3.m(this.f14189g, t5Var, obj, obj2);
    }
}
