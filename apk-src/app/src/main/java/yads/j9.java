package yads;

import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j9 implements gp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f39782b = new n9();

    public j9(d4 d4Var) {
        this.f39781a = d4Var;
    }

    @Override // yads.gp2
    public final Map a() {
        LinkedHashMap linkedHashMapH = kotlin.collections.j0.h(new Pair(AdRevenueScheme.AD_TYPE, this.f39781a.f37613a.f37950b));
        String str = this.f39781a.f37615c.f39118a;
        if (str != null) {
            linkedHashMapH.put("ad_unit_id", str);
        }
        linkedHashMapH.putAll(this.f39782b.a(this.f39781a.f37617e).f39286a);
        return linkedHashMapH;
    }
}
