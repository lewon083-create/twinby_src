package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 implements r6, l5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7791e;

    public m6(long j10) {
        ix.k0(((h) this.f7790d) == null);
        this.f7788b = j10;
        this.f7789c = j10 + 65536;
    }

    public static m6 b(ac.c cVar, byte[] bArr) {
        cVar.v();
        ((rc) cVar.f739c).f9817c.f5320c = ac.e(bArr);
        List list = (List) cVar.x(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        cVar.y(jLongValue, Optional.empty());
        byte[] bArrJ = nz.j();
        String strConcat = "3.825731049.".concat(i61.f6399d.g(bArrJ.length, bArrJ));
        m6 m6Var = new m6();
        m6Var.f7790d = cVar;
        m6Var.f7788b = jLongValue2;
        m6Var.f7789c = jLongValue3;
        m6Var.f7791e = strConcat;
        return m6Var;
    }

    @Override // com.google.android.gms.internal.ads.r6
    public long a(a2 a2Var) {
        long j10 = this.f7789c;
        if (j10 < 0) {
            return -1L;
        }
        this.f7789c = -1L;
        return -(j10 + 2);
    }

    public boolean c(long j10, boolean z5, boolean z10) {
        ob.k3 k3Var = (ob.k3) this.f7791e;
        k3Var.C();
        k3Var.D();
        ob.l1 l1Var = (ob.l1) k3Var.f15951b;
        boolean zA = l1Var.a();
        ob.s0 s0Var = l1Var.f30265g;
        if (zA) {
            ob.z0 z0Var = l1Var.f30264f;
            ob.l1.h(z0Var);
            ob.y0 y0Var = z0Var.f30591q;
            l1Var.f30269l.getClass();
            y0Var.g(System.currentTimeMillis());
        }
        long j11 = j10 - this.f7788b;
        if (!z5 && j11 < 1000) {
            ob.l1.k(s0Var);
            s0Var.f30418o.g(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j11 = j10 - this.f7789c;
            this.f7789c = j10;
        }
        ob.l1.k(s0Var);
        s0Var.f30418o.g(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z11 = !l1Var.f30263e.Q();
        ob.u2 u2Var = l1Var.f30270m;
        ob.l1.i(u2Var);
        ob.e4.s0(u2Var.I(z11), bundle, true);
        if (!z10) {
            ob.k2 k2Var = l1Var.f30271n;
            ob.l1.i(k2Var);
            k2Var.J("auto", "_e", bundle);
        }
        this.f7788b = j10;
        ob.j3 j3Var = (ob.j3) this.f7790d;
        j3Var.c();
        j3Var.b(((Long) ob.d0.f30037q0.a(null)).longValue());
        return true;
    }

    @Override // l5.d
    public long e(q4.l lVar) {
        long j10 = this.f7789c;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f7789c = -1L;
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.r6
    public void f(long j10) {
        long[] jArr = (long[]) ((ut) this.f7791e).f11061c;
        this.f7789c = jArr[cq0.q(jArr, j10, true)];
    }

    @Override // l5.d
    public q4.t j() {
        com.google.android.gms.internal.measurement.h5.r(this.f7788b != -1);
        return new q4.o((g2) this.f7790d, this.f7788b, 0);
    }

    @Override // com.google.android.gms.internal.ads.r6
    public o2 l() {
        ix.k0(this.f7788b != -1);
        return new f2((g2) this.f7790d, this.f7788b, 0);
    }

    @Override // l5.d
    public void o(long j10) {
        long[] jArr = (long[]) ((l6.i) this.f7791e).f27978c;
        this.f7789c = jArr[m3.z.f(jArr, j10, true)];
    }

    public m6(long j10, int i) {
        com.google.android.gms.internal.measurement.h5.r(((m4.a) this.f7790d) == null);
        this.f7788b = j10;
        this.f7789c = j10 + ((long) i);
    }
}
