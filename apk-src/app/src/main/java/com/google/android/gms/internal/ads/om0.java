package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8746h;

    public /* synthetic */ om0(int i, Object obj) {
        this.f8746h = obj;
        this.f8739a = i;
    }

    public void a() {
        e1.c cVar = (e1.c) this.f8746h;
        m3.v vVar = (m3.v) cVar.f15913f;
        s3.y yVar = (s3.y) cVar.f15908a;
        if (!yVar.u()) {
            if (this.f8744f) {
                vVar.d(2);
            }
            this.f8744f = false;
            return;
        }
        j3.o0 o0VarM = yVar.M();
        Object objL = o0VarM.p() ? null : o0VarM.l(yVar.J());
        int iG = yVar.G();
        int iH = yVar.H();
        long jK = yVar.K();
        if (objL != null && iG == -1) {
            jK -= m3.z.Z(o0VarM.g(objL, (j3.m0) cVar.f15912e).f26278e);
        }
        ((m3.t) cVar.f15911d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f8744f;
        int i = this.f8739a;
        if (z5 && Objects.equals(objL, this.f8740b) && iG == this.f8741c && iH == this.f8742d && jK == this.f8743e) {
            if (jElapsedRealtime - this.f8745g >= i) {
                ((s3.t) cVar.f15910c).f32648b.i0(new s3.i(2, new m3.s(2, i), 1003));
                return;
            }
            return;
        }
        this.f8744f = true;
        this.f8745g = jElapsedRealtime;
        this.f8740b = objL;
        this.f8741c = iG;
        this.f8742d = iH;
        this.f8743e = jK;
        vVar.d(2);
        vVar.f28601a.sendEmptyMessageDelayed(2, i);
    }

    public void b() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f8746h;
        ot1 ot1Var = (ot1) cVar.f13337a;
        lo0 lo0Var = (lo0) cVar.f13341e;
        if (ot1Var.c0() != 3 || !ot1Var.e0() || ot1Var.d0() != 0) {
            if (this.f8744f) {
                lo0Var.d(2);
            }
            this.f8744f = false;
            return;
        }
        ci ciVarV1 = ot1Var.v1();
        Object objF = ciVarV1.g() ? null : ciVarV1.f(ot1Var.y1());
        int iT = ot1Var.t();
        int iE1 = ot1Var.E1();
        long jB1 = ot1Var.B1();
        if (objF != null && iT == -1) {
            ciVarV1.o(objF, (bh) cVar.f13340d);
            jB1 -= cq0.r(0L);
            iT = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f8744f;
        int i = this.f8739a;
        if (z5 && Objects.equals(objF, this.f8740b) && iT == this.f8741c && iE1 == this.f8742d && jB1 == this.f8743e) {
            if (jElapsedRealtime - this.f8745g >= i) {
                ((ht1) cVar.f13339c).f6261b.K1(new bt1(2, new rn0(2, i), 1003));
                return;
            }
            return;
        }
        this.f8744f = true;
        this.f8745g = jElapsedRealtime;
        this.f8740b = objF;
        this.f8741c = iT;
        this.f8742d = iE1;
        this.f8743e = jB1;
        lo0Var.d(2);
        lo0Var.f7588a.sendEmptyMessageDelayed(2, i);
    }
}
