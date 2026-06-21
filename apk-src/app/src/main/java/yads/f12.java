package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j5 f38326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f38327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f38329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38330h;
    public final py2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7 f38331j;

    public f12(List list, List list2, List list3, j5 j5Var, Map map, List list4, List list5, String str, py2 py2Var, c7 c7Var) {
        this.f38323a = list;
        this.f38324b = list2;
        this.f38325c = list3;
        this.f38326d = j5Var;
        this.f38327e = map;
        this.f38328f = list4;
        this.f38329g = list5;
        this.f38330h = str;
        this.i = py2Var;
        this.f38331j = c7Var;
    }

    public final List a() {
        return this.f38328f;
    }

    public final py2 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f12)) {
            return false;
        }
        f12 f12Var = (f12) obj;
        return Intrinsics.a(this.f38323a, f12Var.f38323a) && Intrinsics.a(this.f38324b, f12Var.f38324b) && Intrinsics.a(this.f38325c, f12Var.f38325c) && Intrinsics.a(this.f38326d, f12Var.f38326d) && Intrinsics.a(this.f38327e, f12Var.f38327e) && Intrinsics.a(this.f38328f, f12Var.f38328f) && Intrinsics.a(this.f38329g, f12Var.f38329g) && Intrinsics.a(this.f38330h, f12Var.f38330h) && Intrinsics.a(this.i, f12Var.i) && Intrinsics.a(this.f38331j, f12Var.f38331j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f38325c, eb.a(this.f38324b, this.f38323a.hashCode() * 31, 31), 31);
        j5 j5Var = this.f38326d;
        int iA2 = eb.a(this.f38329g, eb.a(this.f38328f, (this.f38327e.hashCode() + ((iA + (j5Var == null ? 0 : j5Var.f39727b.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f38330h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        py2 py2Var = this.i;
        int iHashCode2 = (iHashCode + (py2Var == null ? 0 : py2Var.hashCode())) * 31;
        c7 c7Var = this.f38331j;
        return iHashCode2 + (c7Var != null ? c7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f38323a + ", assets=" + this.f38324b + ", renderTrackingUrls=" + this.f38325c + ", impressionData=" + this.f38326d + ", properties=" + this.f38327e + ", divKitDesigns=" + this.f38328f + ", showNotices=" + this.f38329g + ", version=" + this.f38330h + ", settings=" + this.i + ", adPod=" + this.f38331j + ")";
    }
}
