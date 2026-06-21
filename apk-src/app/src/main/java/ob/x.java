package ob;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.e f30501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1.e f30502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30503e;

    public x(l1 l1Var) {
        super(l1Var);
        this.f30502d = new h1.e(0);
        this.f30501c = new h1.e(0);
    }

    public final void D(long j10, String str) {
        l1 l1Var = (l1) this.f15951b;
        if (str == null || str.length() == 0) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Ad unit id must be a non-empty string");
        } else {
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.L(new a(this, str, j10, 0));
        }
    }

    public final void E(long j10, String str) {
        l1 l1Var = (l1) this.f15951b;
        if (str == null || str.length() == 0) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.f("Ad unit id must be a non-empty string");
        } else {
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.L(new a(this, str, j10, 1));
        }
    }

    public final void F(long j10) {
        u2 u2Var = ((l1) this.f15951b).f30270m;
        l1.i(u2Var);
        r2 r2VarI = u2Var.I(false);
        h1.e eVar = this.f30501c;
        for (String str : (h1.b) eVar.keySet()) {
            H(str, j10 - ((Long) eVar.get(str)).longValue(), r2VarI);
        }
        if (!eVar.isEmpty()) {
            G(j10 - this.f30503e, r2VarI);
        }
        I(j10);
    }

    public final void G(long j10, r2 r2Var) {
        l1 l1Var = (l1) this.f15951b;
        if (r2Var == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30418o.f("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30418o.g(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            e4.s0(r2Var, bundle, true);
            k2 k2Var = l1Var.f30271n;
            l1.i(k2Var);
            k2Var.J("am", "_xa", bundle);
        }
    }

    public final void H(String str, long j10, r2 r2Var) {
        l1 l1Var = (l1) this.f15951b;
        if (r2Var == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30418o.f("Not logging ad unit exposure. No active activity");
        } else {
            if (j10 < 1000) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.f30418o.g(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            e4.s0(r2Var, bundle, true);
            k2 k2Var = l1Var.f30271n;
            l1.i(k2Var);
            k2Var.J("am", "_xu", bundle);
        }
    }

    public final void I(long j10) {
        h1.e eVar = this.f30501c;
        Iterator it = ((h1.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f30503e = j10;
    }
}
