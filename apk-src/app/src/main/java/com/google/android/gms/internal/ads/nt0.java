package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ua.a f8437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f8439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8440f;

    public nt0(Object obj, ua.a aVar, double d10, int i) {
        this.f8435a = obj;
        this.f8437c = aVar;
        aVar.getClass();
        this.f8436b = System.currentTimeMillis();
        this.f8438d = ((Long) q9.s.f31967e.f31970c.a(al.W)).longValue() * 1000;
        this.f8439e = d10;
        this.f8440f = i;
    }

    public final long a() {
        long jMin = this.f8438d + Math.min(Math.max(((Long) q9.s.f31967e.f31970c.a(al.F)).longValue(), -900000L), 10000L);
        this.f8437c.getClass();
        return jMin - (System.currentTimeMillis() - this.f8436b);
    }
}
