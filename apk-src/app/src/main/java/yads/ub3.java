package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ub3 implements wb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43629a;

    public ub3(List list) {
        this.f43629a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub3) && Intrinsics.a(this.f43629a, ((ub3) obj).f43629a);
    }

    public final int hashCode() {
        return this.f43629a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.f43629a + ")";
    }
}
