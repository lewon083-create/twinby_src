package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dr1 {

    @NotNull
    public static final zq1 Companion = new zq1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qk.a[] f37878e = {null, null, null, new uk.c(ar1.f36845a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f37882d;

    public /* synthetic */ dr1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, yq1.f45145a.getDescriptor());
            throw null;
        }
        this.f37879a = str;
        this.f37880b = str2;
        this.f37881c = str3;
        this.f37882d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr1)) {
            return false;
        }
        dr1 dr1Var = (dr1) obj;
        return Intrinsics.a(this.f37879a, dr1Var.f37879a) && Intrinsics.a(this.f37880b, dr1Var.f37880b) && Intrinsics.a(this.f37881c, dr1Var.f37881c) && Intrinsics.a(this.f37882d, dr1Var.f37882d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f37880b, this.f37879a.hashCode() * 31, 31);
        String str = this.f37881c;
        return this.f37882d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.f37879a;
        String str2 = this.f37880b;
        String str3 = this.f37881c;
        List list = this.f37882d;
        StringBuilder sbJ = t.z.j("MediationNetworkData(name=", str, ", id=", str2, ", version=");
        sbJ.append(str3);
        sbJ.append(", adapters=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }

    public dr1(String str, String str2, String str3, ArrayList arrayList) {
        this.f37879a = str;
        this.f37880b = str2;
        this.f37881c = str3;
        this.f37882d = arrayList;
    }
}
