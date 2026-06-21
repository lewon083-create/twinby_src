package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ng3 f44342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lp3 f44343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44348h;
    public rl3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f44349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f44350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f44351l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f44352m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f44353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ge3 f44354o;

    public wd3(boolean z5, ng3 ng3Var) {
        this.f44341a = z5;
        this.f44342b = ng3Var;
        kotlin.collections.j0.d();
        this.f44353n = new LinkedHashMap();
        this.f44354o = new ge3();
    }

    public final wd3 a(Map map) {
        if (map == null) {
            map = kotlin.collections.j0.d();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterable iterable = (List) entry.getValue();
            if (iterable == null) {
                iterable = kotlin.collections.b0.f27475b;
            }
            for (String str2 : CollectionsKt.B(iterable)) {
                LinkedHashMap linkedHashMap = this.f44353n;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(str2);
            }
        }
        return this;
    }

    public final xd3 a() {
        ng3 ng3Var = this.f44342b;
        LinkedHashMap linkedHashMapM = this.f44353n;
        rl3 rl3Var = this.i;
        ng3Var.getClass();
        pt2 pt2VarA = fw2.a().a(ng3Var.f41247a);
        if (pt2VarA == null || !pt2VarA.f42038l) {
            linkedHashMapM = kotlin.collections.j0.m(linkedHashMapM);
            List list = rl3Var != null ? rl3Var.f42631a : null;
            List list2 = (List) linkedHashMapM.get("impression");
            if (list != null) {
                linkedHashMapM.put("impression", list);
            } else {
                linkedHashMapM.remove("impression");
            }
            if (list2 != null) {
                linkedHashMapM.put("render_impression", list2);
            } else {
                linkedHashMapM.remove("render_impression");
            }
        }
        return new xd3(this.f44341a, this.f44351l, this.f44353n, this.f44354o, this.f44344d, this.f44345e, this.f44346f, this.f44347g, this.f44348h, this.i, this.f44349j, this.f44350k, this.f44343c, this.f44352m, linkedHashMapM);
    }
}
