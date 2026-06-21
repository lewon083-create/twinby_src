package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g50 implements d80, z60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua.a f5655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h50 f5656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq0 f5657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5658e;

    public g50(ua.a aVar, h50 h50Var, iq0 iq0Var, String str) {
        this.f5655b = aVar;
        this.f5656c = h50Var;
        this.f5657d = iq0Var;
        this.f5658e = str;
    }

    @Override // com.google.android.gms.internal.ads.d80
    public final void a() {
        this.f5655b.getClass();
        this.f5656c.f6029c.put(this.f5658e, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        this.f5655b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f5657d.f6575g;
        h50 h50Var = this.f5656c;
        ConcurrentHashMap concurrentHashMap = h50Var.f6029c;
        String str2 = this.f5658e;
        Long l10 = (Long) concurrentHashMap.get(str2);
        if (l10 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        h50Var.f6030d.put(str, Long.valueOf(jElapsedRealtime - l10.longValue()));
    }
}
