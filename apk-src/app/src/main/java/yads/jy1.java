package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ct1 f40013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij f40014b;

    public jy1(Context context, nu2 nu2Var, o5 o5Var, e00 e00Var, String str) {
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this.f40013a = cf.a(context, lu3Var.b());
        this.f40014b = new ij(o5Var, e00Var, str);
    }

    public final void a(ArrayList arrayList, eo2 eo2Var) {
        ho2 ho2VarA = this.f40014b.a();
        ho2VarA.b(arrayList, "assets");
        Map map = ho2VarA.f39286a;
        this.f40013a.a(new go2(eo2Var.f38217b, kotlin.collections.j0.m(map), ho2VarA.f39287b));
    }
}
