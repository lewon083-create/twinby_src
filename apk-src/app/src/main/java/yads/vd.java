package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f43997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td f43998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44000d;

    public vd(td tdVar, td tdVar2, boolean z5, String str) {
        this.f43997a = tdVar;
        this.f43998b = tdVar2;
        this.f43999c = z5;
        this.f44000d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return Intrinsics.a(this.f43997a, vdVar.f43997a) && Intrinsics.a(this.f43998b, vdVar.f43998b) && this.f43999c == vdVar.f43999c && Intrinsics.a(this.f44000d, vdVar.f44000d);
    }

    public final int hashCode() {
        td tdVar = this.f43997a;
        int iHashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        td tdVar2 = this.f43998b;
        int iHashCode2 = (Boolean.hashCode(this.f43999c) + ((iHashCode + (tdVar2 == null ? 0 : tdVar2.hashCode())) * 31)) * 31;
        String str = this.f44000d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f43997a + ", hmsAdvertisingInfo=" + this.f43998b + ", gmsAdvertisingReset=" + this.f43999c + ", appSetId=" + this.f44000d + ")";
    }
}
