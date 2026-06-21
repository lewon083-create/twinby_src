package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f9944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f9945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ns1 f9946d;

    public /* synthetic */ ri0(ls1 ls1Var, ns1 ns1Var, qs1 qs1Var, int i) {
        this.f9943a = i;
        this.f9944b = ls1Var;
        this.f9946d = ns1Var;
        this.f9945c = qs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f9943a) {
            case 0:
                return new li0((Context) this.f9944b.j(), (s10) this.f9946d.f8433a, (Executor) this.f9945c.j(), 1);
            case 1:
                Context context = (Context) this.f9944b.j();
                u9.a aVarA = ((j10) this.f9945c).a();
                w10 w10Var = (w10) this.f9946d.f8433a;
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new ti0(context, aVarA, w10Var, gxVar);
            case 2:
                return new li0((Context) this.f9944b.j(), (m10) this.f9946d.f8433a, (Executor) this.f9945c.j(), 2);
            case 3:
                return new ti0((Context) this.f9944b.j(), (m10) this.f9946d.f8433a, ((j10) this.f9945c).a());
            case 4:
                return new tj0((Context) this.f9944b.j(), (Executor) this.f9945c.j(), (z10) this.f9946d.f8433a, 0);
            default:
                return new tj0((Context) this.f9944b.j(), (Executor) this.f9945c.j(), (z10) this.f9946d.f8433a, 1);
        }
    }

    public /* synthetic */ ri0(ls1 ls1Var, qs1 qs1Var, ns1 ns1Var, int i) {
        this.f9943a = i;
        this.f9944b = ls1Var;
        this.f9945c = qs1Var;
        this.f9946d = ns1Var;
    }
}
