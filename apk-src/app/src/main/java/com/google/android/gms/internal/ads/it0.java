package com.google.android.gms.internal.ads;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6604b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ua.a f6608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6609g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6606d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6607e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Random f6610h = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6605c = 0;

    public it0(long j10, long j11, ua.a aVar) {
        this.f6603a = j10;
        this.f6604b = j11;
        this.f6608f = aVar;
        a();
    }

    public final void a() {
        this.f6609g = this.f6603a;
        this.f6605c = 0L;
        this.f6607e = 0L;
    }

    public final long b() {
        double d10 = this.f6609g;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.f6610h.nextDouble() * ((j10 - r0) + 1)));
    }

    public final void c() {
        long jB = b();
        this.f6608f.getClass();
        this.f6607e = System.currentTimeMillis() + jB;
        double d10 = this.f6609g;
        this.f6609g = Math.min((long) (d10 + d10), this.f6604b);
        this.f6605c++;
    }

    public final boolean d() {
        wk wkVar = al.J;
        q9.s sVar = q9.s.f31967e;
        return ((Integer) sVar.f31970c.a(wkVar)).intValue() >= 0 && this.f6605c > Math.max(this.f6606d, (long) ((Integer) sVar.f31970c.a(wkVar)).intValue()) && this.f6609g >= this.f6604b;
    }
}
