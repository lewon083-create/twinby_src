package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80 f43601b;

    public u80(String str, w80 w80Var) {
        this.f43600a = str;
        this.f43601b = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return Intrinsics.a(this.f43600a, u80Var.f43600a) && Intrinsics.a(this.f43601b, u80Var.f43601b);
    }

    public final int hashCode() {
        return this.f43601b.hashCode() + (this.f43600a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f43600a + ", sdkIntegrationStatusData=" + this.f43601b + ")";
    }
}
