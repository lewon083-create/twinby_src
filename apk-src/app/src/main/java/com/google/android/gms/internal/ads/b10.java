package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00 f3555b;

    public /* synthetic */ b10(z00 z00Var, int i) {
        this.f3554a = i;
        this.f3555b = z00Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3554a) {
            case 0:
                z00 z00Var = this.f3555b;
                return new x00(z00Var.f12809b, z00Var.f12808a);
            case 1:
                Context context = this.f3555b.f12809b;
                gr.G(context);
                return context;
            case 2:
                WeakReference weakReference = this.f3555b.f12811d;
                gr.G(weakReference);
                return weakReference;
            case 3:
                return new ku0(this.f3555b.f12809b, 1);
            case 4:
                z00 z00Var2 = this.f3555b;
                return new p9.e(z00Var2.f12809b, z00Var2.f12808a);
            case 5:
                t9.g0 g0Var = p9.k.C.f31297c;
                z00 z00Var3 = this.f3555b;
                String strF = g0Var.F(z00Var3.f12809b, z00Var3.f12808a.f34365b);
                gr.G(strF);
                return strF;
            default:
                return Long.valueOf(this.f3555b.f12810c);
        }
    }
}
