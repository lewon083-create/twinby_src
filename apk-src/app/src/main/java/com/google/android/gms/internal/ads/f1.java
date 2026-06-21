package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5166b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5169e;

    public /* synthetic */ f1(g1 g1Var, Object obj, long j10) {
        this.f5168d = g1Var;
        this.f5169e = obj;
        this.f5167c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5166b;
        long j10 = this.f5167c;
        Object obj = this.f5168d;
        Object obj2 = this.f5169e;
        switch (i) {
            case 0:
                String str = cq0.f4293a;
                ot1 ot1Var = ((g1) obj).f5591b.f6261b;
                bv1 bv1Var = ot1Var.f8792t;
                xu1 xu1VarY = bv1Var.y();
                bv1Var.r(xu1VarY, 26, new xo0(xu1VarY, obj2, j10));
                if (ot1Var.O == obj2) {
                    yf0 yf0Var = ot1Var.f8787o;
                    yf0Var.i(26, jl1.f6879d);
                    yf0Var.j();
                }
                break;
            case 1:
                qa qaVar = (qa) obj2;
                qaVar.f9372b.a(j10, (String) obj);
                qaVar.f9372b.b(qaVar.toString());
                break;
            case 2:
                ht0 ht0Var = (ht0) obj2;
                kx0 kx0Var = ht0Var.f6257r;
                if (kx0Var != null) {
                    q9.y1 y1Var = (q9.y1) obj;
                    mt0 mt0Var = ht0Var.f6259t;
                    kx0Var.P("paa", "pano_ts", this.f5167c, ht0Var.f6245e.f31984e, ht0Var.q(), y1Var instanceof e60 ? ((e60) y1Var).f4846e : null, mt0Var, ht0Var.f());
                }
                break;
            default:
                ob.u2 u2Var = (ob.u2) obj2;
                u2Var.G((ob.r2) obj, false, j10);
                u2Var.f30446f = null;
                ob.d3 d3VarN = ((ob.l1) u2Var.f15951b).n();
                d3VarN.C();
                d3VarN.D();
                d3VarN.Q(new k0.i(d3VarN, (ob.r2) null));
                break;
        }
    }

    public f1(qa qaVar, String str, long j10) {
        this.f5168d = str;
        this.f5167c = j10;
        this.f5169e = qaVar;
    }

    public f1(ht0 ht0Var, long j10, q9.y1 y1Var) {
        this.f5167c = j10;
        this.f5168d = y1Var;
        this.f5169e = ht0Var;
    }

    public f1(ob.u2 u2Var, ob.r2 r2Var, long j10) {
        this.f5168d = r2Var;
        this.f5167c = j10;
        Objects.requireNonNull(u2Var);
        this.f5169e = u2Var;
    }
}
