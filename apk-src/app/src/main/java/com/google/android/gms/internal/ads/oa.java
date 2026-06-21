package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8648e;

    public oa(int i, byte[] bArr, Map map, List list, boolean z5) {
        this.f8644a = i;
        this.f8645b = bArr;
        this.f8646c = map;
        this.f8647d = list == null ? null : Collections.unmodifiableList(list);
        this.f8648e = z5;
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
            arrayList.add(new ka((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public oa(int i, byte[] bArr, boolean z5, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ka kaVar = (ka) it.next();
                treeMap.put(kaVar.f7157a, kaVar.f7158b);
            }
        }
        this(i, bArr, treeMap, list, z5);
    }
}
