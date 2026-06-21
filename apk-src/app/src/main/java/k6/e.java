package k6;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j0.f f27051h = new j0.f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.f f27052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.e f27053b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f27056e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27058g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f27055d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f27057f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.f f27054c = f27051h;

    public e(v7.f fVar, h3.e eVar) {
        this.f27052a = fVar;
        this.f27053b = eVar;
    }

    public final void a(List list) {
        for (d dVar : this.f27055d) {
            ((d0) dVar).f27049a.onCurrentListChanged(list, this.f27057f);
        }
    }
}
