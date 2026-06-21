package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Device;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za2 f44515a;

    public /* synthetic */ wy() {
        this(new za2());
    }

    public final ho2 a(d4 d4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        za2 za2Var = this.f44515a;
        int i = d4Var.f37625n;
        za2Var.getClass();
        linkedHashMap.put(Device.JsonKeys.ORIENTATION, i != 1 ? i != 2 ? StringUtils.UNDEFINED : "landscape" : "portrait");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!kotlin.jvm.internal.k0.d(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(d4Var.f37624m));
        return new ho2(kotlin.collections.j0.i(linkedHashMap, linkedHashMap2), (c) null);
    }

    public wy(za2 za2Var) {
        this.f44515a = za2Var;
    }
}
