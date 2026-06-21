package f3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16576a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Intrinsics.a(this.f16576a, ((c) obj).f16576a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16576a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f16576a + ')';
    }
}
