package ad;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Collection f843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Map f844d;

    public Map a() {
        Map map = this.f844d;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.f844d = mapC;
        return mapC;
    }

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public Set e() {
        Set set = this.f842b;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f842b = setD;
        return setD;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return a().equals(((n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
