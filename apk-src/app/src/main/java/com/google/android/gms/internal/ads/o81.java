package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o81 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p81 f8638b;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f8638b.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
