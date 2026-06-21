package w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f35063d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f35060a = str;
        this.f35061b = j10;
        this.f35062c = Collections.unmodifiableList(arrayList);
        this.f35063d = Collections.unmodifiableList(list);
    }
}
