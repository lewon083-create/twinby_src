package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a50 f36933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f36934h;

    public b50(String str, String str2, boolean z5, String str3, String str4, String str5, a50 a50Var, ArrayList arrayList) {
        this.f36927a = str;
        this.f36928b = str2;
        this.f36929c = z5;
        this.f36930d = str3;
        this.f36931e = str4;
        this.f36932f = str5;
        this.f36933g = a50Var;
        this.f36934h = arrayList;
    }

    public final a50 a() {
        return this.f36933g;
    }

    public final String b() {
        return this.f36930d;
    }

    public final String c() {
        return this.f36931e;
    }

    public final String d() {
        return this.f36928b;
    }

    public final String e() {
        return this.f36927a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return Intrinsics.a(this.f36927a, b50Var.f36927a) && Intrinsics.a(this.f36928b, b50Var.f36928b) && this.f36929c == b50Var.f36929c && Intrinsics.a(this.f36930d, b50Var.f36930d) && Intrinsics.a(this.f36931e, b50Var.f36931e) && Intrinsics.a(this.f36932f, b50Var.f36932f) && Intrinsics.a(this.f36933g, b50Var.f36933g) && Intrinsics.a(this.f36934h, b50Var.f36934h);
    }

    public final String f() {
        return this.f36932f;
    }

    public final int hashCode() {
        int iHashCode = this.f36927a.hashCode() * 31;
        String str = this.f36928b;
        int iHashCode2 = (Boolean.hashCode(this.f36929c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f36930d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36931e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f36932f;
        int iHashCode5 = (this.f36933g.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.f36934h;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f36927a;
        String str2 = this.f36928b;
        boolean z5 = this.f36929c;
        String str3 = this.f36930d;
        String str4 = this.f36931e;
        String str5 = this.f36932f;
        a50 a50Var = this.f36933g;
        List list = this.f36934h;
        StringBuilder sbJ = t.z.j("DebugPanelAdapterData(name=", str, ", logoUrl=", str2, ", adapterIntegrationStatus=");
        sbJ.append(z5);
        sbJ.append(", adapterVersion=");
        sbJ.append(str3);
        sbJ.append(", latestAdapterVersion=");
        l7.o.t(sbJ, str4, ", sdkVersion=", str5, ", adapterStatus=");
        sbJ.append(a50Var);
        sbJ.append(", formats=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
