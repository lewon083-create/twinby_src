package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f40689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f40690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cz1 f40691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ko2 f40692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sx f40693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final we f40694f;

    public lv(v9 v9Var, d4 d4Var, cz1 cz1Var, ko2 ko2Var, sx sxVar, we weVar) {
        this.f40689a = v9Var;
        this.f40690b = d4Var;
        this.f40691c = cz1Var;
        this.f40692d = ko2Var;
        this.f40693e = sxVar;
        this.f40694f = weVar;
    }

    public final go2 a(eo2 eo2Var, Map map) {
        if (!kotlin.jvm.internal.k0.d(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = do2.f37869a;
        if (str == null) {
            map.put("adapter", StringUtils.UNDEFINED);
        } else {
            map.put("adapter", str);
        }
        ho2 ho2VarA = this.f40693e.a(this.f40689a, this.f40690b);
        c cVar = ho2VarA.f39287b;
        LinkedHashMap linkedHashMapI = kotlin.collections.j0.i(map, ho2VarA.f39286a);
        LinkedHashMap linkedHashMap = kotlin.jvm.internal.k0.d(linkedHashMapI) ? linkedHashMapI : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        d03 d03Var = this.f40690b.f37616d.f37951a;
        if (d03Var != null) {
            String str2 = d03Var.b().f37246b;
            if (str2 == null) {
                linkedHashMap.put("size_type", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(d03Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(d03Var.getHeight()));
        }
        cz1 cz1Var = this.f40691c;
        if (cz1Var != null) {
            jj.i builder = new jj.i();
            builder.put("asset_name", cz1Var.f37577a);
            builder.put("action_type", cz1Var.f37578b);
            k22 k22Var = cz1Var.f37579c;
            if (k22Var != null) {
                builder.putAll(k22Var.a().f39286a);
            }
            Map map2 = cz1Var.f37580d.f45039a;
            if (map2 != null) {
                builder.putAll(map2);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            linkedHashMap.putAll(builder.b());
        }
        return new go2(eo2Var.f38217b, kotlin.collections.j0.m(linkedHashMap), cVar);
    }
}
