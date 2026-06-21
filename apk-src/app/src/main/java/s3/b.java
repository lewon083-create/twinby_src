package s3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f32451b = new b(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32452a;

    public b(HashMap map) {
        this.f32452a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f32452a.equals(((b) obj).f32452a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32452a.hashCode();
    }
}
