package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final id1 f6470b = new id1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6471a = new AtomicReference(new vd1(new ut(24)));

    public final synchronized void a(sd1 sd1Var) {
        AtomicReference atomicReference = this.f6471a;
        ut utVar = new ut((vd1) atomicReference.get());
        utVar.j(sd1Var);
        atomicReference.set(new vd1(utVar));
    }

    public final synchronized void b(xd1 xd1Var) {
        AtomicReference atomicReference = this.f6471a;
        ut utVar = new ut((vd1) atomicReference.get());
        utVar.o(xd1Var);
        atomicReference.set(new vd1(utVar));
    }
}
