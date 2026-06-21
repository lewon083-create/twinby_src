package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h40 {

    @NotNull
    public static final g40 Companion = new g40();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qk.a[] f39018f = {null, null, new uk.c(n50.f41174a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39023e;

    public /* synthetic */ h40(int i, String str, String str2, List list, String str3, String str4) {
        if (6 != (i & 6)) {
            uk.o0.e(i, 6, f40.f38367a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f39019a = null;
        } else {
            this.f39019a = str;
        }
        this.f39020b = str2;
        this.f39021c = list;
        if ((i & 8) == 0) {
            this.f39022d = null;
        } else {
            this.f39022d = str3;
        }
        if ((i & 16) == 0) {
            this.f39023e = null;
        } else {
            this.f39023e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return Intrinsics.a(this.f39019a, h40Var.f39019a) && Intrinsics.a(this.f39020b, h40Var.f39020b) && Intrinsics.a(this.f39021c, h40Var.f39021c) && Intrinsics.a(this.f39022d, h40Var.f39022d) && Intrinsics.a(this.f39023e, h40Var.f39023e);
    }

    public final int hashCode() {
        String str = this.f39019a;
        int iA = eb.a(this.f39021c, k4.a(this.f39020b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f39022d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39023e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f39019a;
        String str2 = this.f39020b;
        List list = this.f39021c;
        String str3 = this.f39022d;
        String str4 = this.f39023e;
        StringBuilder sbJ = t.z.j("DebugPanelAdUnitBiddingMediation(adapter=", str, ", networkName=", str2, ", biddingParameters=");
        sbJ.append(list);
        sbJ.append(", adUnitId=");
        sbJ.append(str3);
        sbJ.append(", networkAdUnitIdName=");
        return a0.u.o(sbJ, str4, ")");
    }
}
