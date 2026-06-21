package t;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f32998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33001e;

    public d(List list, List list2, int i, int i10, int i11) {
        this.f32997a = list;
        this.f32998b = list2;
        this.f32999c = i;
        this.f33000d = i10;
        this.f33001e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            List list = dVar.f32998b;
            List list2 = dVar.f32997a;
            List list3 = this.f32997a;
            if (list3 != null ? list3.equals(list2) : list2 == null) {
                List list4 = this.f32998b;
                if (list4 != null ? list4.equals(list) : list == null) {
                    if (this.f32999c == dVar.f32999c && this.f33000d == dVar.f33000d && this.f33001e == dVar.f33001e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f32997a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List list2 = this.f32998b;
        return (((((((list2 != null ? list2.hashCode() : 0) ^ iHashCode) * 1000003) ^ this.f32999c) * 1000003) ^ this.f33000d) * 1000003) ^ this.f33001e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BestSizesAndMaxFpsForConfigs{bestSizes=");
        sb2.append(this.f32997a);
        sb2.append(", bestSizesForStreamUseCase=");
        sb2.append(this.f32998b);
        sb2.append(", maxFpsForBestSizes=");
        sb2.append(this.f32999c);
        sb2.append(", maxFpsForStreamUseCase=");
        sb2.append(this.f33000d);
        sb2.append(", maxFpsForAllSizes=");
        return z.d(this.f33001e, "}", sb2);
    }
}
