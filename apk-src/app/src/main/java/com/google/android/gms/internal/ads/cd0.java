package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf0 f4185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4186b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f4187c = new AtomicBoolean(false);

    public cd0(yf0 yf0Var) {
        this.f4185a = yf0Var;
    }

    public final void a(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f4187c.set(true);
        synchronized (i4Var.f13782c) {
            try {
                if (((lh) i4Var.f13783d) == null) {
                    i4Var.f13783d = new lh();
                }
                lh lhVar = (lh) i4Var.f13783d;
                synchronized (lhVar.f7513d) {
                    lhVar.f7517h.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yf0 yf0Var = this.f4185a;
        yf0Var.getClass();
        hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 3), 3);
    }

    public final void b() {
        if (this.f4186b.get()) {
            yf0 yf0Var = this.f4185a;
            yf0Var.getClass();
            hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 5), 3);
        }
    }

    public final void c() {
        if (this.f4186b.get()) {
            yf0 yf0Var = this.f4185a;
            yf0Var.getClass();
            hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 0), 3);
        }
    }

    public final void d() {
        if (this.f4186b.getAndSet(false)) {
            yf0 yf0Var = this.f4185a;
            yf0Var.getClass();
            hk.c0.m((mk.c) yf0Var.f12610c, null, new zw0(yf0Var, null, 4), 3);
        }
    }
}
