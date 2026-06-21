package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f13849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1 f13850h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, Activity activity, int i) {
        super(l1Var.f13860b, true);
        this.f13848f = i;
        switch (i) {
            case 1:
                this.f13849g = activity;
                this.f13850h = l1Var;
                super(l1Var.f13860b, true);
                break;
            case 2:
                this.f13849g = activity;
                this.f13850h = l1Var;
                super(l1Var.f13860b, true);
                break;
            case 3:
                this.f13849g = activity;
                this.f13850h = l1Var;
                super(l1Var.f13860b, true);
                break;
            case 4:
                this.f13849g = activity;
                this.f13850h = l1Var;
                super(l1Var.f13860b, true);
                break;
            default:
                this.f13849g = activity;
                this.f13850h = l1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f13848f) {
            case 0:
                j0 j0Var = this.f13850h.f13860b.f13882e;
                pa.c0.i(j0Var);
                j0Var.onActivityStartedByScionActivityInfo(v0.a(this.f13849g), this.f13835c);
                break;
            case 1:
                j0 j0Var2 = this.f13850h.f13860b.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.onActivityResumedByScionActivityInfo(v0.a(this.f13849g), this.f13835c);
                break;
            case 2:
                j0 j0Var3 = this.f13850h.f13860b.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.onActivityPausedByScionActivityInfo(v0.a(this.f13849g), this.f13835c);
                break;
            case 3:
                j0 j0Var4 = this.f13850h.f13860b.f13882e;
                pa.c0.i(j0Var4);
                j0Var4.onActivityStoppedByScionActivityInfo(v0.a(this.f13849g), this.f13835c);
                break;
            default:
                j0 j0Var5 = this.f13850h.f13860b.f13882e;
                pa.c0.i(j0Var5);
                j0Var5.onActivityDestroyedByScionActivityInfo(v0.a(this.f13849g), this.f13835c);
                break;
        }
    }
}
