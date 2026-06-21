package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ho2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f39287b;

    public /* synthetic */ ho2(Map map, int i) {
        this((i & 1) != 0 ? kotlin.collections.j0.d() : map, (c) null);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f39286a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f39286a.put(str, StringUtils.UNDEFINED);
        } else {
            this.f39286a.put(str, obj);
        }
    }

    public ho2(Map map, c cVar) {
        map = kotlin.jvm.internal.k0.d(map) ? map : null;
        this.f39286a = map == null ? new LinkedHashMap() : map;
        this.f39287b = cVar;
    }
}
