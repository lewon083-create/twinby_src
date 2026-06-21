package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import na.e;
import pa.k;
import pa.o;
import pa.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d f2536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f2537d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Duration f2538e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra.b f2539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f2540b = new AtomicLong(-1);

    public d(Context context) {
        this.f2539a = new ra.b(context, null, ra.b.f32275m, new p("ads_identifier:api"), e.f29187c);
    }

    public final synchronized void a(int i, int i10, long j10, long j11) {
        AtomicLong atomicLong = this.f2540b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.f2540b.get() == -1 || jElapsedRealtime - this.f2540b.get() > f2538e.toMillis()) {
            ra.b bVar = this.f2539a;
            if (bVar != null) {
                bVar.f(new o(0, Arrays.asList(new k(35401, i, 0, j10, j11, null, null, 0, i10)))).k(new c(this, jElapsedRealtime, 0));
            }
        }
    }
}
