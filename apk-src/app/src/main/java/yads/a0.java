package yads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends e0 implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f36593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f36594g;

    public a0(Map map) {
        pg2.a(map.isEmpty());
        this.f36593f = map;
    }

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final n b() {
        Map map = this.f36593f;
        return map instanceof NavigableMap ? new r(this, (NavigableMap) this.f36593f) : map instanceof SortedMap ? new u(this, (SortedMap) this.f36593f) : new n(this, this.f36593f);
    }

    public final q c() {
        Map map = this.f36593f;
        return map instanceof NavigableMap ? new s(this, (NavigableMap) this.f36593f) : map instanceof SortedMap ? new v(this, (SortedMap) this.f36593f) : new q(this, this.f36593f);
    }
}
