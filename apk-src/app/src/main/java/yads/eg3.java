package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f38126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ct1 f38127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cg3 f38128c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dg3 f38129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f38130f;

    public eg3(Context context, nu2 nu2Var, v9 v9Var, w5 w5Var) {
        this.f38126a = v9Var;
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this.f38127b = cf.a(context, lu3Var.b());
        this.f38128c = new cg3(w5Var);
    }

    public final void a(Map map) {
        Object objD = this.f38130f;
        if (objD == null) {
            objD = kotlin.collections.j0.d();
        }
        map.putAll(objD);
        map.putAll(kotlin.collections.j0.d());
        dg3 dg3Var = this.f38129e;
        Map mapD = dg3Var != null ? dg3Var.a().f39286a : null;
        if (mapD == null) {
            mapD = kotlin.collections.j0.d();
        }
        map.putAll(mapD);
        eo2 eo2Var = eo2.f38194c;
        v9 v9Var = this.f38126a;
        this.f38127b.a(new go2("video_ad_rendering_result", kotlin.collections.j0.m(map), v9Var != null ? v9Var.i : null));
    }
}
