package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f14005a;

    public u6(Unsafe unsafe) {
        this.f14005a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b2);

    public abstract boolean b(long j10, Object obj);

    public abstract void c(Object obj, long j10, boolean z5);

    public abstract float d(long j10, Object obj);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(long j10, Object obj);

    public abstract void g(Object obj, long j10, double d10);
}
