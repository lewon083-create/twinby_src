package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j81 extends i81 {
    public final ed.d i;

    public j81(ed.d dVar) {
        dVar.getClass();
        this.i = dVar;
    }

    @Override // com.google.android.gms.internal.ads.h71, ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.i.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.h71, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.i.cancel(z5);
    }

    @Override // com.google.android.gms.internal.ads.h71, java.util.concurrent.Future
    public final Object get() {
        return this.i.get();
    }

    @Override // com.google.android.gms.internal.ads.h71, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.h71, java.util.concurrent.Future
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.h71
    public final String toString() {
        return this.i.toString();
    }

    @Override // com.google.android.gms.internal.ads.h71, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.i.get(j10, timeUnit);
    }
}
