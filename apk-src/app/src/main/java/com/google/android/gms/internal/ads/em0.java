package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class em0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5010h;
    public final /* synthetic */ Object i;

    public /* synthetic */ em0(int i, Object obj) {
        this.i = obj;
        this.f5003a = i;
    }

    public void a() {
        int i = this.f5003a;
        e1.c cVar = (e1.c) this.i;
        if (((s3.y) cVar.f15908a).Q() == 2 && ((s3.y) cVar.f15908a).P()) {
            s3.y yVar = (s3.y) cVar.f15908a;
            yVar.n0();
            if (yVar.f32702j0.f32669n == 0) {
                j3.o0 o0VarM = ((s3.y) cVar.f15908a).M();
                Object objL = o0VarM.p() ? null : o0VarM.l(((s3.y) cVar.f15908a).J());
                int iG = ((s3.y) cVar.f15908a).G();
                int iH = ((s3.y) cVar.f15908a).H();
                long jE = ((s3.y) cVar.f15908a).E();
                long jMax = Math.max(0L, jE - ((s3.y) cVar.f15908a).K());
                s3.y yVar2 = (s3.y) cVar.f15908a;
                yVar2.n0();
                long jMax2 = Math.max(0L, m3.z.Z(yVar2.f32702j0.f32673r) - jMax);
                if (objL != null && iG == -1) {
                    jE -= m3.z.Z(o0VarM.g(objL, (j3.m0) cVar.f15912e).f26278e);
                }
                ((m3.t) cVar.f15911d).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f5009g && Objects.equals(objL, this.f5004b) && iG == this.f5005c && iH == this.f5006d && jE == this.f5007e && jMax2 == this.f5008f) {
                    if (jElapsedRealtime - this.f5010h >= i) {
                        ((s3.t) cVar.f15910c).f32648b.i0(new s3.i(2, new m3.s(1, i), 1003));
                        return;
                    }
                    return;
                }
                this.f5009g = true;
                this.f5010h = jElapsedRealtime;
                this.f5004b = objL;
                this.f5005c = iG;
                this.f5006d = iH;
                this.f5007e = jE;
                this.f5008f = jMax2;
                ((m3.v) cVar.f15913f).d(1);
                ((m3.v) cVar.f15913f).f28601a.sendEmptyMessageDelayed(1, i);
                return;
            }
        }
        if (this.f5009g) {
            ((m3.v) cVar.f15913f).d(1);
        }
        this.f5009g = false;
    }

    public void b() {
        Object obj;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.i;
        ot1 ot1Var = (ot1) cVar.f13337a;
        lo0 lo0Var = (lo0) cVar.f13341e;
        if (ot1Var.c0() != 2 || !ot1Var.e0() || ot1Var.d0() != 0) {
            if (this.f5009g) {
                lo0Var.d(1);
            }
            this.f5009g = false;
            return;
        }
        ci ciVarV1 = ot1Var.v1();
        Object objF = ciVarV1.g() ? null : ciVarV1.f(ot1Var.y1());
        int iT = ot1Var.t();
        int iE1 = ot1Var.E1();
        long jA2 = ot1Var.a2();
        long jMax = Math.max(0L, ot1Var.C1() - Math.max(0L, jA2 - ot1Var.B1()));
        if (objF != null && iT == -1) {
            ciVarV1.o(objF, (bh) cVar.f13340d);
            jA2 -= cq0.r(0L);
            iT = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f5009g;
        int i = this.f5003a;
        if (z5 && Objects.equals(objF, this.f5004b) && iT == this.f5005c && iE1 == this.f5006d) {
            obj = objF;
            if (jA2 == this.f5007e && jMax == this.f5008f) {
                if (jElapsedRealtime - this.f5010h >= i) {
                    ((ht1) cVar.f13339c).f6261b.K1(new bt1(2, new rn0(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.f5009g = true;
        this.f5010h = jElapsedRealtime;
        this.f5004b = obj;
        this.f5005c = iT;
        this.f5006d = iE1;
        this.f5007e = jA2;
        this.f5008f = jMax;
        lo0Var.d(1);
        lo0Var.f7588a.sendEmptyMessageDelayed(1, i);
    }
}
