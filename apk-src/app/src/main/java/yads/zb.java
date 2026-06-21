package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f45310f;

    public zb(int i, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f45305a = i;
        this.f45306b = i10;
        this.f45307c = Collections.unmodifiableList(arrayList);
        this.f45308d = Collections.unmodifiableList(list);
        this.f45309e = Collections.unmodifiableList(list2);
        this.f45310f = Collections.unmodifiableList(list3);
    }
}
