package y8;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements v8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f36565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f36566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f36567c;

    public p(Set set, j jVar, q qVar) {
        this.f36565a = set;
        this.f36566b = jVar;
        this.f36567c = qVar;
    }

    public final a1.m a(String str, v8.c cVar, v8.e eVar) {
        Set set = this.f36565a;
        if (set.contains(cVar)) {
            return new a1.m(this.f36566b, str, cVar, eVar, this.f36567c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
