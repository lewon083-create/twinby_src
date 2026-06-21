package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g80 {

    @NotNull
    public static final f80 Companion = new f80();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qk.a[] f38669g = {null, null, null, null, new uk.c(uk.a1.f34493a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38675f;

    public /* synthetic */ g80(int i, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i & 18)) {
            uk.o0.e(i, 18, e80.f38043a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f38670a = null;
        } else {
            this.f38670a = str;
        }
        this.f38671b = str2;
        if ((i & 4) == 0) {
            this.f38672c = null;
        } else {
            this.f38672c = str3;
        }
        if ((i & 8) == 0) {
            this.f38673d = null;
        } else {
            this.f38673d = str4;
        }
        this.f38674e = list;
        if ((i & 32) == 0) {
            this.f38675f = null;
        } else {
            this.f38675f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return Intrinsics.a(this.f38670a, g80Var.f38670a) && Intrinsics.a(this.f38671b, g80Var.f38671b) && Intrinsics.a(this.f38672c, g80Var.f38672c) && Intrinsics.a(this.f38673d, g80Var.f38673d) && Intrinsics.a(this.f38674e, g80Var.f38674e) && Intrinsics.a(this.f38675f, g80Var.f38675f);
    }

    public final int hashCode() {
        String str = this.f38670a;
        int iA = k4.a(this.f38671b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f38672c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38673d;
        int iA2 = eb.a(this.f38674e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f38675f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f38670a;
        String str2 = this.f38671b;
        String str3 = this.f38672c;
        String str4 = this.f38673d;
        List list = this.f38674e;
        String str5 = this.f38675f;
        StringBuilder sbJ = t.z.j("DebugPanelMediationNetwork(id=", str, ", name=", str2, ", logoUrl=");
        l7.o.t(sbJ, str3, ", adapterStatus=", str4, ", adapters=");
        sbJ.append(list);
        sbJ.append(", latestAdapterVersion=");
        sbJ.append(str5);
        sbJ.append(")");
        return sbJ.toString();
    }
}
