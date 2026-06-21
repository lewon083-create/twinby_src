package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39128d;

    public hc2(String str, long j10, ArrayList arrayList, List list) {
        this.f39125a = str;
        this.f39126b = j10;
        this.f39127c = Collections.unmodifiableList(arrayList);
        this.f39128d = Collections.unmodifiableList(list);
    }
}
