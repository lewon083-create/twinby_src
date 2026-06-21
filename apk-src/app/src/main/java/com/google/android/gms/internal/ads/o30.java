package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o30 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8596a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f8597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f8598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f8599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ls1 f8600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f8601f;

    public o30(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5) {
        this.f8598c = ls1Var;
        this.f8599d = ls1Var2;
        this.f8597b = ls1Var3;
        this.f8600e = ls1Var4;
        this.f8601f = ls1Var5;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f8596a) {
            case 0:
                return new n30((br) this.f8598c.j(), (j30) this.f8599d.j(), (Executor) this.f8597b.j(), (i30) this.f8600e.j(), (ua.a) this.f8601f.j());
            case 1:
                return new bw0((Context) this.f8597b.j(), (cw0) this.f8598c.j(), (dv0) this.f8599d.j(), (cv0) this.f8600e.j(), ((ux0) this.f8601f.j()).U());
            default:
                return new e11((bw0) this.f8598c.j(), (n11) this.f8599d.j(), (w11) this.f8600e.j(), (j21) this.f8597b.j(), (ExecutorService) this.f8601f.j());
        }
    }

    public o30(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ns1 ns1Var) {
        this.f8598c = ls1Var;
        this.f8599d = ls1Var2;
        this.f8600e = ls1Var3;
        this.f8597b = ls1Var4;
        this.f8601f = ns1Var;
    }

    public o30(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, ns1 ns1Var2, ls1 ls1Var3) {
        this.f8597b = ns1Var;
        this.f8598c = ls1Var;
        this.f8599d = ls1Var2;
        this.f8600e = ls1Var3;
        this.f8601f = ns1Var2;
    }
}
