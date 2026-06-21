package yads;

import io.sentry.clientreport.DiscardedEvent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f37120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f37121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f37122c;

    public /* synthetic */ bq(o5 o5Var, e00 e00Var, v9 v9Var, String str, ct1 ct1Var) {
        this(v9Var, ct1Var, new ij(o5Var, e00Var, str));
    }

    public final void a(String str) {
        ho2 ho2VarA = this.f37122c.a();
        ho2VarA.b("no_view_for_asset", DiscardedEvent.JsonKeys.REASON);
        ho2VarA.b(str, "asset_name");
        Map map = this.f37120a.f43949u;
        if (map != null) {
            ho2VarA.f39286a.putAll(map);
        }
        c cVar = this.f37120a.i;
        ho2VarA.f39287b = cVar;
        this.f37121b.a(new go2(eo2.A.a(), kotlin.collections.j0.m(ho2VarA.f39286a), cVar));
    }

    public bq(v9 v9Var, ct1 ct1Var, ij ijVar) {
        this.f37120a = v9Var;
        this.f37121b = ct1Var;
        this.f37122c = ijVar;
    }
}
