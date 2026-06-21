package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 implements s9.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w60 f2775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f2776c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2777d = new AtomicBoolean(false);

    public a50(w60 w60Var) {
        this.f2775b = w60Var;
    }

    @Override // s9.l
    public final void A2() {
        AtomicBoolean atomicBoolean = this.f2777d;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f2775b.A1(v60.f11257g);
    }

    @Override // s9.l
    public final void E0(int i) {
        this.f2776c.set(true);
        AtomicBoolean atomicBoolean = this.f2777d;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f2775b.A1(v60.f11257g);
    }

    @Override // s9.l
    public final void m() {
        this.f2775b.A1(v60.f11254d);
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // s9.l
    public final void L1() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // s9.l
    public final void d3() {
    }

    @Override // s9.l
    public final void i2() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // s9.l
    public final void w1() {
    }
}
