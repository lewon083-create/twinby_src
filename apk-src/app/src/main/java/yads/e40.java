package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e40 {

    @NotNull
    public static final d40 Companion = new d40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40 f38006d;

    public /* synthetic */ e40(int i, String str, String str2, String str3, m40 m40Var) {
        if (7 != (i & 7)) {
            uk.o0.e(i, 7, c40.f37266a.getDescriptor());
            throw null;
        }
        this.f38003a = str;
        this.f38004b = str2;
        this.f38005c = str3;
        if ((i & 8) == 0) {
            this.f38006d = null;
        } else {
            this.f38006d = m40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return Intrinsics.a(this.f38003a, e40Var.f38003a) && Intrinsics.a(this.f38004b, e40Var.f38004b) && Intrinsics.a(this.f38005c, e40Var.f38005c) && Intrinsics.a(this.f38006d, e40Var.f38006d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f38005c, k4.a(this.f38004b, this.f38003a.hashCode() * 31, 31), 31);
        m40 m40Var = this.f38006d;
        return iA + (m40Var == null ? 0 : m40Var.hashCode());
    }

    public final String toString() {
        String str = this.f38003a;
        String str2 = this.f38004b;
        String str3 = this.f38005c;
        m40 m40Var = this.f38006d;
        StringBuilder sbJ = t.z.j("DebugPanelAdUnit(name=", str, ", format=", str2, ", adUnitId=");
        sbJ.append(str3);
        sbJ.append(", mediation=");
        sbJ.append(m40Var);
        sbJ.append(")");
        return sbJ.toString();
    }
}
