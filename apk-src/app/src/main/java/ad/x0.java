package ad;

import com.google.android.gms.internal.measurement.h5;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends n implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Map f892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient w0 f894g;

    public x0(Map map) {
        h5.h(map.isEmpty());
        this.f892e = map;
    }

    @Override // ad.n
    public final Map c() {
        Map map = this.f892e;
        return map instanceof NavigableMap ? new f(this, (NavigableMap) map) : map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
    }

    @Override // ad.n
    public final Set d() {
        Map map = this.f892e;
        return map instanceof NavigableMap ? new g(this, (NavigableMap) map) : map instanceof SortedMap ? new j(this, (SortedMap) map) : new e(this, map);
    }

    public final void f() {
        Map map = this.f892e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f893f = 0;
    }

    public final Collection g() {
        return (List) this.f894g.get();
    }
}
