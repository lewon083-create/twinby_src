package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b20 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e20 f36901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q03 f36903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36904h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f36905j;

    public b20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, e20 e20Var, String str, q03 q03Var, String str2, int i, String str3) {
        this.f36897a = arrayList;
        this.f36898b = arrayList2;
        this.f36899c = arrayList3;
        this.f36900d = arrayList4;
        this.f36901e = e20Var;
        this.f36902f = str;
        this.f36903g = q03Var;
        this.f36904h = str2;
        this.i = i;
        this.f36905j = str3;
    }

    @Override // yads.yj3
    public final Map a() {
        List<a83> list = this.f36900d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a83 a83Var : list) {
            String str = a83Var.f36649a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(a83Var.f36650b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return Intrinsics.a(this.f36897a, b20Var.f36897a) && Intrinsics.a(this.f36898b, b20Var.f36898b) && Intrinsics.a(this.f36899c, b20Var.f36899c) && Intrinsics.a(this.f36900d, b20Var.f36900d) && Intrinsics.a(this.f36901e, b20Var.f36901e) && Intrinsics.a(this.f36902f, b20Var.f36902f) && Intrinsics.a(this.f36903g, b20Var.f36903g) && Intrinsics.a(this.f36904h, b20Var.f36904h) && this.i == b20Var.i && Intrinsics.a(this.f36905j, b20Var.f36905j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f36900d, eb.a(this.f36899c, eb.a(this.f36898b, this.f36897a.hashCode() * 31, 31), 31), 31);
        e20 e20Var = this.f36901e;
        int iHashCode = (iA + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        String str = this.f36902f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q03 q03Var = this.f36903g;
        int iHashCode3 = (iHashCode2 + (q03Var == null ? 0 : q03Var.hashCode())) * 31;
        String str2 = this.f36904h;
        int iA2 = qd3.a(this.i, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f36905j;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f36897a;
        List list2 = this.f36898b;
        List list3 = this.f36899c;
        List list4 = this.f36900d;
        e20 e20Var = this.f36901e;
        String str = this.f36902f;
        q03 q03Var = this.f36903g;
        String str2 = this.f36904h;
        int i = this.i;
        String str3 = this.f36905j;
        StringBuilder sb2 = new StringBuilder("Creative(mediaFiles=");
        sb2.append(list);
        sb2.append(", interactiveCreativeFiles=");
        sb2.append(list2);
        sb2.append(", icons=");
        gf.a.u(sb2, list3, ", trackingEventsList=", list4, ", creativeExtensions=");
        sb2.append(e20Var);
        sb2.append(", clickThroughUrl=");
        sb2.append(str);
        sb2.append(", skipOffset=");
        sb2.append(q03Var);
        sb2.append(", id=");
        sb2.append(str2);
        sb2.append(", durationMillis=");
        sb2.append(i);
        sb2.append(", adParameters=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
