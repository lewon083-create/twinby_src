package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 extends gr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11286d = AtomicReferenceFieldUpdater.newUpdater(x71.class, Set.class, "i");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11287e = AtomicIntegerFieldUpdater.newUpdater(x71.class, "j");

    @Override // com.google.android.gms.internal.ads.gr
    public final int A(u71 u71Var) {
        return f11287e.decrementAndGet(u71Var);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void u(u71 u71Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f11286d;
            if (atomicReferenceFieldUpdater.compareAndSet(u71Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(u71Var) == null);
    }
}
