package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g70 extends ip1 implements r60, e70 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f5677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eq0 f5679f;

    public g70(Set set, xp0 xp0Var, eq0 eq0Var) {
        super(set);
        this.f5678e = new AtomicBoolean();
        this.f5677d = xp0Var;
        this.f5679f = eq0Var;
    }

    public final void F1() {
        q9.h3 h3Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.S8)).booleanValue() && this.f5678e.compareAndSet(false, true) && (h3Var = this.f5677d.f12236e0) != null && h3Var.f31894b == 3) {
            A1(new ox0(17, h3Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ip1, com.google.android.gms.internal.ads.e70
    public final void e() {
        if (this.f5677d.f12229b == 1) {
            F1();
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        int i = this.f5677d.f12229b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            F1();
        }
    }
}
