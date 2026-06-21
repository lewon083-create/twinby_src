package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 implements te, ny1, vw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6 f3914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh f3915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh f3916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi f3917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f3918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yf0 f3919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ip1 f3920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lo0 f3921h;
    public boolean i;

    public bv1(c6 c6Var) {
        c6Var.getClass();
        this.f3914a = c6Var;
        String str = cq0.f4293a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3919f = new yf0((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread(), 0);
        bh bhVar = new bh();
        this.f3915b = bhVar;
        this.f3916c = new nh();
        hi hiVar = new hi();
        hiVar.f6141b = bhVar;
        v41 v41Var = x41.f12018c;
        hiVar.f6142c = r51.f9713f;
        hiVar.f6143d = w51.f11648h;
        this.f3917d = hiVar;
        this.f3918e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void A() {
        r(y(), 24, new zu1(0));
    }

    public final void B(vu1 vu1Var, Looper looper) {
        boolean z5 = true;
        if (this.f3920g != null && !((x41) this.f3917d.f6142c).isEmpty()) {
            z5 = false;
        }
        ix.k0(z5);
        vu1Var.getClass();
        this.f3920g = vu1Var;
        c6 c6Var = this.f3914a;
        this.f3921h = c6Var.y(looper, null);
        yf0 yf0Var = this.f3919f;
        zd1 zd1Var = new zd1(29, (Object) this, (Object) vu1Var, false);
        yf0Var.getClass();
        this.f3919f = new yf0((CopyOnWriteArraySet) yf0Var.f12613f, looper, looper.getThread(), c6Var, zd1Var, yf0Var.f12609b);
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void a(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        r(z(i, hy1Var), 1002, new zu1(3));
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void b(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var, IOException iOException, boolean z5) {
        xu1 xu1VarZ = z(i, hy1Var);
        r(xu1VarZ, 1003, new pp0(xu1VarZ, zx1Var, ey1Var, iOException, z5));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void c() {
        r(t(), 3, new zu1(8));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void d() {
        r(t(), 5, new zu1(11));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void e() {
        r(t(), 7, new zu1(14));
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void f(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var) {
        r(z(i, hy1Var), 1001, new zu1(2));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void g() {
        r(t(), 2, new zu1(7));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void i() {
        r(t(), 14, new zu1(17));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void j() {
        ip1 ip1Var = this.f3920g;
        ip1Var.getClass();
        hi hiVar = this.f3917d;
        hiVar.f6144e = hi.u(ip1Var, (x41) hiVar.f6142c, (hy1) hiVar.f6145f, (bh) hiVar.f6141b);
        hiVar.s(ip1Var.v1());
        r(t(), 0, new zu1(5));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void k() {
        r(t(), 13, new zu1(9));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void k0(int i) {
        xu1 xu1VarT = t();
        r(xu1VarT, 4, new l7.n(xu1VarT, i));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void l() {
        r(t(), 1, new zu1(6));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void l0(bs bsVar) {
        xu1 xu1VarY = y();
        r(xu1VarY, 25, new in0(xu1VarY, bsVar, 17));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void m() {
        r(t(), -1, new zu1(10));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void m0(bt1 bt1Var) {
        hy1 hy1Var;
        r((bt1Var == null || (hy1Var = bt1Var.i) == null) ? t() : w(hy1Var), 10, new zu1(15));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void n() {
        r(t(), 6, new zu1(12));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void n0(hf hfVar, hf hfVar2, int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        ip1 ip1Var = this.f3920g;
        ip1Var.getClass();
        hi hiVar = this.f3917d;
        hiVar.f6144e = hi.u(ip1Var, (x41) hiVar.f6142c, (hy1) hiVar.f6145f, (bh) hiVar.f6141b);
        xu1 xu1VarT = t();
        r(xu1VarT, 11, new l7.n(xu1VarT, i, hfVar, hfVar2));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void o() {
        r(y(), 21, new zu1(19));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void o0(bt1 bt1Var) {
        hy1 hy1Var;
        xu1 xu1VarT = (bt1Var == null || (hy1Var = bt1Var.i) == null) ? t() : w(hy1Var);
        r(xu1VarT, 10, new nu0(xu1VarT, bt1Var));
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void p(int i, hy1 hy1Var, ey1 ey1Var) {
        xu1 xu1VarZ = z(i, hy1Var);
        r(xu1VarZ, VKApiCodes.CODE_PHONE_ALREADY_USED, new n90(25, xu1VarZ, ey1Var));
    }

    @Override // com.google.android.gms.internal.ads.ny1
    public final void q(int i, hy1 hy1Var, zx1 zx1Var, ey1 ey1Var, int i10) {
        r(z(i, hy1Var), 1000, new zu1(1));
    }

    public final void r(xu1 xu1Var, int i, td0 td0Var) {
        this.f3918e.put(i, xu1Var);
        yf0 yf0Var = this.f3919f;
        yf0Var.i(i, td0Var);
        yf0Var.j();
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void s() {
        r(t(), 12, new zu1(16));
    }

    public final xu1 t() {
        return w((hy1) this.f3917d.f6144e);
    }

    public final xu1 u(ci ciVar, int i, hy1 hy1Var) {
        hy1 hy1Var2 = true == ciVar.g() ? null : hy1Var;
        this.f3914a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = false;
        if (ciVar.equals(this.f3920g.v1()) && i == this.f3920g.z1()) {
            z5 = true;
        }
        long jR = 0;
        if (hy1Var2 == null || !hy1Var2.b()) {
            if (z5) {
                jR = this.f3920g.O();
            } else if (!ciVar.g()) {
                ciVar.b(i, this.f3916c, 0L).getClass();
                jR = cq0.r(0L);
            }
        } else if (z5 && this.f3920g.t() == hy1Var2.f6300b && this.f3920g.E1() == hy1Var2.f6301c) {
            jR = this.f3920g.B1();
        }
        return new xu1(jElapsedRealtime, ciVar, i, hy1Var2, jR, this.f3920g.v1(), this.f3920g.z1(), (hy1) this.f3917d.f6144e, this.f3920g.B1(), this.f3920g.C1());
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void v() {
        r(y(), 23, new zu1(18));
    }

    public final xu1 w(hy1 hy1Var) {
        this.f3920g.getClass();
        ci ciVar = hy1Var == null ? null : (ci) ((w51) this.f3917d.f6143d).get(hy1Var);
        if (hy1Var != null && ciVar != null) {
            return u(ciVar, ciVar.o(hy1Var.f6299a, this.f3915b).f3786c, hy1Var);
        }
        int iZ1 = this.f3920g.z1();
        ci ciVarV1 = this.f3920g.v1();
        if (iZ1 >= ciVarV1.a()) {
            ciVarV1 = ci.f4215a;
        }
        return u(ciVarV1, iZ1, null);
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void x() {
        r(y(), 22, new jl1(22, (byte) 0));
    }

    public final xu1 y() {
        return w((hy1) this.f3917d.f6146g);
    }

    public final xu1 z(int i, hy1 hy1Var) {
        ip1 ip1Var = this.f3920g;
        ip1Var.getClass();
        if (hy1Var != null) {
            return ((ci) ((w51) this.f3917d.f6143d).get(hy1Var)) != null ? w(hy1Var) : u(ci.f4215a, i, hy1Var);
        }
        ci ciVarV1 = ip1Var.v1();
        if (i >= ciVarV1.a()) {
            ciVarV1 = ci.f4215a;
        }
        return u(ciVarV1, i, null);
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void h() {
    }
}
