package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37628a;

    public d50(ArrayList arrayList) {
        this.f37628a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && Intrinsics.a(this.f37628a, ((d50) obj).f37628a);
    }

    public final int hashCode() {
        return this.f37628a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f37628a + ")";
    }
}
