package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy0 f6344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6345b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6346c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6347d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f6348e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6349f;

    public i21(int i, qy0 qy0Var) {
        this.f6349f = i;
        this.f6344a = qy0Var;
    }

    public final void a() {
        if (this.f6345b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f6346c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th2) {
        if (this.f6345b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f6348e = th2;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f6345b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f6347d = SystemClock.uptimeMillis();
        ((xy0) this.f6344a).a(null, this.f6348e, this.f6349f - 1, atomicBoolean.get() ? this.f6347d - this.f6346c : -1L);
    }
}
