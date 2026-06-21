package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43318c;

    public tg(String str, String str2, String str3) {
        this.f43316a = str;
        this.f43317b = str2;
        this.f43318c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return Intrinsics.a(this.f43316a, tgVar.f43316a) && Intrinsics.a(this.f43317b, tgVar.f43317b) && Intrinsics.a(this.f43318c, tgVar.f43318c);
    }

    public final int hashCode() {
        String str = this.f43316a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f43317b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43318c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f43316a;
        String str2 = this.f43317b;
        return a0.u.o(t.z.j("AppMetricaIdentifiers(adGetUrl=", str, ", deviceId=", str2, ", uuid="), this.f43318c, ")");
    }
}
