package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36913c;

    public b40(String str, String str2, String str3) {
        this.f36911a = str;
        this.f36912b = str2;
        this.f36913c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return Intrinsics.a(this.f36911a, b40Var.f36911a) && Intrinsics.a(this.f36912b, b40Var.f36912b) && Intrinsics.a(this.f36913c, b40Var.f36913c);
    }

    public final int hashCode() {
        String str = this.f36911a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f36912b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f36913c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f36911a;
        String str2 = this.f36912b;
        return a0.u.o(t.z.j("DebugPanelAdNetworkSettingsData(pageId=", str, ", appReviewStatus=", str2, ", appAdsTxt="), this.f36913c, ")");
    }
}
