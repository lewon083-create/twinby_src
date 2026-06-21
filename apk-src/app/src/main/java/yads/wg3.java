package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wg3 extends xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44397a;

    public wg3(List list) {
        super(0);
        this.f44397a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg3) && Intrinsics.a(this.f44397a, ((wg3) obj).f44397a);
    }

    public final int hashCode() {
        return this.f44397a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f44397a + ")";
    }
}
