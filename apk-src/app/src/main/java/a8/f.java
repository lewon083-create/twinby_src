package a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f531d;

    public f(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f528a = i;
        this.f529b = str;
        this.f530c = Collections.unmodifiableList(arrayList);
        Collections.unmodifiableList(arrayList2);
        Collections.unmodifiableList(arrayList3);
        this.f531d = Collections.unmodifiableList(arrayList4);
        Collections.unmodifiableList(arrayList5);
    }
}
