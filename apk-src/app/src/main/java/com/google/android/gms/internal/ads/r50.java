package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f9712a;

    public r50(eq0 eq0Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.f9712a = atomicLong;
        atomicLong.set(((iq0) eq0Var.f5032a.f9149c).f6588u.get());
    }

    public final void a(long j10) {
        this.f9712a.set(j10);
    }
}
