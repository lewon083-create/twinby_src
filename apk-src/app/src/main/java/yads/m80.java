package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m80 {

    @NotNull
    public static final l80 Companion = new l80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qk.a[] f40840g = {null, null, new uk.c(yq1.f45145a), null, new uk.c(zu1.f45541a), new uk.c(hu1.f39330a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m50 f40841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t80 f40842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t50 f40844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f40845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f40846f;

    public /* synthetic */ m80(int i, m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        if (63 != (i & 63)) {
            uk.o0.e(i, 63, k80.f40100a.getDescriptor());
            throw null;
        }
        this.f40841a = m50Var;
        this.f40842b = t80Var;
        this.f40843c = list;
        this.f40844d = t50Var;
        this.f40845e = list2;
        this.f40846f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return Intrinsics.a(this.f40841a, m80Var.f40841a) && Intrinsics.a(this.f40842b, m80Var.f40842b) && Intrinsics.a(this.f40843c, m80Var.f40843c) && Intrinsics.a(this.f40844d, m80Var.f40844d) && Intrinsics.a(this.f40845e, m80Var.f40845e) && Intrinsics.a(this.f40846f, m80Var.f40846f);
    }

    public final int hashCode() {
        return this.f40846f.hashCode() + eb.a(this.f40845e, (this.f40844d.hashCode() + eb.a(this.f40843c, (this.f40842b.hashCode() + (this.f40841a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        m50 m50Var = this.f40841a;
        t80 t80Var = this.f40842b;
        List list = this.f40843c;
        t50 t50Var = this.f40844d;
        List list2 = this.f40845e;
        List list3 = this.f40846f;
        StringBuilder sb2 = new StringBuilder("DebugPanelReportData(appData=");
        sb2.append(m50Var);
        sb2.append(", sdkData=");
        sb2.append(t80Var);
        sb2.append(", networksData=");
        sb2.append(list);
        sb2.append(", consentsData=");
        sb2.append(t50Var);
        sb2.append(", sdkLogs=");
        return gf.a.l(sb2, list2, ", networkLogs=", list3, ")");
    }

    public m80(m50 m50Var, t80 t80Var, List list, t50 t50Var, List list2, List list3) {
        this.f40841a = m50Var;
        this.f40842b = t80Var;
        this.f40843c = list;
        this.f40844d = t50Var;
        this.f40845e = list2;
        this.f40846f = list3;
    }
}
