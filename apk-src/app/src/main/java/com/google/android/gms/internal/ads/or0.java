package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements ed.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed.d f8767d;

    public or0(Object obj, String str, ed.d dVar) {
        this.f8765b = obj;
        this.f8766c = str;
        this.f8767d = dVar;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f8767d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.f8767d.cancel(z5);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8767d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8767d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8767d.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f8766c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f8767d.get(j10, timeUnit);
    }
}
