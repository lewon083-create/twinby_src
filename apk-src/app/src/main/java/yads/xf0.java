package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f44684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f44685e;

    public xf0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f44681a = str;
        this.f44682b = str2;
        this.f44683c = str3;
        this.f44684d = arrayList;
        this.f44685e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0)) {
            return false;
        }
        xf0 xf0Var = (xf0) obj;
        return Intrinsics.a(this.f44681a, xf0Var.f44681a) && Intrinsics.a(this.f44682b, xf0Var.f44682b) && Intrinsics.a(this.f44683c, xf0Var.f44683c) && Intrinsics.a(this.f44684d, xf0Var.f44684d) && Intrinsics.a(this.f44685e, xf0Var.f44685e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f44683c, k4.a(this.f44682b, this.f44681a.hashCode() * 31, 31), 31);
        List list = this.f44684d;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f44685e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f44681a;
        String str2 = this.f44682b;
        String str3 = this.f44683c;
        List list = this.f44684d;
        Map map = this.f44685e;
        StringBuilder sbJ = t.z.j("Design(type=", str, ", target=", str2, ", layout=");
        sbJ.append(str3);
        sbJ.append(", images=");
        sbJ.append(list);
        sbJ.append(", analyticsParameters=");
        sbJ.append(map);
        sbJ.append(")");
        return sbJ.toString();
    }
}
