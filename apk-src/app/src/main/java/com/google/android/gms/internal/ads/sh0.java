package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ut0 f10294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10295d;

    public /* synthetic */ sh0(ut0 ut0Var, View view, int i) {
        this.f10293b = i;
        this.f10294c = ut0Var;
        this.f10295d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10293b) {
            case 0:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
                    ut0 ut0Var = this.f10294c;
                    if (!ut0Var.f11068f) {
                        ut0Var.f11064b.a(this.f10295d, wt0.f11896b);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
                    this.f10294c.b(this.f10295d);
                    break;
                }
                break;
        }
    }
}
