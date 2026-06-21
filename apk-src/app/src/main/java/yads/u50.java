package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f43560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f43561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b40 f43562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d50 f43563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t50 f43564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70 f43565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f43566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f43567h;

    public u50(m50 m50Var, t80 t80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var, List list, List list2) {
        this.f43560a = m50Var;
        this.f43561b = t80Var;
        this.f43562c = b40Var;
        this.f43563d = d50Var;
        this.f43564e = t50Var;
        this.f43565f = u70Var;
        this.f43566g = list;
        this.f43567h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return Intrinsics.a(this.f43560a, u50Var.f43560a) && Intrinsics.a(this.f43561b, u50Var.f43561b) && Intrinsics.a(this.f43562c, u50Var.f43562c) && Intrinsics.a(this.f43563d, u50Var.f43563d) && Intrinsics.a(this.f43564e, u50Var.f43564e) && Intrinsics.a(this.f43565f, u50Var.f43565f) && Intrinsics.a(this.f43566g, u50Var.f43566g) && Intrinsics.a(this.f43567h, u50Var.f43567h);
    }

    public final int hashCode() {
        return this.f43567h.hashCode() + eb.a(this.f43566g, (this.f43565f.hashCode() + ((this.f43564e.hashCode() + eb.a(this.f43563d.f37628a, (this.f43562c.hashCode() + ((this.f43561b.hashCode() + (this.f43560a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        m50 m50Var = this.f43560a;
        t80 t80Var = this.f43561b;
        b40 b40Var = this.f43562c;
        d50 d50Var = this.f43563d;
        t50 t50Var = this.f43564e;
        u70 u70Var = this.f43565f;
        List list = this.f43566g;
        List list2 = this.f43567h;
        StringBuilder sb2 = new StringBuilder("DebugPanelData(appData=");
        sb2.append(m50Var);
        sb2.append(", sdkData=");
        sb2.append(t80Var);
        sb2.append(", networkSettingsData=");
        sb2.append(b40Var);
        sb2.append(", adaptersData=");
        sb2.append(d50Var);
        sb2.append(", consentsData=");
        sb2.append(t50Var);
        sb2.append(", debugErrorIndicatorData=");
        sb2.append(u70Var);
        sb2.append(", adUnits=");
        return gf.a.l(sb2, list, ", alerts=", list2, ")");
    }
}
