package a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f527g;

    public e(int i, int i10, ArrayList arrayList, d dVar, String str, ArrayList arrayList2, ArrayList arrayList3, HashMap map, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f521a = i;
        this.f522b = i10;
        this.f523c = Collections.unmodifiableList(arrayList);
        this.f524d = dVar;
        this.f525e = str;
        Collections.unmodifiableList(arrayList2);
        Collections.unmodifiableList(arrayList3);
        this.f526f = Collections.unmodifiableMap(map);
        Collections.unmodifiableMap(map2);
        this.f527g = Collections.unmodifiableList(arrayList4);
        Collections.unmodifiableList(arrayList5);
        Collections.unmodifiableList(arrayList6);
    }
}
