package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9991g;

    public /* synthetic */ rm0(int i, Object obj) {
        this.f9991g = obj;
        this.f9985a = i;
    }

    public void a() {
        long jO;
        e1.c cVar = (e1.c) this.f9991g;
        j3.m0 m0Var = (j3.m0) cVar.f15912e;
        m3.v vVar = (m3.v) cVar.f15913f;
        s3.y yVar = (s3.y) cVar.f15908a;
        j3.o0 o0VarM = yVar.M();
        Object objL = o0VarM.p() ? null : o0VarM.l(yVar.J());
        int iG = yVar.G();
        int iH = yVar.H();
        long jK = yVar.K();
        if (objL == null || iG != -1) {
            jO = iG != -1 ? yVar.O() : -9223372036854775807L;
        } else {
            o0VarM.g(objL, m0Var);
            jK -= m3.z.Z(m0Var.f26278e);
            jO = m3.z.Z(m0Var.f26277d);
        }
        boolean zU = yVar.u();
        if (!zU || jO == -9223372036854775807L || jK < jO) {
            vVar.d(3);
            if (zU && jO != -9223372036854775807L) {
                yVar.n0();
                vVar.f28601a.sendEmptyMessageDelayed(3, (int) Math.ceil((jO - jK) / yVar.f32702j0.f32670o.f26237a));
            }
            this.f9989e = false;
            return;
        }
        ((m3.t) cVar.f15911d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f9989e;
        int i = this.f9985a;
        if (z5 && Objects.equals(objL, this.f9986b) && iG == this.f9987c && iH == this.f9988d) {
            if (jElapsedRealtime - this.f9990f >= i) {
                ((s3.t) cVar.f15910c).f32648b.i0(new s3.i(2, new m3.s(3, i), 1003));
                return;
            }
            return;
        }
        this.f9989e = true;
        this.f9990f = jElapsedRealtime;
        this.f9986b = objL;
        this.f9987c = iG;
        this.f9988d = iH;
        vVar.d(3);
        vVar.f28601a.sendEmptyMessageDelayed(3, i);
    }

    public void b() {
        long jZ1;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f9991g;
        ot1 ot1Var = (ot1) cVar.f13337a;
        bh bhVar = (bh) cVar.f13340d;
        lo0 lo0Var = (lo0) cVar.f13341e;
        ci ciVarV1 = ot1Var.v1();
        Object objF = ciVarV1.g() ? null : ciVarV1.f(ot1Var.y1());
        int iT = ot1Var.t();
        int iE1 = ot1Var.E1();
        long jB1 = ot1Var.B1();
        if (objF == null || iT != -1) {
            jZ1 = iT != -1 ? ot1Var.Z1() : -9223372036854775807L;
        } else {
            ciVarV1.o(objF, bhVar);
            jB1 -= cq0.r(0L);
            jZ1 = cq0.r(bhVar.f3787d);
            iT = -1;
        }
        boolean z5 = ot1Var.c0() == 3 && ot1Var.e0() && ot1Var.d0() == 0;
        if (!z5 || jZ1 == -9223372036854775807L || jB1 < jZ1) {
            lo0Var.d(3);
            if (z5 && jZ1 != -9223372036854775807L) {
                ot1Var.J0();
                lo0Var.f7588a.sendEmptyMessageDelayed(3, (int) Math.ceil((jZ1 - jB1) / ot1Var.f8773b0.f7645o.f9010a));
            }
            this.f9989e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f9989e;
        int i = this.f9985a;
        if (z10 && Objects.equals(objF, this.f9986b) && iT == this.f9987c && iE1 == this.f9988d) {
            if (jElapsedRealtime - this.f9990f >= i) {
                ((ht1) cVar.f13339c).f6261b.K1(new bt1(2, new rn0(3, i), 1003));
                return;
            }
            return;
        }
        this.f9989e = true;
        this.f9990f = jElapsedRealtime;
        this.f9986b = objF;
        this.f9987c = iT;
        this.f9988d = iE1;
        lo0Var.d(3);
        lo0Var.f7588a.sendEmptyMessageDelayed(3, i);
    }
}
