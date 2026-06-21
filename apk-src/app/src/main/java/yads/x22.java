package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x22 extends r32 implements y02 {
    public final w22 P;
    public final oi2 Q;

    public x22(Context context, w22 w22Var, oi2 oi2Var, up upVar, hz1 hz1Var) {
        super(context, upVar, hz1Var);
        this.P = w22Var;
        this.Q = oi2Var;
        a(a(upVar.d().a()));
    }

    @Override // yads.y02
    public final void a(t12 t12Var) {
        this.P.a(t12Var);
    }

    @Override // yads.y02
    public final y00 getAdAssets() {
        return this.P.getAdAssets();
    }

    @Override // yads.r32, yads.y02
    public final void loadImages() {
        this.P.loadImages();
    }

    @Override // yads.r32, yads.y02
    public final void a(z00 z00Var) {
        this.P.a(z00Var);
    }

    public final k22 a(d4 d4Var) {
        x42 x42Var = x42.f44598c;
        k22 k22Var = new k22(d4Var, AdRevenueScheme.AD_UNIT, this.i, this.f42466j, new h22(), null);
        k22Var.f40056f = s22.f42792c;
        return k22Var;
    }
}
