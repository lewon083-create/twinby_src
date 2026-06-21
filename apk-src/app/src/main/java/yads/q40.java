package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p40 f42169f;

    public q40(String str, String str2, ArrayList arrayList, String str3, String str4, p40 p40Var) {
        this.f42164a = str;
        this.f42165b = str2;
        this.f42166c = arrayList;
        this.f42167d = str3;
        this.f42168e = str4;
        this.f42169f = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return Intrinsics.a(this.f42164a, q40Var.f42164a) && Intrinsics.a(this.f42165b, q40Var.f42165b) && Intrinsics.a(this.f42166c, q40Var.f42166c) && Intrinsics.a(this.f42167d, q40Var.f42167d) && Intrinsics.a(this.f42168e, q40Var.f42168e) && Intrinsics.a(this.f42169f, q40Var.f42169f);
    }

    public final int hashCode() {
        String str = this.f42164a;
        int iA = eb.a(this.f42166c, k4.a(this.f42165b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f42167d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42168e;
        return this.f42169f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f42164a;
        String str2 = this.f42165b;
        List list = this.f42166c;
        String str3 = this.f42167d;
        String str4 = this.f42168e;
        p40 p40Var = this.f42169f;
        StringBuilder sbJ = t.z.j("DebugPanelAdUnitMediationAdapterData(logoUrl=", str, ", adapterName=", str2, ", parameters=");
        sbJ.append(list);
        sbJ.append(", adUnitId=");
        sbJ.append(str3);
        sbJ.append(", networkAdUnitIdName=");
        sbJ.append(str4);
        sbJ.append(", type=");
        sbJ.append(p40Var);
        sbJ.append(")");
        return sbJ.toString();
    }
}
