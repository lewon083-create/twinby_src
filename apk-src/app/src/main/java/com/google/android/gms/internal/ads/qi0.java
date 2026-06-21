package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s10 f9508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0 f9510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq0 f9511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f9512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c31 f9513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qd0 f9514g;

    public qi0(s10 s10Var, Context context, Executor executor, yc0 yc0Var, iq0 iq0Var, c31 c31Var, qd0 qd0Var) {
        this.f9509b = context;
        this.f9508a = s10Var;
        this.f9512e = executor;
        this.f9510c = yc0Var;
        this.f9511d = iq0Var;
        this.f9513f = c31Var;
        this.f9514g = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        bq0 bq0Var = xp0Var.f12260s;
        return (bq0Var == null || bq0Var.f3852a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        return vv.J(n81.f8237c, new v40(this, eq0Var, xp0Var, 4), this.f9512e);
    }
}
