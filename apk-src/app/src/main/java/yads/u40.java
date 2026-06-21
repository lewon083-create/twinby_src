package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u40 {

    @NotNull
    public static final t40 Companion = new t40();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qk.a[] f43546g = {null, null, new uk.c(la0.f40459a), null, null, new uk.c(fa0.f38410a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka0 f43551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f43552f;

    public /* synthetic */ u40(int i, String str, String str2, List list, String str3, ka0 ka0Var, List list2) {
        if (54 != (i & 54)) {
            uk.o0.e(i, 54, s40.f42800a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f43547a = null;
        } else {
            this.f43547a = str;
        }
        this.f43548b = str2;
        this.f43549c = list;
        if ((i & 8) == 0) {
            this.f43550d = null;
        } else {
            this.f43550d = str3;
        }
        this.f43551e = ka0Var;
        this.f43552f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return Intrinsics.a(this.f43547a, u40Var.f43547a) && Intrinsics.a(this.f43548b, u40Var.f43548b) && Intrinsics.a(this.f43549c, u40Var.f43549c) && Intrinsics.a(this.f43550d, u40Var.f43550d) && Intrinsics.a(this.f43551e, u40Var.f43551e) && Intrinsics.a(this.f43552f, u40Var.f43552f);
    }

    public final int hashCode() {
        String str = this.f43547a;
        int iA = eb.a(this.f43549c, k4.a(this.f43548b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f43550d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        ka0 ka0Var = this.f43551e;
        return this.f43552f.hashCode() + ((iHashCode + (ka0Var != null ? ka0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f43547a;
        String str2 = this.f43548b;
        List list = this.f43549c;
        String str3 = this.f43550d;
        ka0 ka0Var = this.f43551e;
        List list2 = this.f43552f;
        StringBuilder sbJ = t.z.j("DebugPanelAdUnitWaterfallMediation(adapter=", str, ", networkName=", str2, ", waterfallParameters=");
        sbJ.append(list);
        sbJ.append(", networkAdUnitIdName=");
        sbJ.append(str3);
        sbJ.append(", currency=");
        sbJ.append(ka0Var);
        sbJ.append(", cpmFloors=");
        sbJ.append(list2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
