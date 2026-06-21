package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80 f44306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44307b;

    public w80(v80 v80Var, List list) {
        this.f44306a = v80Var;
        this.f44307b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.f44306a == w80Var.f44306a && Intrinsics.a(this.f44307b, w80Var.f44307b);
    }

    public final int hashCode() {
        int iHashCode = this.f44306a.hashCode() * 31;
        List list = this.f44307b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f44306a + ", messages=" + this.f44307b + ")";
    }
}
