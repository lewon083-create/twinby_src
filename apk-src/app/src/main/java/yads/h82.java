package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f39071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39073e;

    public h82(int i, byte[] bArr, Map map, List list, boolean z5) {
        this.f39069a = i;
        this.f39070b = bArr;
        this.f39071c = map;
        if (list == null) {
            this.f39072d = null;
        } else {
            this.f39072d = Collections.unmodifiableList(list);
        }
        this.f39073e = z5;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Map a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r01 r01Var = (r01) it.next();
            treeMap.put(r01Var.f42435a, r01Var.f42436b);
        }
        return treeMap;
    }
}
