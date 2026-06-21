package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Device;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f41354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f41355b;

    public nv(d4 d4Var, nu2 nu2Var) {
        this.f41354a = d4Var;
        this.f41355b = nu2Var;
    }

    public final void a(Context context, e00 e00Var, kh2 kh2Var, Long l10) {
        Map mapD = kotlin.collections.j0.d();
        if (!kotlin.jvm.internal.k0.d(mapD)) {
            mapD = null;
        }
        if (mapD == null) {
            mapD = new LinkedHashMap();
        }
        String str = StringUtils.UNDEFINED;
        if (e00Var == null) {
            mapD.put(AdRevenueScheme.AD_TYPE, StringUtils.UNDEFINED);
        } else {
            mapD.put(AdRevenueScheme.AD_TYPE, e00Var);
        }
        if (l10 == null) {
            mapD.put("duration", StringUtils.UNDEFINED);
        } else {
            mapD.put("duration", l10);
        }
        LinkedHashMap linkedHashMapA = mh2.a(kh2Var);
        mapD.putAll(linkedHashMapA);
        String str2 = (String) linkedHashMapA.get("adapter");
        cq2 cq2Var = new cq2();
        n9 n9Var = new n9();
        d4 d4Var = this.f41354a;
        ho2 ho2VarB = cq2Var.b(null, d4Var);
        ho2 ho2VarA = n9Var.a(d4Var.f37617e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i = d4Var.f37625n;
        if (i == 1) {
            str = "portrait";
        } else if (i == 2) {
            str = "landscape";
        }
        linkedHashMap.put(Device.JsonKeys.ORIENTATION, str);
        ho2 ho2VarA2 = io2.a(ho2VarB, ho2VarA);
        c cVar = ho2VarA2.f39287b;
        if (cVar == null) {
            cVar = null;
        }
        ho2 ho2Var = new ho2(kotlin.collections.j0.i(ho2VarA2.f39286a, linkedHashMap), cVar);
        c cVar2 = ho2Var.f39287b;
        LinkedHashMap linkedHashMapI = kotlin.collections.j0.i(mapD, ho2Var.f39286a);
        if (!kotlin.jvm.internal.k0.d(linkedHashMapI)) {
            linkedHashMapI = null;
        }
        if (linkedHashMapI == null) {
            linkedHashMapI = new LinkedHashMap();
        }
        eo2 eo2Var = eo2.I;
        LinkedHashMap linkedHashMapM = kotlin.collections.j0.m(linkedHashMapI);
        go2 go2Var = new go2("client_bidding_loading_result", linkedHashMapM, cVar2);
        ((lu3) this.f41355b).getClass();
        su3 su3Var = su3.f43085a;
        cf.a(context, new fq3(((lu3) this.f41355b).f40688a)).a(go2Var);
        new we(context).a(eo2Var, linkedHashMapM, str2, null);
    }
}
