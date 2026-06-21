package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f12085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f12086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f12087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f12088e;

    public /* synthetic */ x90(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, Object obj, int i) {
        this.f12084a = i;
        this.f12085b = ls1Var;
        this.f12086c = ls1Var2;
        this.f12087d = ls1Var3;
        this.f12088e = (qs1) obj;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f12084a) {
            case 0:
                dh dhVar = (dh) this.f12085b.j();
                Executor executor = (Executor) this.f12086c.j();
                Context context = (Context) this.f12087d.j();
                return new q30(executor, new j30(context, dhVar), (ua.a) this.f12088e.j());
            default:
                js1 js1VarB = ls1.b(this.f12085b);
                j21 j21Var = (j21) this.f12086c.j();
                return new x11(js1VarB, j21Var, ((ux0) this.f12088e.j()).L().A());
        }
    }
}
