package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dh3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf1 f37770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv f37771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b20 f37772c;

    public dh3(kf1 kf1Var, hv hvVar, b20 b20Var) {
        this.f37770a = kf1Var;
        this.f37771b = hvVar;
        this.f37772c = b20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kf1 kf1Var;
        b20 b20Var = this.f37772c;
        if (b20Var != null) {
            kf1 kf1Var2 = this.f37770a;
            kf1Var = new kf1(kf1Var2.f40181a, kf1Var2.f40182b, kf1Var2.f40183c, b20Var.f36902f, kf1Var2.f40185e);
        } else {
            kf1Var = this.f37770a;
        }
        kf1 kf1Var3 = kf1Var;
        hv hvVar = this.f37771b;
        n12 n12Var = hvVar.f39336c;
        iv ivVar = n12Var.f41133a;
        oi oiVar = hvVar.f39334a;
        y3 y3Var = hvVar.f39335b;
        mn2 mn2Var = hvVar.f39337d;
        kx0 kx0Var = hvVar.f39338e;
        ivVar.getClass();
        new vz1(kx0Var, mn2Var, y3Var, n12Var, oiVar, kf1Var3).onClick(view);
    }
}
