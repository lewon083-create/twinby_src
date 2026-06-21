package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final js1 f11973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j21 f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11975c;

    public x11(js1 js1Var, j21 j21Var, long j10) {
        this.f11973a = js1Var;
        this.f11974b = j21Var;
        this.f11975c = j10;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final boolean a(bz0 bz0Var) {
        j21 j21Var = this.f11974b;
        if (bz0Var == null || bz0Var.equals(bz0.E())) {
            j21Var.b(15102);
            return false;
        }
        if (bz0Var.B() == this.f11973a.j()) {
            return true;
        }
        j21Var.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final boolean b(bz0 bz0Var) {
        j21 j21Var = this.f11974b;
        if (bz0Var == null || bz0Var.equals(bz0.E())) {
            j21Var.b(15104);
            return true;
        }
        if (bz0Var.B() != this.f11973a.j()) {
            j21Var.b(15105);
            return true;
        }
        boolean z5 = (bz0Var.z().B() * 1000) - System.currentTimeMillis() <= this.f11975c;
        if (z5) {
            j21Var.b(15106);
        }
        return z5;
    }
}
