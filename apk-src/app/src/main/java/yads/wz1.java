package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wz1 implements vm0, a61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f44534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f44535b;

    public /* synthetic */ wz1(Context context, d4 d4Var, nu2 nu2Var, v9 v9Var) {
        yz1 yz1Var = new yz1();
        this(yz1Var, new f1(context, d4Var, nu2Var, v9Var, yz1Var));
    }

    @Override // yads.vm0
    public final void a() {
        this.f44534a.a();
    }

    @Override // yads.a61
    public final void a(j5 j5Var) {
        this.f44534a.a(j5Var);
    }

    public wz1(yz1 yz1Var, f1 f1Var) {
        this.f44534a = yz1Var;
        this.f44535b = f1Var;
    }
}
