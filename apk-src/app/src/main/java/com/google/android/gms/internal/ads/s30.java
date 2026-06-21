package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s30 implements mh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f10159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ua.a f10160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f10161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10162e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10163f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public po0 f10164g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10165h = false;

    public s30(ScheduledExecutorService scheduledExecutorService, ua.a aVar) {
        this.f10159b = scheduledExecutorService;
        this.f10160c = aVar;
        p9.k.C.f31301g.v(this);
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void l0(boolean z5) {
        ScheduledFuture scheduledFuture;
        if (z5) {
            synchronized (this) {
                try {
                    if (this.f10165h) {
                        if (this.f10163f > 0 && (scheduledFuture = this.f10161d) != null && scheduledFuture.isCancelled()) {
                            this.f10161d = this.f10159b.schedule(this.f10164g, this.f10163f, TimeUnit.MILLISECONDS);
                        }
                        this.f10165h = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f10165h) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f10161d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f10163f = -1L;
                } else {
                    this.f10161d.cancel(true);
                    long j10 = this.f10162e;
                    this.f10160c.getClass();
                    this.f10163f = j10 - SystemClock.elapsedRealtime();
                }
                this.f10165h = true;
            } finally {
            }
        }
    }
}
