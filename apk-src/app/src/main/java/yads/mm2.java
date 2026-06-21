package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f40964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f40965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f40966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40967d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mm2(Context context, nu2 nu2Var, o5 o5Var, e00 e00Var, v9 v9Var, String str) {
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this(o5Var, e00Var, v9Var, str, cf.a(context, lu3Var.b()));
    }

    public final void a() {
        if (this.f40967d) {
            this.f40967d = false;
            return;
        }
        ho2 ho2VarA = this.f40966c.a();
        Map map = this.f40964a.f43949u;
        if (map != null) {
            ho2VarA.f39286a.putAll(map);
        }
        c cVar = this.f40964a.i;
        ho2VarA.f39287b = cVar;
        this.f40965b.a(new go2(eo2.f38216z.a(), kotlin.collections.j0.m(ho2VarA.f39286a), cVar));
    }

    public mm2(o5 o5Var, e00 e00Var, v9 v9Var, String str, ko2 ko2Var) {
        this.f40964a = v9Var;
        this.f40965b = ko2Var;
        this.f40966c = new ij(o5Var, e00Var, str);
        this.f40967d = true;
    }
}
