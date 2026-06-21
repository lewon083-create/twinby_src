package ti;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f33825a;

    public g0(Map map) {
        this.f33825a = map;
    }

    public g0(o9.b bVar) {
        HashMap map = new HashMap();
        for (Map.Entry entry : bVar.f().entrySet()) {
            map.put((String) entry.getKey(), new a0((o9.a) entry.getValue()));
        }
        this.f33825a = map;
    }
}
