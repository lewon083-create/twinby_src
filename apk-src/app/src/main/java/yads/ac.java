package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ac implements pc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo2 f36680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36681b;

    public ac(fo2 fo2Var, String str) {
        this.f36680a = fo2Var;
        this.f36681b = str;
    }

    @Override // yads.pc2
    public final Map a(long j10) {
        Map mapD = kotlin.collections.j0.d();
        if (!kotlin.jvm.internal.k0.d(mapD)) {
            mapD = null;
        }
        if (mapD == null) {
            mapD = new LinkedHashMap();
        }
        String str = this.f36681b;
        if (str == null) {
            mapD.put("adapter", StringUtils.UNDEFINED);
        } else {
            mapD.put("adapter", str);
        }
        String str2 = this.f36680a.f38522b;
        if (str2 == null) {
            mapD.put("status", StringUtils.UNDEFINED);
        } else {
            mapD.put("status", str2);
        }
        mapD.put("duration", Long.valueOf(j10));
        return mapD;
    }
}
