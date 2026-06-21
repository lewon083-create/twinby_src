package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g51 implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38660a;

    public g51(Map map) {
        this.f38660a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g51) && Intrinsics.a(this.f38660a, ((g51) obj).f38660a);
    }

    public final int hashCode() {
        return this.f38660a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.f38660a + ")";
    }
}
