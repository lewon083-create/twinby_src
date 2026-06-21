package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0482sb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0507tb f24736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482sb(C0507tb c0507tb, String str) {
        super(str);
        this.f24736a = c0507tb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f24736a.f24764a) {
            C0507tb.a(this.f24736a);
            this.f24736a.f24768e = true;
            this.f24736a.f24764a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f24736a.f24765b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f24736a.f24765b);
                this.f24736a.f24765b.clear();
            }
            if (map.size() > 0) {
                C0507tb.a(this.f24736a, map);
                map.clear();
            }
        }
    }
}
