package yads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f40047b = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k2 f40048c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40049a = new LinkedHashMap();

    public k2() {
        a("window_type_browser", new u1());
        a("window_type_activity_result", new n2());
    }

    public final synchronized void a(String str, i2 i2Var) {
        if (!this.f40049a.containsKey(str)) {
            this.f40049a.put(str, i2Var);
        }
    }
}
