package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qq extends ca.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9574d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9575e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9576f = 0;

    public final pq h() {
        pq pqVar = new pq(this);
        t9.c0.m("createNewReference: Trying to acquire lock");
        synchronized (this.f9574d) {
            t9.c0.m("createNewReference: Lock acquired");
            e(new ox0(this, pqVar), new cf(this, pqVar));
            pa.c0.l(this.f9576f >= 0);
            this.f9576f++;
        }
        t9.c0.m("createNewReference: Lock released");
        return pqVar;
    }

    public final void i() {
        t9.c0.m("releaseOneReference: Trying to acquire lock");
        synchronized (this.f9574d) {
            t9.c0.m("releaseOneReference: Lock acquired");
            pa.c0.l(this.f9576f > 0);
            t9.c0.m("Releasing 1 reference for JS Engine");
            this.f9576f--;
            k();
        }
        t9.c0.m("releaseOneReference: Lock released");
    }

    public final void j() {
        t9.c0.m("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f9574d) {
            t9.c0.m("markAsDestroyable: Lock acquired");
            pa.c0.l(this.f9576f >= 0);
            t9.c0.m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f9575e = true;
            k();
        }
        t9.c0.m("markAsDestroyable: Lock released");
    }

    public final void k() {
        t9.c0.m("maybeDestroy: Trying to acquire lock");
        synchronized (this.f9574d) {
            try {
                t9.c0.m("maybeDestroy: Lock acquired");
                pa.c0.l(this.f9576f >= 0);
                if (this.f9575e && this.f9576f == 0) {
                    t9.c0.m("No reference is left (including root). Cleaning up engine.");
                    e(new fp(3), new fp(17));
                } else {
                    t9.c0.m("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t9.c0.m("maybeDestroy: Lock released");
    }
}
