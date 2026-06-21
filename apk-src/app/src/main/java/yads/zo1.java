package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zo1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f45496g = kotlin.collections.s.f(eo2.f38203m, eo2.f38204n);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f45497h = kotlin.collections.s.f(eo2.f38205o, eo2.f38206p, eo2.D, eo2.E);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f45498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f45499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f45500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yo1 f45501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lr1 f45502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vq2 f45503f;

    public /* synthetic */ zo1(d4 d4Var, nu2 nu2Var, v9 v9Var) {
        this(d4Var, nu2Var, v9Var, new yo1(), new lr1(), new vq2());
    }

    public final void a(Context context, sq1 sq1Var, Map map) {
        a(context, eo2.f38197f, sq1Var, null, map);
    }

    public final void a(Context context, eo2 eo2Var, sq1 sq1Var, String str, Map map) {
        ho2 ho2VarA;
        yo1 yo1Var = this.f45501d;
        v9 v9Var = this.f45500c;
        d4 d4Var = this.f45498a;
        yo1Var.getClass();
        if ((v9Var != null ? v9Var.f43941m : null) == sz.f43133b) {
            Object obj = v9Var.f43948t;
            ho2VarA = yo1Var.f45135b.a(v9Var, d4Var, obj instanceof f12 ? (f12) obj : null);
        } else {
            ho2VarA = yo1Var.f45134a.a(v9Var, d4Var);
        }
        this.f45502e.getClass();
        ho2 ho2VarA2 = io2.a(ho2VarA, lr1.a(sq1Var));
        ho2VarA2.f39286a.putAll(map);
        Map map2 = ho2VarA2.f39286a;
        c cVar = ho2VarA2.f39287b;
        String str2 = eo2Var.f38217b;
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(map2);
        go2 go2Var = new go2(str2, linkedHashMapM, cVar);
        ((lu3) this.f45499b).getClass();
        su3 su3Var = su3.f43085a;
        cf.a(context, new fq3(((lu3) this.f45499b).f40688a)).a(go2Var);
        new we(context).a(eo2Var, linkedHashMapM, str, sq1Var.f43055g);
    }

    public zo1(d4 d4Var, nu2 nu2Var, v9 v9Var, yo1 yo1Var, lr1 lr1Var, vq2 vq2Var) {
        this.f45498a = d4Var;
        this.f45499b = nu2Var;
        this.f45500c = v9Var;
        this.f45501d = yo1Var;
        this.f45502e = lr1Var;
        this.f45503f = vq2Var;
    }
}
