package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class be0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm2 f37003a;

    public /* synthetic */ be0() {
        this(new bm2());
    }

    public final String a(String str, Map map) {
        LinkedHashMap linkedHashMapI = kotlin.collections.j0.i(map, kotlin.collections.i0.c(new Pair("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis()))));
        this.f37003a.getClass();
        for (Map.Entry entry : linkedHashMapI.entrySet()) {
            str = kotlin.text.a0.l(str, (String) entry.getKey(), (String) entry.getValue());
        }
        return str;
    }

    public be0(bm2 bm2Var) {
        this.f37003a = bm2Var;
    }
}
