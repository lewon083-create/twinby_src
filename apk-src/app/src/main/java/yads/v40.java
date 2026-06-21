package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43871a;

    public v40(ArrayList arrayList) {
        this.f43871a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && Intrinsics.a(this.f43871a, ((v40) obj).f43871a);
    }

    public final int hashCode() {
        return this.f43871a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f43871a + ")";
    }
}
