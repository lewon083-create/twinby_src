package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class os1 extends ks1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8768b = 0;

    static {
        ns1.a(Collections.EMPTY_MAP);
    }

    public static in0 a(int i) {
        return new in0(i);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map j() {
        Map map = this.f7291a;
        LinkedHashMap linkedHashMapK = ix.K(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapK.put(entry.getKey(), ((qs1) entry.getValue()).j());
        }
        return Collections.unmodifiableMap(linkedHashMapK);
    }
}
