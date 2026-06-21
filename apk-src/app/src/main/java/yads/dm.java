package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37828d;

    public dm(String str, String str2, String str3, String str4) {
        this.f37825a = str;
        this.f37826b = str2;
        this.f37827c = str3;
        this.f37828d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return Intrinsics.a(this.f37825a, dmVar.f37825a) && Intrinsics.a(this.f37826b, dmVar.f37826b) && Intrinsics.a(this.f37827c, dmVar.f37827c) && Intrinsics.a(this.f37828d, dmVar.f37828d);
    }

    public final int hashCode() {
        String str = this.f37825a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f37826b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37827c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f37828d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f37825a;
        String str2 = this.f37826b;
        return com.google.android.gms.internal.ads.om1.n(t.z.j("BackgroundColors(top=", str, ", right=", str2, ", left="), this.f37827c, ", bottom=", this.f37828d, ")");
    }
}
