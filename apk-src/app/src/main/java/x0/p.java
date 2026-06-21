package x0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f35663b;

    public p(List list, c cVar) {
        f2.g.a("No preferred quality and fallback strategy.", (list.isEmpty() && cVar == c.f35563c) ? false : true);
        this.f35662a = Collections.unmodifiableList(new ArrayList(list));
        this.f35663b = cVar;
    }

    public static p a(List list, c cVar) {
        f2.g.g(list, "qualities cannot be null");
        f2.g.g(cVar, "fallbackStrategy cannot be null");
        f2.g.a("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            f2.g.a("qualities contain invalid quality: " + gVar, g.f35590l.contains(gVar));
        }
        return new p(list, cVar);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f35662a + ", fallbackStrategy=" + this.f35663b + "}";
    }
}
