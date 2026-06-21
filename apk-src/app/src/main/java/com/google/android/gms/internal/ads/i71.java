package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 extends ix {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6408b = AtomicReferenceFieldUpdater.newUpdater(o71.class, Thread.class, "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6409c = AtomicReferenceFieldUpdater.newUpdater(o71.class, o71.class, "b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6410d = AtomicReferenceFieldUpdater.newUpdater(p71.class, o71.class, "d");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6411e = AtomicReferenceFieldUpdater.newUpdater(p71.class, e71.class, "c");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6412f = AtomicReferenceFieldUpdater.newUpdater(p71.class, Object.class, "b");

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean P(p71 p71Var, o71 o71Var, o71 o71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f6410d;
            if (atomicReferenceFieldUpdater.compareAndSet(p71Var, o71Var, o71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p71Var) == o71Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean V(h71 h71Var, e71 e71Var, e71 e71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f6411e;
            if (atomicReferenceFieldUpdater.compareAndSet(h71Var, e71Var, e71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h71Var) == e71Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final o71 X(h71 h71Var) {
        return (o71) f6410d.getAndSet(h71Var, o71.f8627c);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final e71 d0(h71 h71Var) {
        return (e71) f6411e.getAndSet(h71Var, e71.f4867d);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean h0(p71 p71Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f6412f;
            if (atomicReferenceFieldUpdater.compareAndSet(p71Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p71Var) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void l(o71 o71Var, Thread thread) {
        f6408b.lazySet(o71Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void y(o71 o71Var, o71 o71Var2) {
        f6409c.lazySet(o71Var, o71Var2);
    }
}
