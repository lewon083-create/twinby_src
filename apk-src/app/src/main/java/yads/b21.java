package yads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b21 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f36906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib3 f36907b;

    public b21(st1 st1Var, ib3 ib3Var) {
        this.f36906a = st1Var;
        this.f36907b = ib3Var;
    }

    @Override // yads.ho
    public final z11 a(ro2 ro2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        v11 v11Var = v11.f43824c;
        map2.put("User-Agent", ((o53) this.f36907b.f39490a).a());
        return this.f36906a.a(ro2Var, map2);
    }
}
