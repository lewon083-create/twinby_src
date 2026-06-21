package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy0 f6695a;

    public j21(px0 px0Var, qy0 qy0Var) {
        this.f6695a = qy0Var;
    }

    public final i21 a(int i) {
        return new i21(i, this.f6695a);
    }

    public final void b(int i) {
        ((xy0) this.f6695a).a(null, null, i - 1, -1L);
    }

    public final void c(int i, String str) {
        ((xy0) this.f6695a).a(str, null, i - 1, -1L);
    }

    public final void d(Throwable th2, int i) {
        ((xy0) this.f6695a).a(null, th2, i - 1, -1L);
    }

    public final void e(int i, ed.d dVar) {
        i21 i21VarA = a(i);
        i21VarA.a();
        dVar.a(new l81(0, dVar, new nu0(this, i21VarA)), f81.f5272b);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
