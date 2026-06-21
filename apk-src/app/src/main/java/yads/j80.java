package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j80 {

    @NotNull
    public static final i80 Companion = new i80();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qk.a[] f39768h = {null, null, null, null, new uk.c(e50.f38014a), new uk.c(c40.f37266a), new uk.c(e80.f38043a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f39774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f39775g;

    public /* synthetic */ j80(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            uk.o0.e(i, 64, h80.f39067a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f39769a = null;
        } else {
            this.f39769a = str;
        }
        if ((i & 2) == 0) {
            this.f39770b = null;
        } else {
            this.f39770b = str2;
        }
        if ((i & 4) == 0) {
            this.f39771c = null;
        } else {
            this.f39771c = str3;
        }
        if ((i & 8) == 0) {
            this.f39772d = null;
        } else {
            this.f39772d = str4;
        }
        if ((i & 16) == 0) {
            this.f39773e = null;
        } else {
            this.f39773e = list;
        }
        if ((i & 32) == 0) {
            this.f39774f = null;
        } else {
            this.f39774f = list2;
        }
        this.f39775g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return Intrinsics.a(this.f39769a, j80Var.f39769a) && Intrinsics.a(this.f39770b, j80Var.f39770b) && Intrinsics.a(this.f39771c, j80Var.f39771c) && Intrinsics.a(this.f39772d, j80Var.f39772d) && Intrinsics.a(this.f39773e, j80Var.f39773e) && Intrinsics.a(this.f39774f, j80Var.f39774f) && Intrinsics.a(this.f39775g, j80Var.f39775g);
    }

    public final int hashCode() {
        String str = this.f39769a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39770b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39771c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39772d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f39773e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f39774f;
        return this.f39775g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f39769a;
        String str2 = this.f39770b;
        String str3 = this.f39771c;
        String str4 = this.f39772d;
        List list = this.f39773e;
        List list2 = this.f39774f;
        List list3 = this.f39775g;
        StringBuilder sbJ = t.z.j("DebugPanelRemoteData(pageId=", str, ", latestSdkVersion=", str2, ", appAdsTxtUrl=");
        l7.o.t(sbJ, str3, ", appStatus=", str4, ", alerts=");
        gf.a.u(sbJ, list, ", adUnits=", list2, ", mediationNetworks=");
        return t.z.h(sbJ, list3, ")");
    }
}
