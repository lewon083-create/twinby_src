package rd;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f32295b;

    public c(String str, Map map) {
        this.f32294a = str;
        this.f32295b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32294a.equals(cVar.f32294a) && this.f32295b.equals(cVar.f32295b);
    }

    public final int hashCode() {
        return this.f32295b.hashCode() + (this.f32294a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f32294a + ", properties=" + this.f32295b.values() + "}";
    }
}
