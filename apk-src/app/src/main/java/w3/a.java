package w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f35022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f35023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f35024f;

    public a(long j10, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.f35019a = j10;
        this.f35020b = i;
        this.f35021c = Collections.unmodifiableList(arrayList);
        this.f35022d = Collections.unmodifiableList(list);
        this.f35023e = Collections.unmodifiableList(list2);
        this.f35024f = Collections.unmodifiableList(list3);
    }
}
