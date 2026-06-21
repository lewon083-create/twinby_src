package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k40 implements z60, fh, w70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp0 f7109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q60 f7110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d70 f7111d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i70 f7114g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7112e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7113f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f7115h = new AtomicBoolean();

    public k40(xp0 xp0Var, q60 q60Var, d70 d70Var, i70 i70Var) {
        this.f7109b = xp0Var;
        this.f7110c = q60Var;
        this.f7111d = d70Var;
        this.f7114g = i70Var;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        int i = this.f7109b.f12235e;
        if (i == 1) {
            if (ehVar.f4951j && this.f7112e.compareAndSet(false, true)) {
                this.f7110c.a();
            }
        } else if (i == 4 && ehVar.f4951j && this.f7115h.compareAndSet(false, true)) {
            this.f7114g.a();
        }
        if (ehVar.f4951j && this.f7113f.compareAndSet(false, true)) {
            d70 d70Var = this.f7111d;
            synchronized (d70Var) {
                d70Var.A1(v60.f11259j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void g() {
        if (this.f7109b.f12235e == 4 && this.f7112e.compareAndSet(false, true)) {
            this.f7110c.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final synchronized void k() {
        int i = this.f7109b.f12235e;
        if (i == 1 || i == 4) {
            return;
        }
        if (this.f7112e.compareAndSet(false, true)) {
            this.f7110c.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void r() {
    }
}
