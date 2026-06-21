package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo f22839a;

    public Pk(wo woVar) {
        this.f22839a = woVar;
    }

    public final long a() {
        long jOptLong;
        wo woVar = this.f22839a;
        synchronized (woVar) {
            jOptLong = woVar.f24991a.a().optLong("session_id", -1L);
        }
        long j10 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f22839a.b(j10);
        return j10;
    }
}
