package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm f42446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j13 f42447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f42448g;

    public r13(String str, String str2, String str3, String str4, dm dmVar, j13 j13Var, ArrayList arrayList) {
        this.f42442a = str;
        this.f42443b = str2;
        this.f42444c = str3;
        this.f42445d = str4;
        this.f42446e = dmVar;
        this.f42447f = j13Var;
        this.f42448g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r13)) {
            return false;
        }
        r13 r13Var = (r13) obj;
        return Intrinsics.a(this.f42442a, r13Var.f42442a) && Intrinsics.a(this.f42443b, r13Var.f42443b) && Intrinsics.a(this.f42444c, r13Var.f42444c) && Intrinsics.a(this.f42445d, r13Var.f42445d) && Intrinsics.a(this.f42446e, r13Var.f42446e) && Intrinsics.a(this.f42447f, r13Var.f42447f) && Intrinsics.a(this.f42448g, r13Var.f42448g);
    }

    public final int hashCode() {
        String str = this.f42442a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f42443b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42444c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f42445d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dm dmVar = this.f42446e;
        int iHashCode5 = (iHashCode4 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        j13 j13Var = this.f42447f;
        int iHashCode6 = (iHashCode5 + (j13Var == null ? 0 : j13Var.hashCode())) * 31;
        List list = this.f42448g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f42442a;
        String str2 = this.f42443b;
        String str3 = this.f42444c;
        String str4 = this.f42445d;
        dm dmVar = this.f42446e;
        j13 j13Var = this.f42447f;
        List list = this.f42448g;
        StringBuilder sbJ = t.z.j("SmartCenterSettings(colorWizButton=", str, ", colorWizButtonText=", str2, ", colorWizBack=");
        l7.o.t(sbJ, str3, ", colorWizBackRight=", str4, ", backgroundColors=");
        sbJ.append(dmVar);
        sbJ.append(", smartCenter=");
        sbJ.append(j13Var);
        sbJ.append(", smartCenters=");
        return t.z.h(sbJ, list, ")");
    }
}
