package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f6502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d60 f6503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f6504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ns1 f6505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ls1 f6506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f6507h;
    public final ls1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qs1 f6508j;

    public /* synthetic */ ii0(ls1 ls1Var, j10 j10Var, d60 d60Var, ls1 ls1Var2, ns1 ns1Var, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, int i) {
        this.f6500a = i;
        this.f6501b = ls1Var;
        this.f6502c = j10Var;
        this.f6503d = d60Var;
        this.f6504e = ls1Var2;
        this.f6505f = ns1Var;
        this.f6506g = ls1Var3;
        this.f6507h = ls1Var4;
        this.i = ls1Var5;
        this.f6508j = ls1Var6;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6500a) {
            case 0:
                q10 q10Var = (q10) this.f6505f.f8433a;
                return new hi0(q10Var, (Executor) this.f6502c.j(), (yc0) this.f6506g.j(), this.f6503d.a(), ((j10) this.f6504e).a(), new xo(), (ph0) this.f6507h.j(), (qd0) this.i.j(), (sd0) this.f6508j.j());
            case 1:
                return new zi0((Context) this.f6501b.j(), ((j10) this.f6502c).a(), this.f6503d.a(), (Executor) this.f6504e.j(), (w10) this.f6505f.f8433a, (yc0) this.f6506g.j(), new xo(), (ph0) this.f6507h.j(), (qd0) this.i.j(), (sd0) this.f6508j.j());
            default:
                return new zi0((Context) this.f6501b.j(), ((j10) this.f6502c).a(), this.f6503d.a(), (Executor) this.f6504e.j(), (z10) this.f6505f.f8433a, (yc0) this.f6506g.j(), new xo(), (ph0) this.f6507h.j(), (qd0) this.i.j(), (sd0) this.f6508j.j());
        }
    }

    public ii0(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, d60 d60Var, j10 j10Var, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6) {
        this.f6500a = 0;
        this.f6505f = ns1Var;
        this.f6501b = ls1Var;
        this.f6502c = ls1Var2;
        this.f6506g = ls1Var3;
        this.f6503d = d60Var;
        this.f6504e = j10Var;
        this.f6507h = ls1Var4;
        this.i = ls1Var5;
        this.f6508j = ls1Var6;
    }
}
