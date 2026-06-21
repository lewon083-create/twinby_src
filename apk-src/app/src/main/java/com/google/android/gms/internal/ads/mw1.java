package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8030b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8031c = -9223372036854775807L;

    public void a(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8029a == null) {
            this.f8029a = exc;
        }
        if (this.f8030b == -9223372036854775807L && u3.y.f34214c0.get() <= 0) {
            this.f8030b = 200 + jElapsedRealtime;
        }
        long j10 = this.f8030b;
        if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
            this.f8031c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f8029a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f8029a;
        this.f8029a = null;
        this.f8030b = -9223372036854775807L;
        this.f8031c = -9223372036854775807L;
        throw exc3;
    }

    public void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8029a == null) {
            this.f8029a = exc;
        }
        if (this.f8030b == -9223372036854775807L && nw1.X.get() <= 0) {
            this.f8030b = 200 + jElapsedRealtime;
        }
        long j10 = this.f8030b;
        if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
            this.f8031c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f8029a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f8029a;
        this.f8029a = null;
        this.f8030b = -9223372036854775807L;
        this.f8031c = -9223372036854775807L;
        throw exc3;
    }
}
