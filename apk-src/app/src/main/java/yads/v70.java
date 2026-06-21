package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m50 f43917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u80 f43918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b40 f43919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d50 f43920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t50 f43921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70 f43922g;

    public v70(List list, m50 m50Var, u80 u80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var) {
        this.f43916a = list;
        this.f43917b = m50Var;
        this.f43918c = u80Var;
        this.f43919d = b40Var;
        this.f43920e = d50Var;
        this.f43921f = t50Var;
        this.f43922g = u70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return Intrinsics.a(this.f43916a, v70Var.f43916a) && Intrinsics.a(this.f43917b, v70Var.f43917b) && Intrinsics.a(this.f43918c, v70Var.f43918c) && Intrinsics.a(this.f43919d, v70Var.f43919d) && Intrinsics.a(this.f43920e, v70Var.f43920e) && Intrinsics.a(this.f43921f, v70Var.f43921f) && Intrinsics.a(this.f43922g, v70Var.f43922g);
    }

    public final int hashCode() {
        return this.f43922g.hashCode() + ((this.f43921f.hashCode() + eb.a(this.f43920e.f37628a, (this.f43919d.hashCode() + ((this.f43918c.hashCode() + ((this.f43917b.hashCode() + (this.f43916a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f43916a + ", appData=" + this.f43917b + ", sdkIntegrationData=" + this.f43918c + ", adNetworkSettingsData=" + this.f43919d + ", adaptersData=" + this.f43920e + ", consentsData=" + this.f43921f + ", debugErrorIndicatorData=" + this.f43922g + ")";
    }
}
