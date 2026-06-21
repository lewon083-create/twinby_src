package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37308b;

    public c80(List list, List list2) {
        this.f37307a = list;
        this.f37308b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return Intrinsics.a(this.f37307a, c80Var.f37307a) && Intrinsics.a(this.f37308b, c80Var.f37308b);
    }

    public final int hashCode() {
        return this.f37308b.hashCode() + (this.f37307a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f37307a + ", networkLogs=" + this.f37308b + ")";
    }
}
