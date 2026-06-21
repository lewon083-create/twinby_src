package yads;

import android.content.Context;
import io.sentry.clientreport.DiscardedEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f44916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ko2 f44917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sc2 f44918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final we f44919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gp2 f44920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hq2 f44921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44922g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y5(Context context, d4 d4Var, nu2 nu2Var, w5 w5Var) {
        lu3 lu3Var = (lu3) nu2Var;
        lu3Var.d();
        su3 su3Var = su3.f43085a;
        this(d4Var, cf.a(context, lu3Var.b()), new x5(w5Var), new we(context));
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (objArr[i] != null) {
                z5 = true;
                break;
            }
            i++;
        }
        this.f44922g = z5;
    }

    public final void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.put(DiscardedEvent.JsonKeys.REASON, str2);
        map.put("durations", this.f44918c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f44922g));
        a(map);
    }

    public y5(d4 d4Var, ko2 ko2Var, sc2 sc2Var, we weVar) {
        this.f44916a = d4Var;
        this.f44917b = ko2Var;
        this.f44918c = sc2Var;
        this.f44919d = weVar;
    }

    public final void a(HashMap map) {
        ho2 ho2Var = new ho2(map, 2);
        gp2 gp2Var = this.f44920e;
        if (gp2Var != null) {
            ho2Var.f39286a.putAll(gp2Var.a());
        }
        hq2 hq2Var = this.f44921f;
        if (hq2Var != null) {
            ho2Var = io2.a(ho2Var, ((k12) hq2Var).a());
        }
        eo2 eo2Var = eo2.f38194c;
        Map map2 = ho2Var.f39286a;
        c cVar = ho2Var.f39287b;
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(map2);
        this.f44917b.a(new go2("ad_loading_result", linkedHashMapM, cVar));
        if (Intrinsics.a(map.get("status"), "success")) {
            we weVar = this.f44919d;
            String str = this.f44916a.f37623l;
            if (str == null) {
                str = do2.f37869a;
            }
            weVar.a(eo2Var, linkedHashMapM, str, null);
        }
    }

    public final void a() {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("durations", this.f44918c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f44922g));
        a(map);
    }
}
