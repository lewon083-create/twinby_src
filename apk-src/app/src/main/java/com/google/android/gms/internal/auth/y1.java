package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f13309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f13310c;

    public y1() {
        z1 z1Var = z1.zzb;
        this.f13309b = z1Var;
        if (z1Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13310c = z1Var.b();
    }

    public final l0 a() {
        if (!this.f13310c.g()) {
            return this.f13310c;
        }
        l0 l0Var = this.f13310c;
        l0Var.getClass();
        h1.f13228c.a(l0Var.getClass()).d(l0Var);
        l0Var.d();
        return this.f13310c;
    }

    public final Object clone() {
        y1 y1Var = (y1) this.f13309b.h(5);
        y1Var.f13310c = a();
        return y1Var;
    }
}
