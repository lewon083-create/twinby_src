package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12668e;

    public /* synthetic */ ym0(int i, Object obj) {
        this.f12668e = obj;
        this.f12664a = i;
    }

    public void a() {
        e1.c cVar = (e1.c) this.f12668e;
        m3.v vVar = (m3.v) cVar.f15913f;
        s3.y yVar = (s3.y) cVar.f15908a;
        yVar.n0();
        int i = yVar.f32702j0.f32669n;
        if (!yVar.P() || yVar.Q() == 1 || yVar.Q() == 4 || i == 0 || i == 1) {
            if (this.f12666c) {
                vVar.d(4);
            }
            this.f12666c = false;
            return;
        }
        ((m3.t) cVar.f15911d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f12666c;
        int i10 = this.f12664a;
        if (z5 && this.f12665b == i) {
            if (jElapsedRealtime - this.f12667d >= i10) {
                ((s3.t) cVar.f15910c).f32648b.i0(new s3.i(2, new m3.s(4, i10), 1003));
                return;
            }
            return;
        }
        this.f12666c = true;
        this.f12667d = jElapsedRealtime;
        this.f12665b = i;
        vVar.d(4);
        vVar.f28601a.sendEmptyMessageDelayed(4, i10);
    }

    public void b() {
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f12668e;
        ot1 ot1Var = (ot1) cVar.f13337a;
        lo0 lo0Var = (lo0) cVar.f13341e;
        int iD0 = ot1Var.d0();
        ot1 ot1Var2 = (ot1) cVar.f13337a;
        if (!ot1Var2.e0() || ot1Var2.c0() == 1 || ot1Var2.c0() == 4 || iD0 == 0 || iD0 == 1) {
            if (this.f12666c) {
                lo0Var.d(4);
            }
            this.f12666c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = this.f12666c;
        int i = this.f12664a;
        if (z5 && this.f12665b == iD0) {
            if (jElapsedRealtime - this.f12667d >= i) {
                ((ht1) cVar.f13339c).f6261b.K1(new bt1(2, new rn0(4, i), 1003));
                return;
            }
            return;
        }
        this.f12666c = true;
        this.f12667d = jElapsedRealtime;
        this.f12665b = iD0;
        lo0Var.d(4);
        lo0Var.f7588a.sendEmptyMessageDelayed(4, i);
    }
}
