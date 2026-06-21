package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends nx1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t81 f4394h;
    public final nu0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c6 f4395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public em1 f4401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n5 f4402q;

    public /* synthetic */ cz1(n5 n5Var, t81 t81Var, nu0 nu0Var, c6 c6Var, int i) {
        c6 c6Var2 = c6.f4051l;
        this.f4402q = n5Var;
        this.f4394h = t81Var;
        this.i = nu0Var;
        this.f4395j = c6Var2;
        this.f4396k = i;
        this.f4397l = true;
        this.f4398m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final synchronized void a(n5 n5Var) {
        this.f4402q = n5Var;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void b(gy1 gy1Var) {
        az1 az1Var = (az1) gy1Var;
        if (az1Var.f3516w) {
            for (fz1 fz1Var : az1Var.f3513t) {
                fz1Var.n();
                if (fz1Var.f5533g != null) {
                    fz1Var.f5533g = null;
                    fz1Var.f5532f = null;
                }
            }
        }
        oq0 oq0Var = az1Var.f3504k;
        q qVar = (q) oq0Var.f8763d;
        if (qVar != null) {
            qVar.a(true);
        }
        x xVar = (x) oq0Var.f8762c;
        xVar.execute(new s(0, az1Var));
        ((ExecutorService) ((Executor) xVar.f11951c)).shutdown();
        az1Var.f3509p.removeCallbacksAndMessages(null);
        az1Var.f3510q = null;
        az1Var.O = true;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final gy1 c(hy1 hy1Var, i iVar, long j10) {
        g91 g91VarMo1h = this.f4394h.mo1h();
        em1 em1Var = this.f4401p;
        if (em1Var != null) {
            g91VarMo1h.H(em1Var);
        }
        q2 q2Var = f().f8193b;
        q2Var.getClass();
        Uri uri = q2Var.f9291a;
        this.f8494g.getClass();
        return new az1(uri, g91VarMo1h, new l91((d2) this.i.f8456c), this.f4395j, new ly1((CopyOnWriteArrayList) this.f8491d.f7676c, hy1Var), new n90(27, (CopyOnWriteArrayList) this.f8490c.f8249d, hy1Var, false), this, iVar, this.f4396k, cq0.s(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final synchronized n5 f() {
        return this.f4402q;
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void h(em1 em1Var) {
        this.f4401p = em1Var;
        Looper.myLooper().getClass();
        this.f8494g.getClass();
        t();
    }

    public final void s(long j10, o2 o2Var, boolean z5) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f4398m;
        }
        boolean zJ = o2Var.j();
        if (!this.f4397l && this.f4398m == j10 && this.f4399n == zJ && this.f4400o == z5) {
            return;
        }
        this.f4398m = j10;
        this.f4399n = zJ;
        this.f4400o = z5;
        this.f4397l = false;
        t();
    }

    public final void t() {
        long j10 = this.f4398m;
        boolean z5 = this.f4399n;
        boolean z10 = this.f4400o;
        n5 n5VarF = f();
        ci jz1Var = new jz1(j10, j10, z5, n5VarF, z10 ? n5VarF.f8194c : null);
        if (this.f4397l) {
            jz1Var = new bz1(jz1Var);
        }
        k(jz1Var);
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.nx1
    public final void r() {
    }
}
