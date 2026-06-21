package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f3578b;

    public /* synthetic */ b40(cw cwVar, int i) {
        this.f3577a = i;
        this.f3578b = cwVar;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3577a) {
            case 0:
                View view = (View) this.f3578b.f4348d;
                gr.G(view);
                return view;
            case 1:
                yp0 yp0Var = (yp0) this.f3578b.f4349e;
                gr.G(yp0Var);
                return yp0Var;
            case 2:
                return (q40) this.f3578b.f4347c;
            default:
                return (sz) this.f3578b.f4350f;
        }
    }
}
