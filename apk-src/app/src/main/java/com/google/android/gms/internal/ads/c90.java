package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c90 implements s9.l, q9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd0 f4112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zp0 f4113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4114d = new AtomicBoolean(false);

    public c90(cd0 cd0Var, zp0 zp0Var) {
        this.f4112b = cd0Var;
        this.f4113c = zp0Var;
    }

    @Override // s9.l
    public final void A2() {
        a();
    }

    @Override // s9.l
    public final void E0(int i) {
        a();
    }

    public final void a() {
        if (this.f4114d.getAndSet(true)) {
            return;
        }
        cd0 cd0Var = this.f4112b;
        if (cd0Var.f4186b.getAndSet(false)) {
            yf0 yf0Var = cd0Var.f4185a;
            yf0Var.getClass();
            hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 2), 3);
        }
    }

    @Override // s9.l
    public final void m() {
        String gwsQueryId = this.f4113c.f13056b;
        boolean zN = fs1.n(gwsQueryId);
        cd0 cd0Var = this.f4112b;
        if (zN) {
            cd0Var.getClass();
            return;
        }
        if (!cd0Var.f4187c.get() || cd0Var.f4186b.getAndSet(true)) {
            return;
        }
        yf0 yf0Var = cd0Var.f4185a;
        yf0Var.getClass();
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        hk.c0.m((mk.c) yf0Var.f12610c, null, new cx0(yf0Var, gwsQueryId, null, 0), 3);
    }

    @Override // q9.a
    public final void onAdClicked() {
        cd0 cd0Var = this.f4112b;
        if (cd0Var.f4186b.get()) {
            yf0 yf0Var = cd0Var.f4185a;
            yf0Var.getClass();
            hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 1), 3);
        }
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
