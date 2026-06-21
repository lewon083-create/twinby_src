package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pq extends ca.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9151d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qq f9152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9153f;

    public pq(qq qqVar) {
        this.f9152e = qqVar;
    }

    public final void h() {
        t9.c0.m("release: Trying to acquire lock");
        synchronized (this.f9151d) {
            try {
                t9.c0.m("release: Lock acquired");
                if (this.f9153f) {
                    t9.c0.m("release: Lock already released");
                    return;
                }
                this.f9153f = true;
                e(new fp(2), new fp(17));
                e(new gk0(this), new kx0(this));
                t9.c0.m("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
