package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 implements zt1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pc f11903e;

    public final void a(long j10) {
        this.f11901c = j10;
        if (this.f11900b) {
            this.f11902d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final void b(pc pcVar) {
        if (this.f11900b) {
            a(k());
        }
        this.f11903e = pcVar;
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final pc d() {
        return this.f11903e;
    }

    @Override // com.google.android.gms.internal.ads.zt1
    public final long k() {
        long j10 = this.f11901c;
        if (!this.f11900b) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11902d;
        pc pcVar = this.f11903e;
        return (pcVar.f9010a == 1.0f ? cq0.s(jElapsedRealtime) : jElapsedRealtime * ((long) pcVar.f9012c)) + j10;
    }
}
