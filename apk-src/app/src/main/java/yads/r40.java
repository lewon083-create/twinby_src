package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42485a;

    public r40(List list) {
        this.f42485a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r40) && Intrinsics.a(this.f42485a, ((r40) obj).f42485a);
    }

    public final int hashCode() {
        return this.f42485a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f42485a + ")";
    }
}
