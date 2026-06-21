package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12368b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12367a = TimeUnit.MILLISECONDS.toNanos(((Long) q9.s.f31967e.f31970c.a(al.f2980e0)).longValue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12369c = true;

    public final void a(SurfaceTexture surfaceTexture, vx vxVar) {
        if (vxVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f12369c) {
            long j10 = timestamp - this.f12368b;
            if (Math.abs(j10) < this.f12367a) {
                return;
            }
        }
        this.f12369c = false;
        this.f12368b = timestamp;
        t9.g0.f33596l.post(new s(20, vxVar));
    }
}
