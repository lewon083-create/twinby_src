package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f43521a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f43522b;

    public final synchronized Map a() {
        try {
            if (this.f43522b == null) {
                this.f43522b = Collections.unmodifiableMap(new HashMap(this.f43521a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43522b;
    }
}
