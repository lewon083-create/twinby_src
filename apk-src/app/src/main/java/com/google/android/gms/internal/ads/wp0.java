package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua.a f11868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd0 f11869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11870c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f11872e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f11871d = 0;

    public wp0(ua.a aVar, sd0 sd0Var) {
        this.f11868a = aVar;
        this.f11869b = sd0Var;
    }

    public final void a(boolean z5) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3143oe)).booleanValue()) {
            zd1 zd1VarA = this.f11869b.a();
            zd1VarA.v("action", "mbs_state");
            zd1VarA.v("mbs_state", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            zd1VarA.w();
        }
        if (z5) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        this.f11868a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f11870c) {
            try {
                if (this.f11872e == 3) {
                    if (this.f11871d + ((Long) q9.s.f31967e.f31970c.a(al.K6)).longValue() <= jCurrentTimeMillis) {
                        this.f11872e = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(int i, int i10) {
        b();
        Object obj = this.f11870c;
        this.f11868a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f11872e != i) {
                    return;
                }
                this.f11872e = i10;
                if (this.f11872e == 3) {
                    this.f11871d = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
