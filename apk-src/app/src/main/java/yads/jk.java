package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39884c;

    public jk(String str, String str2, String str3) {
        this.f39882a = str;
        this.f39883b = str2;
        this.f39884c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return Intrinsics.a(this.f39882a, jkVar.f39882a) && Intrinsics.a(this.f39883b, jkVar.f39883b) && Intrinsics.a(this.f39884c, jkVar.f39884c);
    }

    public final int hashCode() {
        return this.f39884c.hashCode() + k4.a(this.f39883b, this.f39882a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f39882a;
        String str2 = this.f39883b;
        return a0.u.o(t.z.j("Attributes(campaignId=", str, ", bannerId=", str2, ", placeId="), this.f39884c, ")");
    }
}
