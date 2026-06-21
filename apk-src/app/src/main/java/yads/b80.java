package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f36954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f36955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f36957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70 f36958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c80 f36959f;

    public b80(m50 m50Var, t80 t80Var, ArrayList arrayList, t50 t50Var, u70 u70Var, c80 c80Var) {
        this.f36954a = m50Var;
        this.f36955b = t80Var;
        this.f36956c = arrayList;
        this.f36957d = t50Var;
        this.f36958e = u70Var;
        this.f36959f = c80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80Var = (b80) obj;
        return Intrinsics.a(this.f36954a, b80Var.f36954a) && Intrinsics.a(this.f36955b, b80Var.f36955b) && Intrinsics.a(this.f36956c, b80Var.f36956c) && Intrinsics.a(this.f36957d, b80Var.f36957d) && Intrinsics.a(this.f36958e, b80Var.f36958e) && Intrinsics.a(this.f36959f, b80Var.f36959f);
    }

    public final int hashCode() {
        int iHashCode = (this.f36958e.hashCode() + ((this.f36957d.hashCode() + eb.a(this.f36956c, (this.f36955b.hashCode() + (this.f36954a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        c80 c80Var = this.f36959f;
        return iHashCode + (c80Var == null ? 0 : c80Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f36954a + ", sdkData=" + this.f36955b + ", mediationNetworksData=" + this.f36956c + ", consentsData=" + this.f36957d + ", debugErrorIndicatorData=" + this.f36958e + ", logsData=" + this.f36959f + ")";
    }
}
