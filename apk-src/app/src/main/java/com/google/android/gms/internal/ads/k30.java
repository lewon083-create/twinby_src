package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k30 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f7102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f7103c;

    public /* synthetic */ k30(ls1 ls1Var, qs1 qs1Var, int i) {
        this.f7101a = i;
        this.f7103c = ls1Var;
        this.f7102b = qs1Var;
    }

    public wj0 a() {
        return new wj0((jk0) this.f7103c.j(), (gd0) this.f7102b.j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f7101a) {
            case 0:
                return new j30(((d10) this.f7102b).a(), (dh) this.f7103c.j());
            case 1:
                return new e50((ua.a) this.f7102b.j(), (xw) this.f7103c.j());
            case 2:
                return new p9.a((Context) this.f7102b.j(), (wv) this.f7103c.j());
            case 3:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 4:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 5:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 6:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 7:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 8:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 9:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 10:
                return new s80((s70) this.f7103c.j(), (Executor) this.f7102b.j());
            case 11:
                return a();
            case 12:
                ed.d dVar = (ed.d) this.f7103c.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new ml0(dVar, gxVar, (ScheduledExecutorService) this.f7102b.j(), 0);
            default:
                return fs1.s((Context) this.f7102b.j(), (dv0) this.f7103c.j());
        }
    }

    public /* synthetic */ k30(qs1 qs1Var, ls1 ls1Var, int i) {
        this.f7101a = i;
        this.f7102b = qs1Var;
        this.f7103c = ls1Var;
    }
}
