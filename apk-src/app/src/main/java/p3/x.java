package p3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f31207a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f31208b;

    public final synchronized Map a() {
        try {
            if (this.f31208b == null) {
                this.f31208b = Collections.unmodifiableMap(new HashMap(this.f31207a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f31208b;
    }
}
