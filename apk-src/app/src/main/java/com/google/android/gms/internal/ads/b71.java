package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h71 f3661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.d f3662c;

    public b71(h71 h71Var, ed.d dVar) {
        this.f3661b = h71Var;
        this.f3662c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3661b.f8952b != this) {
            return;
        }
        ed.d dVar = this.f3662c;
        if (p71.f8951h.h0(this.f3661b, this, h71.i(dVar))) {
            h71.p(this.f3661b, false);
        }
    }
}
