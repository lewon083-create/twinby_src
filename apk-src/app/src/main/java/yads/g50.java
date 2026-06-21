package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g50 {

    @NotNull
    public static final f50 Companion = new f50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38659c;

    public /* synthetic */ g50(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f38657a = null;
        } else {
            this.f38657a = str;
        }
        if ((i & 2) == 0) {
            this.f38658b = null;
        } else {
            this.f38658b = str2;
        }
        if ((i & 4) == 0) {
            this.f38659c = null;
        } else {
            this.f38659c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return Intrinsics.a(this.f38657a, g50Var.f38657a) && Intrinsics.a(this.f38658b, g50Var.f38658b) && Intrinsics.a(this.f38659c, g50Var.f38659c);
    }

    public final int hashCode() {
        String str = this.f38657a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38658b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38659c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f38657a;
        String str2 = this.f38658b;
        return a0.u.o(t.z.j("DebugPanelAlert(title=", str, ", message=", str2, ", type="), this.f38659c, ")");
    }
}
