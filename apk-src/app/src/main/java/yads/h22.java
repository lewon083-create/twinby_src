package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h22 implements v22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f38985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f38986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f38987c;

    public /* synthetic */ h22() {
        this(new cq2(), new n9(), new wy());
    }

    @Override // yads.v22
    public final ho2 a(v9 v9Var, d4 d4Var, f12 f12Var) {
        cq2 cq2Var = this.f38985a;
        ho2 ho2VarA = cq2Var.a(v9Var, d4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (f12Var != null) {
            List listA = cq2Var.f37477b.a(f12Var);
            if (!listA.isEmpty()) {
                linkedHashMap.put("image_sizes", listA);
            }
            cq2Var.f37477b.getClass();
            List list = f12Var.f38323a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((hy1) it.next()).f39363a.f38240b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            cq2Var.f37477b.getClass();
            ArrayList arrayListB = i12.b(f12Var);
            Object objFirstOrNull = CollectionsKt.firstOrNull(arrayListB);
            if (objFirstOrNull == null) {
                linkedHashMap.put("ad_id", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("ad_id", objFirstOrNull);
            }
            if (arrayListB.isEmpty()) {
                arrayListB = null;
            }
            if (arrayListB == null) {
                linkedHashMap.put("ad_ids", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("ad_ids", arrayListB);
            }
        }
        c cVar = ho2VarA.f39287b;
        if (cVar == null) {
            cVar = null;
        }
        LinkedHashMap linkedHashMapI = kotlin.collections.j0.i(ho2VarA.f39286a, linkedHashMap);
        if (!kotlin.jvm.internal.k0.d(linkedHashMapI)) {
            linkedHashMapI = null;
        }
        if (linkedHashMapI == null) {
            linkedHashMapI = new LinkedHashMap();
        }
        ho2 ho2VarA2 = this.f38986b.a(d4Var.f37617e);
        ho2 ho2VarA3 = this.f38987c.a(d4Var);
        if (cVar == null) {
            cVar = ho2VarA2.f39287b;
        }
        LinkedHashMap linkedHashMapI2 = kotlin.collections.j0.i(linkedHashMapI, ho2VarA2.f39286a);
        LinkedHashMap linkedHashMap2 = kotlin.jvm.internal.k0.d(linkedHashMapI2) ? linkedHashMapI2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = ho2VarA3.f39287b;
        }
        return new ho2(kotlin.collections.j0.i(linkedHashMap2, ho2VarA3.f39286a), cVar);
    }

    public h22(cq2 cq2Var, n9 n9Var, wy wyVar) {
        this.f38985a = cq2Var;
        this.f38986b = n9Var;
        this.f38987c = wyVar;
    }
}
