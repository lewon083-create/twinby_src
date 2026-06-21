package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.e0 f13128a;

    public zv(t9.e0 e0Var) {
        this.f13128a = e0Var;
    }

    public final void a(int i, long j10) {
        long j11;
        wk wkVar = al.R0;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            return;
        }
        t9.e0 e0Var = this.f13128a;
        e0Var.i();
        synchronized (e0Var.f33564a) {
            j11 = e0Var.D;
        }
        if (j10 - j11 < 0) {
            t9.c0.m("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) sVar.f31970c.a(al.S0)).booleanValue()) {
            e0Var.c(i);
            e0Var.d(j10);
        } else {
            e0Var.c(-1);
            e0Var.d(j10);
        }
    }
}
