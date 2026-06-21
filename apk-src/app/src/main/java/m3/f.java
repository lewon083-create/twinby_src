package m3;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28562b;

    public f() {
        this(t.f28598a);
    }

    public final synchronized void a() {
        boolean z5 = false;
        while (!this.f28562b) {
            try {
                this.f28561a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z5 = true;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j10) {
        if (j10 <= 0) {
            return this.f28562b;
        }
        this.f28561a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + jElapsedRealtime;
        if (j11 < jElapsedRealtime) {
            a();
        } else {
            boolean z5 = false;
            while (!this.f28562b && jElapsedRealtime < j11) {
                try {
                    this.f28561a.getClass();
                    wait(j11 - jElapsedRealtime);
                } catch (InterruptedException unused) {
                    z5 = true;
                }
                this.f28561a.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f28562b;
    }

    public final synchronized boolean c() {
        if (this.f28562b) {
            return false;
        }
        this.f28562b = true;
        notifyAll();
        return true;
    }

    public f(t tVar) {
        this.f28561a = tVar;
    }
}
