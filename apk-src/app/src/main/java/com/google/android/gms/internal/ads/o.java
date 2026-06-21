package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8528b;

    public /* synthetic */ o(int i, long j10, boolean z5) {
        this.f8527a = i;
        this.f8528b = j10;
    }

    public static o b(q4.l lVar, m3.p pVar) {
        lVar.V(pVar.f28589a, 0, 8);
        pVar.M(0);
        return new o(pVar.m(), pVar.q(), false);
    }

    public static o c(a2 a2Var, tk0 tk0Var) {
        a2Var.E(tk0Var.f10641a, 0, 8);
        tk0Var.E(0);
        return new o(tk0Var.b(), tk0Var.a(), false);
    }

    public boolean a() {
        int i = this.f8527a;
        return i == 0 || i == 1;
    }

    public o(int i, long j10) {
        com.google.android.gms.internal.measurement.h5.h(j10 >= 0);
        this.f8527a = i;
        this.f8528b = j10;
    }
}
